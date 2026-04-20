---
id: 932
internal_id: 968
slug: beautiful-array
title: Beautiful Array
difficulty: Medium
tags: Array, Math, Divide and Conquer
date: 2026-04-20
lang: java
---

# 932. Beautiful Array

**Difficulty:** Medium | **Tags:** Array, Math, Divide and Conquer

## Description

An array `nums` of length `n` is **beautiful** if:

 - `nums` is a permutation of the integers in the range `[1, n]`.
- For every `0 <= i < j < n`, there is no index `k` with `i < k < j` where `2 * nums[k] == nums[i] + nums[j]`.

 Given the integer `n`, return _any **beautiful** array _`nums`_ of length _`n`. There will be at least one valid answer for the given `n`.

 

 **Example 1:**

 ```
Input: n = 4
Output: [2,1,4,3]
```

**Example 2:**

 ```
Input: n = 5
Output: [3,1,2,5,4]
```

 

 **Constraints:**

 - `1 <= n <= 1000`
