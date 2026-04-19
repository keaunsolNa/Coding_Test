---
id: 537
slug: complex-number-multiplication
title: Complex Number Multiplication
difficulty: Medium
tags: Math, String, Simulation
date: 2026-04-20
lang: java
---

# 537. Complex Number Multiplication

**Difficulty:** Medium | **Tags:** Math, String, Simulation

## Description

A complex number can be represented as a string on the form `"real+imaginaryi"` where:

 - `real` is the real part and is an integer in the range `[-100, 100]`.
- `imaginary` is the imaginary part and is an integer in the range `[-100, 100]`.
- `i2 == -1`.

 Given two complex numbers `num1` and `num2` as strings, return _a string of the complex number that represents their multiplications_.

 

 **Example 1:**

 ```
Input: num1 = "1+1i", num2 = "1+1i"
Output: "0+2i"
Explanation: (1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i, and you need convert it to the form of 0+2i.
```

 **Example 2:**

 ```
Input: num1 = "1+-1i", num2 = "1+-1i"
Output: "0+-2i"
Explanation: (1 - i) * (1 - i) = 1 + i2 - 2 * i = -2i, and you need convert it to the form of 0+-2i.
```

 

 **Constraints:**

 - `num1` and `num2` are valid complex numbers.
