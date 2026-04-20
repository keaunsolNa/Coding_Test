---
id: 1020
internal_id: 1073
slug: number-of-enclaves
title: Number of Enclaves
difficulty: Medium
tags: Array, Depth-First Search, Breadth-First Search, Union-Find, Matrix
date: 2026-04-20
lang: java
---

# 1020. Number of Enclaves

**Difficulty:** Medium | **Tags:** Array, Depth-First Search, Breadth-First Search, Union-Find, Matrix

## Description

You are given an `m x n` binary matrix `grid`, where `0` represents a sea cell and `1` represents a land cell.

 A **move** consists of walking from one land cell to another adjacent (**4-directionally**) land cell or walking off the boundary of the `grid`.

 Return _the number of land cells in_ `grid` _for which we cannot walk off the boundary of the grid in any number of **moves**_.

 

 **Example 1:**

  ```
Input: grid = [[0,0,0,0],[1,0,1,0],[0,1,1,0],[0,0,0,0]]
Output: 3
Explanation: There are three 1s that are enclosed by 0s, and one 1 that is not enclosed because its on the boundary.
```

 **Example 2:**

  ```
Input: grid = [[0,1,1,0],[0,0,1,0],[0,0,1,0],[0,0,0,0]]
Output: 0
Explanation: All 1s are either on the boundary or can reach the boundary.
```

 

 **Constraints:**

 - `m == grid.length`
- `n == grid[i].length`
- `1 <= m, n <= 500`
- `grid[i][j]` is either `0` or `1`.
