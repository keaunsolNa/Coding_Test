---
id: 3646
internal_id: 3951
slug: next-special-palindrome-number
title: Next Special Palindrome Number
difficulty: Hard
tags: Backtracking, Bit Manipulation
date: 2026-04-20
lang: java
---

# 3646. Next Special Palindrome Number

**Difficulty:** Hard | **Tags:** Backtracking, Bit Manipulation

## Description

You are given an integer `n`.

 A number is called **special** if:

 - It is a **palindrome**.
- Every digit `k` in the number appears **exactly** `k` times.

 Return the **smallest** special number **strictly **greater than `n`.

 

 **Example 1:**

  **Input:** n = 2

 **Output:** 22

 **Explanation:**

 22 is the smallest special number greater than 2, as it is a palindrome and the digit 2 appears exactly 2 times.

  **Example 2:**

  **Input:** n = 33

 **Output:** 212

 **Explanation:**

 212 is the smallest special number greater than 33, as it is a palindrome and the digits 1 and 2 appear exactly 1 and 2 times respectively.

  

 **Constraints:**

 - `0 <= n <= 1015`
