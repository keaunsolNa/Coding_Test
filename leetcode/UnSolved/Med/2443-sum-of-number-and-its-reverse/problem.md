---
id: 2443
slug: sum-of-number-and-its-reverse
title: Sum of Number and Its Reverse
difficulty: Medium
tags: Math, Enumeration
date: 2026-04-20
lang: java
---

# 2443. Sum of Number and Its Reverse

**Difficulty:** Medium | **Tags:** Math, Enumeration

## Description

Given a **non-negative** integer `num`, return `true`_ if _`num`_ can be expressed as the sum of any **non-negative** integer and its reverse, or _`false`_ otherwise._

 

 **Example 1:**

 ```
Input: num = 443
Output: true
Explanation: 172 + 271 = 443 so we return true.
```

 **Example 2:**

 ```
Input: num = 63
Output: false
Explanation: 63 cannot be expressed as the sum of a non-negative integer and its reverse so we return false.
```

 **Example 3:**

 ```
Input: num = 181
Output: true
Explanation: 140 + 041 = 181 so we return true. Note that when a number is reversed, there may be leading zeros.
```

 

 **Constraints:**

 - `0 <= num <= 105`
