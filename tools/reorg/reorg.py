#!/usr/bin/env python3
"""프로그래머스 숫자 폴더를 lvN 으로 통일하고, 실질 내용이 없는 파일을 제거한다.

- 프로그래머스/0,1,2,3  ->  프로그래머스/lv0,lv1,lv2,lv3 (git mv, 내용 그대로)
- 프로그래머스/unrated/250125  제거 (lv1 쪽이 최신 제출, unrated 쪽은 옛 사본)
- CodingTest/src/baekjoon_Class01/Class03.java 제거 (본문 없는 껍데기)
"""
import os
import re
import subprocess
import sys

ROOT = os.environ.get('REPO_ROOT', os.getcwd())
PG = os.path.join(ROOT, '프로그래머스')


def git(*args):
    r = subprocess.run(['git', '-C', ROOT] + list(args),
                       capture_output=True, text=True)
    if r.returncode != 0:
        raise SystemExit(f'git {" ".join(args[:2])} 실패:\n{r.stderr}')
    return r.stdout


def main():
    moved = 0
    for n in ('0', '1', '2', '3'):
        src = os.path.join(PG, n)
        if not os.path.isdir(src):
            print(f'건너뜀: 프로그래머스/{n} 없음')
            continue
        dst = os.path.join(PG, f'lv{n}')
        os.makedirs(dst, exist_ok=True)
        for name in sorted(os.listdir(src)):
            s = os.path.join(src, name)
            if not os.path.isdir(s):
                continue
            d = os.path.join(dst, name)
            if os.path.exists(d):
                print(f'  충돌로 건너뜀: lv{n}/{name}')
                continue
            git('mv', s, d)
            moved += 1
        rest = os.listdir(src) if os.path.isdir(src) else []
        if not rest:
            os.rmdir(src)
            print(f'프로그래머스/{n} -> lv{n} 이동 완료')
        else:
            print(f'프로그래머스/{n} 에 잔여 항목: {rest}')

    removed = []
    dup = None
    up = os.path.join(PG, 'unrated')
    for name in os.listdir(up):
        if name.startswith('250125.'):
            dup = os.path.join(up, name)
    if dup:
        git('rm', '-r', '-q', dup)
        removed.append('프로그래머스/unrated/250125 (lv1 쪽 최신본 유지)')

    cls = os.path.join(ROOT, 'CodingTest/src/baekjoon_Class01/Class03.java')
    if os.path.exists(cls):
        git('rm', '-q', cls)
        removed.append('CodingTest/src/baekjoon_Class01/Class03.java')

    print(f'\n이동 {moved}개 문제 폴더')
    for r in removed:
        print('제거:', r)

    # 결과 요약
    print('\n=== 프로그래머스 현황 ===')
    total = 0
    for lv in sorted(os.listdir(PG)):
        p = os.path.join(PG, lv)
        if not os.path.isdir(p):
            continue
        c = len([x for x in os.listdir(p)
                 if os.path.isdir(os.path.join(p, x))])
        total += c
        print(f'  {lv:8s} {c}')
    print(f'  합계     {total}')


if __name__ == '__main__':
    main()
