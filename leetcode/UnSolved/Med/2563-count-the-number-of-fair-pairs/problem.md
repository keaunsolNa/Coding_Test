---
id: 2563
internal_id: 2699
slug: count-the-number-of-fair-pairs
title: Count the Number of Fair Pairs
difficulty: Medium
tags: Array, Two Pointers, Binary Search, Sorting
date: 2026-04-20
lang: java
---

# 2563. Count the Number of Fair Pairs

**Difficulty:** Medium | **Tags:** Array, Two Pointers, Binary Search, Sorting

## Description

Given a **0-indexed** integer array `nums` of size `n` and two integers `lower` and `upper`, return _the number of fair pairs_.

 A pair `(i, j)` is **fair **if:

 - `0 <= i < j < n`, and
- `lower <= nums[i] + nums[j] <= upper`

 

 **Example 1:**

 ```
Input: nums = [0,1,7,4,4,5], lower = 3, upper = 6
Output: 6
Explanation: There are 6 fair pairs: (0,3), (0,4), (0,5), (1,3), (1,4), and (1,5).
```

 **Example 2:**

 ```
Input: nums = [1,7,9,2,5], lower = 11, upper = 11
Output: 1
Explanation: There is a single fair pair: (2,3).
```

 

 **Constraints:**

 - `1 <= nums.length <= 105`
- `nums.length == n`
- `-109 <= nums[i] <= 109`
- `-109 <= lower <= upper <= 109`
