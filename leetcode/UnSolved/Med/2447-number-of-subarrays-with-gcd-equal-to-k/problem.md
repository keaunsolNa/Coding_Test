---
id: 2447
slug: number-of-subarrays-with-gcd-equal-to-k
title: Number of Subarrays With GCD Equal to K
difficulty: Medium
tags: Array, Math, Number Theory
date: 2026-04-20
lang: java
---

# 2447. Number of Subarrays With GCD Equal to K

**Difficulty:** Medium | **Tags:** Array, Math, Number Theory

## Description

Given an integer array `nums` and an integer `k`, return _the number of **subarrays** of _`nums`_ where the greatest common divisor of the subarray's elements is _`k`.

 A **subarray** is a contiguous non-empty sequence of elements within an array.

 The **greatest common divisor of an array** is the largest integer that evenly divides all the array elements.

 

 **Example 1:**

 ```
Input: nums = [9,3,1,2,6,3], k = 3
Output: 4
Explanation: The subarrays of nums where 3 is the greatest common divisor of all the subarray's elements are:
- [9,3,1,2,6,3]
- [9,3,1,2,6,3]
- [9,3,1,2,6,3]
- [9,3,1,2,6,3]
```

 **Example 2:**

 ```
Input: nums = [4], k = 7
Output: 0
Explanation: There are no subarrays of nums where 7 is the greatest common divisor of all the subarray's elements.
```

 

 **Constraints:**

 - `1 <= nums.length <= 1000`
- `1 <= nums[i], k <= 109`
