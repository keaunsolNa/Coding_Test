---
id: 1292
internal_id: 1413
slug: maximum-side-length-of-a-square-with-sum-less-than-or-equal-to-threshold
title: Maximum Side Length of a Square with Sum Less than or Equal to Threshold
difficulty: Medium
tags: Array, Binary Search, Matrix, Prefix Sum
date: 2026-04-20
lang: java
---

# 1292. Maximum Side Length of a Square with Sum Less than or Equal to Threshold

**Difficulty:** Medium | **Tags:** Array, Binary Search, Matrix, Prefix Sum

## Description

Given a `m x n` matrix `mat` and an integer `threshold`, return _the maximum side-length of a square with a sum less than or equal to _`threshold`_ or return _`0`_ if there is no such square_.

 

 **Example 1:**

  ```
Input: mat = [[1,1,3,2,4,3,2],[1,1,3,2,4,3,2],[1,1,3,2,4,3,2]], threshold = 4
Output: 2
Explanation: The maximum side length of square with sum less than or equal to 4 is 2 as shown.
```

 **Example 2:**

 ```
Input: mat = [[2,2,2,2,2],[2,2,2,2,2],[2,2,2,2,2],[2,2,2,2,2],[2,2,2,2,2]], threshold = 1
Output: 0
```

 

 **Constraints:**

 - `m == mat.length`
- `n == mat[i].length`
- `1 <= m, n <= 300`
- `0 <= mat[i][j] <= 104`
- `0 <= threshold <= 105`
