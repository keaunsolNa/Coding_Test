---
id: 2062
internal_id: 2186
slug: count-vowel-substrings-of-a-string
title: Count Vowel Substrings of a String
difficulty: Easy
tags: Hash Table, String
date: 2026-04-20
lang: java
---

# 2062. Count Vowel Substrings of a String

**Difficulty:** Easy | **Tags:** Hash Table, String

## Description

A **substring** is a contiguous (non-empty) sequence of characters within a string.

 A **vowel substring** is a substring that **only** consists of vowels (`'a'`, `'e'`, `'i'`, `'o'`, and `'u'`) and has **all five** vowels present in it.

 Given a string `word`, return _the number of **vowel substrings** in_ `word`.

 

 **Example 1:**

 ```
Input: word = "aeiouu"
Output: 2
Explanation: The vowel substrings of word are as follows (underlined):
- "aeiouu"
- "aeiouu"
```

 **Example 2:**

 ```
Input: word = "unicornarihan"
Output: 0
Explanation: Not all 5 vowels are present, so there are no vowel substrings.
```

 **Example 3:**

 ```
Input: word = "cuaieuouac"
Output: 7
Explanation: The vowel substrings of word are as follows (underlined):
- "cuaieuouac"
- "cuaieuouac"
- "cuaieuouac"
- "cuaieuouac"
- "cuaieuouac"
- "cuaieuouac"
- "cuaieuouac"
```

 

 **Constraints:**

 - `1 <= word.length <= 100`
- `word` consists of lowercase English letters only.
