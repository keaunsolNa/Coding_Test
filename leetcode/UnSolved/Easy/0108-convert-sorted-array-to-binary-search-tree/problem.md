---
id: 108
internal_id: 108
slug: convert-sorted-array-to-binary-search-tree
title: Convert Sorted Array to Binary Search Tree
difficulty: Easy
tags: Array, Divide and Conquer, Tree, Binary Search Tree, Binary Tree
date: 2026-04-20
lang: java
---

# 108. Convert Sorted Array to Binary Search Tree

**Difficulty:** Easy | **Tags:** Array, Divide and Conquer, Tree, Binary Search Tree, Binary Tree

## Description

Given an integer array `nums` where the elements are sorted in **ascending order**, convert _it to a _**_height-balanced_** _binary search tree_.

 

 **Example 1:**

  ```
Input: nums = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: [0,-10,5,null,-3,null,9] is also accepted:
```

 **Example 2:**

  ```
Input: nums = [1,3]
Output: [3,1]
Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.
```

 

 **Constraints:**

 - `1 <= nums.length <= 104`
- `-104 <= nums[i] <= 104`
- `nums` is sorted in a **strictly increasing** order.
