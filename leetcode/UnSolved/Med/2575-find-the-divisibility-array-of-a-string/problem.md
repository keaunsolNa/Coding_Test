---
id: 2575
slug: find-the-divisibility-array-of-a-string
title: Find the Divisibility Array of a String
difficulty: Medium
tags: Array, Math, String
date: 2026-04-20
lang: java
---

# 2575. Find the Divisibility Array of a String

**Difficulty:** Medium | **Tags:** Array, Math, String

## Description

You are given a **0-indexed** string `word` of length `n` consisting of digits, and a positive integer `m`.

 The **divisibility array** `div` of `word` is an integer array of length `n` such that:

 - `div[i] = 1` if the **numeric value** of `word[0,...,i]` is divisible by `m`, or
- `div[i] = 0` otherwise.

 Return_ the divisibility array of__ _`word`.

 

 **Example 1:**

 ```
Input: word = "998244353", m = 3
Output: [1,1,0,0,0,1,1,0,0]
Explanation: There are only 4 prefixes that are divisible by 3: "9", "99", "998244", and "9982443".
```

 **Example 2:**

 ```
Input: word = "1010", m = 10
Output: [0,1,0,1]
Explanation: There are only 2 prefixes that are divisible by 10: "10", and "1010".
```

 

 **Constraints:**

 - `1 <= n <= 105`
- `word.length == n`
- `word` consists of digits from `0` to `9`
- `1 <= m <= 109`
