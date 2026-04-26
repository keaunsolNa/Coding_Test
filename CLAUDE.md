# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Repository Overview

This is a competitive programming solutions repository (코딩 테스트 저장소) containing Java solutions for multiple platforms, plus SQL problems. No build system or test runner — solutions are written and submitted directly to online judges.

## Repository Structure

```
CodingTest/src/          # Baekjoon solutions (old style, grouped by topic)
백준/                    # Baekjoon solutions (newer, grouped by tier: Bronze/Silver/Gold/Platinum)
leetcode/Solved/         # LeetCode solutions (Easy/Med/Hard → problem-folder/Solution.java + problem.md)
leetcode/UnSolved/       # LeetCode problems not yet solved
프로그래머스/             # Programmers solutions (lv1–lv5, unrated, 0–3 for SQL)
goormlevel/              # GoormLevel solutions
```

## Commit Message Convention

All commits follow this format (based on git log):
```
solve: #<problem-number> <problem-slug> | runtime: <X> ms (<percentile>%), memory: <Y> MB (<percentile>%)
```

Example: `solve: #561 array-partition | runtime: 18 ms (31.7%), memory: 49.4 MB (85.8%)`

## LeetCode Solution File Layout

Each LeetCode problem lives in its own folder:
- `Solution.java` — bare class (no `public class`, no package, no imports at top; add imports inside the class or rely on judge's implicit imports)
- `problem.md` — frontmatter + full problem statement

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

## Java Style (Baekjoon / GoormLevel)

- `Main` class with `public static void main`
- I/O via `BufferedReader` + `StringTokenizer` (fast I/O pattern)
- `BufferedWriter` for output, flushed and closed at end

## SQL Problems

`Coding_TEST_MySQL.sql` contains MySQL practice queries. LeetCode SQL problems use `Solution.sql`. Programmers SQL problems are under `프로그래머스/0/`, `1/`, `2/`, `3/`.
