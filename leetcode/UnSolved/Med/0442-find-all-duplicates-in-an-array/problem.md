---
id: 442
internal_id: 442
slug: find-all-duplicates-in-an-array
title: Find All Duplicates in an Array
difficulty: Medium
tags: Array, Hash Table, Sorting
date: 2026-04-20
lang: java
---

# 442. Find All Duplicates in an Array

**Difficulty:** Medium | **Tags:** Array, Hash Table, Sorting

## Description

Given an integer array `nums` of length `n` where all the integers of `nums` are in the range `[1, n]` and each integer appears **at most** **twice**, return _an array of all the integers that appears **twice**_.

 You must write an algorithm that runs in `O(n)` time and uses only _constant_ auxiliary space, excluding the space needed to store the output

 

 **Example 1:**

 ```
Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]
```

**Example 2:**

 ```
Input: nums = [1,1,2]
Output: [1]
```

**Example 3:**

 ```
Input: nums = [1]
Output: []
```

 

 **Constraints:**

 - `n == nums.length`
- `1 <= n <= 105`
- `1 <= nums[i] <= n`
- Each element in `nums` appears **once** or **twice**.
