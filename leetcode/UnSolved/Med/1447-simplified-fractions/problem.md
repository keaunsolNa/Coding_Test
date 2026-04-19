---
id: 1447
slug: simplified-fractions
title: Simplified Fractions
difficulty: Medium
tags: Math, String, Number Theory
date: 2026-04-20
lang: java
---

# 1447. Simplified Fractions

**Difficulty:** Medium | **Tags:** Math, String, Number Theory

## Description

Given an integer `n`, return _a list of all **simplified** fractions between _`0`_ and _`1`_ (exclusive) such that the denominator is less-than-or-equal-to _`n`. You can return the answer in **any order**.

 

 **Example 1:**

 ```
Input: n = 2
Output: ["1/2"]
Explanation: "1/2" is the only unique fraction with a denominator less-than-or-equal-to 2.
```

 **Example 2:**

 ```
Input: n = 3
Output: ["1/2","1/3","2/3"]
```

 **Example 3:**

 ```
Input: n = 4
Output: ["1/2","1/3","1/4","2/3","3/4"]
Explanation: "2/4" is not a simplified fraction because it can be simplified to "1/2".
```

 

 **Constraints:**

 - `1 <= n <= 100`
