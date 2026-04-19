---
id: 3755
slug: find-maximum-balanced-xor-subarray-length
title: Find Maximum Balanced XOR Subarray Length
difficulty: Medium
tags: Array, Hash Table, Bit Manipulation, Prefix Sum
date: 2026-04-20
lang: java
---

# 3755. Find Maximum Balanced XOR Subarray Length

**Difficulty:** Medium | **Tags:** Array, Hash Table, Bit Manipulation, Prefix Sum

## Description

Given an integer array `nums`, return the **length** of the **longest subarray** that has a bitwise XOR of zero and contains an **equal** number of **even** and **odd** numbers. If no such subarray exists, return 0.

 

 **Example 1:**

  **Input:** nums = [3,1,3,2,0]

 **Output:** 4

 **Explanation:**

 The subarray `[1, 3, 2, 0]` has bitwise XOR `1 XOR 3 XOR 2 XOR 0 = 0` and contains 2 even and 2 odd numbers.

  **Example 2:**

  **Input:** nums = [3,2,8,5,4,14,9,15]

 **Output:** 8

 **Explanation:**

 The whole array has bitwise XOR `0` and contains 4 even and 4 odd numbers.

  **Example 3:**

  **Input:** nums = [0]

 **Output:** 0

 **Explanation:**

 No non-empty subarray satisfies both conditions.

  

 **Constraints:**

 - `1 <= nums.length <= 105`
- `0 <= nums[i] <= 109`
