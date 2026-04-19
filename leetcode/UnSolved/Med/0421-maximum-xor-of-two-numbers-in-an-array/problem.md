---
id: 421
slug: maximum-xor-of-two-numbers-in-an-array
title: Maximum XOR of Two Numbers in an Array
difficulty: Medium
tags: Array, Hash Table, Bit Manipulation, Trie
date: 2026-04-20
lang: java
---

# 421. Maximum XOR of Two Numbers in an Array

**Difficulty:** Medium | **Tags:** Array, Hash Table, Bit Manipulation, Trie

## Description

Given an integer array `nums`, return _the maximum result of _`nums[i] XOR nums[j]`, where `0 <= i <= j < n`.

 

 **Example 1:**

 ```
Input: nums = [3,10,5,25,2,8]
Output: 28
Explanation: The maximum result is 5 XOR 25 = 28.
```

 **Example 2:**

 ```
Input: nums = [14,70,53,83,49,91,36,80,92,51,66,70]
Output: 127
```

 

 **Constraints:**

 - `1 <= nums.length <= 2 * 105`
- `0 <= nums[i] <= 231 - 1`
