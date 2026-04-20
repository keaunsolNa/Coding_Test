---
id: 3759
internal_id: 4141
slug: count-elements-with-at-least-k-greater-values
title: Count Elements With at Least K Greater Values
difficulty: Medium
tags: Array, Binary Search, Divide and Conquer, Sorting, Quickselect
date: 2026-04-20
lang: java
---

# 3759. Count Elements With at Least K Greater Values

**Difficulty:** Medium | **Tags:** Array, Binary Search, Divide and Conquer, Sorting, Quickselect

## Description

You are given an integer array `nums` of length `n` and an integer `k`.

 An element in `nums` is said to be **qualified** if there exist **at least** `k` elements in the array that are **strictly greater** than it.

 Return an integer denoting the total number of qualified elements in `nums`.

 

 **Example 1:**

  **Input:** nums = [3,1,2], k = 1

 **Output:** 2

 **Explanation:**

 The elements 1 and 2 each have at least `k = 1` element greater than themselves.
 No element is greater than 3. Therefore, the answer is 2.

  **Example 2:**

  **Input:** nums = [5,5,5], k = 2

 **Output:** 0

 **Explanation:**

 Since all elements are equal to 5, no element is greater than the other. Therefore, the answer is 0.

  

 **Constraints:**

 - `1 <= n == nums.length <= 105`
- `1 <= nums[i] <= 109`
- `0 <= k < n`
