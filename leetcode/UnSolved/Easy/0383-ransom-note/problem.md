---
id: 383
slug: ransom-note
title: Ransom Note
difficulty: Easy
tags: Hash Table, String, Counting
date: 2026-04-19
lang: java
---

# 383. Ransom Note

**Difficulty:** Easy | **Tags:** Hash Table, String, Counting

## Description

Given two strings `ransomNote` and `magazine`, return `true`_ if _`ransomNote`_ can be constructed by using the letters from _`magazine`_ and _`false`_ otherwise_.

 Each letter in `magazine` can only be used once in `ransomNote`.

 

 **Example 1:**

 ```
Input: ransomNote = "a", magazine = "b"
Output: false
```

**Example 2:**

 ```
Input: ransomNote = "aa", magazine = "ab"
Output: false
```

**Example 3:**

 ```
Input: ransomNote = "aa", magazine = "aab"
Output: true
```

 

 **Constraints:**

 - `1 <= ransomNote.length, magazine.length <= 105`
- `ransomNote` and `magazine` consist of lowercase English letters.
