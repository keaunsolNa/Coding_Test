---
id: 2352
slug: equal-row-and-column-pairs
title: Equal Row and Column Pairs
difficulty: Medium
tags: Array, Hash Table, Matrix, Simulation
date: 2026-04-20
lang: java
---

# 2352. Equal Row and Column Pairs

**Difficulty:** Medium | **Tags:** Array, Hash Table, Matrix, Simulation

## Description

Given a **0-indexed** `n x n` integer matrix `grid`, _return the number of pairs _`(ri, cj)`_ such that row _`ri`_ and column _`cj`_ are equal_.

 A row and column pair is considered equal if they contain the same elements in the same order (i.e., an equal array).

 

 **Example 1:**

  ```
Input: grid = [[3,2,1],[1,7,6],[2,7,7]]
Output: 1
Explanation: There is 1 equal row and column pair:
- (Row 2, Column 1): [2,7,7]
```

 **Example 2:**

  ```
Input: grid = [[3,1,2,2],[1,4,4,5],[2,4,2,2],[2,4,2,2]]
Output: 3
Explanation: There are 3 equal row and column pairs:
- (Row 0, Column 0): [3,1,2,2]
- (Row 2, Column 2): [2,4,2,2]
- (Row 3, Column 2): [2,4,2,2]
```

 

 **Constraints:**

 - `n == grid.length == grid[i].length`
- `1 <= n <= 200`
- `1 <= grid[i][j] <= 105`
