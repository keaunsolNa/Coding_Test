---
id: 1456
internal_id: 1567
slug: maximum-number-of-vowels-in-a-substring-of-given-length
title: Maximum Number of Vowels in a Substring of Given Length
difficulty: Medium
tags: String, Sliding Window
date: 2026-04-20
lang: java
---

# 1456. Maximum Number of Vowels in a Substring of Given Length

**Difficulty:** Medium | **Tags:** String, Sliding Window

## Description

Given a string `s` and an integer `k`, return _the maximum number of vowel letters in any substring of _`s`_ with length _`k`.

 **Vowel letters** in English are `'a'`, `'e'`, `'i'`, `'o'`, and `'u'`.

 

 **Example 1:**

 ```
Input: s = "abciiidef", k = 3
Output: 3
Explanation: The substring "iii" contains 3 vowel letters.
```

 **Example 2:**

 ```
Input: s = "aeiou", k = 2
Output: 2
Explanation: Any substring of length 2 contains 2 vowels.
```

 **Example 3:**

 ```
Input: s = "leetcode", k = 3
Output: 2
Explanation: "lee", "eet" and "ode" contain 2 vowels.
```

 

 **Constraints:**

 - `1 <= s.length <= 105`
- `s` consists of lowercase English letters.
- `1 <= k <= s.length`
