---
id: 780
slug: reaching-points
title: Reaching Points
difficulty: Hard
tags: Math
date: 2026-04-19
lang: java
---

# 780. Reaching Points

**Difficulty:** Hard | **Tags:** Math

## Description

Given four integers `sx`, `sy`, `tx`, and `ty`, return `true`_ if it is possible to convert the point _`(sx, sy)`_ to the point _`(tx, ty)` _through some operations__, or _`false`_ otherwise_.

 The allowed operation on some point `(x, y)` is to convert it to either `(x, x + y)` or `(x + y, y)`.

 

 **Example 1:**

 ```
Input: sx = 1, sy = 1, tx = 3, ty = 5
Output: true
Explanation:
One series of moves that transforms the starting point to the target is:
(1, 1) -> (1, 2)
(1, 2) -> (3, 2)
(3, 2) -> (3, 5)
```

 **Example 2:**

 ```
Input: sx = 1, sy = 1, tx = 2, ty = 2
Output: false
```

 **Example 3:**

 ```
Input: sx = 1, sy = 1, tx = 1, ty = 1
Output: true
```

 

 **Constraints:**

 - `1 <= sx, sy, tx, ty <= 109`
