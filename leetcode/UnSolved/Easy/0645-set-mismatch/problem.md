---
id: 645
internal_id: 645
slug: set-mismatch
title: Set Mismatch
difficulty: Easy
tags: Array, Hash Table, Bit Manipulation, Sorting
date: 2026-04-20
lang: java
---

# 645. Set Mismatch

**Difficulty:** Easy | **Tags:** Array, Hash Table, Bit Manipulation, Sorting

## Description

You have a set of integers `s`, which originally contains all the numbers from `1` to `n`. Unfortunately, due to some error, one of the numbers in `s` got duplicated to another number in the set, which results in **repetition of one** number and **loss of another** number.

 You are given an integer array `nums` representing the data status of this set after the error.

 Find the number that occurs twice and the number that is missing and return _them in the form of an array_.

 

 **Example 1:**

 ```
Input: nums = [1,2,2,4]
Output: [2,3]
```

**Example 2:**

 ```
Input: nums = [1,1]
Output: [1,2]
```

 

 **Constraints:**

 - `2 <= nums.length <= 104`
- `1 <= nums[i] <= 104`
