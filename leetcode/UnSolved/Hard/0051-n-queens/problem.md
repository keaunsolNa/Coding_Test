---
id: 51
slug: n-queens
title: N-Queens
difficulty: Hard
tags: Array, Backtracking
date: 2026-04-19
lang: java
---

# 51. N-Queens

**Difficulty:** Hard | **Tags:** Array, Backtracking

## Description

The **n-queens** puzzle is the problem of placing `n` queens on an `n x n` chessboard such that no two queens attack each other.

 Given an integer `n`, return _all distinct solutions to the **n-queens puzzle**_. You may return the answer in **any order**.

 Each solution contains a distinct board configuration of the n-queens' placement, where `'Q'` and `'.'` both indicate a queen and an empty space, respectively.

 

 **Example 1:**

  ```
Input: n = 4
Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
Explanation: There exist two distinct solutions to the 4-queens puzzle as shown above
```

 **Example 2:**

 ```
Input: n = 1
Output: [["Q"]]
```

 

 **Constraints:**

 - `1 <= n <= 9`
