---
id: 2516
internal_id: 2599
slug: take-k-of-each-character-from-left-and-right
title: Take K of Each Character From Left and Right
difficulty: Medium
tags: Hash Table, String, Sliding Window
date: 2026-04-20
lang: java
---

# 2516. Take K of Each Character From Left and Right

**Difficulty:** Medium | **Tags:** Hash Table, String, Sliding Window

## Description

You are given a string `s` consisting of the characters `'a'`, `'b'`, and `'c'` and a non-negative integer `k`. Each minute, you may take either the **leftmost** character of `s`, or the **rightmost** character of `s`.

 Return_ the **minimum** number of minutes needed for you to take **at least** _`k`_ of each character, or return _`-1`_ if it is not possible to take _`k`_ of each character._

 

 **Example 1:**

 ```
Input: s = "aabaaaacaabc", k = 2
Output: 8
Explanation: 
Take three characters from the left of s. You now have two 'a' characters, and one 'b' character.
Take five characters from the right of s. You now have four 'a' characters, two 'b' characters, and two 'c' characters.
A total of 3 + 5 = 8 minutes is needed.
It can be proven that 8 is the minimum number of minutes needed.
```

 **Example 2:**

 ```
Input: s = "a", k = 1
Output: -1
Explanation: It is not possible to take one 'b' or 'c' so return -1.
```

 

 **Constraints:**

 - `1 <= s.length <= 105`
- `s` consists of only the letters `'a'`, `'b'`, and `'c'`.
- `0 <= k <= s.length`
