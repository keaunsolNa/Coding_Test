---
id: 1018
slug: binary-prefix-divisible-by-5
title: Binary Prefix Divisible By 5
difficulty: Easy
tags: Array, Bit Manipulation
date: 2026-04-19
lang: java
---

# 1018. Binary Prefix Divisible By 5

**Difficulty:** Easy | **Tags:** Array, Bit Manipulation

## Description

You are given a binary array `nums` (**0-indexed**).

 We define `xi` as the number whose binary representation is the subarray `nums[0..i]` (from most-significant-bit to least-significant-bit).

 - For example, if `nums = [1,0,1]`, then `x0 = 1`, `x1 = 2`, and `x2 = 5`.

 Return _an array of booleans _`answer`_ where _`answer[i]`_ is _`true`_ if _`xi`_ is divisible by _`5`.

 

 **Example 1:**

 ```
Input: nums = [0,1,1]
Output: [true,false,false]
Explanation: The input numbers in binary are 0, 01, 011; which are 0, 1, and 3 in base-10.
Only the first number is divisible by 5, so answer[0] is true.
```

 **Example 2:**

 ```
Input: nums = [1,1,1]
Output: [false,false,false]
```

 

 **Constraints:**

 - `1 <= nums.length <= 105`
- `nums[i]` is either `0` or `1`.
