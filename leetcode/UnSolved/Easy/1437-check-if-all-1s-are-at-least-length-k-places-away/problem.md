---
id: 1437
internal_id: 1548
slug: check-if-all-1s-are-at-least-length-k-places-away
title: Check If All 1's Are at Least Length K Places Away
difficulty: Easy
tags: Array
date: 2026-04-20
lang: java
---

# 1437. Check If All 1's Are at Least Length K Places Away

**Difficulty:** Easy | **Tags:** Array

## Description

Given an binary array `nums` and an integer `k`, return `true`_ if all _`1`_'s are at least _`k`_ places away from each other, otherwise return _`false`.

 

 **Example 1:**

  ```
Input: nums = [1,0,0,0,1,0,0,1], k = 2
Output: true
Explanation: Each of the 1s are at least 2 places away from each other.
```

 **Example 2:**

  ```
Input: nums = [1,0,0,1,0,1], k = 2
Output: false
Explanation: The second 1 and third 1 are only one apart from each other.
```

 

 **Constraints:**

 - `1 <= nums.length <= 105`
- `0 <= k <= nums.length`
- `nums[i]` is `0` or `1`
