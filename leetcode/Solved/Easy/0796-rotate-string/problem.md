---
id: 796
slug: rotate-string
title: Rotate String
difficulty: Easy
tags: String, String Matching
date: 2026-07-22
lang: java
---

# 796. Rotate String

**Difficulty:** Easy | **Tags:** String, String Matching

## Description

Given two strings `s` and `goal`, return `true` *if and only if* `s` *can become* `goal` *after some number of **shifts** on* `s`.

A **shift** on `s` consists of moving the leftmost character of `s` to the rightmost position.

	- For example, if `s = "abcde"`, then it will be `"bcdea"` after one shift.

 

Example 1:

```
Input: s = "abcde", goal = "cdeab"
Output: true

```
Example 2:

```
Input: s = "abcde", goal = "abced"
Output: false

```

 

**Constraints:**

	- `1 <= s.length, goal.length <= 100`

	- `s` and `goal` consist of lowercase English letters.
