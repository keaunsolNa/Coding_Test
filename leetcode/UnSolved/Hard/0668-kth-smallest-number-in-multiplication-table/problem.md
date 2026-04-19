---
id: 668
slug: kth-smallest-number-in-multiplication-table
title: Kth Smallest Number in Multiplication Table
difficulty: Hard
tags: Math, Binary Search
date: 2026-04-19
lang: java
---

# 668. Kth Smallest Number in Multiplication Table

**Difficulty:** Hard | **Tags:** Math, Binary Search

## Description

Nearly everyone has used the Multiplication Table. The multiplication table of size `m x n` is an integer matrix `mat` where `mat[i][j] == i * j` (**1-indexed**).

 Given three integers `m`, `n`, and `k`, return _the _`kth`_ smallest element in the _`m x n`_ multiplication table_.

 

 **Example 1:**

  ```
Input: m = 3, n = 3, k = 5
Output: 3
Explanation: The 5th smallest number is 3.
```

 **Example 2:**

  ```
Input: m = 2, n = 3, k = 6
Output: 6
Explanation: The 6th smallest number is 6.
```

 

 **Constraints:**

 - `1 <= m, n <= 3 * 104`
- `1 <= k <= m * n`
