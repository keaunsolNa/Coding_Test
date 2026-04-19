---
id: 3177
slug: find-the-maximum-length-of-a-good-subsequence-ii
title: Find the Maximum Length of a Good Subsequence II
difficulty: Hard
tags: Array, Hash Table, Dynamic Programming
date: 2026-04-19
lang: java
---

# 3177. Find the Maximum Length of a Good Subsequence II

**Difficulty:** Hard | **Tags:** Array, Hash Table, Dynamic Programming

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

 - `1 <= nums.length <= 5 * 103`
- `1 <= nums[i] <= 109`
- `0 <= k <= min(50, nums.length)`
