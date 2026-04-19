---
id: 1227
slug: airplane-seat-assignment-probability
title: Airplane Seat Assignment Probability
difficulty: Medium
tags: Math, Dynamic Programming, Brainteaser, Probability and Statistics
date: 2026-04-20
lang: java
---

# 1227. Airplane Seat Assignment Probability

**Difficulty:** Medium | **Tags:** Math, Dynamic Programming, Brainteaser, Probability and Statistics

## Description

`n` passengers board an airplane with exactly `n` seats. The first passenger has lost the ticket and picks a seat randomly. But after that, the rest of the passengers will:

 - Take their own seat if it is still available, and
- Pick other seats randomly when they find their seat occupied

 Return _the probability that the _`nth`_ person gets his own seat_.

 

 **Example 1:**

 ```
Input: n = 1
Output: 1.00000
Explanation: The first person can only get the first seat.
```

 **Example 2:**

 ```
Input: n = 2
Output: 0.50000
Explanation: The second person has a probability of 0.5 to get the second seat (when first person gets the first seat).
```

 

 **Constraints:**

 - `1 <= n <= 105`
