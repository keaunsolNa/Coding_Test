---
id: 338
slug: counting-bits
title: Counting Bits
difficulty: Easy
tags: Dynamic Programming, Bit Manipulation
date: 2026-04-19
lang: java
---

# 338. Counting Bits

**Difficulty:** Easy | **Tags:** Dynamic Programming, Bit Manipulation

## Description

Given an integer `n`, return _an array _`ans`_ of length _`n + 1`_ such that for each _`i`_ _(`0 <= i <= n`)_, _`ans[i]`_ is the **number of **_`1`_**'s** in the binary representation of _`i`.

 

 **Example 1:**

 ```
Input: n = 2
Output: [0,1,1]
Explanation:
0 --> 0
1 --> 1
2 --> 10
```

 **Example 2:**

 ```
Input: n = 5
Output: [0,1,1,2,1,2]
Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101
```

 

 **Constraints:**

 - `0 <= n <= 105`

 

 **Follow up:**

 - It is very easy to come up with a solution with a runtime of `O(n log n)`. Can you do it in linear time `O(n)` and possibly in a single pass?
- Can you do it without using any built-in function (i.e., like `__builtin_popcount` in C++)?
