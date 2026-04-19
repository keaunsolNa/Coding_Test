---
id: 777
slug: swap-adjacent-in-lr-string
title: Swap Adjacent in LR String
difficulty: Medium
tags: Two Pointers, String
date: 2026-04-20
lang: java
---

# 777. Swap Adjacent in LR String

**Difficulty:** Medium | **Tags:** Two Pointers, String

## Description

In a string composed of `'L'`, `'R'`, and `'X'` characters, like `"RXXLRXRXL"`, a move consists of either replacing one occurrence of `"XL"` with `"LX"`, or replacing one occurrence of `"RX"` with `"XR"`. Given the starting string `start` and the ending string `result`, return `True` if and only if there exists a sequence of moves to transform `start` to `result`.

 

 **Example 1:**

 ```
Input: start = "RXXLRXRXL", result = "XRLXXRRLX"
Output: true
Explanation: We can transform start to result following these steps:
RXXLRXRXL ->
XRXLRXRXL ->
XRLXRXRXL ->
XRLXXRRXL ->
XRLXXRRLX
```

 **Example 2:**

 ```
Input: start = "X", result = "L"
Output: false
```

 

 **Constraints:**

 - `1 <= start.length <= 104`
- `start.length == result.length`
- Both `start` and `result` will only consist of characters in `'L'`, `'R'`, and `'X'`.
