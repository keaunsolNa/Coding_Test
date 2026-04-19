---
id: 1886
slug: determine-whether-matrix-can-be-obtained-by-rotation
title: Determine Whether Matrix Can Be Obtained By Rotation
difficulty: Easy
tags: Array, Matrix
date: 2026-04-19
lang: java
---

# 1886. Determine Whether Matrix Can Be Obtained By Rotation

**Difficulty:** Easy | **Tags:** Array, Matrix

## Description

Given two `n x n` binary matrices `mat` and `target`, return `true`_ if it is possible to make _`mat`_ equal to _`target`_ by **rotating** _`mat`_ in **90-degree increments**, or _`false`_ otherwise._

 

 **Example 1:**

  ```
Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
Output: true
Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.
```

 **Example 2:**

  ```
Input: mat = [[0,1],[1,1]], target = [[1,0],[0,1]]
Output: false
Explanation: It is impossible to make mat equal to target by rotating mat.
```

 **Example 3:**

  ```
Input: mat = [[0,0,0],[0,1,0],[1,1,1]], target = [[1,1,1],[0,1,0],[0,0,0]]
Output: true
Explanation: We can rotate mat 90 degrees clockwise two times to make mat equal target.
```

 

 **Constraints:**

 - `n == mat.length == target.length`
- `n == mat[i].length == target[i].length`
- `1 <= n <= 10`
- `mat[i][j]` and `target[i][j]` are either `0` or `1`.
