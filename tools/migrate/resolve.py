#!/usr/bin/env python3
"""solved.ac 데이터셋으로 src 문제들을 최종 확정한다.

출력 buckets:
- move    : 백준/에 없고 번호·티어 확정 → 이동 대상
- dup     : 백준/에 이미 있음 → src에 남김(보고용)
- ambiguous: 제목이 여러 문제와 일치 → 수동/웹 확인 필요
- unresolved: 데이터셋에서도 못 찾음
- untitled : 제목 없음
"""
import json
import os
import re
import sys
import unicodedata

ROOT = os.environ.get("REPO_ROOT", os.getcwd())
BAEKJOON = os.path.join(ROOT, "백준")
DATA = os.environ.get("SOLVEDAC_DATA", "/tmp/solvedac/data")

FULLWIDTH = {
    '＋': '+', '－': '-', '／': '/', '＊': '*', '？': '?', '：': ':',
    '＜': '<', '＞': '>', '＂': '"', '｜': '|', '＼': '\\', '．': '.',
    '，': ',', '！': '!', '（': '(', '）': ')', '％': '%', '＆': '&',
    '＝': '=', '＃': '#', '＠': '@', '［': '[', '］': ']',
}


def normalize(title):
    t = title
    for k, v in FULLWIDTH.items():
        t = t.replace(k, v)
    t = unicodedata.normalize('NFC', t)
    t = t.lower()
    t = re.sub(r'[^0-9a-z가-힣]+', '', t)
    return t


def tier_name(level):
    if level == 0:
        return 'Unrated'
    for name, lo in [('Bronze', 1), ('Silver', 6), ('Gold', 11),
                     ('Platinum', 16), ('Diamond', 21), ('Ruby', 26)]:
        if lo <= level <= lo + 4:
            return name
    return 'Unrated'


def load_dataset():
    by_id = {}
    by_norm = {}
    for sub in os.listdir(DATA):
        subdir = os.path.join(DATA, sub)
        if not os.path.isdir(subdir):
            continue
        for fn in os.listdir(subdir):
            if not fn.endswith('.json'):
                continue
            try:
                d = json.load(open(os.path.join(subdir, fn)))
            except Exception:
                continue
            pid = d.get('problemId')
            title = d.get('titleKo', '')
            if not pid:
                continue
            by_id[pid] = {'title': title, 'level': d.get('level', 0)}
            by_norm.setdefault(normalize(title), []).append(pid)
    return by_id, by_norm


def existing_numbers():
    nums = {}
    for tier in os.listdir(BAEKJOON):
        tdir = os.path.join(BAEKJOON, tier)
        if not os.path.isdir(tdir):
            continue
        for folder in os.listdir(tdir):
            m = re.match(r'^(\d+)\.', folder)
            if m:
                nums[int(m.group(1))] = os.path.join('백준', tier, folder)
    return nums


def main():
    matched = json.load(open(sys.argv[1]))
    by_id, by_norm = load_dataset()
    existing = existing_numbers()

    out = {'move': [], 'dup': [], 'ambiguous': [], 'unresolved': [],
           'untitled': matched['untitled']}

    # 이미 중복 확정된 것들
    for e in matched['dup_by_number'] + matched['dup_by_title']:
        out['dup'].append(e)

    # 번호는 있으나 백준/에 없는 것: 데이터셋에서 티어 확인
    for e in matched['new_with_number']:
        n = e['number']
        info = by_id.get(n)
        if not info:
            e['reason'] = 'number-not-in-dataset'
            out['unresolved'].append(e)
            continue
        # 제목 대략 일치 검증 (제목이 있으면)
        clean = e.get('clean_title', '')
        if clean and normalize(clean) and info['title']:
            a, b = normalize(clean), normalize(info['title'])
            if a and b and a != b and a not in b and b not in a:
                e['dataset_title'] = info['title']
                e['reason'] = 'title-mismatch'
                out['ambiguous'].append(e)
                continue
        e['number'] = n
        e['official_title'] = info['title']
        e['level'] = info['level']
        e['tier'] = tier_name(info['level'])
        out['move'].append(e)

    # 번호 없는 것: 제목으로 데이터셋 검색
    for e in matched['unknown']:
        clean = e.get('clean_title') or e['title']
        norm = normalize(clean)
        cands = by_norm.get(norm, [])
        if len(cands) == 1:
            n = cands[0]
            info = by_id[n]
            if n in existing:
                e['number'] = n
                e['baekjoon'] = existing[n]
                out['dup'].append(e)
            else:
                e['number'] = n
                e['official_title'] = info['title']
                e['level'] = info['level']
                e['tier'] = tier_name(info['level'])
                out['move'].append(e)
        elif len(cands) > 1:
            # 이미 백준/에 있는 후보가 하나뿐이면 그걸 중복으로 간주하기엔
            # 위험하므로 ambiguous로 보낸다
            e['candidates'] = [
                {'id': c, 'level': by_id[c]['level'],
                 'in_repo': c in existing} for c in cands]
            out['ambiguous'].append(e)
        else:
            e['reason'] = 'no-title-match'
            out['unresolved'].append(e)

    with open(sys.argv[2], 'w', encoding='utf-8') as f:
        json.dump(out, f, ensure_ascii=False, indent=1)
    for k, v in out.items():
        print(f"{k}: {len(v)}")
    # 이동 대상 티어 분포
    from collections import Counter
    print('move tiers:', Counter(e['tier'] for e in out['move']))


if __name__ == '__main__':
    main()
