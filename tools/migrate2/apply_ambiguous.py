#!/usr/bin/env python3
"""식별된 애매 항목 적용: move는 백준/<티어>/ 생성, 전 항목 src에서 제거.

- move: gen_main_java + javac 검증. 실패 시 이동/삭제 모두 취소(보존·보고)
- src 제거: delete_dups의 고정점 + 파일별 javac 게이트 재사용
"""
import json
import os
import re
import subprocess
import sys
import tempfile
from collections import defaultdict

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from analyze_src import ROOT, parse_members
import move_problems as MP
import delete_dups as DD

BAEKJOON = os.path.join(ROOT, '백준')
SP = ' '


def tier_name(level):
    if level == 0:
        return 'Unrated'
    return ['Bronze', 'Silver', 'Gold', 'Platinum', 'Diamond',
            'Ruby'][(level - 1) // 5]


def main():
    plan = json.load(open(sys.argv[1]))
    moves = [p for p in plan if p[3] == 'move']
    dels = [p for p in plan if p[3] == 'delete']

    created, move_fail = [], []
    confirmed_removals = defaultdict(set)   # file -> methods

    with tempfile.TemporaryDirectory() as td:
        for i, (rel, method, pid, _) in enumerate(moves):
            path = os.path.join(ROOT, rel)
            lines, imports, members = parse_members(path)
            deps, methods, fields, classes = MP.compute_deps(lines, members)
            member = methods.get(method)
            if member is None:
                move_fail.append((rel, method, pid, 'method-not-found'))
                continue
            java = MP.gen_main_java(lines, imports, member, deps[method],
                                    methods, fields, classes)
            wd = os.path.join(td, str(i))
            os.makedirs(wd, exist_ok=True)
            ok, err = MP.javac_ok(java, wd)
            if not ok:
                move_fail.append((rel, method, pid, err[:300]))
                continue
            m = MP.load_problem_meta(pid) or {}
            title = m.get('titleKo') or f'문제 {pid}'
            level = m.get('level', 0)
            entry = {'file': rel, 'method': method,
                     'official_title': title}
            folder = os.path.join(BAEKJOON, tier_name(level),
                                  f"{pid}.{SP}{MP.safe_name(title)}")
            os.makedirs(folder, exist_ok=True)
            with open(os.path.join(folder,
                                   f"{MP.safe_name(title)}.java"), 'w',
                      encoding='utf-8') as fp:
                fp.write(java)
            with open(os.path.join(folder, 'README.md'), 'w',
                      encoding='utf-8') as fp:
                fp.write(MP.gen_readme(pid, m or {'titleKo': title,
                                                  'level': level,
                                                  'tags': []}, entry))
            created.append(os.path.relpath(folder, ROOT))
            confirmed_removals[rel].add(method)

    for rel, method, pid, _ in dels:
        confirmed_removals[rel].add(method)

    # src 제거 (delete_dups 로직)
    deleted_files, modified_files, skipped = [], [], []
    with tempfile.TemporaryDirectory() as td:
        for rel, targets in sorted(confirmed_removals.items()):
            path = os.path.join(ROOT, rel)
            lines, _, members = parse_members(path)
            tests = {m['name'] for m in members if m['kind'] == 'method'
                     and re.match(r'^test\d+$', m['name'])}
            remaining = tests - targets
            if not remaining:
                os.remove(path)
                deleted_files.append(rel)
                continue
            orig = open(path).read()
            ok = False
            for conservative in (False, True):
                out = DD.process_file(rel, targets,
                                      conservative=conservative)
                open(path, 'w').write('\n'.join(out))
                good, err = DD.compile_ok(path, td)
                if good:
                    modified_files.append(rel)
                    ok = True
                    break
            if not ok:
                open(path, 'w').write(orig)
                skipped.append((rel, err[:200]))

    print(f"이동 생성 {len(created)}, 이동 실패 {len(move_fail)}, "
          f"src 파일삭제 {len(deleted_files)}, 수정 {len(modified_files)}, "
          f"게이트실패 {len(skipped)}")
    for mf in move_fail:
        print('  MOVE-FAIL', mf[0].split('/')[-1], mf[1], f'#{mf[2]}',
              str(mf[3])[:120])
    for s in skipped:
        print('  SKIP', s)
    json.dump({'created': created,
               'move_fail': [list(x) for x in move_fail],
               'deleted': deleted_files, 'modified': modified_files,
               'skipped': [list(x) for x in skipped]},
              open(sys.argv[2], 'w'), ensure_ascii=False, indent=1)


if __name__ == '__main__':
    main()
