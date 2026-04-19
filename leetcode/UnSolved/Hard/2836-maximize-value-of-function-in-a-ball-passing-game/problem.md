---
id: 2836
slug: maximize-value-of-function-in-a-ball-passing-game
title: Maximize Value of Function in a Ball Passing Game
difficulty: Hard
tags: Array, Dynamic Programming, Bit Manipulation
date: 2026-04-19
lang: java
---

# 2836. Maximize Value of Function in a Ball Passing Game

**Difficulty:** Hard | **Tags:** Array, Dynamic Programming, Bit Manipulation

## Description

You are given an integer array `receiver` of length `n` and an integer `k`. `n` players are playing a ball-passing game.

 You choose the starting player, `i`. The game proceeds as follows: player `i` passes the ball to player `receiver[i]`, who then passes it to `receiver[receiver[i]]`, and so on, for `k` passes in total. The game's score is the sum of the indices of the players who touched the ball, including repetitions, i.e. `i + receiver[i] + receiver[receiver[i]] + ... + receiver(k)[i]`.

 Return the **maximum** possible score.

 **Notes:**

 - `receiver` may contain duplicates.
- `receiver[i]` may be equal to `i`.

 

 **Example 1:**

  **Input:** receiver = [2,0,1], k = 4

 **Output:** 6

 **Explanation:**

 Starting with player `i = 2` the initial score is 2:

    Pass Sender Index Receiver Index Score   1 2 1 3   2 1 0 3   3 0 2 5   4 2 1 6     **Example 2:**

  **Input:** receiver = [1,1,1,2,3], k = 3

 **Output:** 10

 **Explanation:**

 Starting with player `i = 4` the initial score is 4:

    Pass Sender Index Receiver Index Score   1 4 3 7   2 3 2 9   3 2 1 10     

 **Constraints:**

 - `1 <= receiver.length == n <= 105`
- `0 <= receiver[i] <= n - 1`
- `1 <= k <= 1010`
