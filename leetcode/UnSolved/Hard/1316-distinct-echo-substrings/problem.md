---
id: 1316
slug: distinct-echo-substrings
title: Distinct Echo Substrings
difficulty: Hard
tags: String, Trie, Rolling Hash, Hash Function
date: 2026-04-19
lang: java
---

# 1316. Distinct Echo Substrings

**Difficulty:** Hard | **Tags:** String, Trie, Rolling Hash, Hash Function

## Description

Return the number of **distinct** non-empty substrings of `text` that can be written as the concatenation of some string with itself (i.e. it can be written as `a + a` where `a` is some string).

 

 **Example 1:**

 ```
Input: text = "abcabcabc"
Output: 3
Explanation: The 3 substrings are "abcabc", "bcabca" and "cabcab".
```

 **Example 2:**

 ```
Input: text = "leetcodeleetcode"
Output: 2
Explanation: The 2 substrings are "ee" and "leetcodeleetcode".
```

 

 **Constraints:**

 - `1 <= text.length <= 2000`
- `text` has only lowercase English letters.
