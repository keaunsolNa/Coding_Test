---
id: 447
internal_id: 447
slug: number-of-boomerangs
title: Number of Boomerangs
difficulty: Medium
tags: Array, Hash Table, Math
date: 2026-04-20
lang: java
---

# 447. Number of Boomerangs

**Difficulty:** Medium | **Tags:** Array, Hash Table, Math

## Description

You are given `n` `points` in the plane that are all **distinct**, where `points[i] = [xi, yi]`. A **boomerang** is a tuple of points `(i, j, k)` such that the distance between `i` and `j` equals the distance between `i` and `k` **(the order of the tuple matters)**.

 Return _the number of boomerangs_.

 

 **Example 1:**

 ```
Input: points = [[0,0],[1,0],[2,0]]
Output: 2
Explanation: The two boomerangs are [[1,0],[0,0],[2,0]] and [[1,0],[2,0],[0,0]].
```

 **Example 2:**

 ```
Input: points = [[1,1],[2,2],[3,3]]
Output: 2
```

 **Example 3:**

 ```
Input: points = [[1,1]]
Output: 0
```

 

 **Constraints:**

 - `n == points.length`
- `1 <= n <= 500`
- `points[i].length == 2`
- `-104 <= xi, yi <= 104`
- All the points are **unique**.
