---
id: 939
internal_id: 976
slug: minimum-area-rectangle
title: Minimum Area Rectangle
difficulty: Medium
tags: Array, Hash Table, Math, Geometry, Sorting
date: 2026-04-20
lang: java
---

# 939. Minimum Area Rectangle

**Difficulty:** Medium | **Tags:** Array, Hash Table, Math, Geometry, Sorting

## Description

You are given an array of points in the **X-Y** plane `points` where `points[i] = [xi, yi]`.

 Return _the minimum area of a rectangle formed from these points, with sides parallel to the X and Y axes_. If there is not any such rectangle, return `0`.

 

 **Example 1:**

  ```
Input: points = [[1,1],[1,3],[3,1],[3,3],[2,2]]
Output: 4
```

 **Example 2:**

  ```
Input: points = [[1,1],[1,3],[3,1],[3,3],[4,1],[4,3]]
Output: 2
```

 

 **Constraints:**

 - `1 <= points.length <= 500`
- `points[i].length == 2`
- `0 <= xi, yi <= 4 * 104`
- All the given points are **unique**.
