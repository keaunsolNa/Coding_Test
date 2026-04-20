---
id: 2124
internal_id: 2243
slug: check-if-all-as-appears-before-all-bs
title: Check if All A's Appears Before All B's
difficulty: Easy
tags: String
date: 2026-04-20
lang: java
---

# 2124. Check if All A's Appears Before All B's

**Difficulty:** Easy | **Tags:** String

## Description

Given a string `s` consisting of **only** the characters `'a'` and `'b'`, return `true` _if **every** _`'a'` _appears before **every** _`'b'`_ in the string_. Otherwise, return `false`.

 

 **Example 1:**

 ```
Input: s = "aaabbb"
Output: true
Explanation:
The 'a's are at indices 0, 1, and 2, while the 'b's are at indices 3, 4, and 5.
Hence, every 'a' appears before every 'b' and we return true.
```

 **Example 2:**

 ```
Input: s = "abab"
Output: false
Explanation:
There is an 'a' at index 2 and a 'b' at index 1.
Hence, not every 'a' appears before every 'b' and we return false.
```

 **Example 3:**

 ```
Input: s = "bbb"
Output: true
Explanation:
There are no 'a's, hence, every 'a' appears before every 'b' and we return true.
```

 

 **Constraints:**

 - `1 <= s.length <= 100`
- `s[i]` is either `'a'` or `'b'`.
