#!/usr/bin/env python3
"""확정된 문제를 백준/<티어>/로 생성하고 src에서 제거한다.

단계:
1) 원본 src 파일 전체 javac 베이스라인 컴파일 (원래부터 안 되는 파일 기록)
2) 이동 대상별 Main.java 생성 → 임시 디렉토리에서 javac 검증
   실패 시 해당 문제는 이동 취소(다른 사본이 있으면 그걸 시도)
3) 검증 통과한 이동만 src에서 메서드/전용 의존성 제거, 빈 파일은 삭제
4) 수정된 src 파일 재컴파일 → 베이스라인 대비 새 실패는 보고
결과 요약 JSON 저장.
"""
import json
import os
import re
import shutil
import subprocess
import sys
import tempfile
from collections import defaultdict

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from analyze_src import (ROOT, parse_members, body_text, find_matching_brace,
                         IDENT_RE)

DATA = os.environ.get("SOLVEDAC_DATA", "/tmp/solvedac/data")
BAEKJOON = os.path.join(ROOT, "백준")
SP = ' '  # BaekjoonHub가 폴더/파일명 공백에 쓰는 문자(U+2005)

UNSAFE = {'/': '／', '\\': '＼', ':': '：', '*': '＊', '?': '？',
          '"': '＂', '<': '＜', '>': '＞', '|': '｜'}

TIER_ROMAN = ['V', 'IV', 'III', 'II', 'I']


def tier_label(level):
    if level == 0:
        return 'Unrated'
    names = ['Bronze', 'Silver', 'Gold', 'Platinum', 'Diamond', 'Ruby']
    return f"{names[(level - 1) // 5]} {TIER_ROMAN[(level - 1) % 5]}"


def safe_name(title):
    t = title
    for k, v in UNSAFE.items():
        t = t.replace(k, v)
    t = t.replace(' ', SP)
    return t


def load_problem_meta(pid):
    sub = f"{pid // 1000:02d}xxx"
    path = os.path.join(DATA, sub, f"{pid}.json")
    try:
        return json.load(open(path))
    except Exception:
        return None


def compute_deps(lines, members):
    methods = {m['name']: m for m in members if m['kind'] == 'method'}
    fields = {m['name']: m for m in members if m['kind'] == 'field'}
    classes = {m['name']: m for m in members if m['kind'] == 'class'}
    deps = {}
    for name in methods:
        used_methods, used_fields = set(), set()
        queue, seen = [name], {name}
        while queue:
            cur = queue.pop()
            b = body_text(lines, methods[cur])
            ids = set(IDENT_RE.findall(b))
            for h in methods:
                if h != name and h != 'main' and h in ids and h not in seen:
                    if re.search(r'\b' + re.escape(h) + r'\s*\(', b):
                        used_methods.add(h)
                        seen.add(h)
                        queue.append(h)
            for f in fields:
                if f in ids:
                    used_fields.add(f)
        used_classes = set()
        bodies = [body_text(lines, methods[x]) for x in ({name} | used_methods)]
        for c in classes:
            if any(re.search(r'\b' + re.escape(c) + r'\b', b) for b in bodies):
                used_classes.add(c)
        changed = True
        while changed:
            changed = False
            for c in classes:
                if c in used_classes:
                    continue
                for uc in list(used_classes):
                    if re.search(r'\b' + re.escape(c) + r'\b',
                                 body_text(lines, classes[uc])):
                        used_classes.add(c)
                        changed = True
        deps[name] = {'methods': used_methods, 'fields': used_fields,
                      'classes': used_classes}
    return deps, methods, fields, classes


def gen_main_java(lines, imports, member, deps_entry, methods, fields, classes):
    decl_line = lines[member.get('decl', member['start'])]
    tm = re.search(r'(throws [\w,\s.]+?)\s*\{?\s*$', decl_line)
    throws = (' ' + tm.group(1).strip()) if tm else ''
    parts = []
    parts.extend(imports)
    parts.append('')
    parts.append('public class Main {')
    parts.append('')
    for fname in sorted(deps_entry['fields'],
                        key=lambda x: fields[x]['start']):
        parts.append(lines[fields[fname]['start']])
    if deps_entry['fields']:
        parts.append('')
    parts.append(f'\tpublic static void main(String[] args){throws} {{')
    parts.append(f'\t\t{member["name"]}();')
    parts.append('\t}')
    parts.append('')
    emitted = [member['name']] + sorted(
        deps_entry['methods'], key=lambda x: methods[x]['start'])
    for mname in emitted:
        mm = methods[mname]
        start = mm.get('decl', mm['start'])
        parts.extend(lines[start:mm['end'] + 1])
        parts.append('')
    for cname in sorted(deps_entry['classes'],
                        key=lambda x: classes[x]['start']):
        cc = classes[cname]
        parts.extend(lines[cc['start']:cc['end'] + 1])
        parts.append('')
    while parts and parts[-1] == '':
        parts.pop()
    parts.append('}')
    parts.append('')
    return '\n'.join(parts)


