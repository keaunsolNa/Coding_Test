---
id: 315
slug: count-of-smaller-numbers-after-self
title: Count of Smaller Numbers After Self
difficulty: Hard
tags: Array, Binary Search, Divide and Conquer, Binary Indexed Tree, Segment Tree, Merge Sort, Ordered Set
date: 2026-04-19
lang: java
---

# 315. Count of Smaller Numbers After Self

**Difficulty:** Hard | **Tags:** Array, Binary Search, Divide and Conquer, Binary Indexed Tree, Segment Tree, Merge Sort, Ordered Set

## Description

Given an integer array `nums`, return_ an integer array _`counts`_ where _`counts[i]`_ is the number of smaller elements to the right of _`nums[i]`.

 

 **Example 1:**

 ```
Input: nums = [5,2,6,1]
Output: [2,1,1,0]
Explanation:
To the right of 5 there are 2 smaller elements (2 and 1).
To the right of 2 there is only 1 smaller element (1).
To the right of 6 there is 1 smaller element (1).
To the right of 1 there is 0 smaller element.
```

 **Example 2:**

 ```
Input: nums = [-1]
Output: [0]
```

 **Example 3:**

 ```
Input: nums = [-1,-1]
Output: [0,0]
```

 

 **Constraints:**

 - `1 <= nums.length <= 105`
- `-104 <= nums[i] <= 104`
