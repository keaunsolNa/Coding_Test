---
id: 2278
slug: percentage-of-letter-in-string
title: Percentage of Letter in String
difficulty: Easy
tags: String
date: 2026-04-19
lang: java
---

# 2278. Percentage of Letter in String

**Difficulty:** Easy | **Tags:** String

## Description

Given a string `s` and a character `letter`, return_ the **percentage** of characters in _`s`_ that equal _`letter`_ **rounded down** to the nearest whole percent._

 

 **Example 1:**

 ```
Input: s = "foobar", letter = "o"
Output: 33
Explanation:
The percentage of characters in s that equal the letter 'o' is 2 / 6 * 100% = 33% when rounded down, so we return 33.
```

 **Example 2:**

 ```
Input: s = "jjjj", letter = "k"
Output: 0
Explanation:
The percentage of characters in s that equal the letter 'k' is 0%, so we return 0.
```

 

 **Constraints:**

 - `1 <= s.length <= 100`
- `s` consists of lowercase English letters.
- `letter` is a lowercase English letter.
