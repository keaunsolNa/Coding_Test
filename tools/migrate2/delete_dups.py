#!/usr/bin/env python3
"""src 메서드 삭제 유틸: 고정점 방식으로 전용 의존성만 함께 제거.

- 다중 선언 필드(int M, N, K;)는 선언된 모든 이름을 추적
- 도우미/필드/클래스 제거는 '남은 텍스트에 이름이 등장하지 않을 때만'
"""
import json
import os
import re
import subprocess
import sys
import tempfile
from collections import defaultdict

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from analyze_src import ROOT, parse_members, strip_code_noise

MODIFIERS = {'public', 'private', 'protected', 'static', 'final',
             'synchronized'}


def declared_field_names(line):
    """필드 선언 라인에서 선언된 변수 이름들을 추출."""
    s = strip_code_noise(line).strip()
    s = s.rstrip(';').strip()
    toks = s.split()
    while toks and toks[0] in MODIFIERS:
        toks.pop(0)
    if not toks:
        return []
    rest = ' '.join(toks)
    for op, cl in [('<', '>'), ('(', ')'), ('{', '}'), ('[', ']')]:
        depth = 0
        out = []
        for ch in rest:
            if ch == op:
                depth += 1
            elif ch == cl and depth > 0:
                depth -= 1
            elif depth == 0:
                out.append(ch)
        rest = ''.join(out)
    parts = rest.split(None, 1)
    if len(parts) < 2:
        return []
    decls = parts[1]
    names = []
    for seg in decls.split(','):
        seg = seg.split('=')[0].strip()
        m = re.match(r'^(\w+)', seg)
        if m:
            names.append(m.group(1))
    return names


def member_ranges(m):
    s = m['start']
    if m.get('comment') and m.get('comment_start') is not None:
        s = min(s, m['comment_start'])
    return (s, m['end'])


def build_text(lines, removed_ranges, exclude=None):
    skip = set()
    for s, t in removed_ranges:
        skip.update(range(s, t + 1))
    if exclude:
        skip.update(range(exclude[0], exclude[1] + 1))
    return '\n'.join(l for i, l in enumerate(lines) if i not in skip)


def process_file(rel, targets, conservative=False):
    """targets: 삭제할 test 메서드 이름 집합. 반환: new_lines"""
    path = os.path.join(ROOT, rel)
    lines, imports, members = parse_members(path)

    removed = []
    removed_ranges = []
    for m in members:
        if m['kind'] == 'method' and m['name'] in targets:
            removed.append(m)
            removed_ranges.append(member_ranges(m))

    if not conservative:
        changed = True
        while changed:
            changed = False
            for m in members:
                if m in removed or m['kind'] not in ('method', 'field',
                                                     'class'):
                    continue
                if m['kind'] == 'method' and (
                        m['name'] == 'main'
                        or re.match(r'^test\d+$', m['name'])):
                    continue
                if m['kind'] == 'field':
                    names = declared_field_names(lines[m['start']])
                    if not names:
                        continue
                else:
                    names = [m['name']]
                rng = member_ranges(m)
                rest = build_text(lines, removed_ranges, exclude=rng)
                if not any(re.search(r'\b' + re.escape(n) + r'\b', rest)
                           for n in names):
                    removed.append(m)
                    removed_ranges.append(rng)
                    changed = True

    new_lines = list(lines)
    remaining_tests = sorted(
        m['name'] for m in members
        if m['kind'] == 'method' and re.match(r'^test\d+$', m['name'])
        and m['name'] not in targets)
    mains = [m for m in members if m['kind'] == 'method'
             and m['name'] == 'main']
    if mains and remaining_tests:
        mm = mains[0]
        first = remaining_tests[0]
        for i in range(mm['start'], mm['end'] + 1):
            def _sub(mo):
                return (f"{first}(" if mo.group(1) in targets
                        else mo.group(0))
            new_lines[i] = re.sub(r'\b(test\d+)\s*\(', _sub, new_lines[i])

    for s, t in sorted(removed_ranges, reverse=True):
        del new_lines[s:t + 1]

    out, blank = [], 0
    for ln in new_lines:
        if ln.strip() == '':
            blank += 1
            if blank > 2:
                continue
        else:
            blank = 0
        out.append(ln)
    return out


def compile_ok(path, outdir):
    r = subprocess.run(
        ['javac', '-encoding', 'UTF-8', '-nowarn', '-d', outdir, path],
        capture_output=True, text=True)
    return r.returncode == 0, r.stderr[-800:]
