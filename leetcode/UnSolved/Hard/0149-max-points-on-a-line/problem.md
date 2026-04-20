---
id: 149
internal_id: 149
slug: max-points-on-a-line
title: Max Points on a Line
difficulty: Hard
tags: Array, Hash Table, Math, Geometry
date: 2026-04-20
lang: java
---

# 149. Max Points on a Line

**Difficulty:** Hard | **Tags:** Array, Hash Table, Math, Geometry

## Description

Given an array of `points` where `points[i] = [xi, yi]` represents a point on the **X-Y** plane, return _the maximum number of points that lie on the same straight line_.

 

 **Example 1:**

  ```
Input: points = [[1,1],[2,2],[3,3]]
Output: 3
```

 **Example 2:**

  ```
Input: points = [[1,1],[3,2],[5,3],[4,1],[2,3],[1,4]]
Output: 4
```

 

 **Constraints:**

 - `1 <= points.length <= 300`
- `points[i].length == 2`
- `-104 <= xi, yi <= 104`
- All the `points` are **unique**.
