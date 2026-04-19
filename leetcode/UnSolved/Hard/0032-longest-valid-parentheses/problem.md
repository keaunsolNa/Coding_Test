---
id: 32
slug: longest-valid-parentheses
title: Longest Valid Parentheses
difficulty: Hard
tags: String, Dynamic Programming, Stack
date: 2026-04-19
lang: java
---

# 32. Longest Valid Parentheses

**Difficulty:** Hard | **Tags:** String, Dynamic Programming, Stack

## Description

Given a string containing just the characters `'('` and `')'`, return _the length of the longest valid (well-formed) parentheses __substring_.

 

 **Example 1:**

 ```
Input: s = "(()"
Output: 2
Explanation: The longest valid parentheses substring is "()".
```

 **Example 2:**

 ```
Input: s = ")()())"
Output: 4
Explanation: The longest valid parentheses substring is "()()".
```

 **Example 3:**

 ```
Input: s = ""
Output: 0
```

 

 **Constraints:**

 - `0 <= s.length <= 3 * 104`
- `s[i]` is `'('`, or `')'`.
