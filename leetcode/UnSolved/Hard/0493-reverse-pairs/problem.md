---
id: 493
slug: reverse-pairs
title: Reverse Pairs
difficulty: Hard
tags: Array, Binary Search, Divide and Conquer, Binary Indexed Tree, Segment Tree, Merge Sort, Ordered Set
date: 2026-04-19
lang: java
---

# 493. Reverse Pairs

**Difficulty:** Hard | **Tags:** Array, Binary Search, Divide and Conquer, Binary Indexed Tree, Segment Tree, Merge Sort, Ordered Set

## Description

Given an integer array `nums`, return _the number of **reverse pairs** in the array_.

 A **reverse pair** is a pair `(i, j)` where:

 - `0 <= i < j < nums.length` and
- `nums[i] > 2 * nums[j]`.

 

 **Example 1:**

 ```
Input: nums = [1,3,2,3,1]
Output: 2
Explanation: The reverse pairs are:
(1, 4) --> nums[1] = 3, nums[4] = 1, 3 > 2 * 1
(3, 4) --> nums[3] = 3, nums[4] = 1, 3 > 2 * 1
```

 **Example 2:**

 ```
Input: nums = [2,4,3,5,1]
Output: 3
Explanation: The reverse pairs are:
(1, 4) --> nums[1] = 4, nums[4] = 1, 4 > 2 * 1
(2, 4) --> nums[2] = 3, nums[4] = 1, 3 > 2 * 1
(3, 4) --> nums[3] = 5, nums[4] = 1, 5 > 2 * 1
```

 

 **Constraints:**

 - `1 <= nums.length <= 5 * 104`
- `-231 <= nums[i] <= 231 - 1`
