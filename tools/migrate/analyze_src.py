#!/usr/bin/env python3
"""src 백준 파일 구조 분석 v2.

파일을 클래스 최상위 멤버(필드/메서드/주석) 단위로 파싱하고,
- 문제 메서드(test\\d+)에 제목 주석을 연결 (필드 블록을 건너뛰고 다음 메서드에 붙는 규칙)
- 메서드별 의존성(도우미 메서드, 클래스 필드)을 계산
결과를 JSON으로 저장한다.
"""
import json
import os
import re
import sys

ROOT = os.environ.get("REPO_ROOT", os.getcwd())
SRC = os.path.join(ROOT, "CodingTest/src")

MODS = r'(?:(?:public|private|protected|static|final|synchronized)\s+)+'
METHOD_RE = re.compile(
    r'^\s*' + MODS +
    r'[\w<>\[\],\s.?]+?\s(\w+)\s*\(([^)]*)\)\s*(throws [\w,\s.]+)?\s*\{?\s*$'
)
FIELD_RE = re.compile(
    r'^\s*' + MODS +
    r'[\w<>\[\],\s.?]+?[\s\]](\w+)\s*(\[\s*\])*\s*(=.*)?[;{]?\s*$'
)
CLASS_RE = re.compile(
    r'^\s*' + MODS + r'class\s+(\w+)'
)
ANNOT_RE = re.compile(r'^\s*@\w+')
COMMENT_RE = re.compile(r'^\s*//\s?(.*)$')
IDENT_RE = re.compile(r'\b([A-Za-z_]\w*)\b')


def strip_code_noise(line):
    line = re.sub(r'"(?:\\.|[^"\\])*"', '""', line)
    line = re.sub(r"'(?:\\.|[^'\\])*'", "''", line)
    line = re.sub(r'//.*$', '', line)
    return line


def find_matching_brace(lines, start_idx):
    depth = 0
    opened = False
    for i in range(start_idx, len(lines)):
        s = strip_code_noise(lines[i])
        depth += s.count('{') - s.count('}')
        if '{' in s:
            opened = True
        if opened and depth == 0:
            return i
    return None


def parse_members(path):
    """최상위 멤버 목록 반환: [{kind, name, start, end, comment(list)}]"""
    with open(path, encoding='utf-8') as f:
        lines = f.read().split('\n')
    members = []
    imports = []
    pending_comment = []       # (start_line, [texts])
    pending_comment_start = None
    class_open = False
    i = 0
    n = len(lines)
    while i < n:
        raw = lines[i]
        s = raw.strip()
        if not class_open:
            if s.startswith('import '):
                imports.append(s)
            if re.match(r'^(public\s+)?(final\s+)?class\s+\w+', s):
                class_open = True
            i += 1
            continue
        cm = COMMENT_RE.match(raw)
        if cm:
            if not pending_comment:
                pending_comment_start = i
            pending_comment.append(cm.group(1).strip())
            i += 1
            continue
        if s == '':
            i += 1
            continue
        if ANNOT_RE.match(raw):
            # 어노테이션은 다음 멤버 시작 줄로 흡수: pending 주석처럼 취급
            if not pending_comment:
                pending_comment_start = i
            i += 1
            continue
        cmatch = CLASS_RE.match(raw)
        if cmatch:
            end = find_matching_brace(lines, i)
            if end is None:
                end = i
            members.append({'kind': 'class', 'name': cmatch.group(1),
                            'start': (pending_comment_start
                                      if pending_comment_start is not None
                                      and not pending_comment else i),
                            'end': end,
                            'comment': pending_comment,
                            'comment_start': pending_comment_start})
            pending_comment, pending_comment_start = [], None
            i = end + 1
            continue
        m = METHOD_RE.match(raw)
        # 메서드 선언이 여러 줄일 수 있어 '{'가 같은 줄에 없으면 다음 줄까지 확인
        if m and ('{' in raw or (i + 1 < n and lines[i + 1].strip().startswith('{'))):
            end = find_matching_brace(lines, i)
            if end is None:
                members.append({'kind': 'error', 'name': m.group(1),
                                'start': i, 'end': i,
                                'comment': pending_comment,
                                'comment_start': pending_comment_start})
                pending_comment, pending_comment_start = [], None
                i += 1
                continue
            mstart = i
            if pending_comment_start is not None and not pending_comment:
                mstart = pending_comment_start
            members.append({'kind': 'method', 'name': m.group(1),
                            'start': mstart, 'end': end, 'decl': i,
                            'comment': pending_comment,
                            'comment_start': pending_comment_start})
            pending_comment, pending_comment_start = [], None
            i = end + 1
            continue
        fm = FIELD_RE.match(raw) if ';' in raw else None
        if fm and '(' not in raw.split('=')[0]:
            members.append({'kind': 'field', 'name': fm.group(1),
                            'start': i, 'end': i,
                            'comment': pending_comment,
                            'comment_start': pending_comment_start})
            pending_comment, pending_comment_start = [], None
            i += 1
            continue
        # 클래스 닫는 중괄호 등
        if s == '}':
            i += 1
            continue
        members.append({'kind': 'other', 'name': None, 'start': i, 'end': i,
                        'comment': pending_comment,
                        'comment_start': pending_comment_start})
        pending_comment, pending_comment_start = [], None
        i += 1
    return lines, imports, members


