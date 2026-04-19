---
id: 115
slug: distinct-subsequences
title: Distinct Subsequences
difficulty: Hard
tags: String, Dynamic Programming
date: 2026-04-19
lang: java
---

# 115. Distinct Subsequences

**Difficulty:** Hard | **Tags:** String, Dynamic Programming

## Description

Given two strings s and t, return _the number of distinct_ **_subsequences_**_ of _s_ which equals _t.

 The test cases are generated so that the answer fits on a 32-bit signed integer.

 

 **Example 1:**

 ```
Input: s = "rabbbit", t = "rabbit"
Output: 3
Explanation:
As shown below, there are 3 ways you can generate "rabbit" from s.
rabbbit
rabbbit
rabbbit
```

 **Example 2:**

 ```
Input: s = "babgbag", t = "bag"
Output: 5
Explanation:
As shown below, there are 5 ways you can generate "bag" from s.
babgbag
babgbag
babgbag
babgbag
babgbag
```

 

 **Constraints:**

 - `1 <= s.length, t.length <= 1000`
- `s` and `t` consist of English letters.
