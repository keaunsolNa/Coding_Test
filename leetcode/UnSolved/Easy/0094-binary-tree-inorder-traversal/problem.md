---
id: 94
slug: binary-tree-inorder-traversal
title: Binary Tree Inorder Traversal
difficulty: Easy
tags: Stack, Tree, Depth-First Search, Binary Tree
date: 2026-04-19
lang: java
---

# 94. Binary Tree Inorder Traversal

**Difficulty:** Easy | **Tags:** Stack, Tree, Depth-First Search, Binary Tree

## Description

Given the `root` of a binary tree, return _the inorder traversal of its nodes' values_.

 

 **Example 1:**

  **Input:** root = [1,null,2,3]

 **Output:** [1,3,2]

 **Explanation:**

 

  **Example 2:**

  **Input:** root = [1,2,3,4,5,null,8,null,null,6,7,9]

 **Output:** [4,2,6,5,7,1,3,9,8]

 **Explanation:**

 

  **Example 3:**

  **Input:** root = []

 **Output:** []

  **Example 4:**

  **Input:** root = [1]

 **Output:** [1]

  

 **Constraints:**

 - The number of nodes in the tree is in the range `[0, 100]`.
- `-100 <= Node.val <= 100`

 

 **Follow up:** Recursive solution is trivial, could you do it iteratively?
