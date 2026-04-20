---
id: 2595
internal_id: 2659
slug: number-of-even-and-odd-bits
title: Number of Even and Odd Bits
difficulty: Easy
tags: Bit Manipulation
date: 2026-04-20
lang: java
---

# 2595. Number of Even and Odd Bits

**Difficulty:** Easy | **Tags:** Bit Manipulation

## Description

You are given a **positive** integer `n`.

 Let `even` denote the number of even indices in the binary representation of `n` with value 1.

 Let `odd` denote the number of odd indices in the binary representation of `n` with value 1.

 Note that bits are indexed from **right to left** in the binary representation of a number.

 Return the array `[even, odd]`.

 

 **Example 1:**

  **Input:** n = 50

 **Output:** [1,2]

 **Explanation:**

 The binary representation of 50 is `110010`.

 It contains 1 on indices 1, 4, and 5.

  **Example 2:**

  **Input:** n = 2

 **Output:** [0,1]

 **Explanation:**

 The binary representation of 2 is `10`.

 It contains 1 only on index 1.

  

 **Constraints:**

 - `1 <= n <= 1000`
