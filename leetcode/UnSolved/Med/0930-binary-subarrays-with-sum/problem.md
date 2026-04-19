---
id: 930
slug: binary-subarrays-with-sum
title: Binary Subarrays With Sum
difficulty: Medium
tags: Array, Hash Table, Sliding Window, Prefix Sum
date: 2026-04-20
lang: java
---

# 930. Binary Subarrays With Sum

**Difficulty:** Medium | **Tags:** Array, Hash Table, Sliding Window, Prefix Sum

## Description

Given a binary array `nums` and an integer `goal`, return _the number of non-empty **subarrays** with a sum_ `goal`.

 A **subarray** is a contiguous part of the array.

 

 **Example 1:**

 ```
Input: nums = [1,0,1,0,1], goal = 2
Output: 4
Explanation: The 4 subarrays are bolded and underlined below:
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]
```

 **Example 2:**

 ```
Input: nums = [0,0,0,0,0], goal = 0
Output: 15
```

 

 **Constraints:**

 - `1 <= nums.length <= 3 * 104`
- `nums[i]` is either `0` or `1`.
- `0 <= goal <= nums.length`
