---
id: 451
internal_id: 451
slug: sort-characters-by-frequency
title: Sort Characters By Frequency
difficulty: Medium
tags: Hash Table, String, Sorting, Heap (Priority Queue), Bucket Sort, Counting
date: 2026-04-20
lang: java
---

# 451. Sort Characters By Frequency

**Difficulty:** Medium | **Tags:** Hash Table, String, Sorting, Heap (Priority Queue), Bucket Sort, Counting

## Description

Given a string `s`, sort it in **decreasing order** based on the **frequency** of the characters. The **frequency** of a character is the number of times it appears in the string.

 Return _the sorted string_. If there are multiple answers, return _any of them_.

 

 **Example 1:**

 ```
Input: s = "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
```

 **Example 2:**

 ```
Input: s = "cccaaa"
Output: "aaaccc"
Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
Note that "cacaca" is incorrect, as the same characters must be together.
```

 **Example 3:**

 ```
Input: s = "Aabb"
Output: "bbAa"
Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters.
```

 

 **Constraints:**

 - `1 <= s.length <= 5 * 105`
- `s` consists of uppercase and lowercase English letters and digits.
