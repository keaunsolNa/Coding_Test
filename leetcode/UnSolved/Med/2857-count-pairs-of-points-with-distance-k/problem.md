---
id: 2857
slug: count-pairs-of-points-with-distance-k
title: Count Pairs of Points With Distance k
difficulty: Medium
tags: Array, Hash Table, Bit Manipulation
date: 2026-04-20
lang: java
---

# 2857. Count Pairs of Points With Distance k

**Difficulty:** Medium | **Tags:** Array, Hash Table, Bit Manipulation

## Description

You are given a **2D** integer array `coordinates` and an integer `k`, where `coordinates[i] = [xi, yi]` are the coordinates of the `ith` point in a 2D plane.

 We define the **distance** between two points `(x1, y1)` and `(x2, y2)` as `(x1 XOR x2) + (y1 XOR y2)` where `XOR` is the bitwise `XOR` operation.

 Return _the number of pairs _`(i, j)`_ such that _`i < j`_ and the distance between points _`i`_ and _`j`_ is equal to _`k`.

 

 **Example 1:**

 ```
Input: coordinates = [[1,2],[4,2],[1,3],[5,2]], k = 5
Output: 2
Explanation: We can choose the following pairs:
- (0,1): Because we have (1 XOR 4) + (2 XOR 2) = 5.
- (2,3): Because we have (1 XOR 5) + (3 XOR 2) = 5.
```

 **Example 2:**

 ```
Input: coordinates = [[1,3],[1,3],[1,3],[1,3],[1,3]], k = 0
Output: 10
Explanation: Any two chosen pairs will have a distance of 0. There are 10 ways to choose two pairs.
```

 

 **Constraints:**

 - `2 <= coordinates.length <= 50000`
- `0 <= xi, yi <= 106`
- `0 <= k <= 100`
