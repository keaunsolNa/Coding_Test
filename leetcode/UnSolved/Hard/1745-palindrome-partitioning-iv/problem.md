---
id: 1745
internal_id: 1871
slug: palindrome-partitioning-iv
title: Palindrome Partitioning IV
difficulty: Hard
tags: String, Dynamic Programming
date: 2026-04-20
lang: java
---

# 1745. Palindrome Partitioning IV

**Difficulty:** Hard | **Tags:** String, Dynamic Programming

## Description

Given a string `s`, return `true` _if it is possible to split the string_ `s` _into three **non-empty** palindromic substrings. Otherwise, return _`false`.

 A string is said to be palindrome if it the same string when reversed.

 

 **Example 1:**

 ```
Input: s = "abcbdd"
Output: true
Explanation: "abcbdd" = "a" + "bcb" + "dd", and all three substrings are palindromes.
```

 **Example 2:**

 ```
Input: s = "bcbddxy"
Output: false
Explanation: s cannot be split into 3 palindromes.
```

 

 **Constraints:**

 - `3 <= s.length <= 2000`
- `s` consists only of lowercase English letters.
