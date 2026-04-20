---
id: 2185
internal_id: 2292
slug: counting-words-with-a-given-prefix
title: Counting Words With a Given Prefix
difficulty: Easy
tags: Array, String, String Matching
date: 2026-04-20
lang: java
---

# 2185. Counting Words With a Given Prefix

**Difficulty:** Easy | **Tags:** Array, String, String Matching

## Description

You are given an array of strings `words` and a string `pref`.

 Return _the number of strings in _`words`_ that contain _`pref`_ as a **prefix**_.

 A **prefix** of a string `s` is any leading contiguous substring of `s`.

 

 **Example 1:**

 ```
Input: words = ["pay","attention","practice","attend"], pref = "at"
Output: 2
Explanation: The 2 strings that contain "at" as a prefix are: "attention" and "attend".
```

 **Example 2:**

 ```
Input: words = ["leetcode","win","loops","success"], pref = "code"
Output: 0
Explanation: There are no strings that contain "code" as a prefix.
```

 

 **Constraints:**

 - `1 <= words.length <= 100`
- `1 <= words[i].length, pref.length <= 100`
- `words[i]` and `pref` consist of lowercase English letters.
