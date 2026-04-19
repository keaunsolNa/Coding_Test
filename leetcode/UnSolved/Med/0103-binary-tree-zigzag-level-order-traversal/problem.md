---
id: 103
slug: binary-tree-zigzag-level-order-traversal
title: Binary Tree Zigzag Level Order Traversal
difficulty: Medium
tags: Tree, Breadth-First Search, Binary Tree
date: 2026-04-20
lang: java
---

# 103. Binary Tree Zigzag Level Order Traversal

**Difficulty:** Medium | **Tags:** Tree, Breadth-First Search, Binary Tree

## Description

Given the `root` of a binary tree, return _the zigzag level order traversal of its nodes' values_. (i.e., from left to right, then right to left for the next level and alternate between).

 

 **Example 1:**

  ```
Input: root = [3,9,20,null,null,15,7]
Output: [[3],[20,9],[15,7]]
```

 **Example 2:**

 ```
Input: root = [1]
Output: [[1]]
```

 **Example 3:**

 ```
Input: root = []
Output: []
```

 

 **Constraints:**

 - The number of nodes in the tree is in the range `[0, 2000]`.
- `-100 <= Node.val <= 100`
