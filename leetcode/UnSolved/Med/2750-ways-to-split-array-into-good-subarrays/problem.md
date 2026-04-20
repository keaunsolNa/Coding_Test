---
id: 2750
internal_id: 2867
slug: ways-to-split-array-into-good-subarrays
title: Ways to Split Array Into Good Subarrays
difficulty: Medium
tags: Array, Math, Dynamic Programming
date: 2026-04-20
lang: java
---

# 2750. Ways to Split Array Into Good Subarrays

**Difficulty:** Medium | **Tags:** Array, Math, Dynamic Programming

## Description

You are given a binary array `nums`.

 A subarray of an array is **good** if it contains **exactly** **one** element with the value `1`.

 Return _an integer denoting the number of ways to split the array _`nums`_ into **good** subarrays_. As the number may be too large, return it **modulo** `109 + 7`.

 A subarray is a contiguous **non-empty** sequence of elements within an array.

 

 **Example 1:**

 ```
Input: nums = [0,1,0,0,1]
Output: 3
Explanation: There are 3 ways to split nums into good subarrays:
- [0,1] [0,0,1]
- [0,1,0] [0,1]
- [0,1,0,0] [1]
```

 **Example 2:**

 ```
Input: nums = [0,1,0]
Output: 1
Explanation: There is 1 way to split nums into good subarrays:
- [0,1,0]
```

 

 **Constraints:**

 - `1 <= nums.length <= 105`
- `0 <= nums[i] <= 1`
