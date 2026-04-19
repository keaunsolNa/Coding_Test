---
id: 2487
slug: remove-nodes-from-linked-list
title: Remove Nodes From Linked List
difficulty: Medium
tags: Linked List, Stack, Recursion, Monotonic Stack
date: 2026-04-20
lang: java
---

# 2487. Remove Nodes From Linked List

**Difficulty:** Medium | **Tags:** Linked List, Stack, Recursion, Monotonic Stack

## Description

You are given the `head` of a linked list.

 Remove every node which has a node with a greater value anywhere to the right side of it.

 Return _the _`head`_ of the modified linked list._

 

 **Example 1:**

  ```
Input: head = [5,2,13,3,8]
Output: [13,8]
Explanation: The nodes that should be removed are 5, 2 and 3.
- Node 13 is to the right of node 5.
- Node 13 is to the right of node 2.
- Node 8 is to the right of node 3.
```

 **Example 2:**

 ```
Input: head = [1,1,1,1]
Output: [1,1,1,1]
Explanation: Every node has value 1, so no nodes are removed.
```

 

 **Constraints:**

 - The number of the nodes in the given list is in the range `[1, 105]`.
- `1 <= Node.val <= 105`
