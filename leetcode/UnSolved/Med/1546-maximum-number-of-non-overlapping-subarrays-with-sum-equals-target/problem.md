---
id: 1546
slug: maximum-number-of-non-overlapping-subarrays-with-sum-equals-target
title: Maximum Number of Non-Overlapping Subarrays With Sum Equals Target
difficulty: Medium
tags: Array, Hash Table, Greedy, Prefix Sum
date: 2026-04-20
lang: java
---

# 1546. Maximum Number of Non-Overlapping Subarrays With Sum Equals Target

**Difficulty:** Medium | **Tags:** Array, Hash Table, Greedy, Prefix Sum

## Description

Given an array `nums` and an integer `target`, return _the maximum number of **non-empty** **non-overlapping** subarrays such that the sum of values in each subarray is equal to_ `target`.

 

 **Example 1:**

 ```
Input: nums = [1,1,1,1,1], target = 2
Output: 2
Explanation: There are 2 non-overlapping subarrays [1,1,1,1,1] with sum equals to target(2).
```

 **Example 2:**

 ```
Input: nums = [-1,3,5,1,4,2,-9], target = 6
Output: 2
Explanation: There are 3 subarrays with sum equal to 6.
([5,1], [4,2], [3,5,1,4,2,-9]) but only the first 2 are non-overlapping.
```

 

 **Constraints:**

 - `1 <= nums.length <= 105`
- `-104 <= nums[i] <= 104`
- `0 <= target <= 106`
