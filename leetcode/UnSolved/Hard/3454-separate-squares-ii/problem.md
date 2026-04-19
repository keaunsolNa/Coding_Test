---
id: 3454
slug: separate-squares-ii
title: Separate Squares II
difficulty: Hard
tags: Array, Binary Search, Segment Tree, Sweep Line
date: 2026-04-19
lang: java
---

# 3454. Separate Squares II

**Difficulty:** Hard | **Tags:** Array, Binary Search, Segment Tree, Sweep Line

## Description

You are given a 2D integer array `squares`. Each `squares[i] = [xi, yi, li]` represents the coordinates of the bottom-left point and the side length of a square parallel to the x-axis.

 Find the **minimum** y-coordinate value of a horizontal line such that the total area covered by squares above the line _equals_ the total area covered by squares below the line.

 Answers within `10-5` of the actual answer will be accepted.

 **Note**: Squares **may** overlap. Overlapping areas should be counted **only once** in this version.

 

 **Example 1:**

  **Input:** squares = [[0,0,1],[2,2,1]]

 **Output:** 1.00000

 **Explanation:**

 

 Any horizontal line between `y = 1` and `y = 2` results in an equal split, with 1 square unit above and 1 square unit below. The minimum y-value is 1.

  **Example 2:**

  **Input:** squares = [[0,0,2],[1,1,1]]

 **Output:** 1.00000

 **Explanation:**

 

 Since the blue square overlaps with the red square, it will not be counted again. Thus, the line `y = 1` splits the squares into two equal parts.

  

 **Constraints:**

 - `1 <= squares.length <= 5 * 104`
- `squares[i] = [xi, yi, li]`
- `squares[i].length == 3`
- `0 <= xi, yi <= 109`
- `1 <= li <= 109`
- The total area of all the squares will not exceed `1015`.
