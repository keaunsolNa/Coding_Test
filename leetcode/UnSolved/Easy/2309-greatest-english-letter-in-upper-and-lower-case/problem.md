---
id: 2309
internal_id: 1363
slug: greatest-english-letter-in-upper-and-lower-case
title: Greatest English Letter in Upper and Lower Case
difficulty: Easy
tags: Hash Table, String, Enumeration
date: 2026-04-20
lang: java
---

# 2309. Greatest English Letter in Upper and Lower Case

**Difficulty:** Easy | **Tags:** Hash Table, String, Enumeration

## Description

Given a string of English letters `s`, return _the **greatest **English letter which occurs as **both** a lowercase and uppercase letter in_ `s`. The returned letter should be in **uppercase**. If no such letter exists, return _an empty string_.

 An English letter `b` is **greater** than another letter `a` if `b` appears **after** `a` in the English alphabet.

 

 **Example 1:**

 ```
Input: s = "lEeTcOdE"
Output: "E"
Explanation:
The letter 'E' is the only letter to appear in both lower and upper case.
```

 **Example 2:**

 ```
Input: s = "arRAzFif"
Output: "R"
Explanation:
The letter 'R' is the greatest letter to appear in both lower and upper case.
Note that 'A' and 'F' also appear in both lower and upper case, but 'R' is greater than 'F' or 'A'.
```

 **Example 3:**

 ```
Input: s = "AbCdEfGhIjK"
Output: ""
Explanation:
There is no letter that appears in both lower and upper case.
```

 

 **Constraints:**

 - `1 <= s.length <= 1000`
- `s` consists of lowercase and uppercase English letters.
