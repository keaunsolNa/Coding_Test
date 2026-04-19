---
id: 1419
slug: minimum-number-of-frogs-croaking
title: Minimum Number of Frogs Croaking
difficulty: Medium
tags: String, Counting
date: 2026-04-20
lang: java
---

# 1419. Minimum Number of Frogs Croaking

**Difficulty:** Medium | **Tags:** String, Counting

## Description

You are given the string `croakOfFrogs`, which represents a combination of the string `"croak"` from different frogs, that is, multiple frogs can croak at the same time, so multiple `"croak"` are mixed.

 _Return the minimum number of _different_ frogs to finish all the croaks in the given string._

 A valid `"croak"` means a frog is printing five letters `'c'`, `'r'`, `'o'`, `'a'`, and `'k'` **sequentially**. The frogs have to print all five letters to finish a croak. If the given string is not a combination of a valid `"croak"` return `-1`.

 

 **Example 1:**

 ```
Input: croakOfFrogs = "croakcroak"
Output: 1 
Explanation: One frog yelling "croak" twice.
```

 **Example 2:**

 ```
Input: croakOfFrogs = "crcoakroak"
Output: 2 
Explanation: The minimum number of frogs is two. 
The first frog could yell "crcoakroak".
The second frog could yell later "crcoakroak".
```

 **Example 3:**

 ```
Input: croakOfFrogs = "croakcrook"
Output: -1
Explanation: The given string is an invalid combination of "croak" from different frogs.
```

 

 **Constraints:**

 - `1 <= croakOfFrogs.length <= 105`
- `croakOfFrogs` is either `'c'`, `'r'`, `'o'`, `'a'`, or `'k'`.
