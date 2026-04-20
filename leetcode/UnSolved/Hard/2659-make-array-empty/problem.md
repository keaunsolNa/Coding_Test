---
id: 2659
internal_id: 2765
slug: make-array-empty
title: Make Array Empty
difficulty: Hard
tags: Array, Binary Search, Greedy, Binary Indexed Tree, Segment Tree, Sorting, Ordered Set
date: 2026-04-20
lang: java
---

# 2659. Make Array Empty

**Difficulty:** Hard | **Tags:** Array, Binary Search, Greedy, Binary Indexed Tree, Segment Tree, Sorting, Ordered Set

## Description

You are given an integer array `nums` containing **distinct** numbers, and you can perform the following operations **until the array is empty**:

 - If the first element has the **smallest** value, remove it
- Otherwise, put the first element at the **end** of the array.

 Return _an integer denoting the number of operations it takes to make _`nums`_ empty._

 

 **Example 1:**

 ```
Input: nums = [3,4,-1]
Output: 5
```

    Operation Array     1 [4, -1, 3]   2 [-1, 3, 4]   3 [3, 4]   4 [4]   5 []    **Example 2:**

 ```
Input: nums = [1,2,4,3]
Output: 5
```

    Operation Array     1 [2, 4, 3]   2 [4, 3]   3 [3, 4]   4 [4]   5 []    **Example 3:**

 ```
Input: nums = [1,2,3]
Output: 3
```

    Operation Array     1 [2, 3]   2 [3]   3 []    

 **Constraints:**

 - `1 <= nums.length <= 105`
- `-109 <= nums[i] <= 109`
- All values in `nums` are **distinct**.
