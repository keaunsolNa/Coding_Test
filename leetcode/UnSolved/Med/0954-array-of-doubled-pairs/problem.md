---
id: 954
internal_id: 991
slug: array-of-doubled-pairs
title: Array of Doubled Pairs
difficulty: Medium
tags: Array, Hash Table, Greedy, Sorting
date: 2026-04-20
lang: java
---

# 954. Array of Doubled Pairs

**Difficulty:** Medium | **Tags:** Array, Hash Table, Greedy, Sorting

## Description

Given an integer array of even length `arr`, return `true`_ if it is possible to reorder _`arr`_ such that _`arr[2 * i + 1] = 2 * arr[2 * i]`_ for every _`0 <= i < len(arr) / 2`_, or _`false`_ otherwise_.

 

 **Example 1:**

 ```
Input: arr = [3,1,3,6]
Output: false
```

 **Example 2:**

 ```
Input: arr = [2,1,2,6]
Output: false
```

 **Example 3:**

 ```
Input: arr = [4,-2,2,-4]
Output: true
Explanation: We can take two groups, [-2,-4] and [2,4] to form [-2,-4,2,4] or [2,4,-2,-4].
```

 

 **Constraints:**

 - `2 <= arr.length <= 3 * 104`
- `arr.length` is even.
- `-105 <= arr[i] <= 105`
