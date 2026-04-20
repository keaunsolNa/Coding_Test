---
id: 2418
internal_id: 2502
slug: sort-the-people
title: Sort the People
difficulty: Easy
tags: Array, Hash Table, String, Sorting
date: 2026-04-20
lang: java
---

# 2418. Sort the People

**Difficulty:** Easy | **Tags:** Array, Hash Table, String, Sorting

## Description

You are given an array of strings `names`, and an array `heights` that consists of **distinct** positive integers. Both arrays are of length `n`.

 For each index `i`, `names[i]` and `heights[i]` denote the name and height of the `ith` person.

 Return `names`_ sorted in **descending** order by the people's heights_.

 

 **Example 1:**

 ```
Input: names = ["Mary","John","Emma"], heights = [180,165,170]
Output: ["Mary","Emma","John"]
Explanation: Mary is the tallest, followed by Emma and John.
```

 **Example 2:**

 ```
Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
Output: ["Bob","Alice","Bob"]
Explanation: The first Bob is the tallest, followed by Alice and the second Bob.
```

 

 **Constraints:**

 - `n == names.length == heights.length`
- `1 <= n <= 103`
- `1 <= names[i].length <= 20`
- `1 <= heights[i] <= 105`
- `names[i]` consists of lower and upper case English letters.
- All the values of `heights` are distinct.
