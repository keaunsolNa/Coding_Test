---
id: 653
internal_id: 653
slug: two-sum-iv-input-is-a-bst
title: Two Sum IV - Input is a BST
difficulty: Easy
tags: Hash Table, Two Pointers, Tree, Depth-First Search, Breadth-First Search, Binary Search Tree, Binary Tree
date: 2026-04-20
lang: java
---

# 653. Two Sum IV - Input is a BST

**Difficulty:** Easy | **Tags:** Hash Table, Two Pointers, Tree, Depth-First Search, Breadth-First Search, Binary Search Tree, Binary Tree

## Description

Given the `root` of a binary search tree and an integer `k`, return `true` _if there exist two elements in the BST such that their sum is equal to_ `k`, _or_ `false` _otherwise_.

 

 **Example 1:**

  ```
Input: root = [5,3,6,2,4,null,7], k = 9
Output: true
```

 **Example 2:**

  ```
Input: root = [5,3,6,2,4,null,7], k = 28
Output: false
```

 

 **Constraints:**

 - The number of nodes in the tree is in the range `[1, 104]`.
- `-104 <= Node.val <= 104`
- `root` is guaranteed to be a **valid** binary search tree.
- `-105 <= k <= 105`
