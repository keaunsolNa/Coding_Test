---
id: 3074
internal_id: 3334
slug: apple-redistribution-into-boxes
title: Apple Redistribution into Boxes
difficulty: Easy
tags: Array, Greedy, Sorting
date: 2026-04-20
lang: java
---

# 3074. Apple Redistribution into Boxes

**Difficulty:** Easy | **Tags:** Array, Greedy, Sorting

## Description

You are given an array `apple` of size `n` and an array `capacity` of size `m`.

 There are `n` packs where the `ith` pack contains `apple[i]` apples. There are `m` boxes as well, and the `ith` box has a capacity of `capacity[i]` apples.

 Return _the **minimum** number of boxes you need to select to redistribute these _`n`_ packs of apples into boxes_.

 **Note** that, apples from the same pack can be distributed into different boxes.

 

 **Example 1:**

 ```
Input: apple = [1,3,2], capacity = [4,3,1,5,2]
Output: 2
Explanation: We will use boxes with capacities 4 and 5.
It is possible to distribute the apples as the total capacity is greater than or equal to the total number of apples.
```

 **Example 2:**

 ```
Input: apple = [5,5,5], capacity = [2,4,2,7]
Output: 4
Explanation: We will need to use all the boxes.
```

 

 **Constraints:**

 - `1 <= n == apple.length <= 50`
- `1 <= m == capacity.length <= 50`
- `1 <= apple[i], capacity[i] <= 50`
- The input is generated such that it's possible to redistribute packs of apples into boxes.
