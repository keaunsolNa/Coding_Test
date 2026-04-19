---
id: 2963
slug: count-the-number-of-good-partitions
title: Count the Number of Good Partitions
difficulty: Hard
tags: Array, Hash Table, Math, Combinatorics
date: 2026-04-19
lang: java
---

# 2963. Count the Number of Good Partitions

**Difficulty:** Hard | **Tags:** Array, Hash Table, Math, Combinatorics

## Description

You are given a **0-indexed** array `nums` consisting of **positive** integers.

 A partition of an array into one or more **contiguous** subarrays is called **good** if no two subarrays contain the same number.

 Return _the **total number** of good partitions of _`nums`.

 Since the answer may be large, return it **modulo** `109 + 7`.

 

 **Example 1:**

 ```
Input: nums = [1,2,3,4]
Output: 8
Explanation: The 8 possible good partitions are: ([1], [2], [3], [4]), ([1], [2], [3,4]), ([1], [2,3], [4]), ([1], [2,3,4]), ([1,2], [3], [4]), ([1,2], [3,4]), ([1,2,3], [4]), and ([1,2,3,4]).
```

 **Example 2:**

 ```
Input: nums = [1,1,1,1]
Output: 1
Explanation: The only possible good partition is: ([1,1,1,1]).
```

 **Example 3:**

 ```
Input: nums = [1,2,1,3]
Output: 2
Explanation: The 2 possible good partitions are: ([1,2,1], [3]) and ([1,2,1,3]).
```

 

 **Constraints:**

 - `1 <= nums.length <= 105`
- `1 <= nums[i] <= 109`
