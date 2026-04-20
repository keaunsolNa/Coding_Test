---
id: 3686
internal_id: 4027
slug: number-of-stable-subsequences
title: Number of Stable Subsequences
difficulty: Hard
tags: Array, Dynamic Programming
date: 2026-04-20
lang: java
---

# 3686. Number of Stable Subsequences

**Difficulty:** Hard | **Tags:** Array, Dynamic Programming

## Description

You are given an integer array `nums`.

 A **subsequence** is **stable** if it does not contain **three consecutive** elements with the **same** parity when the subsequence is read **in order** (i.e., consecutive **inside the subsequence**).

 Return the number of stable subsequences.

 Since the answer may be too large, return it **modulo** `109 + 7`.

 

 **Example 1:**

  **Input:** nums = [1,3,5]

 **Output:** 6

 **Explanation:**

 - Stable subsequences are `[1]`, `[3]`, `[5]`, `[1, 3]`, `[1, 5]`, and `[3, 5]`.
- Subsequence `[1, 3, 5]` is not stable because it contains three consecutive odd numbers. Thus, the answer is 6.

  **Example 2:**

  **Input:** nums = [2,3,4,2]

 **Output:** 14

 **Explanation:**

 - The only subsequence that is not stable is `[2, 4, 2]`, which contains three consecutive even numbers.
- All other subsequences are stable. Thus, the answer is 14.

  

 **Constraints:**

 - `1 <= nums.length <= 105`
- `1 <= nums[i] <= 105`
