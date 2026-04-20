---
id: 611
internal_id: 611
slug: valid-triangle-number
title: Valid Triangle Number
difficulty: Medium
tags: Array, Two Pointers, Binary Search, Greedy, Sorting
date: 2026-04-20
lang: java
---

# 611. Valid Triangle Number

**Difficulty:** Medium | **Tags:** Array, Two Pointers, Binary Search, Greedy, Sorting

## Description

Given an integer array `nums`, return _the number of triplets chosen from the array that can make triangles if we take them as side lengths of a triangle_.

 

 **Example 1:**

 ```
Input: nums = [2,2,3,4]
Output: 3
Explanation: Valid combinations are: 
2,3,4 (using the first 2)
2,3,4 (using the second 2)
2,2,3
```

 **Example 2:**

 ```
Input: nums = [4,2,3,4]
Output: 4
```

 

 **Constraints:**

 - `1 <= nums.length <= 1000`
- `0 <= nums[i] <= 1000`
