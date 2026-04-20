---
id: 203
internal_id: 203
slug: remove-linked-list-elements
title: Remove Linked List Elements
difficulty: Easy
tags: Linked List, Recursion
date: 2026-04-20
lang: java
---

# 203. Remove Linked List Elements

**Difficulty:** Easy | **Tags:** Linked List, Recursion

## Description

Given the `head` of a linked list and an integer `val`, remove all the nodes of the linked list that has `Node.val == val`, and return _the new head_.

 

 **Example 1:**

  ```
Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]
```

 **Example 2:**

 ```
Input: head = [], val = 1
Output: []
```

 **Example 3:**

 ```
Input: head = [7,7,7,7], val = 7
Output: []
```

 

 **Constraints:**

 - The number of nodes in the list is in the range `[0, 104]`.
- `1 <= Node.val <= 50`
- `0 <= val <= 50`
