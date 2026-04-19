---
id: 2703
slug: return-length-of-arguments-passed
title: Return Length of Arguments Passed
difficulty: Easy
tags: 
date: 2026-04-19
lang: java
---

# 2703. Return Length of Arguments Passed

**Difficulty:** Easy | **Tags:** 

## Description

Write a function `argumentsLength` that returns the count of arguments passed to it. 

 **Example 1:**

 ```
Input: args = [5]
Output: 1
Explanation:
argumentsLength(5); // 1

One value was passed to the function so it should return 1.
```

 **Example 2:**

 ```
Input: args = [{}, null, "3"]
Output: 3
Explanation: 
argumentsLength({}, null, "3"); // 3

Three values were passed to the function so it should return 3.
```

 

 **Constraints:**

 - `args` is a valid JSON array
- `0 <= args.length <= 100`
