---
id: 1323
internal_id: 1448
slug: maximum-69-number
title: Maximum 69 Number
difficulty: Easy
tags: Math, Greedy
date: 2026-04-20
lang: java
---

# 1323. Maximum 69 Number

**Difficulty:** Easy | **Tags:** Math, Greedy

## Description

You are given a positive integer `num` consisting only of digits `6` and `9`.

 Return _the maximum number you can get by changing **at most** one digit (_`6`_ becomes _`9`_, and _`9`_ becomes _`6`_)_.

 

 **Example 1:**

 ```
Input: num = 9669
Output: 9969
Explanation: 
Changing the first digit results in 6669.
Changing the second digit results in 9969.
Changing the third digit results in 9699.
Changing the fourth digit results in 9666.
The maximum number is 9969.
```

 **Example 2:**

 ```
Input: num = 9996
Output: 9999
Explanation: Changing the last digit 6 to 9 results in the maximum number.
```

 **Example 3:**

 ```
Input: num = 9999
Output: 9999
Explanation: It is better not to apply any change.
```

 

 **Constraints:**

 - `1 <= num <= 104`
- `num` consists of only `6` and `9` digits.
