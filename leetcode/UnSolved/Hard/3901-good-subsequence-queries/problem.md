---
id: 3901
slug: good-subsequence-queries
title: Good Subsequence Queries
difficulty: Hard
tags: 
date: 2026-04-19
lang: java
---

# 3901. Good Subsequence Queries

**Difficulty:** Hard | **Tags:** 

## Description

You are given an integer array `nums` of length `n` and an integer `p`.

 A **non-empty subsequence** of `nums` is called **good** if:

 - Its length is **strictly less** than `n`.
- The **greatest common divisor (GCD)** of its elements is **exactly** `p`.

 You are also given a 2D integer array `queries` of length `q`, where each `queries[i] = [indi, vali]` indicates that you should update `nums[indi]` to `vali`.

 After each query, determine whether there exists **any good subsequence** in the current array.

 Return the **number** of queries for which a **good subsequence** exists.

 The term `gcd(a, b)` denotes the **greatest common divisor** of `a` and `b`. 

 **Example 1:**

  **Input:** nums = [4,8,12,16], p = 2, queries = [[0,3],[2,6]]

 **Output:** 1

 **Explanation:**

    i `[indi, vali]` Operation Updated `nums` Any good Subsequence     0 `[0, 3]` Update `nums[0]` to `3` `[3, 8, 12, 16]` No, as no subsequence has GCD exactly `p = 2`   1 `[2, 6]` Update `nums[2]` to `6` `[3, 8, 6, 16]` Yes, subsequence `[8, 6]` has GCD exactly `p = 2`    Thus, the answer is 1.

  **Example 2:**

  **Input:** nums = [4,5,7,8], p = 3, queries = [[0,6],[1,9],[2,3]]

 **Output:** 2

 **Explanation:**

    i `[indi, vali]` Operation Updated `nums` Any good Subsequence     0 `[0, 6]` Update `nums[0]` to `6` `[6, 5, 7, 8]` No, as no subsequence has GCD exactly `p = 3`   1 `[1, 9]` Update `nums[1]` to `9` `[6, 9, 7, 8]` Yes, subsequence `[6, 9]` has GCD exactly `p = 3`   2 `[2, 3]` Update `nums[2]` to `3` `[6, 9, 3, 8]` Yes, subsequence `[6, 9, 3]` has GCD exactly `p = 3`    Thus, the answer is 2.

  **Example 3:**

  **Input:** nums = [5,7,9], p = 2, queries = [[1,4],[2,8]]

 **Output:** 0

 **Explanation:**

    i `[indi, vali]` Operation Updated `nums` Any good Subsequence     0 `[1, 4]` Update `nums[1]` to `4` `[5, 4, 9]` No, as no subsequence has GCD exactly `p = 2`   1 `[2, 8]` Update `nums[2]` to `8` `[5, 4, 8]` No, as no subsequence has GCD exactly `p = 2`    Thus, the answer is 0.

  

 **Constraints:**

 - `2 <= n == nums.length <= 5 * 104`
- `1 <= nums[i] <= 5 * 104`
- `1 <= queries.length <= 5 * 104`
- `queries[i] = [indi, vali]`
- `1 <= vali, p <= 5 * 104`
- `0 <= indi <= n - 1`
