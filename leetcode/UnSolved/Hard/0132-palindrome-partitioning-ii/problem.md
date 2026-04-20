---
id: 132
internal_id: 132
slug: palindrome-partitioning-ii
title: Palindrome Partitioning II
difficulty: Hard
tags: String, Dynamic Programming
date: 2026-04-20
lang: java
---

# 132. Palindrome Partitioning II

**Difficulty:** Hard | **Tags:** String, Dynamic Programming

## Description

Given a string `s`, partition `s` such that every substring of the partition is a palindrome.

 Return _the **minimum** cuts needed for a palindrome partitioning of_ `s`.

 

 **Example 1:**

 ```
Input: s = "aab"
Output: 1
Explanation: The palindrome partitioning ["aa","b"] could be produced using 1 cut.
```

 **Example 2:**

 ```
Input: s = "a"
Output: 0
```

 **Example 3:**

 ```
Input: s = "ab"
Output: 1
```

 

 **Constraints:**

 - `1 <= s.length <= 2000`
- `s` consists of lowercase English letters only.
