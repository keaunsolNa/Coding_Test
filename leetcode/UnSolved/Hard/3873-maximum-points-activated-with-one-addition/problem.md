---
id: 3873
slug: maximum-points-activated-with-one-addition
title: Maximum Points Activated with One Addition
difficulty: Hard
tags: Array, Hash Table, Union-Find
date: 2026-04-19
lang: java
---

# 3873. Maximum Points Activated with One Addition

**Difficulty:** Hard | **Tags:** Array, Hash Table, Union-Find

## Description

You are given a 2D integer array `points`, where `points[i] = [xi, yi]` represents the coordinates of the `ith` point. All coordinates in `points` are **distinct**.

 If a point is **activated**, then all points that have the **same** x-coordinate **or** y-coordinate become **activated** as well.

 Activation continues until no additional points can be activated.

 You may add **one additional** point at any integer coordinate `(x, y)` not already present in `points`. Activation begins by **activating** this **newly added point**.

 Return an integer denoting the **maximum** number of points that can be activated, including the newly added point.

 

 **Example 1:**

  **Input:** points = [[1,1],[1,2],[2,2]]

 **Output:** 4

 **Explanation:**

 Adding and activating a point such as `(1, 3)` causes activations:

 - `(1, 3)` shares `x = 1` with `(1, 1)` and `(1, 2)` -> `(1, 1)` and `(1, 2)` become activated.
- `(1, 2)` shares `y = 2` with `(2, 2)` -> `(2, 2)` becomes activated.

 Thus, the activated points are `(1, 3)`, `(1, 1)`, `(1, 2)`, `(2, 2)`, so 4 points in total. We can show this is the maximum activated.

  **Example 2:**

  **Input:** points = [[2,2],[1,1],[3,3]]

 **Output:** 3

 **Explanation:**

 Adding and activating a point such as `(1, 2)` causes activations:

 - `(1, 2)` shares `x = 1` with `(1, 1)` -> `(1, 1)` becomes activated.
- `(1, 2)` shares `y = 2` with `(2, 2)` -> `(2, 2)` becomes activated.

 Thus, the activated points are `(1, 2)`, `(1, 1)`, `(2, 2)`, so 3 points in total. We can show this is the maximum activated.

  **Example 3:**

  **Input:** points = [[2,3],[2,2],[1,1],[4,5]]

 **Output:** 4

 **Explanation:**

 Adding and activating a point such as `(2, 1)` causes activations:

 - `(2, 1)` shares `x = 2` with `(2, 3)` and `(2, 2)` -> `(2, 3)` and `(2, 2)` become activated.
- `(2, 1)` shares `y = 1` with `(1, 1)` -> `(1, 1)` becomes activated.

 Thus, the activated points are `(2, 1)`, `(2, 3)`, `(2, 2)`, `(1, 1)`, so 4 points in total.

  

 **Constraints:**

 - `1 <= points.length <= 105`
- `points[i] = [xi, yi]`
- `-109 <= xi, yi <= 109`
- `points` contains all **distinct** coordinates.
