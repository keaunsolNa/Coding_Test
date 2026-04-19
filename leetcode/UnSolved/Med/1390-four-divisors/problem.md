---
id: 1390
slug: four-divisors
title: Four Divisors
difficulty: Medium
tags: Array, Math
date: 2026-04-20
lang: java
---

# 1390. Four Divisors

**Difficulty:** Medium | **Tags:** Array, Math

## Description

Given an integer array `nums`, return _the sum of divisors of the integers in that array that have exactly four divisors_. If there is no such integer in the array, return `0`.

 

 **Example 1:**

 ```
Input: nums = [21,4,7]
Output: 32
Explanation: 
21 has 4 divisors: 1, 3, 7, 21
4 has 3 divisors: 1, 2, 4
7 has 2 divisors: 1, 7
The answer is the sum of divisors of 21 only.
```

 **Example 2:**

 ```
Input: nums = [21,21]
Output: 64
```

 **Example 3:**

 ```
Input: nums = [1,2,3,4,5]
Output: 0
```

 

 **Constraints:**

 - `1 <= nums.length <= 104`
- `1 <= nums[i] <= 105`
