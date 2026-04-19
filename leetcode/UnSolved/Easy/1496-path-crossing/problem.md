---
id: 1496
slug: path-crossing
title: Path Crossing
difficulty: Easy
tags: Hash Table, String
date: 2026-04-19
lang: java
---

# 1496. Path Crossing

**Difficulty:** Easy | **Tags:** Hash Table, String

## Description

Given a string `path`, where `path[i] = 'N'`, `'S'`, `'E'` or `'W'`, each representing moving one unit north, south, east, or west, respectively. You start at the origin `(0, 0)` on a 2D plane and walk on the path specified by `path`.

 Return `true` _if the path crosses itself at any point, that is, if at any time you are on a location you have previously visited_. Return `false` otherwise.

 

 **Example 1:**

  ```
Input: path = "NES"
Output: false 
Explanation: Notice that the path doesn't cross any point more than once.
```

 **Example 2:**

  ```
Input: path = "NESWW"
Output: true
Explanation: Notice that the path visits the origin twice.
```

 

 **Constraints:**

 - `1 <= path.length <= 104`
- `path[i]` is either `'N'`, `'S'`, `'E'`, or `'W'`.
