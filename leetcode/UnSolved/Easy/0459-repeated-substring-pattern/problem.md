---
id: 459
internal_id: 459
slug: repeated-substring-pattern
title: Repeated Substring Pattern
difficulty: Easy
tags: String, String Matching
date: 2026-04-20
lang: java
---

# 459. Repeated Substring Pattern

**Difficulty:** Easy | **Tags:** String, String Matching

## Description

Given a string `s`, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.

 

 **Example 1:**

 ```
Input: s = "abab"
Output: true
Explanation: It is the substring "ab" twice.
```

 **Example 2:**

 ```
Input: s = "aba"
Output: false
```

 **Example 3:**

 ```
Input: s = "abcabcabcabc"
Output: true
Explanation: It is the substring "abc" four times or the substring "abcabc" twice.
```

 

 **Constraints:**

 - `1 <= s.length <= 104`
- `s` consists of lowercase English letters.
