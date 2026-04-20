---
id: 896
internal_id: 932
slug: monotonic-array
title: Monotonic Array
difficulty: Easy
tags: Array
date: 2026-04-20
lang: java
---

# 896. Monotonic Array

**Difficulty:** Easy | **Tags:** Array

## Description

An array is **monotonic** if it is either monotone increasing or monotone decreasing.

 An array `nums` is monotone increasing if for all `i <= j`, `nums[i] <= nums[j]`. An array `nums` is monotone decreasing if for all `i <= j`, `nums[i] >= nums[j]`.

 Given an integer array `nums`, return `true`_ if the given array is monotonic, or _`false`_ otherwise_.

 

 **Example 1:**

 ```
Input: nums = [1,2,2,3]
Output: true
```

 **Example 2:**

 ```
Input: nums = [6,5,4,4]
Output: true
```

 **Example 3:**

 ```
Input: nums = [1,3,2]
Output: false
```

 

 **Constraints:**

 - `1 <= nums.length <= 105`
- `-105 <= nums[i] <= 105`