def gen_readme(pid, meta, entry):
    level = meta.get('level', 0)
    title = meta.get('titleKo', entry['official_title'])
    tags = []
    for t in meta.get('tags', []):
        ko = next((d['name'] for d in t.get('displayNames', [])
                   if d['language'] == 'ko'), None)
        if ko:
            tags.append(ko)
    lines = [
        f"# [{tier_label(level)}] {title} - {pid} ",
        "",
        f"[문제 링크](https://www.acmicpc.net/problem/{pid}) ",
        "",
        "### 분류",
        "",
        (', '.join(tags) if tags else '(미분류)'),
        "",
        "### 비고",
        "",
        f"`CodingTest/src`의 이전 풀이(`{entry['file']}` `{entry['method']}()`)를 "
        "이관한 파일입니다.",
        "",
    ]
    return '\n'.join(lines)


def javac_ok(java_text, workdir):
    src = os.path.join(workdir, 'Main.java')
    with open(src, 'w', encoding='utf-8') as f:
        f.write(java_text)
    r = subprocess.run(
        ['javac', '-encoding', 'UTF-8', '-nowarn', '-d', workdir, src],
        capture_output=True, text=True)
    return r.returncode == 0, r.stderr[-1500:]


def compile_src_file(path, outdir):
    r = subprocess.run(
        ['javac', '-encoding', 'UTF-8', '-nowarn', '-d', outdir, path],
        capture_output=True, text=True)
    return r.returncode == 0, r.stderr[-1500:]


