---
id: 3176
slug: find-the-maximum-length-of-a-good-subsequence-i
title: Find the Maximum Length of a Good Subsequence I
difficulty: Medium
tags: Array, Hash Table, Dynamic Programming
date: 2026-04-20
lang: java
---

# 3176. Find the Maximum Length of a Good Subsequence I

**Difficulty:** Medium | **Tags:** Array, Hash Table, Dynamic Programming

## Description

You are given an integer array `nums` and a **non-negative** integer `k`. A sequence of integers `seq` is called **good** if there are **at most** `k` indices `i` in the range `[0, seq.length - 2]` such that `seq[i] != seq[i + 1]`.

 Return the **maximum** possible length of a **good** subsequence of `nums`.

 

 **Example 1:**

  **Input:** nums = [1,2,1,1,3], k = 2

 **Output:** 4

 **Explanation:**

 The maximum length subsequence is `[1,2,1,1,3]`.

  **Example 2:**

  **Input:** nums = [1,2,3,4,5,1], k = 0

 **Output:** 2

 **Explanation:**

 The maximum length subsequence is `[1,2,3,4,5,1]`.

  

 **Constraints:**

 - `1 <= nums.length <= 500`
- `1 <= nums[i] <= 109`
- `0 <= k <= min(nums.length, 25)`
