---
id: 812
slug: largest-triangle-area
title: Largest Triangle Area
difficulty: Easy
tags: Array, Math, Geometry
date: 2026-04-19
lang: java
---

# 812. Largest Triangle Area

**Difficulty:** Easy | **Tags:** Array, Math, Geometry

## Description

Given an array of points on the **X-Y** plane `points` where `points[i] = [xi, yi]`, return _the area of the largest triangle that can be formed by any three different points_. Answers within `10-5` of the actual answer will be accepted.

 

 **Example 1:**

  ```
Input: points = [[0,0],[0,1],[1,0],[0,2],[2,0]]
Output: 2.00000
Explanation: The five points are shown in the above figure. The red triangle is the largest.
```

 **Example 2:**

 ```
Input: points = [[1,0],[0,0],[0,1]]
Output: 0.50000
```

 

 **Constraints:**

 - `3 <= points.length <= 50`
- `-50 <= xi, yi <= 50`
- All the given points are **unique**.
