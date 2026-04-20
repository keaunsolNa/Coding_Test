---
id: 2787
internal_id: 2882
slug: ways-to-express-an-integer-as-sum-of-powers
title: Ways to Express an Integer as Sum of Powers
difficulty: Medium
tags: Dynamic Programming
date: 2026-04-20
lang: java
---

# 2787. Ways to Express an Integer as Sum of Powers

**Difficulty:** Medium | **Tags:** Dynamic Programming

## Description

Given two **positive** integers `n` and `x`.

 Return _the number of ways _`n`_ can be expressed as the sum of the _`xth`_ power of **unique** positive integers, in other words, the number of sets of unique integers _`[n1, n2, ..., nk]`_ where _`n = n1x + n2x + ... + nkx`_._

 Since the result can be very large, return it modulo `109 + 7`.

 For example, if `n = 160` and `x = 3`, one way to express `n` is `n = 23 + 33 + 53`.

 

 **Example 1:**

 ```
Input: n = 10, x = 2
Output: 1
Explanation: We can express n as the following: n = 32 + 12 = 10.
It can be shown that it is the only way to express 10 as the sum of the 2nd power of unique integers.
```

 **Example 2:**

 ```
Input: n = 4, x = 1
Output: 2
Explanation: We can express n in the following ways:
- n = 41 = 4.
- n = 31 + 11 = 4.
```

 

 **Constraints:**

 - `1 <= n <= 300`
- `1 <= x <= 5`
