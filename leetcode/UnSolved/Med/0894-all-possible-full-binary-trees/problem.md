---
id: 894
slug: all-possible-full-binary-trees
title: All Possible Full Binary Trees
difficulty: Medium
tags: Dynamic Programming, Tree, Recursion, Memoization, Binary Tree
date: 2026-04-20
lang: java
---

# 894. All Possible Full Binary Trees

**Difficulty:** Medium | **Tags:** Dynamic Programming, Tree, Recursion, Memoization, Binary Tree

## Description

Given an integer `n`, return _a list of all possible **full binary trees** with_ `n` _nodes_. Each node of each tree in the answer must have `Node.val == 0`.

 Each element of the answer is the root node of one possible tree. You may return the final list of trees in **any order**.

 A **full binary tree** is a binary tree where each node has exactly `0` or `2` children.

 

 **Example 1:**

  ```
Input: n = 7
Output: [[0,0,0,null,null,0,0,null,null,0,0],[0,0,0,null,null,0,0,0,0],[0,0,0,0,0,0,0],[0,0,0,0,0,null,null,null,null,0,0],[0,0,0,0,0,null,null,0,0]]
```

 **Example 2:**

 ```
Input: n = 3
Output: [[0,0,0]]
```

 

 **Constraints:**

 - `1 <= n <= 20`
