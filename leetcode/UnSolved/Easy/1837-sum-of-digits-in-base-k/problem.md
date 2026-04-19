---
id: 1837
slug: sum-of-digits-in-base-k
title: Sum of Digits in Base K
difficulty: Easy
tags: Math
date: 2026-04-19
lang: java
---

# 1837. Sum of Digits in Base K

**Difficulty:** Easy | **Tags:** Math

## Description

Given an integer `n` (in base `10`) and a base `k`, return _the **sum** of the digits of _`n`_ **after** converting _`n`_ from base _`10`_ to base _`k`.

 After converting, each digit should be interpreted as a base `10` number, and the sum should be returned in base `10`.

 

 **Example 1:**

 ```
Input: n = 34, k = 6
Output: 9
Explanation: 34 (base 10) expressed in base 6 is 54. 5 + 4 = 9.
```

 **Example 2:**

 ```
Input: n = 10, k = 10
Output: 1
Explanation: n is already in base 10. 1 + 0 = 1.
```

 

 **Constraints:**

 - `1 <= n <= 100`
- `2 <= k <= 10`
