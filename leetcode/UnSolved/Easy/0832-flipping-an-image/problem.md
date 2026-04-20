---
id: 832
internal_id: 861
slug: flipping-an-image
title: Flipping an Image
difficulty: Easy
tags: Array, Two Pointers, Bit Manipulation, Matrix, Simulation
date: 2026-04-20
lang: java
---

# 832. Flipping an Image

**Difficulty:** Easy | **Tags:** Array, Two Pointers, Bit Manipulation, Matrix, Simulation

## Description

Given an `n x n` binary matrix `image`, flip the image **horizontally**, then invert it, and return _the resulting image_.

 To flip an image horizontally means that each row of the image is reversed.

 - For example, flipping `[1,1,0]` horizontally results in `[0,1,1]`.

 To invert an image means that each `0` is replaced by `1`, and each `1` is replaced by `0`.

 - For example, inverting `[0,1,1]` results in `[1,0,0]`.

 

 **Example 1:**

 ```
Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
```

 **Example 2:**

 ```
Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
```

 

 **Constraints:**

 - `n == image.length`
- `n == image[i].length`
- `1 <= n <= 20`
- `images[i][j]` is either `0` or `1`.
