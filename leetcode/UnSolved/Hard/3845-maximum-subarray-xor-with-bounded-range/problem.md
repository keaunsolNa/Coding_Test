---
id: 3845
slug: maximum-subarray-xor-with-bounded-range
title: Maximum Subarray XOR with Bounded Range
difficulty: Hard
tags: Array, Bit Manipulation, Trie, Queue, Sliding Window, Prefix Sum, Monotonic Queue
date: 2026-04-19
lang: java
---

# 3845. Maximum Subarray XOR with Bounded Range

**Difficulty:** Hard | **Tags:** Array, Bit Manipulation, Trie, Queue, Sliding Window, Prefix Sum, Monotonic Queue

## Description

You are given a non-negative integer array `nums` and an integer `k`.

 You must select a **subarray** of `nums` such that the **difference** between its **maximum** and **minimum** elements is at most `k`. The **value** of this subarray is the bitwise XOR of all elements in the subarray.

 Return an integer denoting the **maximum** possible **value** of the selected subarray.

 

 **Example 1:**

  **Input:** nums = [5,4,5,6], k = 2

 **Output:** 7

 **Explanation:**

 - Select the subarray `[5, 4, 5, 6]`.
- The difference between its maximum and minimum elements is `6 - 4 = 2 <= k`.
- The value is `4 XOR 5 XOR 6 = 7`.

  **Example 2:**

  **Input:** nums = [5,4,5,6], k = 1

 **Output:** 6

 **Explanation:**

 - Select the subarray `[5, 4, 5, 6]`.
- The difference between its maximum and minimum elements is `6 - 6 = 0 <= k`.
- The value is 6.

  

 **Constraints:**

 - `1 <= nums.length <= 4 * 104`
- `0 <= nums[i] < 215`
- `0 <= k < 215`
