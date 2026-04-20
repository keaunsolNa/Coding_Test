---
id: 542
internal_id: 542
slug: 01-matrix
title: 01 Matrix
difficulty: Medium
tags: Array, Dynamic Programming, Breadth-First Search, Matrix
date: 2026-04-20
lang: java
---

# 542. 01 Matrix

**Difficulty:** Medium | **Tags:** Array, Dynamic Programming, Breadth-First Search, Matrix

## Description

Given an `m x n` binary matrix `mat`, return _the distance of the nearest _`0`_ for each cell_.

 The distance between two cells sharing a common edge is `1`.

 

 **Example 1:**

  ```
Input: mat = [[0,0,0],[0,1,0],[0,0,0]]
Output: [[0,0,0],[0,1,0],[0,0,0]]
```

 **Example 2:**

  ```
Input: mat = [[0,0,0],[0,1,0],[1,1,1]]
Output: [[0,0,0],[0,1,0],[1,2,1]]
```

 

 **Constraints:**

 - `m == mat.length`
- `n == mat[i].length`
- `1 <= m, n <= 104`
- `1 <= m * n <= 104`
- `mat[i][j]` is either `0` or `1`.
- There is at least one `0` in `mat`.

 

 **Note:** This question is the same as 1765: https://leetcode.com/problems/map-of-highest-peak/
