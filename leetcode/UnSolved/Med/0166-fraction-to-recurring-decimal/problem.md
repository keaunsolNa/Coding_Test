---
id: 166
slug: fraction-to-recurring-decimal
title: Fraction to Recurring Decimal
difficulty: Medium
tags: Hash Table, Math, String
date: 2026-04-20
lang: java
---

# 166. Fraction to Recurring Decimal

**Difficulty:** Medium | **Tags:** Hash Table, Math, String

## Description

Given two integers representing the `numerator` and `denominator` of a fraction, return _the fraction in string format_.

 If the fractional part is repeating, enclose the repeating part in parentheses

 If multiple answers are possible, return **any of them**.

 It is **guaranteed** that the length of the answer string is less than `104` for all the given inputs.

 **Note** that if the fraction can be represented as a _finite length string_, you **must** return it.

 

 **Example 1:**

 ```
Input: numerator = 1, denominator = 2
Output: "0.5"
```

 **Example 2:**

 ```
Input: numerator = 2, denominator = 1
Output: "2"
```

 **Example 3:**

 ```
Input: numerator = 4, denominator = 333
Output: "0.(012)"
```

 

 **Constraints:**

 - `-231 <= numerator, denominator <= 231 - 1`
- `denominator != 0`
