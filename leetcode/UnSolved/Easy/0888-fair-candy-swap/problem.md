---
id: 888
internal_id: 924
slug: fair-candy-swap
title: Fair Candy Swap
difficulty: Easy
tags: Array, Hash Table, Binary Search, Sorting
date: 2026-04-20
lang: java
---

# 888. Fair Candy Swap

**Difficulty:** Easy | **Tags:** Array, Hash Table, Binary Search, Sorting

## Description

Alice and Bob have a different total number of candies. You are given two integer arrays `aliceSizes` and `bobSizes` where `aliceSizes[i]` is the number of candies of the `ith` box of candy that Alice has and `bobSizes[j]` is the number of candies of the `jth` box of candy that Bob has.

 Since they are friends, they would like to exchange one candy box each so that after the exchange, they both have the same total amount of candy. The total amount of candy a person has is the sum of the number of candies in each box they have.

 Return a_n integer array _`answer`_ where _`answer[0]`_ is the number of candies in the box that Alice must exchange, and _`answer[1]`_ is the number of candies in the box that Bob must exchange_. If there are multiple answers, you may **return any** one of them. It is guaranteed that at least one answer exists.

 

 **Example 1:**

 ```
Input: aliceSizes = [1,1], bobSizes = [2,2]
Output: [1,2]
```

 **Example 2:**

 ```
Input: aliceSizes = [1,2], bobSizes = [2,3]
Output: [1,2]
```

 **Example 3:**

 ```
Input: aliceSizes = [2], bobSizes = [1,3]
Output: [2,3]
```

 

 **Constraints:**

 - `1 <= aliceSizes.length, bobSizes.length <= 104`
- `1 <= aliceSizes[i], bobSizes[j] <= 105`
- Alice and Bob have a different total number of candies.
- There will be at least one valid answer for the given input.
