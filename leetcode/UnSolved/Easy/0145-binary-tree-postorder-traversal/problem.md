---
id: 145
internal_id: 145
slug: binary-tree-postorder-traversal
title: Binary Tree Postorder Traversal
difficulty: Easy
tags: Stack, Tree, Depth-First Search, Binary Tree
date: 2026-04-20
lang: java
---

# 145. Binary Tree Postorder Traversal

**Difficulty:** Easy | **Tags:** Stack, Tree, Depth-First Search, Binary Tree

## Description

Given the `root` of a binary tree, return _the postorder traversal of its nodes' values_.

 

 **Example 1:**

  **Input:** root = [1,null,2,3]

 **Output:** [3,2,1]

 **Explanation:**

 

  **Example 2:**

  **Input:** root = [1,2,3,4,5,null,8,null,null,6,7,9]

 **Output:** [4,6,7,5,2,9,8,3,1]

 **Explanation:**

 

  **Example 3:**

  **Input:** root = []

 **Output:** []

  **Example 4:**

  **Input:** root = [1]

 **Output:** [1]

  

 **Constraints:**

 - The number of the nodes in the tree is in the range `[0, 100]`.
- `-100 <= Node.val <= 100`

 

 **Follow up:** Recursive solution is trivial, could you do it iteratively?
