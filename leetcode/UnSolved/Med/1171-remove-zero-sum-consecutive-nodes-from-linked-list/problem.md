---
id: 1171
slug: remove-zero-sum-consecutive-nodes-from-linked-list
title: Remove Zero Sum Consecutive Nodes from Linked List
difficulty: Medium
tags: Hash Table, Linked List
date: 2026-04-20
lang: java
---

# 1171. Remove Zero Sum Consecutive Nodes from Linked List

**Difficulty:** Medium | **Tags:** Hash Table, Linked List

## Description

Given the `head` of a linked list, we repeatedly delete consecutive sequences of nodes that sum to `0` until there are no such sequences.

 After doing so, return the head of the final linked list. You may return any such answer.

 

 (Note that in the examples below, all sequences are serializations of `ListNode` objects.)

 **Example 1:**

 ```
Input: head = [1,2,-3,3,1]
Output: [3,1]
Note: The answer [1,2,1] would also be accepted.
```

 **Example 2:**

 ```
Input: head = [1,2,3,-3,4]
Output: [1,2,4]
```

 **Example 3:**

 ```
Input: head = [1,2,3,-3,-2]
Output: [1]
```

 

 **Constraints:**

 - The given linked list will contain between `1` and `1000` nodes.
- Each node in the linked list has `-1000 <= node.val <= 1000`.
