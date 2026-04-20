---
id: 219
internal_id: 219
slug: contains-duplicate-ii
title: Contains Duplicate II
difficulty: Easy
tags: Array, Hash Table, Sliding Window
date: 2026-04-20
lang: java
---

# 219. Contains Duplicate II

**Difficulty:** Easy | **Tags:** Array, Hash Table, Sliding Window

## Description

Given an integer array `nums` and an integer `k`, return `true` _if there are two **distinct indices** _`i`_ and _`j`_ in the array such that _`nums[i] == nums[j]`_ and _`abs(i - j) <= k`.

 

 **Example 1:**

 ```
Input: nums = [1,2,3,1], k = 3
Output: true
```

 **Example 2:**

 ```
Input: nums = [1,0,1,1], k = 1
Output: true
```

 **Example 3:**

 ```
Input: nums = [1,2,3,1,2,3], k = 2
Output: false
```

 

 **Constraints:**

 - `1 <= nums.length <= 105`
- `-109 <= nums[i] <= 109`
- `0 <= k <= 105`
