---
id: 1079
internal_id: 1160
slug: letter-tile-possibilities
title: Letter Tile Possibilities
difficulty: Medium
tags: Hash Table, String, Backtracking, Counting
date: 2026-04-20
lang: java
---

# 1079. Letter Tile Possibilities

**Difficulty:** Medium | **Tags:** Hash Table, String, Backtracking, Counting

## Description

You have `n` `tiles`, where each tile has one letter `tiles[i]` printed on it.

 Return _the number of possible non-empty sequences of letters_ you can make using the letters printed on those `tiles`.

 

 **Example 1:**

 ```
Input: tiles = "AAB"
Output: 8
Explanation: The possible sequences are "A", "B", "AA", "AB", "BA", "AAB", "ABA", "BAA".
```

 **Example 2:**

 ```
Input: tiles = "AAABBC"
Output: 188
```

 **Example 3:**

 ```
Input: tiles = "V"
Output: 1
```

 

 **Constraints:**

 - `1 <= tiles.length <= 7`
- `tiles` consists of uppercase English letters.
