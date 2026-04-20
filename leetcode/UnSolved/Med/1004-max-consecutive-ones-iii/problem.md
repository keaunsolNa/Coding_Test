---
id: 1004
internal_id: 1046
slug: max-consecutive-ones-iii
title: Max Consecutive Ones III
difficulty: Medium
tags: Array, Binary Search, Sliding Window, Prefix Sum
date: 2026-04-20
lang: java
---

# 1004. Max Consecutive Ones III

**Difficulty:** Medium | **Tags:** Array, Binary Search, Sliding Window, Prefix Sum

## Description

Given a binary array `nums` and an integer `k`, return _the maximum number of consecutive _`1`_'s in the array if you can flip at most_ `k` `0`'s.

 

 **Example 1:**

 ```
Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
```

 **Example 2:**

 ```
Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
```

 

 **Constraints:**

 - `1 <= nums.length <= 105`
- `nums[i]` is either `0` or `1`.
- `0 <= k <= nums.length`
