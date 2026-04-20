---
id: 3798
internal_id: 4179
slug: largest-even-number
title: Largest Even Number
difficulty: Easy
tags: String
date: 2026-04-20
lang: java
---

# 3798. Largest Even Number

**Difficulty:** Easy | **Tags:** String

## Description

You are given a string `s` consisting only of the characters `'1'` and `'2'`.

 You may delete any number of characters from `s` without changing the order of the remaining characters.

 Return the **largest possible resultant string** that represents an **even** integer. If there is no such string, return the empty string `""`.

 

 **Example 1:**

  **Input:** s = "1112"

 **Output:** "1112"

 **Explanation:**

 The string already represents the largest possible even number, so no deletions are needed.

  **Example 2:**

  **Input:** s = "221"

 **Output:** "22"

 **Explanation:**

 Deleting `'1'` results in the largest possible even number which is equal to 22.

  **Example 3:**

  **Input:** s = "1"

 **Output:** ""

 **Explanation:**

 There is no way to get an even number.

  

 **Constraints:**

 - `1 <= s.length <= 100`
- `s` consists only of the characters `'1'` and `'2'`.
