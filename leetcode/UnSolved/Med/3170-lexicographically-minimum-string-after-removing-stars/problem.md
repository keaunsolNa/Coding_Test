---
id: 3170
slug: lexicographically-minimum-string-after-removing-stars
title: Lexicographically Minimum String After Removing Stars
difficulty: Medium
tags: Hash Table, String, Stack, Greedy, Heap (Priority Queue)
date: 2026-04-20
lang: java
---

# 3170. Lexicographically Minimum String After Removing Stars

**Difficulty:** Medium | **Tags:** Hash Table, String, Stack, Greedy, Heap (Priority Queue)

## Description

You are given a string `s`. It may contain any number of `'*'` characters. Your task is to remove all `'*'` characters.

 While there is a `'*'`, do the following operation:

 - Delete the leftmost `'*'` and the **smallest** non-`'*'` character to its _left_. If there are several smallest characters, you can delete any of them.

 Return the lexicographically smallest resulting string after removing all `'*'` characters.

 

 **Example 1:**

  **Input:** s = "aaba*"

 **Output:** "aab"

 **Explanation:**

 We should delete one of the `'a'` characters with `'*'`. If we choose `s[3]`, `s` becomes the lexicographically smallest.

  **Example 2:**

  **Input:** s = "abc"

 **Output:** "abc"

 **Explanation:**

 There is no `'*'` in the string.

  

 **Constraints:**

 - `1 <= s.length <= 105`
- `s` consists only of lowercase English letters and `'*'`.
- The input is generated such that it is possible to delete all `'*'` characters.
