---
id: 2734
slug: lexicographically-smallest-string-after-substring-operation
title: Lexicographically Smallest String After Substring Operation
difficulty: Medium
tags: String, Greedy
date: 2026-04-20
lang: java
---

# 2734. Lexicographically Smallest String After Substring Operation

**Difficulty:** Medium | **Tags:** String, Greedy

## Description

Given a string `s` consisting of lowercase English letters. Perform the following operation:

 - Select any non-empty substring then replace every letter of the substring with the preceding letter of the English alphabet. For example, 'b' is converted to 'a', and 'a' is converted to 'z'.

 Return the **lexicographically smallest** string **after performing the operation**.

 

 **Example 1:**

  **Input:** s = "cbabc"

 **Output:** "baabc"

 **Explanation:**

 Perform the operation on the substring starting at index 0, and ending at index 1 inclusive.

  **Example 2:**

  **Input:** s = "aa"

 **Output:** "az"

 **Explanation:**

 Perform the operation on the last letter.

  **Example 3:**

  **Input:** s = "acbbc"

 **Output:** "abaab"

 **Explanation:**

 Perform the operation on the substring starting at index 1, and ending at index 4 inclusive.

  **Example 4:**

  **Input:** s = "leetcode"

 **Output:** "kddsbncd"

 **Explanation:**

 Perform the operation on the entire string.

  

 **Constraints:**

 - `1 <= s.length <= 3 * 105`
- `s` consists of lowercase English letters
