---
id: 3779
internal_id: 4162
slug: minimum-number-of-operations-to-have-distinct-elements
title: Minimum Number of Operations to Have Distinct Elements
difficulty: Medium
tags: Array, Hash Table
date: 2026-04-20
lang: java
---

# 3779. Minimum Number of Operations to Have Distinct Elements

**Difficulty:** Medium | **Tags:** Array, Hash Table

## Description

You are given an integer array `nums`.

 In one operation, you remove the **first three elements** of the current array. If there are fewer than three elements remaining, **all** remaining elements are removed.

 Repeat this operation until the array is empty or contains no duplicate values.

 Return an integer denoting the number of operations required.

 

 **Example 1:**

  **Input:** nums = [3,8,3,6,5,8]

 **Output:** 1

 **Explanation:**

 In the first operation, we remove the first three elements. The remaining elements `[6, 5, 8]` are all distinct, so we stop. Only one operation is needed.

  **Example 2:**

  **Input:** nums = [2,2]

 **Output:** 1

 **Explanation:**

 After one operation, the array becomes empty, which meets the stopping condition.

  **Example 3:**

  **Input:** nums = [4,3,5,1,2]

 **Output:** 0

 **Explanation:**

 All elements in the array are distinct, therefore no operations are needed.

  

 **Constraints:**

 - `1 <= nums.length <= 105`
- `1 <= nums[i] <= 105`
