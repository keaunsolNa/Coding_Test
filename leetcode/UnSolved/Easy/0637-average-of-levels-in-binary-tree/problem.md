---
id: 637
slug: average-of-levels-in-binary-tree
title: Average of Levels in Binary Tree
difficulty: Easy
tags: Tree, Depth-First Search, Breadth-First Search, Binary Tree
date: 2026-04-19
lang: java
---

# 637. Average of Levels in Binary Tree

**Difficulty:** Easy | **Tags:** Tree, Depth-First Search, Breadth-First Search, Binary Tree

## Description

Given the `root` of a binary tree, return _the average value of the nodes on each level in the form of an array_. Answers within `10-5` of the actual answer will be accepted. 

 **Example 1:**

  ```
Input: root = [3,9,20,null,null,15,7]
Output: [3.00000,14.50000,11.00000]
Explanation: The average value of nodes on level 0 is 3, on level 1 is 14.5, and on level 2 is 11.
Hence return [3, 14.5, 11].
```

 **Example 2:**

  ```
Input: root = [3,9,20,15,7]
Output: [3.00000,14.50000,11.00000]
```

 

 **Constraints:**

 - The number of nodes in the tree is in the range `[1, 104]`.
- `-231 <= Node.val <= 231 - 1`
