---
id: 718
internal_id: 718
slug: maximum-length-of-repeated-subarray
title: Maximum Length of Repeated Subarray
difficulty: Medium
tags: Array, Binary Search, Dynamic Programming, Sliding Window, Rolling Hash, Hash Function
date: 2026-04-20
lang: java
---

# 718. Maximum Length of Repeated Subarray

**Difficulty:** Medium | **Tags:** Array, Binary Search, Dynamic Programming, Sliding Window, Rolling Hash, Hash Function

## Description

Given two integer arrays `nums1` and `nums2`, return _the maximum length of a subarray that appears in **both** arrays_.

 

 **Example 1:**

 ```
Input: nums1 = [1,2,3,2,1], nums2 = [3,2,1,4,7]
Output: 3
Explanation: The repeated subarray with maximum length is [3,2,1].
```

 **Example 2:**

 ```
Input: nums1 = [0,0,0,0,0], nums2 = [0,0,0,0,0]
Output: 5
Explanation: The repeated subarray with maximum length is [0,0,0,0,0].
```

 

 **Constraints:**

 - `1 <= nums1.length, nums2.length <= 1000`
- `0 <= nums1[i], nums2[i] <= 100`
