---
id: 1290
internal_id: 1411
slug: convert-binary-number-in-a-linked-list-to-integer
title: Convert Binary Number in a Linked List to Integer
difficulty: Easy
tags: Linked List, Math
date: 2026-04-20
lang: java
---

# 1290. Convert Binary Number in a Linked List to Integer

**Difficulty:** Easy | **Tags:** Linked List, Math

## Description

Given `head` which is a reference node to a singly-linked list. The value of each node in the linked list is either `0` or `1`. The linked list holds the binary representation of a number.

 Return the _decimal value_ of the number in the linked list.

 The **most significant bit** is at the head of the linked list.

 

 **Example 1:**

  ```
Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10
```

 **Example 2:**

 ```
Input: head = [0]
Output: 0
```

 

 **Constraints:**

 - The Linked List is not empty.
- Number of nodes will not exceed `30`.
- Each node's value is either `0` or `1`.
