---
id: 1941
internal_id: 2053
slug: check-if-all-characters-have-equal-number-of-occurrences
title: Check if All Characters Have Equal Number of Occurrences
difficulty: Easy
tags: Hash Table, String, Counting
date: 2026-04-20
lang: java
---

# 1941. Check if All Characters Have Equal Number of Occurrences

**Difficulty:** Easy | **Tags:** Hash Table, String, Counting

## Description

Given a string `s`, return `true`_ if _`s`_ is a **good** string, or _`false`_ otherwise_.

 A string `s` is **good** if **all** the characters that appear in `s` have the **same** number of occurrences (i.e., the same frequency).

 

 **Example 1:**

 ```
Input: s = "abacbc"
Output: true
Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.
```

 **Example 2:**

 ```
Input: s = "aaabb"
Output: false
Explanation: The characters that appear in s are 'a' and 'b'.
'a' occurs 3 times while 'b' occurs 2 times, which is not the same number of times.
```

 

 **Constraints:**

 - `1 <= s.length <= 1000`
- `s` consists of lowercase English letters.
