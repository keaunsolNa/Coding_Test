---
id: 1044
slug: longest-duplicate-substring
title: Longest Duplicate Substring
difficulty: Hard
tags: String, Binary Search, Sliding Window, Rolling Hash, Suffix Array, Hash Function
date: 2026-04-19
lang: java
---

# 1044. Longest Duplicate Substring

**Difficulty:** Hard | **Tags:** String, Binary Search, Sliding Window, Rolling Hash, Suffix Array, Hash Function

## Description

Given a string `s`, consider all _duplicated substrings_: (contiguous) substrings of s that occur 2 or more times. The occurrences may overlap.

 Return **any** duplicated substring that has the longest possible length. If `s` does not have a duplicated substring, the answer is `""`.

 

 **Example 1:**

 ```
Input: s = "banana"
Output: "ana"
```

**Example 2:**

 ```
Input: s = "abcd"
Output: ""
```

 

 **Constraints:**

 - `2 <= s.length <= 3 * 104`
- `s` consists of lowercase English letters.
