---
id: 915
internal_id: 951
slug: partition-array-into-disjoint-intervals
title: Partition Array into Disjoint Intervals
difficulty: Medium
tags: Array
date: 2026-04-20
lang: java
---

# 915. Partition Array into Disjoint Intervals

**Difficulty:** Medium | **Tags:** Array

## Description

Given an integer array `nums`, partition it into two (contiguous) subarrays `left` and `right` so that:

 - Every element in `left` is less than or equal to every element in `right`.
- `left` and `right` are non-empty.
- `left` has the smallest possible size.

 Return _the length of _`left`_ after such a partitioning_.

 Test cases are generated such that partitioning exists.

 

 **Example 1:**

 ```
Input: nums = [5,0,3,8,6]
Output: 3
Explanation: left = [5,0,3], right = [8,6]
```

 **Example 2:**

 ```
Input: nums = [1,1,1,0,6,12]
Output: 4
Explanation: left = [1,1,1,0], right = [6,12]
```

 

 **Constraints:**

 - `2 <= nums.length <= 105`
- `0 <= nums[i] <= 106`
- There is at least one valid answer for the given input.
