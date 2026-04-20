---
id: 1016
internal_id: 1065
slug: binary-string-with-substrings-representing-1-to-n
title: Binary String With Substrings Representing 1 To N
difficulty: Medium
tags: Hash Table, String, Bit Manipulation, Sliding Window
date: 2026-04-20
lang: java
---

# 1016. Binary String With Substrings Representing 1 To N

**Difficulty:** Medium | **Tags:** Hash Table, String, Bit Manipulation, Sliding Window

## Description

Given a binary string `s` and a positive integer `n`, return `true`_ if the binary representation of all the integers in the range _`[1, n]`_ are **substrings** of _`s`_, or _`false`_ otherwise_.

 A **substring** is a contiguous sequence of characters within a string.

 

 **Example 1:**

 ```
Input: s = "0110", n = 3
Output: true
```

**Example 2:**

 ```
Input: s = "0110", n = 4
Output: false
```

 

 **Constraints:**

 - `1 <= s.length <= 1000`
- `s[i]` is either `'0'` or `'1'`.
- `1 <= n <= 109`
