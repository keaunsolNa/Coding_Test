---
id: 2708
internal_id: 2754
slug: maximum-strength-of-a-group
title: Maximum Strength of a Group
difficulty: Medium
tags: Array, Dynamic Programming, Backtracking, Greedy, Bit Manipulation, Sorting, Enumeration
date: 2026-04-20
lang: java
---

# 2708. Maximum Strength of a Group

**Difficulty:** Medium | **Tags:** Array, Dynamic Programming, Backtracking, Greedy, Bit Manipulation, Sorting, Enumeration

## Description

You are given a **0-indexed** integer array `nums` representing the score of students in an exam. The teacher would like to form one **non-empty** group of students with maximal **strength**, where the strength of a group of students of indices `i0`, `i1`, `i2`, ... , `ik` is defined as `nums[i0] * nums[i1] * nums[i2] * ... * nums[ik]`.

 Return _the maximum strength of a group the teacher can create_.

 

 **Example 1:**

 ```
Input: nums = [3,-1,-5,2,5,-9]
Output: 1350
Explanation: One way to form a group of maximal strength is to group the students at indices [0,2,3,4,5]. Their strength is 3 * (-5) * 2 * 5 * (-9) = 1350, which we can show is optimal.
```

 **Example 2:**

 ```
Input: nums = [-4,-5,-4]
Output: 20
Explanation: Group the students at indices [0, 1] . Then, we’ll have a resulting strength of 20. We cannot achieve greater strength.
```

 

 **Constraints:**

 - `1 <= nums.length <= 13`
- `-9 <= nums[i] <= 9`
