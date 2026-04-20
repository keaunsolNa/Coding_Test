---
id: 1363
internal_id: 1277
slug: largest-multiple-of-three
title: Largest Multiple of Three
difficulty: Hard
tags: Array, Math, Dynamic Programming, Greedy, Sorting
date: 2026-04-20
lang: java
---

# 1363. Largest Multiple of Three

**Difficulty:** Hard | **Tags:** Array, Math, Dynamic Programming, Greedy, Sorting

## Description

Given an array of digits `digits`, return _the largest multiple of **three** that can be formed by concatenating some of the given digits in **any order**_. If there is no answer return an empty string.

 Since the answer may not fit in an integer data type, return the answer as a string. Note that the returning answer must not contain unnecessary leading zeros.

 

 **Example 1:**

 ```
Input: digits = [8,1,9]
Output: "981"
```

 **Example 2:**

 ```
Input: digits = [8,6,7,1,0]
Output: "8760"
```

 **Example 3:**

 ```
Input: digits = [1]
Output: ""
```

 

 **Constraints:**

 - `1 <= digits.length <= 104`
- `0 <= digits[i] <= 9`