def body_text(lines, member):
    return '\n'.join(lines[member['start']:member['end'] + 1])


def analyze_file(path):
    lines, imports, members = parse_members(path)
    methods = {m['name']: m for m in members if m['kind'] == 'method'}
    fields = {m['name']: m for m in members if m['kind'] == 'field'}
    classes = {m['name']: m for m in members if m['kind'] == 'class'}
    errors = [m for m in members if m['kind'] == 'error']
    others = [m for m in members if m['kind'] == 'other']

    # 제목 배정: 주석이 필드에 붙었으면 그 뒤 첫 메서드로 이월
    titles = {}
    carried = None
    for m in members:
        if m['comment']:
            carried = ' '.join(t for t in m['comment'] if t).strip()
        if m['kind'] == 'method':
            if carried:
                titles[m['name']] = carried
            carried = None
        elif m['kind'] == 'field':
            pass  # carried 유지
        else:
            carried = None

    # 의존성: 메서드 본문에서 참조하는 도우미/필드 (전이적)
    deps = {}
    for name, m in methods.items():
        body = body_text(lines, m)
        idents = set(IDENT_RE.findall(body))
        used_methods = set()
        used_fields = set()
        queue = [name]
        seen = {name}
        while queue:
            cur = queue.pop()
            b = body_text(lines, methods[cur])
            ids = set(IDENT_RE.findall(b))
            for h in methods:
                if h != name and h in ids and h not in seen and h != 'main':
                    # 호출 형태 확인
                    if re.search(r'\b' + re.escape(h) + r'\s*\(', b):
                        used_methods.add(h)
                        seen.add(h)
                        queue.append(h)
            for f in fields:
                if f in ids:
                    used_fields.add(f)
        used_classes = set()
        all_bodies = [body_text(lines, methods[x])
                      for x in ({name} | used_methods)]
        for c in classes:
            if any(re.search(r'\b' + re.escape(c) + r'\b', b)
                   for b in all_bodies):
                used_classes.add(c)
        # 클래스 본문이 참조하는 다른 클래스도 포함
        changed = True
        while changed:
            changed = False
            for c in list(classes):
                if c in used_classes:
                    continue
                for uc in list(used_classes):
                    if re.search(r'\b' + re.escape(c) + r'\b',
                                 body_text(lines, classes[uc])):
                        used_classes.add(c)
                        changed = True
        deps[name] = {'methods': sorted(used_methods),
                      'fields': sorted(used_fields),
                      'classes': sorted(used_classes)}

    problems = []
    for name, m in methods.items():
        if name == 'main':
            continue
        if not re.match(r'^test\d+$', name):
            continue
        problems.append({
            'file': os.path.relpath(path, ROOT),
            'method': name,
            'title': titles.get(name, ''),
            'start': m['start'], 'end': m['end'],
            'throws': ('throws' in lines[m.get('decl', m['start'])]),
            'deps': deps[name],
        })
    return {
        'file': os.path.relpath(path, ROOT),
        'imports': imports,
        'problems': sorted(problems, key=lambda p: p['start']),
        'helpers': sorted(n for n in methods if n != 'main'
                          and not re.match(r'^test\d+$', n)),
        'fields': sorted(fields),
        'classes': sorted(m['name'] for m in members if m['kind'] == 'class'),
        'errors': [{'name': e['name'], 'line': e['start'] + 1} for e in errors],
        'others': [{'line': o['start'] + 1,
                    'text': lines[o['start']].strip()[:80]} for o in others],
    }


def main():
    results = []
    for dirpath, _, filenames in os.walk(SRC):
        base = os.path.basename(dirpath)
        if not (base.startswith('baekjoon') or base.startswith('backjoon')):
            continue
        for fn in sorted(filenames):
            if fn.endswith('.java'):
                results.append(analyze_file(os.path.join(dirpath, fn)))
    results.sort(key=lambda r: r['file'])
    total = sum(len(r['problems']) for r in results)
    untitled = [p for r in results for p in r['problems'] if not p['title']]
    errs = [r['file'] for r in results if r['errors']]
    others = [(r['file'], r['others']) for r in results if r['others']]
    out = {'files': results, 'problem_count': total}
    with open(sys.argv[1], 'w', encoding='utf-8') as f:
        json.dump(out, f, ensure_ascii=False, indent=1)
    print(f"files={len(results)} problems={total} untitled={len(untitled)} "
          f"parse_errors={len(errs)} others={len(others)}")
    for fpath in errs[:10]:
        print(' ERR', fpath)
    for fpath, o in others[:10]:
        print(' OTHER', fpath, o[:2])


if __name__ == '__main__':
    main()
