---
id: 3816
slug: lexicographically-smallest-string-after-deleting-duplicate-characters
title: Lexicographically Smallest String After Deleting Duplicate Characters
difficulty: Hard
tags: Hash Table, String, Stack, Greedy, Monotonic Stack
date: 2026-04-19
lang: java
---

# 3816. Lexicographically Smallest String After Deleting Duplicate Characters

**Difficulty:** Hard | **Tags:** Hash Table, String, Stack, Greedy, Monotonic Stack

## Description

You are given a string `s` that consists of lowercase English letters.

 You can perform the following operation any number of times (possibly zero times):

 - Choose any letter that appears **at least twice** in the current string `s` and delete any **one** occurrence.

 Return the **lexicographically smallest** resulting string that can be formed this way.

 

 **Example 1:**

  **Input:** s = "aaccb"

 **Output:** "aacb"

 **Explanation:**

 We can form the strings `"acb"`, `"aacb"`, `"accb"`, and `"aaccb"`. `"aacb"` is the lexicographically smallest one.

 For example, we can obtain `"aacb"` by choosing `'c'` and deleting its first occurrence.

  **Example 2:**

  **Input:** s = "z"

 **Output:** "z"

 **Explanation:**

 We cannot perform any operations. The only string we can form is `"z"`.

  

 **Constraints:**

 - `1 <= s.length <= 105`
- `s` contains lowercase English letters only.
