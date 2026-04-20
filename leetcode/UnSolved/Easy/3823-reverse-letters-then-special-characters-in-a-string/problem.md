---
id: 3823
internal_id: 4200
slug: reverse-letters-then-special-characters-in-a-string
title: Reverse Letters Then Special Characters in a String
difficulty: Easy
tags: Two Pointers, String, Simulation
date: 2026-04-20
lang: java
---

# 3823. Reverse Letters Then Special Characters in a String

**Difficulty:** Easy | **Tags:** Two Pointers, String, Simulation

## Description

You are given a string `s` consisting of lowercase English letters and special characters.

 Your task is to perform these **in order**:

 - **Reverse** the **lowercase letters** and place them back into the positions originally occupied by letters.
- **Reverse** the **special characters** and place them back into the positions originally occupied by special characters.

 Return the resulting string after performing the reversals.

 

 **Example 1:**

  **Input:** s = ")ebc#da@f("

 **Output:** "(fad@cb#e)"

 **Explanation:**

 - The letters in the string are `['e', 'b', 'c', 'd', 'a', 'f']`: - Reversing them gives `['f', 'a', 'd', 'c', 'b', 'e']`
- `s` becomes `")fad#cb@e("`
- The special characters in the string are `[')', '#', '@', '(']`: - Reversing them gives `['(', '@', '#', ')']`
- `s` becomes `"(fad@cb#e)"`

  **Example 2:**

  **Input:** s = "z"

 **Output:** "z"

 **Explanation:**

 The string contains only one letter, and reversing it does not change the string. There are no special characters.

  **Example 3:**

  **Input:** s = "!@#$%^&*()"

 **Output:** ")(*&^%$#@!"

 **Explanation:**

 The string contains no letters. The string contains all special characters, so reversing the special characters reverses the whole string.

  

 **Constraints:**

 - `1 <= s.length <= 100`
- `s` consists only of lowercase English letters and the special characters in `"!@#$%^&*()"`.
