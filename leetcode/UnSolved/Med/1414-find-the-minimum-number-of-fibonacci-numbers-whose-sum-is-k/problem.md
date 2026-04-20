---
id: 1414
internal_id: 1515
slug: find-the-minimum-number-of-fibonacci-numbers-whose-sum-is-k
title: Find the Minimum Number of Fibonacci Numbers Whose Sum Is K
difficulty: Medium
tags: Math, Greedy
date: 2026-04-20
lang: java
---

# 1414. Find the Minimum Number of Fibonacci Numbers Whose Sum Is K

**Difficulty:** Medium | **Tags:** Math, Greedy

## Description

Given an integer `k`, _return the minimum number of Fibonacci numbers whose sum is equal to _`k`. The same Fibonacci number can be used multiple times.

 The Fibonacci numbers are defined as:

 - `F1 = 1`
- `F2 = 1`
- `Fn = Fn-1 + Fn-2` for `n > 2.`

 It is guaranteed that for the given constraints we can always find such Fibonacci numbers that sum up to `k`. 

 **Example 1:**

 ```
Input: k = 7
Output: 2 
Explanation: The Fibonacci numbers are: 1, 1, 2, 3, 5, 8, 13, ... 
For k = 7 we can use 2 + 5 = 7.
```

 **Example 2:**

 ```
Input: k = 10
Output: 2 
Explanation: For k = 10 we can use 2 + 8 = 10.
```

 **Example 3:**

 ```
Input: k = 19
Output: 3 
Explanation: For k = 19 we can use 1 + 5 + 13 = 19.
```

 

 **Constraints:**

 - `1 <= k <= 109`
