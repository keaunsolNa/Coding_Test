---
id: 862
internal_id: 892
slug: shortest-subarray-with-sum-at-least-k
title: Shortest Subarray with Sum at Least K
difficulty: Hard
tags: Array, Binary Search, Queue, Sliding Window, Heap (Priority Queue), Prefix Sum, Monotonic Queue
date: 2026-04-20
lang: java
---

# 862. Shortest Subarray with Sum at Least K

**Difficulty:** Hard | **Tags:** Array, Binary Search, Queue, Sliding Window, Heap (Priority Queue), Prefix Sum, Monotonic Queue

## Description

Given an integer array `nums` and an integer `k`, return _the length of the shortest non-empty **subarray** of _`nums`_ with a sum of at least _`k`. If there is no such **subarray**, return `-1`.

 A **subarray** is a **contiguous** part of an array.

 

 **Example 1:**

 ```
Input: nums = [1], k = 1
Output: 1
```

**Example 2:**

 ```
Input: nums = [1,2], k = 4
Output: -1
```

**Example 3:**

 ```
Input: nums = [2,-1,2], k = 3
Output: 3
```

 

 **Constraints:**

 - `1 <= nums.length <= 105`
- `-105 <= nums[i] <= 105`
- `1 <= k <= 109`
