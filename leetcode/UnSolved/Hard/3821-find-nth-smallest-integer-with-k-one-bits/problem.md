---
id: 3821
slug: find-nth-smallest-integer-with-k-one-bits
title: Find Nth Smallest Integer With K One Bits
difficulty: Hard
tags: Math, Bit Manipulation, Combinatorics
date: 2026-04-19
lang: java
---

# 3821. Find Nth Smallest Integer With K One Bits

**Difficulty:** Hard | **Tags:** Math, Bit Manipulation, Combinatorics

## Description

You are given two positive integers `n` and `k`.

 Return an integer denoting the `nth` smallest positive integer that has **exactly** `k` ones in its binary representation. It is guaranteed that the answer is **strictly less** than `250`.

 

 **Example 1:**

  **Input:** n = 4, k = 2

 **Output:** 9

 **Explanation:**

 The 4 smallest positive integers that have exactly `k = 2` ones in their binary representations are:

 - `3 = 112`
- `5 = 1012`
- `6 = 1102`
- `9 = 10012`

  **Example 2:**

  **Input:** n = 3, k = 1

 **Output:** 4

 **Explanation:**

 The 3 smallest positive integers that have exactly `k = 1` one in their binary representations are:

 - `1 = 12`
- `2 = 102`
- `4 = 1002`

  

 **Constraints:**

 - `1 <= n <= 250`
- `1 <= k <= 50`
- The answer is strictly less than `250`.
