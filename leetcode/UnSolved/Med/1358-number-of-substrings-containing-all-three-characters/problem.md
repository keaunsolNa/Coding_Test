---
id: 1358
internal_id: 1460
slug: number-of-substrings-containing-all-three-characters
title: Number of Substrings Containing All Three Characters
difficulty: Medium
tags: Hash Table, String, Sliding Window
date: 2026-04-20
lang: java
---

# 1358. Number of Substrings Containing All Three Characters

**Difficulty:** Medium | **Tags:** Hash Table, String, Sliding Window

## Description

Given a string `s` consisting only of characters _a_, _b_ and _c_.

 Return the number of substrings containing **at least** one occurrence of all these characters _a_, _b_ and _c_.

 

 **Example 1:**

 ```
Input: s = "abcabc"
Output: 10
Explanation: The substrings containing at least one occurrence of the characters a, b and c are "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" (again).
```

 **Example 2:**

 ```
Input: s = "aaacb"
Output: 3
Explanation: The substrings containing at least one occurrence of the characters a, b and c are "aaacb", "aacb" and "acb".
```

 **Example 3:**

 ```
Input: s = "abc"
Output: 1
```

 

 **Constraints:**

 - `3 <= s.length <= 5 x 10^4`
- `s` only consists of _a_, _b_ or _c _characters.
