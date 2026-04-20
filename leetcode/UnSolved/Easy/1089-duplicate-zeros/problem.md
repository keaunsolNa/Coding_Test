---
id: 1089
internal_id: 1168
slug: duplicate-zeros
title: Duplicate Zeros
difficulty: Easy
tags: Array, Two Pointers
date: 2026-04-20
lang: java
---

# 1089. Duplicate Zeros

**Difficulty:** Easy | **Tags:** Array, Two Pointers

## Description

Given a fixed-length integer array `arr`, duplicate each occurrence of zero, shifting the remaining elements to the right.

 **Note** that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.

 

 **Example 1:**

 ```
Input: arr = [1,0,2,3,0,4,5,0]
Output: [1,0,0,2,3,0,0,4]
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
```

 **Example 2:**

 ```
Input: arr = [1,2,3]
Output: [1,2,3]
Explanation: After calling your function, the input array is modified to: [1,2,3]
```

 

 **Constraints:**

 - `1 <= arr.length <= 104`
- `0 <= arr[i] <= 9`
