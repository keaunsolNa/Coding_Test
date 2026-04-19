---
id: 546
slug: remove-boxes
title: Remove Boxes
difficulty: Hard
tags: Array, Dynamic Programming, Memoization
date: 2026-04-19
lang: java
---

# 546. Remove Boxes

**Difficulty:** Hard | **Tags:** Array, Dynamic Programming, Memoization

## Description

You are given several `boxes` with different colors represented by different positive numbers.

 You may experience several rounds to remove boxes until there is no box left. Each time you can choose some continuous boxes with the same color (i.e., composed of `k` boxes, `k >= 1`), remove them and get `k * k` points.

 Return _the maximum points you can get_.

 

 **Example 1:**

 ```
Input: boxes = [1,3,2,2,2,3,4,3,1]
Output: 23
Explanation:
[1, 3, 2, 2, 2, 3, 4, 3, 1] 
----> [1, 3, 3, 4, 3, 1] (3*3=9 points) 
----> [1, 3, 3, 3, 1] (1*1=1 points) 
----> [1, 1] (3*3=9 points) 
----> [] (2*2=4 points)
```

 **Example 2:**

 ```
Input: boxes = [1,1,1]
Output: 9
```

 **Example 3:**

 ```
Input: boxes = [1]
Output: 1
```

 

 **Constraints:**

 - `1 <= boxes.length <= 100`
- `1 <= boxes[i] <= 100`
