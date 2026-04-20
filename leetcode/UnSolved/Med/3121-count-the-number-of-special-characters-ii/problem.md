---
id: 3121
internal_id: 3405
slug: count-the-number-of-special-characters-ii
title: Count the Number of Special Characters II
difficulty: Medium
tags: Hash Table, String
date: 2026-04-20
lang: java
---

# 3121. Count the Number of Special Characters II

**Difficulty:** Medium | **Tags:** Hash Table, String

## Description

You are given a string `word`. A letter `c` is called **special** if it appears **both** in lowercase and uppercase in `word`, and **every** lowercase occurrence of `c` appears before the **first** uppercase occurrence of `c`.

 Return the number of_ _**special** letters_ _in_ _`word`.

 

 **Example 1:**

  **Input:** word = "aaAbcBC"

 **Output:** 3

 **Explanation:**

 The special characters are `'a'`, `'b'`, and `'c'`.

  **Example 2:**

  **Input:** word = "abc"

 **Output:** 0

 **Explanation:**

 There are no special characters in `word`.

  **Example 3:**

  **Input:** word = "AbBCab"

 **Output:** 0

 **Explanation:**

 There are no special characters in `word`.

  

 **Constraints:**

 - `1 <= word.length <= 2 * 105`
- `word` consists of only lowercase and uppercase English letters.