def main():
    resolved = json.load(open(sys.argv[1]))
    dry = '--dry-run' in sys.argv

    # 이동 후보: 번호별로 사본 리스트 유지
    by_num = defaultdict(list)
    for e in resolved['move']:
        by_num[e['number']].append(e)
    # 제목에 번호가 명시된 사본을 우선
    for n in by_num:
        by_num[n].sort(key=lambda e: (('번' not in e['title']
                                       and str(n) not in e['title']),))

    # 1) 베이스라인 컴파일
    print("== 1) 원본 베이스라인 컴파일 ==", flush=True)
    src_files = sorted({e['file'] for es in by_num.values() for e in es})
    baseline_fail = {}
    from concurrent.futures import ThreadPoolExecutor
    with tempfile.TemporaryDirectory() as td:
        def _bl(rel):
            d = os.path.join(td, re.sub(r'[^\w]', '_', rel))
            os.makedirs(d, exist_ok=True)
            return rel, compile_src_file(os.path.join(ROOT, rel), d)
        with ThreadPoolExecutor(max_workers=8) as ex:
            for rel, (ok, err) in ex.map(_bl, src_files):
                if not ok:
                    baseline_fail[rel] = err
    print(f"  베이스라인 실패: {len(baseline_fail)}")

    # 파일별 파싱 캐시
    cache = {}

    def get_parsed(rel):
        if rel not in cache:
            lines, imports, members = parse_members(os.path.join(ROOT, rel))
            deps, methods, fields, classes = compute_deps(lines, members)
            cache[rel] = dict(lines=lines, imports=imports, members=members,
                              deps=deps, methods=methods, fields=fields,
                              classes=classes)
        return cache[rel]

    # 2) 생성 + 검증
    print("== 2) Main.java 생성/검증 ==", flush=True)
    moved = []          # 실제 이동 확정 항목
    gen_fail = []
    skipped_copies = []  # 두 번째 사본 등
    from concurrent.futures import ThreadPoolExecutor as _TPE
    jobs = []   # (n, idx, e, java or None, err or None)
    for n, copies in sorted(by_num.items()):
        for idx, e in enumerate(copies):
            p = get_parsed(e['file'])
            member = p['methods'].get(e['method'])
            if member is None:
                jobs.append([n, idx, e, None, 'method-not-found'])
                continue
            java = gen_main_java(p['lines'], p['imports'], member,
                                 p['deps'][e['method']], p['methods'],
                                 p['fields'], p['classes'])
            jobs.append([n, idx, e, java, None])
    with tempfile.TemporaryDirectory() as td:
        def _check(j):
            n, idx, e, java, err = j
            if java is None:
                return j + [False]
            wd = os.path.join(td, f"{n}_{idx}")
            os.makedirs(wd, exist_ok=True)
            ok, cerr = javac_ok(java, wd)
            j[4] = None if ok else cerr
            return j + [ok]
        with _TPE(max_workers=8) as ex:
            results = list(ex.map(_check, jobs))
    by_num_done = set()
    for n, idx, e, java, err, ok in results:
        if ok and n not in by_num_done:
            e['java'] = java
            moved.append(e)
            by_num_done.add(n)
        elif ok:
            skipped_copies.append(e)
        else:
            gen_fail.append({**e, 'error': err})
    print(f"  생성 성공 {len(moved)} / 실패항목 {len(gen_fail)} / "
          f"중복사본 보류 {len(skipped_copies)}")

    if dry:
        json.dump({'moved': len(moved),
                   'gen_fail': [{k: v for k, v in e.items() if k != 'java'}
                                for e in gen_fail]},
                  open(sys.argv[2], 'w'), ensure_ascii=False, indent=1)
        return

    # 3) 파일 쓰기 (백준/) 및 src 삭제
    print("== 3) 백준/ 생성 + src 정리 ==", flush=True)
    created = []
    for e in moved:
        pid = e['number']
        meta = load_problem_meta(pid) or {'titleKo': e['official_title'],
                                          'level': e['level'], 'tags': []}
        title = meta.get('titleKo') or e['official_title']
        folder = os.path.join(BAEKJOON, e['tier'],
                              f"{pid}.{SP}{safe_name(title)}")
        os.makedirs(folder, exist_ok=True)
        jpath = os.path.join(folder, f"{safe_name(title)}.java")
        with open(jpath, 'w', encoding='utf-8') as f:
            f.write(e['java'])
        with open(os.path.join(folder, 'README.md'), 'w',
                  encoding='utf-8') as f:
            f.write(gen_readme(pid, meta, e))
        created.append(os.path.relpath(folder, ROOT))

    # src 파일별 삭제 대상 정리
    moved_by_file = defaultdict(list)
    for e in moved:
        moved_by_file[e['file']].append(e)

    deleted_files, modified_files = [], []
    for rel, entries in sorted(moved_by_file.items()):
        p = get_parsed(rel)
        lines = list(p['lines'])
        members = p['members']
        methods, fields, classes = p['methods'], p['fields'], p['classes']
        deps = p['deps']
        moved_names = {e['method'] for e in entries}
        test_methods = {m for m in methods
                        if re.match(r'^test\d+$', m)}
        remaining = test_methods - moved_names
        if not remaining:
            os.remove(os.path.join(ROOT, rel))
            deleted_files.append(rel)
            continue
        # 남은 메서드들이 쓰는 의존성
        keep = {'methods': set(), 'fields': set(), 'classes': set()}
        for r_ in remaining:
            keep['methods'] |= deps[r_]['methods']
            keep['fields'] |= deps[r_]['fields']
            keep['classes'] |= deps[r_]['classes']
        drop = {'methods': set(), 'fields': set(), 'classes': set()}
        for e in entries:
            d = deps[e['method']]
            drop['methods'] |= d['methods'] - keep['methods'] - remaining
            drop['fields'] |= d['fields'] - keep['fields']
            drop['classes'] |= d['classes'] - keep['classes']
        # 삭제 라인 구간 수집
        ranges = []

        def add_member_range(m):
            s = m['start']
            if m.get('comment') and m.get('comment_start') is not None:
                s = min(s, m['comment_start'])
            ranges.append((s, m['end']))

        for m in members:
            if m['kind'] == 'method' and m['name'] in moved_names:
                add_member_range(m)
            elif m['kind'] == 'method' and m['name'] in drop['methods']:
                add_member_range(m)
            elif m['kind'] == 'field' and m['name'] in drop['fields']:
                add_member_range(m)
            elif m['kind'] == 'class' and m['name'] in drop['classes']:
                add_member_range(m)
        # main() 호출 보정
        first_remaining = sorted(remaining)[0]
        if 'main' in methods:
            mm = methods['main']
            for i in range(mm['start'], mm['end'] + 1):
                def _sub(mo):
                    return (f"{first_remaining}("
                            if mo.group(1) in moved_names else mo.group(0))
                lines[i] = re.sub(r'\b(test\d+)\s*\(', _sub, lines[i])
        for s, t in sorted(ranges, reverse=True):
            del lines[s:t + 1]
        # 연속 빈 줄 정리
        out = []
        blank = 0
        for ln in lines:
            if ln.strip() == '':
                blank += 1
                if blank > 2:
                    continue
            else:
                blank = 0
            out.append(ln)
        with open(os.path.join(ROOT, rel), 'w', encoding='utf-8') as f:
            f.write('\n'.join(out))
        modified_files.append(rel)

    # 4) 수정 파일 재컴파일
    print("== 4) 수정 파일 재컴파일 ==", flush=True)
    new_fail = {}
    with tempfile.TemporaryDirectory() as td:
        for rel in modified_files:
            ok, err = compile_src_file(os.path.join(ROOT, rel), td)
            if not ok and rel not in baseline_fail:
                new_fail[rel] = err
    print(f"  수정 후 새 컴파일 실패: {len(new_fail)}")

    summary = {
        'moved_count': len(moved),
        'created_folders': created,
        'deleted_src_files': deleted_files,
        'modified_src_files': modified_files,
        'baseline_compile_fail': baseline_fail,
        'new_compile_fail': new_fail,
        'gen_fail': [{k: v for k, v in e.items() if k != 'java'}
                     for e in gen_fail],
        'skipped_second_copies': [
            {k: v for k, v in e.items() if k != 'java'}
            for e in skipped_copies],
        'moved': [{k: v for k, v in e.items() if k != 'java'}
                  for e in moved],
    }
    with open(sys.argv[2], 'w', encoding='utf-8') as f:
        json.dump(summary, f, ensure_ascii=False, indent=1)
    print("완료")


if __name__ == '__main__':
    main()
