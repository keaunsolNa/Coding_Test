---
id: 795
internal_id: 811
slug: number-of-subarrays-with-bounded-maximum
title: Number of Subarrays with Bounded Maximum
difficulty: Medium
tags: Array, Two Pointers
date: 2026-04-20
lang: java
---

# 795. Number of Subarrays with Bounded Maximum

**Difficulty:** Medium | **Tags:** Array, Two Pointers

## Description

Given an integer array `nums` and two integers `left` and `right`, return _the number of contiguous non-empty **subarrays** such that the value of the maximum array element in that subarray is in the range _`[left, right]`.

 The test cases are generated so that the answer will fit in a **32-bit** integer.

 

 **Example 1:**

 ```
Input: nums = [2,1,4,3], left = 2, right = 3
Output: 3
Explanation: There are three subarrays that meet the requirements: [2], [2, 1], [3].
```

 **Example 2:**

 ```
Input: nums = [2,9,2,5,6], left = 2, right = 8
Output: 7
```

 

 **Constraints:**

 - `1 <= nums.length <= 105`
- `0 <= nums[i] <= 109`
- `0 <= left <= right <= 109`
