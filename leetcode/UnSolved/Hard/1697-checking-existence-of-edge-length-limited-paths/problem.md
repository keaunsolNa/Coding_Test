---
id: 1697
internal_id: 1815
slug: checking-existence-of-edge-length-limited-paths
title: Checking Existence of Edge Length Limited Paths
difficulty: Hard
tags: Array, Two Pointers, Union-Find, Graph Theory, Sorting
date: 2026-04-20
lang: java
---

# 1697. Checking Existence of Edge Length Limited Paths

**Difficulty:** Hard | **Tags:** Array, Two Pointers, Union-Find, Graph Theory, Sorting

## Description

An undirected graph of `n` nodes is defined by `edgeList`, where `edgeList[i] = [ui, vi, disi]` denotes an edge between nodes `ui` and `vi` with distance `disi`. Note that there may be **multiple** edges between two nodes.

 Given an array `queries`, where `queries[j] = [pj, qj, limitj]`, your task is to determine for each `queries[j]` whether there is a path between `pj` and `qj` such that each edge on the path has a distance **strictly less than** `limitj` .

 Return _a **boolean array** _`answer`_, where _`answer.length == queries.length` _and the _`jth` _value of _`answer` _is _`true`_ if there is a path for _`queries[j]`_ is _`true`_, and _`false`_ otherwise_.

 

 **Example 1:**

  ```
Input: n = 3, edgeList = [[0,1,2],[1,2,4],[2,0,8],[1,0,16]], queries = [[0,1,2],[0,2,5]]
Output: [false,true]
Explanation: The above figure shows the given graph. Note that there are two overlapping edges between 0 and 1 with distances 2 and 16.
For the first query, between 0 and 1 there is no path where each distance is less than 2, thus we return false for this query.
For the second query, there is a path (0 -> 1 -> 2) of two edges with distances less than 5, thus we return true for this query.
```

 **Example 2:**

  ```
Input: n = 5, edgeList = [[0,1,10],[1,2,5],[2,3,9],[3,4,13]], queries = [[0,4,14],[1,4,13]]
Output: [true,false]
Explanation: The above figure shows the given graph.
```

 

 **Constraints:**

 - `2 <= n <= 105`
- `1 <= edgeList.length, queries.length <= 105`
- `edgeList[i].length == 3`
- `queries[j].length == 3`
- `0 <= ui, vi, pj, qj <= n - 1`
- `ui != vi`
- `pj != qj`
- `1 <= disi, limitj <= 109`
- There may be **multiple** edges between two nodes.
