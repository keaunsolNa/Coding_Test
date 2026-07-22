---
id: 999
slug: available-captures-for-rook
title: Available Captures for Rook
difficulty: Easy
tags: Array, Matrix, Simulation
date: 2026-07-22
lang: java
---

# 999. Available Captures for Rook

**Difficulty:** Easy | **Tags:** Array, Matrix, Simulation

## Description

You are given an `8 x 8` **matrix** representing a chessboard. There is **exactly one** white rook represented by `&#39;R&#39;`, some number of white bishops `&#39;B&#39;`, and some number of black pawns `&#39;p&#39;`. Empty squares are represented by `&#39;.&#39;`.

A rook can move any number of squares horizontally or vertically (up, down, left, right) until it reaches another piece *or* the edge of the board. A rook is **attacking** a pawn if it can move to the pawn&#39;s square in one move.

Note: A rook cannot move through other pieces, such as bishops or pawns. This means a rook cannot attack a pawn if there is another piece blocking the path.

Return the **number of pawns** the white rook is **attacking**.

 

Example 1:

**Input:** board = [[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".","R",".",".",".","p"],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."]]

**Output:** 3

**Explanation:**

In this example, the rook is attacking all the pawns.

Example 2:

**Input:** board = [[".",".",".",".",".",".","."],[".","p","p","p","p","p",".","."],[".","p","p","B","p","p",".","."],[".","p","B","R","B","p",".","."],[".","p","p","B","p","p",".","."],[".","p","p","p","p","p",".","."],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."]]

**Output:** 0

**Explanation:**

The bishops are blocking the rook from attacking any of the pawns.

Example 3:

**Input:** board = [[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".","p",".",".",".","."],["p","p",".","R",".","p","B","."],[".",".",".",".",".",".",".","."],[".",".",".","B",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".",".",".",".",".","."]]

**Output:** 3

**Explanation:**

The rook is attacking the pawns at positions b5, d6, and f5.

 

**Constraints:**

	- `board.length == 8`

	- `board[i].length == 8`

	- `board[i][j]` is either `&#39;R&#39;`, `&#39;.&#39;`, `&#39;B&#39;`, or `&#39;p&#39;`

	- There is exactly one cell with `board[i][j] == &#39;R&#39;`
