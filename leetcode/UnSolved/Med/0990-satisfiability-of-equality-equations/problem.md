---
id: 990
slug: satisfiability-of-equality-equations
title: Satisfiability of Equality Equations
difficulty: Medium
tags: Array, String, Union-Find, Graph Theory
date: 2026-04-20
lang: java
---

# 990. Satisfiability of Equality Equations

**Difficulty:** Medium | **Tags:** Array, String, Union-Find, Graph Theory

## Description

You are given an array of strings `equations` that represent relationships between variables where each string `equations[i]` is of length `4` and takes one of two different forms: `"xi==yi"` or `"xi!=yi"`.Here, `xi` and `yi` are lowercase letters (not necessarily different) that represent one-letter variable names.

 Return `true`_ if it is possible to assign integers to variable names so as to satisfy all the given equations, or _`false`_ otherwise_.

 

 **Example 1:**

 ```
Input: equations = ["a==b","b!=a"]
Output: false
Explanation: If we assign say, a = 1 and b = 1, then the first equation is satisfied, but not the second.
There is no way to assign the variables to satisfy both equations.
```

 **Example 2:**

 ```
Input: equations = ["b==a","a==b"]
Output: true
Explanation: We could assign a = 1 and b = 1 to satisfy both equations.
```

 

 **Constraints:**

 - `1 <= equations.length <= 500`
- `equations[i].length == 4`
- `equations[i][0]` is a lowercase letter.
- `equations[i][1]` is either `'='` or `'!'`.
- `equations[i][2]` is `'='`.
- `equations[i][3]` is a lowercase letter.
