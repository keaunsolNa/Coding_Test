---
id: 3780
internal_id: 4160
slug: maximum-sum-of-three-numbers-divisible-by-three
title: Maximum Sum of Three Numbers Divisible by Three
difficulty: Medium
tags: Array, Greedy, Sorting, Heap (Priority Queue)
date: 2026-04-20
lang: java
---

# 3780. Maximum Sum of Three Numbers Divisible by Three

**Difficulty:** Medium | **Tags:** Array, Greedy, Sorting, Heap (Priority Queue)

## Description

You are given an integer array `nums`.

 Your task is to choose **exactly three** integers from `nums` such that their sum is divisible by three.

 Return the **maximum** possible sum of such a triplet. If no such triplet exists, return 0.

 

 **Example 1:**

  **Input:** nums = [4,2,3,1]

 **Output:** 9

 **Explanation:**

 The valid triplets whose sum is divisible by 3 are:

 - `(4, 2, 3)` with a sum of `4 + 2 + 3 = 9`.
- `(2, 3, 1)` with a sum of `2 + 3 + 1 = 6`.

 Thus, the answer is 9.

  **Example 2:**

  **Input:** nums = [2,1,5]

 **Output:** 0

 **Explanation:**

 No triplet forms a sum divisible by 3, so the answer is 0.

  

 **Constraints:**

 - `3 <= nums.length <= 105`
- `1 <= nums[i] <= 105`
