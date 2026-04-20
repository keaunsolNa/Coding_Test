---
id: 3304
internal_id: 3600
slug: find-the-k-th-character-in-string-game-i
title: Find the K-th Character in String Game I
difficulty: Easy
tags: Math, Bit Manipulation, Recursion, Simulation
date: 2026-04-20
lang: java
---

# 3304. Find the K-th Character in String Game I

**Difficulty:** Easy | **Tags:** Math, Bit Manipulation, Recursion, Simulation

## Description

Alice and Bob are playing a game. Initially, Alice has a string `word = "a"`.

 You are given a **positive** integer `k`.

 Now Bob will ask Alice to perform the following operation **forever**:

 - Generate a new string by **changing** each character in `word` to its **next** character in the English alphabet, and **append** it to the _original_ `word`.

 For example, performing the operation on `"c"` generates `"cd"` and performing the operation on `"zb"` generates `"zbac"`.

 Return the value of the `kth` character in `word`, after enough operations have been done for `word` to have **at least** `k` characters.

 

 **Example 1:**

  **Input:** k = 5

 **Output:** "b"

 **Explanation:**

 Initially, `word = "a"`. We need to do the operation three times:

 - Generated string is `"b"`, `word` becomes `"ab"`.
- Generated string is `"bc"`, `word` becomes `"abbc"`.
- Generated string is `"bccd"`, `word` becomes `"abbcbccd"`.

  **Example 2:**

  **Input:** k = 10

 **Output:** "c"

  

 **Constraints:**

 - `1 <= k <= 500`
