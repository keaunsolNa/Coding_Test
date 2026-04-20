---
id: 968
internal_id: 1008
slug: binary-tree-cameras
title: Binary Tree Cameras
difficulty: Hard
tags: Dynamic Programming, Tree, Depth-First Search, Binary Tree
date: 2026-04-20
lang: java
---

# 968. Binary Tree Cameras

**Difficulty:** Hard | **Tags:** Dynamic Programming, Tree, Depth-First Search, Binary Tree

## Description

You are given the `root` of a binary tree. We install cameras on the tree nodes where each camera at a node can monitor its parent, itself, and its immediate children.

 Return _the minimum number of cameras needed to monitor all nodes of the tree_.

 

 **Example 1:**

  ```
Input: root = [0,0,null,0,0]
Output: 1
Explanation: One camera is enough to monitor all nodes if placed as shown.
```

 **Example 2:**

  ```
Input: root = [0,0,null,0,null,0,null,null,0]
Output: 2
Explanation: At least two cameras are needed to monitor all nodes of the tree. The above image shows one of the valid configurations of camera placement.
```

 

 **Constraints:**

 - The number of nodes in the tree is in the range `[1, 1000]`.
- `Node.val == 0`
