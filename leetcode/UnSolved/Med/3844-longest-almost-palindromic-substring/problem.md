---
id: 3844
internal_id: 4221
slug: longest-almost-palindromic-substring
title: Longest Almost-Palindromic Substring
difficulty: Medium
tags: Two Pointers, String, Dynamic Programming
date: 2026-04-20
lang: java
---

# 3844. Longest Almost-Palindromic Substring

**Difficulty:** Medium | **Tags:** Two Pointers, String, Dynamic Programming

## Description

You are given a string `s` consisting of lowercase English letters.

 A substring is **almost-palindromic** if it becomes a palindrome after removing **exactly** one character from it.

 Return an integer denoting the length of the **longest** **almost-palindromic** substring in `s`.

 

 **Example 1:**

  **Input:** s = "abca"

 **Output:** 4

 **Explanation:**

 Choose the substring `"abca"`.

 - Remove `"abca"`.
- The string becomes `"aba"`, which is a palindrome.
- Therefore, `"abca"` is almost-palindromic.

  **Example 2:**

  **Input:** s = "abba"

 **Output:** 4

 **Explanation:**

 Choose the substring `"abba"`.

 - Remove `"abba"`.
- The string becomes `"aba"`, which is a palindrome.
- Therefore, `"abba"` is almost-palindromic.

  **Example 3:**

  **Input:** s = "zzabba"

 **Output:** 5

 **Explanation:**

 Choose the substring `"zzabba"`.

 - Remove `"zabba"`.
- The string becomes `"abba"`, which is a palindrome.
- Therefore, `"zabba"` is almost-palindromic.

  

 **Constraints:**

 - `2 <= s.length <= 2500`
- `s` consists of only lowercase English letters.
