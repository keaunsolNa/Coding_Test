---
id: 3569
internal_id: 3878
slug: maximize-count-of-distinct-primes-after-split
title: Maximize Count of Distinct Primes After Split
difficulty: Hard
tags: Array, Math, Segment Tree, Number Theory
date: 2026-04-20
lang: java
---

# 3569. Maximize Count of Distinct Primes After Split

**Difficulty:** Hard | **Tags:** Array, Math, Segment Tree, Number Theory

## Description

You are given an integer array `nums` having length `n` and a 2D integer array `queries` where `queries[i] = [idx, val]`.

 For each query:

 1. Update `nums[idx] = val`.
2. Choose an integer `k` with `1 <= k < n` to split the array into the non-empty prefix `nums[0..k-1]` and suffix `nums[k..n-1]` such that the sum of the counts of **distinct** prime values in each part is **maximum**.

 **Note:** The changes made to the array in one query persist into the next query.

 Return an array containing the result for each query, in the order they are given.

 

 **Example 1:**

  **Input:** nums = [2,1,3,1,2], queries = [[1,2],[3,3]]

 **Output:** [3,4]

 **Explanation:**

 - Initially `nums = [2, 1, 3, 1, 2]`.
- After 1^st query, `nums = [2, 2, 3, 1, 2]`. Split `nums` into `[2]` and `[2, 3, 1, 2]`. `[2]` consists of 1 distinct prime and `[2, 3, 1, 2]` consists of 2 distinct primes. Hence, the answer for this query is `1 + 2 = 3`.
- After 2^nd query, `nums = [2, 2, 3, 3, 2]`. Split `nums` into `[2, 2, 3]` and `[3, 2]` with an answer of `2 + 2 = 4`.
- The output is `[3, 4]`.

  **Example 2:**

  **Input:** nums = [2,1,4], queries = [[0,1]]

 **Output:** [0]

 **Explanation:**

 - Initially `nums = [2, 1, 4]`.
- After 1^st query, `nums = [1, 1, 4]`. There are no prime numbers in `nums`, hence the answer for this query is 0.
- The output is `[0]`.

  

 **Constraints:**

 - `2 <= n == nums.length <= 5 * 104`
- `1 <= queries.length <= 5 * 104`
- `1 <= nums[i] <= 105`
- `0 <= queries[i][0] < nums.length`
- `1 <= queries[i][1] <= 105`
