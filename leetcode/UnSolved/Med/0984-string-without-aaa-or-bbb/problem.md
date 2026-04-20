---
id: 984
internal_id: 1026
slug: string-without-aaa-or-bbb
title: String Without AAA or BBB
difficulty: Medium
tags: String, Greedy
date: 2026-04-20
lang: java
---

# 984. String Without AAA or BBB

**Difficulty:** Medium | **Tags:** String, Greedy

## Description

Given two integers `a` and `b`, return **any** string `s` such that:

 - `s` has length `a + b` and contains exactly `a` `'a'` letters, and exactly `b` `'b'` letters,
- The substring `'aaa'` does not occur in `s`, and
- The substring `'bbb'` does not occur in `s`.

 

 **Example 1:**

 ```
Input: a = 1, b = 2
Output: "abb"
Explanation: "abb", "bab" and "bba" are all correct answers.
```

 **Example 2:**

 ```
Input: a = 4, b = 1
Output: "aabaa"
```

 

 **Constraints:**

 - `0 <= a, b <= 100`
- It is guaranteed such an `s` exists for the given `a` and `b`.
