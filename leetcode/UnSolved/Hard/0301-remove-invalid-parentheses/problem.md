---
id: 301
slug: remove-invalid-parentheses
title: Remove Invalid Parentheses
difficulty: Hard
tags: String, Backtracking, Breadth-First Search
date: 2026-04-19
lang: java
---

# 301. Remove Invalid Parentheses

**Difficulty:** Hard | **Tags:** String, Backtracking, Breadth-First Search

## Description

Given a string `s` that contains parentheses and letters, remove the minimum number of invalid parentheses to make the input string valid.

 Return _a list of **unique strings** that are valid with the minimum number of removals_. You may return the answer in **any order**.

 

 **Example 1:**

 ```
Input: s = "()())()"
Output: ["(())()","()()()"]
```

 **Example 2:**

 ```
Input: s = "(a)())()"
Output: ["(a())()","(a)()()"]
```

 **Example 3:**

 ```
Input: s = ")("
Output: [""]
```

 

 **Constraints:**

 - `1 <= s.length <= 25`
- `s` consists of lowercase English letters and parentheses `'('` and `')'`.
- There will be at most `20` parentheses in `s`.
