---
id: 925
slug: long-pressed-name
title: Long Pressed Name
difficulty: Easy
tags: Two Pointers, String
date: 2026-08-12
lang: java
---

# 925. Long Pressed Name

**Difficulty:** Easy | **Tags:** Two Pointers, String

## Description

Your friend is typing his `name` into a keyboard. Sometimes, when typing a character `c`, the key might get *long pressed*, and the character will be typed 1 or more times.

You examine the `typed` characters of the keyboard. Return `True` if it is possible that it was your friends name, with some characters (possibly none) being long pressed.

 

Example 1:

```

Input: name = "alex", typed = "aaleex"
Output: true
Explanation: &#39;a&#39; and &#39;e&#39; in &#39;alex&#39; were long pressed.

```

Example 2:

```

Input: name = "saeed", typed = "ssaaedd"
Output: false
Explanation: &#39;e&#39; must have been pressed twice, but it was not in the typed output.

```

 

**Constraints:**

	- `1 <= name.length, typed.length <= 1000`

	- `name` and `typed` consist of only lowercase English letters.
