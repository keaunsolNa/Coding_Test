---
id: 2251
slug: number-of-flowers-in-full-bloom
title: Number of Flowers in Full Bloom
difficulty: Hard
tags: Array, Hash Table, Binary Search, Sorting, Prefix Sum, Ordered Set
date: 2026-04-19
lang: java
---

# 2251. Number of Flowers in Full Bloom

**Difficulty:** Hard | **Tags:** Array, Hash Table, Binary Search, Sorting, Prefix Sum, Ordered Set

## Description

You are given a **0-indexed** 2D integer array `flowers`, where `flowers[i] = [starti, endi]` means the `ith` flower will be in **full bloom** from `starti` to `endi` (**inclusive**). You are also given a **0-indexed** integer array `people` of size `n`, where `people[i]` is the time that the `ith` person will arrive to see the flowers.

 Return _an integer array _`answer`_ of size _`n`_, where _`answer[i]`_ is the **number** of flowers that are in full bloom when the _`ith`_ person arrives._

 

 **Example 1:**

  ```
Input: flowers = [[1,6],[3,7],[9,12],[4,13]], people = [2,3,7,11]
Output: [1,2,2,2]
Explanation: The figure above shows the times when the flowers are in full bloom and when the people arrive.
For each person, we return the number of flowers in full bloom during their arrival.
```

 **Example 2:**

  ```
Input: flowers = [[1,10],[3,3]], people = [3,3,2]
Output: [2,2,1]
Explanation: The figure above shows the times when the flowers are in full bloom and when the people arrive.
For each person, we return the number of flowers in full bloom during their arrival.
```

 

 **Constraints:**

 - `1 <= flowers.length <= 5 * 104`
- `flowers[i].length == 2`
- `1 <= starti <= endi <= 109`
- `1 <= people.length <= 5 * 104`
- `1 <= people[i] <= 109`
