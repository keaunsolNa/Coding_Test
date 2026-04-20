---
id: 1977
internal_id: 2091
slug: number-of-ways-to-separate-numbers
title: Number of Ways to Separate Numbers
difficulty: Hard
tags: String, Dynamic Programming, Suffix Array
date: 2026-04-20
lang: java
---

# 1977. Number of Ways to Separate Numbers

**Difficulty:** Hard | **Tags:** String, Dynamic Programming, Suffix Array

## Description

You wrote down many **positive** integers in a string called `num`. However, you realized that you forgot to add commas to seperate the different numbers. You remember that the list of integers was **non-decreasing** and that **no** integer had leading zeros.

 Return _the **number of possible lists of integers** that you could have written down to get the string _`num`. Since the answer may be large, return it **modulo** `109 + 7`.

 

 **Example 1:**

 ```
Input: num = "327"
Output: 2
Explanation: You could have written down the numbers:
3, 27
327
```

 **Example 2:**

 ```
Input: num = "094"
Output: 0
Explanation: No numbers can have leading zeros and all numbers must be positive.
```

 **Example 3:**

 ```
Input: num = "0"
Output: 0
Explanation: No numbers can have leading zeros and all numbers must be positive.
```

 

 **Constraints:**

 - `1 <= num.length <= 3500`
- `num` consists of digits `'0'` through `'9'`.
