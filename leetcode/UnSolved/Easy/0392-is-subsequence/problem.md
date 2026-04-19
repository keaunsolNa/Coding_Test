---
id: 392
slug: is-subsequence
title: Is Subsequence
difficulty: Easy
tags: Two Pointers, String, Dynamic Programming
date: 2026-04-19
lang: java
---

# 392. Is Subsequence

**Difficulty:** Easy | **Tags:** Two Pointers, String, Dynamic Programming

## Description

Given two strings `s` and `t`, return `true`_ if _`s`_ is a **subsequence** of _`t`_, or _`false`_ otherwise_.

 A **subsequence** of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., `"ace"` is a subsequence of `"abcde"` while `"aec"` is not).

 

 **Example 1:**

 ```
Input: s = "abc", t = "ahbgdc"
Output: true
```

**Example 2:**

 ```
Input: s = "axc", t = "ahbgdc"
Output: false
```

 

 **Constraints:**

 - `0 <= s.length <= 100`
- `0 <= t.length <= 104`
- `s` and `t` consist only of lowercase English letters.

 

 **Follow up:** Suppose there are lots of incoming `s`, say `s1, s2, ..., sk` where `k >= 109`, and you want to check one by one to see if `t` has its subsequence. In this scenario, how would you change your code?
