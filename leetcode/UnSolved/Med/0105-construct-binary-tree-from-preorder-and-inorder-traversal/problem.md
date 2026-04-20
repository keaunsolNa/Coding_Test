---
id: 105
internal_id: 105
slug: construct-binary-tree-from-preorder-and-inorder-traversal
title: Construct Binary Tree from Preorder and Inorder Traversal
difficulty: Medium
tags: Array, Hash Table, Divide and Conquer, Tree, Binary Tree
date: 2026-04-20
lang: java
---

# 105. Construct Binary Tree from Preorder and Inorder Traversal

**Difficulty:** Medium | **Tags:** Array, Hash Table, Divide and Conquer, Tree, Binary Tree

## Description

Given two integer arrays `preorder` and `inorder` where `preorder` is the preorder traversal of a binary tree and `inorder` is the inorder traversal of the same tree, construct and return _the binary tree_.

 

 **Example 1:**

  ```
Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
Output: [3,9,20,null,null,15,7]
```

 **Example 2:**

 ```
Input: preorder = [-1], inorder = [-1]
Output: [-1]
```

 

 **Constraints:**

 - `1 <= preorder.length <= 3000`
- `inorder.length == preorder.length`
- `-3000 <= preorder[i], inorder[i] <= 3000`
- `preorder` and `inorder` consist of **unique** values.
- Each value of `inorder` also appears in `preorder`.
- `preorder` is **guaranteed** to be the preorder traversal of the tree.
- `inorder` is **guaranteed** to be the inorder traversal of the tree.
