---
id: 2910
internal_id: 3166
slug: minimum-number-of-groups-to-create-a-valid-assignment
title: Minimum Number of Groups to Create a Valid Assignment
difficulty: Medium
tags: Array, Hash Table, Greedy
date: 2026-04-20
lang: java
---

# 2910. Minimum Number of Groups to Create a Valid Assignment

**Difficulty:** Medium | **Tags:** Array, Hash Table, Greedy

## Description

You are given a collection of numbered `balls` and instructed to sort them into boxes for a nearly balanced distribution. There are two rules you must follow:

 - Balls with the same box must have the same value. But, if you have more than one ball with the same number, you can put them in different boxes.
- The biggest box can only have one more ball than the smallest box.

 Return the _fewest number of boxes_ to sort these balls following these rules.

 

 **Example 1: **

  **Input: **  balls = [3,2,3,2,3]

 **Output: **  2

 **Explanation:**

 We can sort `balls` into boxes as follows:

 - `[3,3,3]`
- `[2,2]`

 The size difference between the two boxes doesn't exceed one.

  **Example 2: **

  **Input: **  balls = [10,10,10,3,1,1]

 **Output: **  4

 **Explanation:**

 We can sort `balls` into boxes as follows:

 
 - `[10]`
- `[10,10]`
- `[3]`
- `[1,1]`

 You can't use fewer than four boxes while still following the rules. For example, putting all three balls numbered 10 in one box would break the rule about the maximum size difference between boxes.

  

 **Constraints:**

 - `1 <= nums.length <= 105`
- `1 <= nums[i] <= 109`
