---
id: 1408
internal_id: 1524
slug: string-matching-in-an-array
title: String Matching in an Array
difficulty: Easy
tags: Array, String, String Matching
date: 2026-04-20
lang: java
---

# 1408. String Matching in an Array

**Difficulty:** Easy | **Tags:** Array, String, String Matching

## Description

Given an array of string `words`, return all strings in_ _`words`_ _that are a substring of another word. You can return the answer in **any order**.

 

 **Example 1:**

 ```
Input: words = ["mass","as","hero","superhero"]
Output: ["as","hero"]
Explanation: "as" is substring of "mass" and "hero" is substring of "superhero".
["hero","as"] is also a valid answer.
```

 **Example 2:**

 ```
Input: words = ["leetcode","et","code"]
Output: ["et","code"]
Explanation: "et", "code" are substring of "leetcode".
```

 **Example 3:**

 ```
Input: words = ["blue","green","bu"]
Output: []
Explanation: No string of words is substring of another string.
```

 

 **Constraints:**

 - `1 <= words.length <= 100`
- `1 <= words[i].length <= 30`
- `words[i]` contains only lowercase English letters.
- All the strings of `words` are **unique**.
