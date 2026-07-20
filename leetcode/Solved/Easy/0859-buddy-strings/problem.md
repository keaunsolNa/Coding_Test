---
id: 859
slug: buddy-strings
title: Buddy Strings
difficulty: Easy
tags: Hash Table, String
date: 2026-07-20
lang: java
---

# 859. Buddy Strings

**Difficulty:** Easy | **Tags:** Hash Table, String

## Description

Given two strings `s` and `goal`, return `true`* if you can swap two letters in *`s`* so the result is equal to *`goal`*, otherwise, return *`false`*.*

Swapping letters is defined as taking two indices `i` and `j` (0-indexed) such that `i != j` and swapping the characters at `s[i]` and `s[j]`.

	- For example, swapping at indices `0` and `2` in `"abcd"` results in `"cbad"`.

 

Example 1:

```

Input: s = "ab", goal = "ba"
Output: true
Explanation: You can swap s[0] = &#39;a&#39; and s[1] = &#39;b&#39; to get "ba", which is equal to goal.

```

Example 2:

```

Input: s = "ab", goal = "ab"
Output: false
Explanation: The only letters you can swap are s[0] = &#39;a&#39; and s[1] = &#39;b&#39;, which results in "ba" != goal.

```

Example 3:

```

Input: s = "aa", goal = "aa"
Output: true
Explanation: You can swap s[0] = &#39;a&#39; and s[1] = &#39;a&#39; to get "aa", which is equal to goal.

```

 

**Constraints:**

	- `1 <= s.length, goal.length <= 2 * 104`

	- `s` and `goal` consist of lowercase letters.
