---
id: 1300
internal_id: 1232
slug: sum-of-mutated-array-closest-to-target
title: Sum of Mutated Array Closest to Target
difficulty: Medium
tags: Array, Binary Search, Sorting
date: 2026-04-20
lang: java
---

# 1300. Sum of Mutated Array Closest to Target

**Difficulty:** Medium | **Tags:** Array, Binary Search, Sorting

## Description

Given an integer array `arr` and a target value `target`, return the integer `value` such that when we change all the integers larger than `value` in the given array to be equal to `value`, the sum of the array gets as close as possible (in absolute difference) to `target`.

 In case of a tie, return the minimum such integer.

 Notice that the answer is not neccesarilly a number from `arr`.

 

 **Example 1:**

 ```
Input: arr = [4,9,3], target = 10
Output: 3
Explanation: When using 3 arr converts to [3, 3, 3] which sums 9 and that's the optimal answer.
```

 **Example 2:**

 ```
Input: arr = [2,3,5], target = 10
Output: 5
```

 **Example 3:**

 ```
Input: arr = [60864,25176,27249,21296,20204], target = 56803
Output: 11361
```

 

 **Constraints:**

 - `1 <= arr.length <= 104`
- `1 <= arr[i], target <= 105`
