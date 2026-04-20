---
id: 3101
internal_id: 3374
slug: count-alternating-subarrays
title: Count Alternating Subarrays
difficulty: Medium
tags: Array, Math
date: 2026-04-20
lang: java
---

# 3101. Count Alternating Subarrays

**Difficulty:** Medium | **Tags:** Array, Math

## Description

You are given a binary array `nums`.

 We call a subarray **alternating** if **no** two **adjacent** elements in the subarray have the **same** value.

 Return _the number of alternating subarrays in _`nums`.

 

 **Example 1:**

  **Input:** nums = [0,1,1,1]

 **Output:** 5

 **Explanation:**

 The following subarrays are alternating: `[0]`, `[1]`, `[1]`, `[1]`, and `[0,1]`.

  **Example 2:**

  **Input:** nums = [1,0,1,0]

 **Output:** 10

 **Explanation:**

 Every subarray of the array is alternating. There are 10 possible subarrays that we can choose.

  

 **Constraints:**

 - `1 <= nums.length <= 105`
- `nums[i]` is either `0` or `1`.
