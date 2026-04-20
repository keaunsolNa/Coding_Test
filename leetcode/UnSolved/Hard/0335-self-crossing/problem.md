---
id: 335
internal_id: 335
slug: self-crossing
title: Self Crossing
difficulty: Hard
tags: Array, Math, Geometry
date: 2026-04-20
lang: java
---

# 335. Self Crossing

**Difficulty:** Hard | **Tags:** Array, Math, Geometry

## Description

You are given an array of integers `distance`.

 You start at the point `(0, 0)` on an **X-Y plane,** and you move `distance[0]` meters to the north, then `distance[1]` meters to the west, `distance[2]` meters to the south, `distance[3]` meters to the east, and so on. In other words, after each move, your direction changes counter-clockwise.

 Return `true` _if your path crosses itself or _`false`_ if it does not_.

 

 **Example 1:**

  ```
Input: distance = [2,1,1,2]
Output: true
Explanation: The path crosses itself at the point (0, 1).
```

 **Example 2:**

  ```
Input: distance = [1,2,3,4]
Output: false
Explanation: The path does not cross itself at any point.
```

 **Example 3:**

  ```
Input: distance = [1,1,1,2,1]
Output: true
Explanation: The path crosses itself at the point (0, 0).
```

 

 **Constraints:**

 - `1 <= distance.length <= 105`
- `1 <= distance[i] <= 105`
