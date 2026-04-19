---
id: 2667
slug: create-hello-world-function
title: Create Hello World Function
difficulty: Easy
tags: 
date: 2026-04-19
lang: java
---

# 2667. Create Hello World Function

**Difficulty:** Easy | **Tags:** 

## Description

Write a function `createHelloWorld`. It should return a new function that always returns `"Hello World"`. 

 **Example 1:**

 ```
Input: args = []
Output: "Hello World"
Explanation:
const f = createHelloWorld();
f(); // "Hello World"

The function returned by createHelloWorld should always return "Hello World".
```

 **Example 2:**

 ```
Input: args = [{},null,42]
Output: "Hello World"
Explanation:
const f = createHelloWorld();
f({}, null, 42); // "Hello World"

Any arguments could be passed to the function but it should still always return "Hello World".
```

 

 **Constraints:**

 - `0 <= args.length <= 10`
