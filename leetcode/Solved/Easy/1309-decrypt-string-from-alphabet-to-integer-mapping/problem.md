---
id: 1309
slug: decrypt-string-from-alphabet-to-integer-mapping
title: Decrypt String from Alphabet to Integer Mapping
difficulty: Easy
tags: String
date: 2026-08-28
lang: java
---

# 1309. Decrypt String from Alphabet to Integer Mapping

**Difficulty:** Easy | **Tags:** String

## Description

You are given a string `s` formed by digits and `&#39;#&#39;`. We want to map `s` to English lowercase characters as follows:

	- Characters (`&#39;a&#39;` to `&#39;i&#39;`) are represented by (`&#39;1&#39;` to `&#39;9&#39;`) respectively.

	- Characters (`&#39;j&#39;` to `&#39;z&#39;`) are represented by (`&#39;10#&#39;` to `&#39;26#&#39;`) respectively.

Return *the string formed after mapping*.

The test cases are generated so that a unique mapping will always exist.

 

Example 1:

```

Input: s = "10#11#12"
Output: "jkab"
Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".

```

Example 2:

```

Input: s = "1326#"
Output: "acz"

```

 

**Constraints:**

	- `1 <= s.length <= 1000`

	- `s` consists of digits and the `&#39;#&#39;` letter.

	- `s` will be a valid string such that mapping is always possible.
