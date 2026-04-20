---
id: 1160
internal_id: 1112
slug: find-words-that-can-be-formed-by-characters
title: Find Words That Can Be Formed by Characters
difficulty: Easy
tags: Array, Hash Table, String, Counting
date: 2026-04-20
lang: java
---

# 1160. Find Words That Can Be Formed by Characters

**Difficulty:** Easy | **Tags:** Array, Hash Table, String, Counting

## Description

You are given an array of strings `words` and a string `chars`.

 A string is **good** if it can be formed by characters from `chars` (each character can only be used once for **each** word in `words`).

 Return _the sum of lengths of all good strings in words_.

 

 **Example 1:**

 ```
Input: words = ["cat","bt","hat","tree"], chars = "atach"
Output: 6
Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
```

 **Example 2:**

 ```
Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
Output: 10
Explanation: The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.
```

 

 **Constraints:**

 - `1 <= words.length <= 1000`
- `1 <= words[i].length, chars.length <= 100`
- `words[i]` and `chars` consist of lowercase English letters.
