# 🧑‍💻 Coding Test 저장소

[![Solved.ac Profile](http://mazassumnida.wtf/api/v2/generate_badge?boj=knsol1992)](https://solved.ac/knsol1992/)

백준(BOJ), LeetCode, 프로그래머스, 구름LEVEL 문제 풀이를 모아둔 저장소입니다.
백준 허브(BaekjoonHub)로 자동 커밋된 풀이와 직접 정리한 풀이가 함께 있습니다.

- 주 언어: **Java** (SQL 문제는 **MySQL**)
- [solved.ac 프로필](https://solved.ac/profile/knsol1992)

## 📂 저장소 구조

```
Coding_Test/
├── 백준/                  # 백준 풀이 (티어별: Bronze / Silver / Gold / Platinum / Unrated)
│   └── <티어>/<번호. 문제이름>/     # 문제별 폴더 (풀이 + README)
├── leetcode/
│   ├── Solved/            # 푼 문제 (Easy / Med / Hard)
│   │   └── <난이도>/<번호-슬러그>/  # Solution.java + problem.md + analysis.md
│   └── UnSolved/          # 아직 풀지 않은 문제 목록
├── 프로그래머스/
│   ├── lv1 ~ lv5, unrated  # 알고리즘 문제 (레벨별)
│   └── 0 ~ 3               # SQL 문제 (레벨별)
├── goormlevel/            # 구름LEVEL 풀이
├── CodingTest/src/        # 초기 백준 풀이 (유형별 정리: DFS/BFS, DP, Greedy 등)
├── Coding_TEST_MySQL.sql  # MySQL 연습 쿼리 모음
└── templates/             # 새 문제 풀이용 템플릿
```

## 📊 풀이 현황

> 2026-08-11 기준, 문제 폴더 수 집계

### 백준 (티어별 폴더)

| Bronze | Silver | Gold | Platinum | Unrated | 합계 |
|:------:|:------:|:----:|:--------:|:-------:|:----:|
| 2,195 | 943 | 198 | 25 | 20 | **3,381** |

`CodingTest/src/` 에 유형별로 모아두었던 백준 풀이는 문제 번호를 확정할 수 있는 항목을 모두 `백준/<티어>/` 로 이관했습니다. 번호를 특정하지 못한 87건(제목 미기재·동명 문제 중복 등)만 `CodingTest/src/` 에 남아 있습니다.

### LeetCode

| Easy | Medium | Hard | 합계 |
|:----:|:------:|:----:|:----:|
| 185 | 18 | 0 | **203** |

### 프로그래머스

| lv1 | lv2 | lv3 | lv4 | lv5 | unrated | SQL (0~3) | 합계 |
|:---:|:---:|:---:|:---:|:---:|:-------:|:---------:|:----:|
| 26 | 55 | 19 | 13 | 1 | 158 | 12 | **284** |

## 📝 문제별 파일 구성

### LeetCode (`leetcode/Solved/<난이도>/<번호-슬러그>/`)

| 파일 | 내용 |
|------|------|
| `Solution.java` | 제출 코드 (bare class — `public`/`package`/상단 `import` 없음) |
| `problem.md` | frontmatter + 문제 전문 |
| `analysis.md` | 접근 방법·복잡도 분석 |

`problem.md` frontmatter:

```yaml
---
id: <number>
slug: <slug>
title: <Title>
difficulty: Easy|Med|Hard
tags: Tag1, Tag2
date: YYYY-MM-DD
lang: java
---
```

### 백준 / 구름LEVEL

- `Main` 클래스 + `public static void main`
- `BufferedReader` + `StringTokenizer` 로 빠른 입력, `BufferedWriter` 로 출력 (마지막에 flush/close)
- 백준 허브로 커밋된 문제 폴더에는 문제 정보가 담긴 `README.md` 가 함께 있습니다.

### SQL

- LeetCode SQL 문제: `Solution.sql`
- 프로그래머스 SQL 문제: `프로그래머스/0/ ~ 3/`
- 기타 MySQL 연습: 루트의 `Coding_TEST_MySQL.sql`

## 🔖 커밋 컨벤션

```
solve: #<문제번호> <문제-슬러그> | runtime: <X> ms (<백분위>%), memory: <Y> MB (<백분위>%)
docs:  분석/문서 추가·수정
```

예시:

```
solve: #561 array-partition | runtime: 18 ms (31.7%), memory: 49.4 MB (85.8%)
docs: add analysis 0144-binary-tree-preorder-traversal
```

## 🧰 템플릿

새 문제를 풀 때 `templates/` 의 파일을 복사해서 시작합니다.

- `templates/leetcode/Solution.java` · `problem.md` · `analysis.md`
- `templates/baekjoon/Main.java`
