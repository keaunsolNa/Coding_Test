---
id: 3309
internal_id: 3579
slug: maximum-possible-number-by-binary-concatenation
title: Maximum Possible Number by Binary Concatenation
difficulty: Medium
tags: Array, Bit Manipulation, Enumeration
date: 2026-04-20
lang: java
---

# 3309. Maximum Possible Number by Binary Concatenation

**Difficulty:** Medium | **Tags:** Array, Bit Manipulation, Enumeration

## Description

You are given an array of integers `nums` of size 3.

 Return the **maximum** possible number whose _binary representation_ can be formed by **concatenating** the _binary representation_ of **all** elements in `nums` in some order.

 **Note** that the binary representation of any number _does not_ contain leading zeros.

 

 **Example 1:**

  **Input:** nums = [1,2,3]

 **Output:** 30

 **Explanation:**

 Concatenate the numbers in the order `[3, 1, 2]` to get the result `"11110"`, which is the binary representation of 30.

  **Example 2:**

  **Input:** nums = [2,8,16]

 **Output:** 1296

 **Explanation:**

 Concatenate the numbers in the order `[2, 8, 16]` to get the result `"10100010000"`, which is the binary representation of 1296.

  

 **Constraints:**

 - `nums.length == 3`
- `1 <= nums[i] <= 127`
