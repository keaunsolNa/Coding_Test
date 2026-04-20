---
id: 2929
internal_id: 3201
slug: distribute-candies-among-children-ii
title: Distribute Candies Among Children II
difficulty: Medium
tags: Math, Combinatorics, Enumeration
date: 2026-04-20
lang: java
---

# 2929. Distribute Candies Among Children II

**Difficulty:** Medium | **Tags:** Math, Combinatorics, Enumeration

## Description

You are given two positive integers `n` and `limit`.

 Return _the **total number** of ways to distribute _`n` _candies among _`3`_ children such that no child gets more than _`limit`_ candies._

 

 **Example 1:**

 ```
Input: n = 5, limit = 2
Output: 3
Explanation: There are 3 ways to distribute 5 candies such that no child gets more than 2 candies: (1, 2, 2), (2, 1, 2) and (2, 2, 1).
```

 **Example 2:**

 ```
Input: n = 3, limit = 3
Output: 10
Explanation: There are 10 ways to distribute 3 candies such that no child gets more than 3 candies: (0, 0, 3), (0, 1, 2), (0, 2, 1), (0, 3, 0), (1, 0, 2), (1, 1, 1), (1, 2, 0), (2, 0, 1), (2, 1, 0) and (3, 0, 0).
```

 

 **Constraints:**

 - `1 <= n <= 106`
- `1 <= limit <= 106`
