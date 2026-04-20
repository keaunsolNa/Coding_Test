---
id: 3145
internal_id: 3411
slug: find-products-of-elements-of-big-array
title: Find Products of Elements of Big Array
difficulty: Hard
tags: Array, Binary Search, Bit Manipulation
date: 2026-04-20
lang: java
---

# 3145. Find Products of Elements of Big Array

**Difficulty:** Hard | **Tags:** Array, Binary Search, Bit Manipulation

## Description

The **powerful array** of a non-negative integer `x` is defined as the shortest sorted array of powers of two that sum up to `x`. The table below illustrates examples of how the **powerful array** is determined. It can be proven that the powerful array of `x` is unique.

    num Binary Representation powerful array   1 00001 [1]   8 01000 [8]   10 01010 [2, 8]   13 01101 [1, 4, 8]   23 10111 [1, 2, 4, 16]    The array `big_nums` is created by concatenating the **powerful arrays** for every positive integer `i` in ascending order: 1, 2, 3, and so on. Thus, `big_nums` begins as `[1, 2, 1, 2, 4, 1, 4, 2, 4, 1, 2, 4, 8, ...]`.

 You are given a 2D integer matrix `queries`, where for `queries[i] = [fromi, toi, modi]` you should calculate `(big_nums[fromi] * big_nums[fromi + 1] * ... * big_nums[toi]) % modi`.

 Return an integer array `answer` such that `answer[i]` is the answer to the `ith` query.

 

 **Example 1:**

  **Input:** queries = [[1,3,7]]

 **Output:** [4]

 **Explanation:**

 There is one query.

 `big_nums[1..3] = [2,1,2]`. The product of them is 4. The result is `4 % 7 = 4.`

  **Example 2:**

  **Input:** queries = [[2,5,3],[7,7,4]]

 **Output:** [2,2]

 **Explanation:**

 There are two queries.

 First query: `big_nums[2..5] = [1,2,4,1]`. The product of them is 8. The result is `8 % 3 = 2`.

 Second query: `big_nums[7] = 2`. The result is `2 % 4 = 2`.

  

 **Constraints:**

 - `1 <= queries.length <= 500`
- `queries[i].length == 3`
- `0 <= queries[i][0] <= queries[i][1] <= 1015`
- `1 <= queries[i][2] <= 105`
