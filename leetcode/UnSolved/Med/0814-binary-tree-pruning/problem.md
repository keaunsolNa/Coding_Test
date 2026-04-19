---
id: 814
slug: binary-tree-pruning
title: Binary Tree Pruning
difficulty: Medium
tags: Tree, Depth-First Search, Binary Tree
date: 2026-04-20
lang: java
---

# 814. Binary Tree Pruning

**Difficulty:** Medium | **Tags:** Tree, Depth-First Search, Binary Tree

## Description

Given the `root` of a binary tree, return _the same tree where every subtree (of the given tree) not containing a _`1`_ has been removed_.

 A subtree of a node `node` is `node` plus every node that is a descendant of `node`.

 

 **Example 1:**

  ```
Input: root = [1,null,0,0,1]
Output: [1,null,0,null,1]
Explanation: 
Only the red nodes satisfy the property "every subtree not containing a 1".
The diagram on the right represents the answer.
```

 **Example 2:**

  ```
Input: root = [1,0,1,0,0,0,1]
Output: [1,null,1,null,1]
```

 **Example 3:**

  ```
Input: root = [1,1,0,1,1,0,1,0]
Output: [1,1,0,1,1,null,1]
```

 

 **Constraints:**

 - The number of nodes in the tree is in the range `[1, 200]`.
- `Node.val` is either `0` or `1`.
