---
id: 2099
slug: find-subsequence-of-length-k-with-the-largest-sum
title: Find Subsequence of Length K With the Largest Sum
difficulty: Easy
tags: Array, Hash Table, Sorting, Heap (Priority Queue)
date: 2026-04-19
lang: java
---

# 2099. Find Subsequence of Length K With the Largest Sum

**Difficulty:** Easy | **Tags:** Array, Hash Table, Sorting, Heap (Priority Queue)

## Description

You are given an integer array `nums` and an integer `k`. You want to find a **subsequence **of `nums` of length `k` that has the **largest** sum.

 Return_ __**any** such subsequence as an integer array of length _`k`.

 A **subsequence** is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.

 

 **Example 1:**

 ```
Input: nums = [2,1,3,3], k = 2
Output: [3,3]
Explanation:
The subsequence has the largest sum of 3 + 3 = 6.
```

 **Example 2:**

 ```
Input: nums = [-1,-2,3,4], k = 3
Output: [-1,3,4]
Explanation: 
The subsequence has the largest sum of -1 + 3 + 4 = 6.
```

 **Example 3:**

 ```
Input: nums = [3,4,3,3], k = 2
Output: [3,4]
Explanation:
The subsequence has the largest sum of 3 + 4 = 7. 
Another possible subsequence is [4, 3].
```

 

 **Constraints:**

 - `1 <= nums.length <= 1000`
- `-105 <= nums[i] <= 105`
- `1 <= k <= nums.length`
