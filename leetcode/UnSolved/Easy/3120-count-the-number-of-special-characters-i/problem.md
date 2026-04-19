---
id: 3120
slug: count-the-number-of-special-characters-i
title: Count the Number of Special Characters I
difficulty: Easy
tags: Hash Table, String
date: 2026-04-19
lang: java
---

# 3120. Count the Number of Special Characters I

**Difficulty:** Easy | **Tags:** Hash Table, String

## Description

You are given a string `word`. A letter is called **special** if it appears **both** in lowercase and uppercase in `word`.

 Return the number of_ _**special** letters in_ _`word`.

 

 **Example 1:**

  **Input:** word = "aaAbcBC"

 **Output:** 3

 **Explanation:**

 The special characters in `word` are `'a'`, `'b'`, and `'c'`.

  **Example 2:**

  **Input:** word = "abc"

 **Output:** 0

 **Explanation:**

 No character in `word` appears in uppercase.

  **Example 3:**

  **Input:** word = "abBCab"

 **Output:** 1

 **Explanation:**

 The only special character in `word` is `'b'`.

  

 **Constraints:**

 - `1 <= word.length <= 50`
- `word` consists of only lowercase and uppercase English letters.
