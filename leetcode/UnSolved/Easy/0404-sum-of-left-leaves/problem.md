---
id: 404
slug: sum-of-left-leaves
title: Sum of Left Leaves
difficulty: Easy
tags: Tree, Depth-First Search, Breadth-First Search, Binary Tree
date: 2026-04-19
lang: java
---

# 404. Sum of Left Leaves

**Difficulty:** Easy | **Tags:** Tree, Depth-First Search, Breadth-First Search, Binary Tree

## Description

Given the `root` of a binary tree, return _the sum of all left leaves._

 A **leaf** is a node with no children. A **left leaf** is a leaf that is the left child of another node.

 

 **Example 1:**

  ```
Input: root = [3,9,20,null,null,15,7]
Output: 24
Explanation: There are two left leaves in the binary tree, with values 9 and 15 respectively.
```

 **Example 2:**

 ```
Input: root = [1]
Output: 0
```

 

 **Constraints:**

 - The number of nodes in the tree is in the range `[1, 1000]`.
- `-1000 <= Node.val <= 1000`
