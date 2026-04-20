---
id: 914
internal_id: 950
slug: x-of-a-kind-in-a-deck-of-cards
title: X of a Kind in a Deck of Cards
difficulty: Easy
tags: Array, Hash Table, Math, Counting, Number Theory
date: 2026-04-20
lang: java
---

# 914. X of a Kind in a Deck of Cards

**Difficulty:** Easy | **Tags:** Array, Hash Table, Math, Counting, Number Theory

## Description

You are given an integer array `deck` where `deck[i]` represents the number written on the `ith` card.

 Partition the cards into **one or more groups** such that:

 - Each group has **exactly** `x` cards where `x > 1`, and
- All the cards in one group have the same integer written on them.

 Return `true`_ if such partition is possible, or _`false`_ otherwise_.

 

 **Example 1:**

 ```
Input: deck = [1,2,3,4,4,3,2,1]
Output: true
Explanation: Possible partition [1,1],[2,2],[3,3],[4,4].
```

 **Example 2:**

 ```
Input: deck = [1,1,1,2,2,2,3,3]
Output: false
Explanation: No possible partition.
```

 

 **Constraints:**

 - `1 <= deck.length <= 104`
- `0 <= deck[i] < 104`
