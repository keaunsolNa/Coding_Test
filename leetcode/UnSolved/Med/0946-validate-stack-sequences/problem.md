---
id: 946
internal_id: 983
slug: validate-stack-sequences
title: Validate Stack Sequences
difficulty: Medium
tags: Array, Stack, Simulation
date: 2026-04-20
lang: java
---

# 946. Validate Stack Sequences

**Difficulty:** Medium | **Tags:** Array, Stack, Simulation

## Description

Given two integer arrays `pushed` and `popped` each with distinct values, return `true`_ if this could have been the result of a sequence of push and pop operations on an initially empty stack, or _`false`_ otherwise._

 

 **Example 1:**

 ```
Input: pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
Output: true
Explanation: We might do the following sequence:
push(1), push(2), push(3), push(4),
pop() -> 4,
push(5),
pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1
```

 **Example 2:**

 ```
Input: pushed = [1,2,3,4,5], popped = [4,3,5,1,2]
Output: false
Explanation: 1 cannot be popped before 2.
```

 

 **Constraints:**

 - `1 <= pushed.length <= 1000`
- `0 <= pushed[i] <= 1000`
- All the elements of `pushed` are **unique**.
- `popped.length == pushed.length`
- `popped` is a permutation of `pushed`.
