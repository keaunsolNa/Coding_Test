---
id: 3858
slug: minimum-bitwise-or-from-grid
title: Minimum Bitwise OR From Grid
difficulty: Medium
tags: Array, Greedy, Bit Manipulation, Matrix
date: 2026-04-20
lang: java
---

# 3858. Minimum Bitwise OR From Grid

**Difficulty:** Medium | **Tags:** Array, Greedy, Bit Manipulation, Matrix

## Description

You are given a 2D integer array `grid` of size `m x n`.

 You must select **exactly one** integer from each row of the grid.

 Return an integer denoting the **minimum possible bitwise OR** of the selected integers from each row.

 

 **Example 1:**

  **Input:** grid = [[1,5],[2,4]]

 **Output:** 3

 **Explanation:**

 - Choose 1 from the first row and 2 from the second row.
- The bitwise OR of `1 | 2 = 3`, which is the minimum possible.

  **Example 2:**

  **Input:** grid = [[3,5],[6,4]]

 **Output:** 5

 **Explanation:**

 - Choose 5 from the first row and 4 from the second row.
- The bitwise OR of `5 | 4 = 5`, which is the minimum possible.

  **Example 3:**

  **Input:** grid = [[7,9,8]]

 **Output:** 7

 **Explanation:**

 - Choosing 7 gives the minimum bitwise OR.

  

 **Constraints:**

 - `1 <= m == grid.length <= 105`
- `1 <= n == grid[i].length <= 105`
- `m * n <= 105`
- `1 <= grid[i][j] <= 105`
