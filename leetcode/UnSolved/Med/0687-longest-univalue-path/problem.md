---
id: 687
slug: longest-univalue-path
title: Longest Univalue Path
difficulty: Medium
tags: Tree, Depth-First Search, Binary Tree
date: 2026-04-20
lang: java
---

# 687. Longest Univalue Path

**Difficulty:** Medium | **Tags:** Tree, Depth-First Search, Binary Tree

## Description

Given the `root` of a binary tree, return _the length of the longest path, where each node in the path has the same value_. This path may or may not pass through the root.

 **The length of the path** between two nodes is represented by the number of edges between them.

 

 **Example 1:**

  ```
Input: root = [5,4,5,1,1,null,5]
Output: 2
Explanation: The shown image shows that the longest path of the same value (i.e. 5).
```

 **Example 2:**

  ```
Input: root = [1,4,5,4,4,null,5]
Output: 2
Explanation: The shown image shows that the longest path of the same value (i.e. 4).
```

 

 **Constraints:**

 - The number of nodes in the tree is in the range `[0, 104]`.
- `-1000 <= Node.val <= 1000`
- The depth of the tree will not exceed `1000`.
