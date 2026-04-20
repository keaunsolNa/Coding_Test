---
id: 152
internal_id: 152
slug: maximum-product-subarray
title: Maximum Product Subarray
difficulty: Medium
tags: Array, Dynamic Programming
date: 2026-04-20
lang: java
---

# 152. Maximum Product Subarray

**Difficulty:** Medium | **Tags:** Array, Dynamic Programming

## Description

Given an integer array `nums`, find a subarray that has the largest product, and return _the product_.

 The test cases are generated so that the answer will fit in a **32-bit** integer.

 **Note** that the product of an array with a single element is the value of that element.

 

 **Example 1:**

 ```
Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
```

 **Example 2:**

 ```
Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
```

 

 **Constraints:**

 - `1 <= nums.length <= 2 * 104`
- `-10 <= nums[i] <= 10`
- The product of any subarray of `nums` is **guaranteed** to fit in a **32-bit** integer.
