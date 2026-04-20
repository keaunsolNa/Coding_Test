---
id: 1781
internal_id: 1890
slug: sum-of-beauty-of-all-substrings
title: Sum of Beauty of All Substrings
difficulty: Medium
tags: Hash Table, String, Counting
date: 2026-04-20
lang: java
---

# 1781. Sum of Beauty of All Substrings

**Difficulty:** Medium | **Tags:** Hash Table, String, Counting

## Description

The **beauty** of a string is the difference in frequencies between the most frequent and least frequent characters.

 - For example, the beauty of `"abaacc"` is `3 - 1 = 2`.

 Given a string `s`, return _the sum of **beauty** of all of its substrings._

 

 **Example 1:**

 ```
Input: s = "aabcb"
Output: 5
Explanation: The substrings with non-zero beauty are ["aab","aabc","aabcb","abcb","bcb"], each with beauty equal to 1.
```

 **Example 2:**

 ```
Input: s = "aabcbaa"
Output: 17
```

 

 **Constraints:**

 - `1 <= s.length <= 500`
- `s` consists of only lowercase English letters.
