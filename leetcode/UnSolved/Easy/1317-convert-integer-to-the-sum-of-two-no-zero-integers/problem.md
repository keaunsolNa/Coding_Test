---
id: 1317
slug: convert-integer-to-the-sum-of-two-no-zero-integers
title: Convert Integer to the Sum of Two No-Zero Integers
difficulty: Easy
tags: Math
date: 2026-04-19
lang: java
---

# 1317. Convert Integer to the Sum of Two No-Zero Integers

**Difficulty:** Easy | **Tags:** Math

## Description

**No-Zero integer** is a positive integer that **does not contain any `0`** in its decimal representation.

 Given an integer `n`, return _a list of two integers_ `[a, b]` _where_:

 - `a` and `b` are **No-Zero integers**.
- `a + b = n`

 The test cases are generated so that there is at least one valid solution. If there are many valid solutions, you can return any of them.

 

 **Example 1:**

 ```
Input: n = 2
Output: [1,1]
Explanation: Let a = 1 and b = 1.
Both a and b are no-zero integers, and a + b = 2 = n.
```

 **Example 2:**

 ```
Input: n = 11
Output: [2,9]
Explanation: Let a = 2 and b = 9.
Both a and b are no-zero integers, and a + b = 11 = n.
Note that there are other valid answers as [8, 3] that can be accepted.
```

 

 **Constraints:**

 - `2 <= n <= 104`
