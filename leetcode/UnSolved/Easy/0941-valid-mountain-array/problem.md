---
id: 941
slug: valid-mountain-array
title: Valid Mountain Array
difficulty: Easy
tags: Array
date: 2026-04-19
lang: java
---

# 941. Valid Mountain Array

**Difficulty:** Easy | **Tags:** Array

## Description

Given an array of integers `arr`, return _`true` if and only if it is a valid mountain array_.

 Recall that arr is a mountain array if and only if:

 - `arr.length >= 3`
- There exists some `i` with `0 < i < arr.length - 1` such that: - `arr[0] < arr[1] < ... < arr[i - 1] < arr[i]`
- `arr[i] > arr[i + 1] > ... > arr[arr.length - 1]`

  

 **Example 1:**

 ```
Input: arr = [2,1]
Output: false
```

**Example 2:**

 ```
Input: arr = [3,5,5]
Output: false
```

**Example 3:**

 ```
Input: arr = [0,3,2,1]
Output: true
```

 

 **Constraints:**

 - `1 <= arr.length <= 104`
- `0 <= arr[i] <= 104`
