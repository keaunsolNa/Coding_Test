#!/usr/bin/env python3
"""src 추출 문제 제목을 백준/ 폴더 인덱스와 대조해 분류한다.

분류:
- dup_by_number : 제목에 문제번호가 있고 백준/에 이미 있음
- dup_by_title  : 번호는 없지만 제목이 백준/ 폴더 제목과 유일하게 일치
- new_with_number: 번호가 있고 백준/에 없음 (티어만 확인하면 이동 가능)
- unknown       : 번호 없음 + 제목 매칭 실패 (웹 검색 필요)
- untitled      : 제목 주석 자체가 없음
"""
import json
import os
import re
import sys
import unicodedata

ROOT = os.environ.get("REPO_ROOT", os.getcwd())
BAEKJOON = os.path.join(ROOT, "백준")

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
    # 한글/영숫자만 남긴다
    t = re.sub(r'[^0-9a-z가-힣]+', '', t)
    return t


def build_index():
    """{number: {'tier':, 'title':, 'norm':}} + norm-title -> [numbers]"""
    by_num = {}
    by_norm = {}
    for tier in os.listdir(BAEKJOON):
        tdir = os.path.join(BAEKJOON, tier)
        if not os.path.isdir(tdir):
            continue
        for folder in os.listdir(tdir):
            m = re.match(r'^(\d+)\.\s*(.+)$', folder)
            if not m:
                continue
            num, title = int(m.group(1)), m.group(2)
            norm = normalize(title)
            by_num[num] = {'tier': tier, 'title': title, 'norm': norm,
                           'folder': os.path.join('백준', tier, folder)}
            by_norm.setdefault(norm, []).append(num)
    return by_num, by_norm


NUM_PATTERNS = [
    re.compile(r'(\d{3,6})\s*번'),          # 15654번
    re.compile(r'^\s*(\d{3,6})\s*[-–.:]'),  # 15654 - 제목
    re.compile(r'[-–]\s*(\d{3,6})\s*$'),    # 제목 - 15654
    re.compile(r'\(\s*(\d{3,6})\s*\)\s*$'), # 제목 (15654)
    re.compile(r'^\s*(\d{3,6})\s+'),        # 15654 제목
]


def extract_number(title):
    nums = []
    for pat in NUM_PATTERNS:
        for m in pat.finditer(title):
            n = int(m.group(1))
            if 1000 <= n <= 35000:
                nums.append(n)
    # 중복 제거, 순서 유지
    seen = []
    for n in nums:
        if n not in seen:
            seen.append(n)
    return seen


def strip_number_tokens(title):
    t = re.sub(r'\d{3,6}\s*번', ' ', title)
    t = re.sub(r'\(\s*\d{3,6}\s*\)', ' ', t)
    t = re.sub(r'^\s*\d{3,6}\s*[-–.:]\s*', ' ', t)
    t = re.sub(r'[-–]\s*\d{3,6}\s*$', ' ', t)
    return t.strip(' -–')


def main():
    data = json.load(open(sys.argv[1]))
    by_num, by_norm = build_index()

    buckets = {'dup_by_number': [], 'dup_by_title': [],
               'new_with_number': [], 'unknown': [], 'untitled': []}
    for f in data['files']:
        for p in f['problems']:
            title = p['title']
            entry = {'file': p['file'], 'method': p['method'], 'title': title}
            if not title:
                buckets['untitled'].append(entry)
                continue
            nums = extract_number(title)
            stripped = strip_number_tokens(title)
            norm = normalize(stripped)
            if nums:
                hit = [n for n in nums if n in by_num]
                if hit:
                    entry['number'] = hit[0]
                    entry['baekjoon'] = by_num[hit[0]]['folder']
                    buckets['dup_by_number'].append(entry)
                else:
                    entry['number'] = nums[0]
                    entry['clean_title'] = stripped
                    buckets['new_with_number'].append(entry)
                continue
            cand = by_norm.get(norm, [])
            if len(cand) == 1:
                entry['number'] = cand[0]
                entry['baekjoon'] = by_num[cand[0]]['folder']
                buckets['dup_by_title'].append(entry)
            elif len(cand) > 1:
                entry['candidates'] = cand
                buckets['unknown'].append(entry)
            else:
                entry['clean_title'] = stripped
                buckets['unknown'].append(entry)

    out = sys.argv[2]
    with open(out, 'w', encoding='utf-8') as fp:
        json.dump(buckets, fp, ensure_ascii=False, indent=1)
    for k, v in buckets.items():
        print(f"{k}: {len(v)}")


if __name__ == '__main__':
    main()
