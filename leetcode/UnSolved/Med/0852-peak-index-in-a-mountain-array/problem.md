---
id: 852
slug: peak-index-in-a-mountain-array
title: Peak Index in a Mountain Array
difficulty: Medium
tags: Array, Binary Search
date: 2026-04-20
lang: java
---

# 852. Peak Index in a Mountain Array

**Difficulty:** Medium | **Tags:** Array, Binary Search

## Description

You are given an integer **mountain** array `arr` of length `n` where the values increase to a **peak element** and then decrease.

 Return the index of the peak element.

 Your task is to solve it in `O(log(n))` time complexity.

 

 **Example 1:**

  **Input:** arr = [0,1,0]

 **Output:** 1

  **Example 2:**

  **Input:** arr = [0,2,1,0]

 **Output:** 1

  **Example 3:**

  **Input:** arr = [0,10,5,2]

 **Output:** 1

  

 **Constraints:**

 - `3 <= arr.length <= 105`
- `0 <= arr[i] <= 106`
- `arr` is **guaranteed** to be a mountain array.
