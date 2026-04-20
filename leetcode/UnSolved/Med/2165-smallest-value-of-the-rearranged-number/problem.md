---
id: 2165
internal_id: 2284
slug: smallest-value-of-the-rearranged-number
title: Smallest Value of the Rearranged Number
difficulty: Medium
tags: Math, Sorting
date: 2026-04-20
lang: java
---

# 2165. Smallest Value of the Rearranged Number

**Difficulty:** Medium | **Tags:** Math, Sorting

## Description

You are given an integer `num.` **Rearrange** the digits of `num` such that its value is **minimized** and it does not contain **any** leading zeros.

 Return _the rearranged number with minimal value_.

 Note that the sign of the number does not change after rearranging the digits.

 

 **Example 1:**

 ```
Input: num = 310
Output: 103
Explanation: The possible arrangements for the digits of 310 are 013, 031, 103, 130, 301, 310. 
The arrangement with the smallest value that does not contain any leading zeros is 103.
```

 **Example 2:**

 ```
Input: num = -7605
Output: -7650
Explanation: Some possible arrangements for the digits of -7605 are -7650, -6705, -5076, -0567.
The arrangement with the smallest value that does not contain any leading zeros is -7650.
```

 

 **Constraints:**

 - `-1015 <= num <= 1015`
