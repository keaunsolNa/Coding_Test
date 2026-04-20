---
id: 2550
internal_id: 2680
slug: count-collisions-of-monkeys-on-a-polygon
title: Count Collisions of Monkeys on a Polygon
difficulty: Medium
tags: Math, Recursion
date: 2026-04-20
lang: java
---

# 2550. Count Collisions of Monkeys on a Polygon

**Difficulty:** Medium | **Tags:** Math, Recursion

## Description

There is a regular convex polygon with `n` vertices. The vertices are labeled from `0` to `n - 1` in a clockwise direction, and each vertex has **exactly one monkey**. The following figure shows a convex polygon of `6` vertices.

  Simultaneously, each monkey moves to a neighboring vertex. A **collision** happens if at least two monkeys reside on the same vertex after the movement or intersect on an edge.

 Return the number of ways the monkeys can move so that at least **one collision** happens. Since the answer may be very large, return it modulo `109 + 7`.

 

 **Example 1:**

  **Input:** n = 3

 **Output:** 6

 **Explanation:**

 There are 8 total possible movements.
 Two ways such that they collide at some point are:

 - Monkey 1 moves in a clockwise direction; monkey 2 moves in an anticlockwise direction; monkey 3 moves in a clockwise direction. Monkeys 1 and 2 collide.
- Monkey 1 moves in an anticlockwise direction; monkey 2 moves in an anticlockwise direction; monkey 3 moves in a clockwise direction. Monkeys 1 and 3 collide.

  **Example 2:**

  **Input:** n = 4

 **Output:** 14

  

 **Constraints:**

 - `3 <= n <= 109`
