---
id: 1128
slug: number-of-equivalent-domino-pairs
title: Number of Equivalent Domino Pairs
difficulty: Easy
tags: Array, Hash Table, Counting
date: 2026-04-19
lang: java
---

# 1128. Number of Equivalent Domino Pairs

**Difficulty:** Easy | **Tags:** Array, Hash Table, Counting

## Description

Given a list of `dominoes`, `dominoes[i] = [a, b]` is **equivalent to** `dominoes[j] = [c, d]` if and only if either (`a == c` and `b == d`), or (`a == d` and `b == c`) - that is, one domino can be rotated to be equal to another domino.

 Return _the number of pairs _`(i, j)`_ for which _`0 <= i < j < dominoes.length`_, and _`dominoes[i]`_ is **equivalent to** _`dominoes[j]`.

 

 **Example 1:**

 ```
Input: dominoes = [[1,2],[2,1],[3,4],[5,6]]
Output: 1
```

 **Example 2:**

 ```
Input: dominoes = [[1,2],[1,2],[1,1],[1,2],[2,2]]
Output: 3
```

 

 **Constraints:**

 - `1 <= dominoes.length <= 4 * 104`
- `dominoes[i].length == 2`
- `1 <= dominoes[i][j] <= 9`
