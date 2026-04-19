---
id: 792
slug: number-of-matching-subsequences
title: Number of Matching Subsequences
difficulty: Medium
tags: Array, Hash Table, String, Binary Search, Dynamic Programming, Trie, Sorting
date: 2026-04-20
lang: java
---

# 792. Number of Matching Subsequences

**Difficulty:** Medium | **Tags:** Array, Hash Table, String, Binary Search, Dynamic Programming, Trie, Sorting

## Description

Given a string `s` and an array of strings `words`, return _the number of_ `words[i]` _that is a subsequence of_ `s`.

 A **subsequence** of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.

 - For example, `"ace"` is a subsequence of `"abcde"`.

 

 **Example 1:**

 ```
Input: s = "abcde", words = ["a","bb","acd","ace"]
Output: 3
Explanation: There are three strings in words that are a subsequence of s: "a", "acd", "ace".
```

 **Example 2:**

 ```
Input: s = "dsahjpjauf", words = ["ahjpjau","ja","ahbwzgqnuk","tnmlanowax"]
Output: 2
```

 

 **Constraints:**

 - `1 <= s.length <= 5 * 104`
- `1 <= words.length <= 5000`
- `1 <= words[i].length <= 50`
- `s` and `words[i]` consist of only lowercase English letters.
