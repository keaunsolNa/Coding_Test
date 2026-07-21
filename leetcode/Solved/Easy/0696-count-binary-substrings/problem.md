---
id: 696
slug: count-binary-substrings
title: Count Binary Substrings
difficulty: Easy
tags: Two Pointers, String
date: 2026-07-21
lang: java
---

# 696. Count Binary Substrings

**Difficulty:** Easy | **Tags:** Two Pointers, String

## Description

Given a binary string `s`, return the number of non-empty substrings that have the same number of `0`&#39;s and `1`&#39;s, and all the `0`&#39;s and all the `1`&#39;s in these substrings are grouped consecutively.

Substrings that occur multiple times are counted the number of times they occur.

 

Example 1:

```

Input: s = "00110011"
Output: 6
Explanation: There are 6 substrings that have equal number of consecutive 1&#39;s and 0&#39;s: "0011", "01", "1100", "10", "0011", and "01".
Notice that some of these substrings repeat and are counted the number of times they occur.
Also, "00110011" is not a valid substring because all the 0&#39;s (and 1&#39;s) are not grouped together.

```

Example 2:

```

Input: s = "10101"
Output: 4
Explanation: There are 4 substrings: "10", "01", "10", "01" that have equal number of consecutive 1&#39;s and 0&#39;s.

```

 

**Constraints:**

	- `1 <= s.length <= 105`

	- `s[i]` is either `&#39;0&#39;` or `&#39;1&#39;`.
