---
id: 2543
slug: check-if-point-is-reachable
title: Check if Point Is Reachable
difficulty: Hard
tags: Math, Number Theory
date: 2026-04-19
lang: java
---

# 2543. Check if Point Is Reachable

**Difficulty:** Hard | **Tags:** Math, Number Theory

## Description

There exists an infinitely large grid. You are currently at point `(1, 1)`, and you need to reach the point `(targetX, targetY)` using a finite number of steps.

 In one **step**, you can move from point `(x, y)` to any one of the following points:

 - `(x, y - x)`
- `(x - y, y)`
- `(2 * x, y)`
- `(x, 2 * y)`

 Given two integers `targetX` and `targetY` representing the X-coordinate and Y-coordinate of your final position, return `true` _if you can reach the point from_ `(1, 1)` _using some number of steps, and _`false`_ otherwise_.

 

 **Example 1:**

 ```
Input: targetX = 6, targetY = 9
Output: false
Explanation: It is impossible to reach (6,9) from (1,1) using any sequence of moves, so false is returned.
```

 **Example 2:**

 ```
Input: targetX = 4, targetY = 7
Output: true
Explanation: You can follow the path (1,1) -> (1,2) -> (1,4) -> (1,8) -> (1,7) -> (2,7) -> (4,7).
```

 

 **Constraints:**

 - `1 <= targetX, targetY <= 109`
