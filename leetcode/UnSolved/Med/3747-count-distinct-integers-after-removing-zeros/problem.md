---
id: 3747
internal_id: 4054
slug: count-distinct-integers-after-removing-zeros
title: Count Distinct Integers After Removing Zeros
difficulty: Medium
tags: Math, Dynamic Programming
date: 2026-04-20
lang: java
---

# 3747. Count Distinct Integers After Removing Zeros

**Difficulty:** Medium | **Tags:** Math, Dynamic Programming

## Description

You are given a **positive** integer `n`.

 For every integer `x` from 1 to `n`, we write down the integer obtained by removing all zeros from the decimal representation of `x`.

 Return an integer denoting the number of **distinct** integers written down.

 

 **Example 1:**

  **Input:** n = 10

 **Output:** 9

 **Explanation:**

 The integers we wrote down are 1, 2, 3, 4, 5, 6, 7, 8, 9, 1. There are 9 distinct integers (1, 2, 3, 4, 5, 6, 7, 8, 9).

  **Example 2:**

  **Input:** n = 3

 **Output:** 3

 **Explanation:**

 The integers we wrote down are 1, 2, 3. There are 3 distinct integers (1, 2, 3).

  

 **Constraints:**

 - `1 <= n <= 1015`
