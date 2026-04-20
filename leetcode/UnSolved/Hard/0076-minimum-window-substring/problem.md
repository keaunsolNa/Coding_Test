---
id: 76
internal_id: 76
slug: minimum-window-substring
title: Minimum Window Substring
difficulty: Hard
tags: Hash Table, String, Sliding Window
date: 2026-04-20
lang: java
---

# 76. Minimum Window Substring

**Difficulty:** Hard | **Tags:** Hash Table, String, Sliding Window

## Description

Given two strings `s` and `t` of lengths `m` and `n` respectively, return _the **minimum window**_ **_substring_**_ of _`s`_ such that every character in _`t`_ (**including duplicates**) is included in the window_. If there is no such substring, return _the empty string _`""`.

 The testcases will be generated such that the answer is **unique**.

 

 **Example 1:**

 ```
Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
```

 **Example 2:**

 ```
Input: s = "a", t = "a"
Output: "a"
Explanation: The entire string s is the minimum window.
```

 **Example 3:**

 ```
Input: s = "a", t = "aa"
Output: ""
Explanation: Both 'a's from t must be included in the window.
Since the largest window of s only has one 'a', return empty string.
```

 

 **Constraints:**

 - `m == s.length`
- `n == t.length`
- `1 <= m, n <= 105`
- `s` and `t` consist of uppercase and lowercase English letters.

 

 **Follow up:** Could you find an algorithm that runs in `O(m + n)` time?
