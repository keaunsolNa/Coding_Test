---
id: 2433
internal_id: 2519
slug: find-the-original-array-of-prefix-xor
title: Find The Original Array of Prefix Xor
difficulty: Medium
tags: Array, Bit Manipulation
date: 2026-04-20
lang: java
---

# 2433. Find The Original Array of Prefix Xor

**Difficulty:** Medium | **Tags:** Array, Bit Manipulation

## Description

You are given an **integer** array `pref` of size `n`. Find and return _the array _`arr`_ of size _`n`_ that satisfies_:

 - `pref[i] = arr[0] ^ arr[1] ^ ... ^ arr[i]`.

 Note that `^` denotes the **bitwise-xor** operation.

 It can be proven that the answer is **unique**.

 

 **Example 1:**

 ```
Input: pref = [5,2,0,3,1]
Output: [5,7,2,3,2]
Explanation: From the array [5,7,2,3,2] we have the following:
- pref[0] = 5.
- pref[1] = 5 ^ 7 = 2.
- pref[2] = 5 ^ 7 ^ 2 = 0.
- pref[3] = 5 ^ 7 ^ 2 ^ 3 = 3.
- pref[4] = 5 ^ 7 ^ 2 ^ 3 ^ 2 = 1.
```

 **Example 2:**

 ```
Input: pref = [13]
Output: [13]
Explanation: We have pref[0] = arr[0] = 13.
```

 

 **Constraints:**

 - `1 <= pref.length <= 105`
- `0 <= pref[i] <= 106`
