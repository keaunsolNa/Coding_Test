---
id: 3894
internal_id: 4275
slug: traffic-signal-color
title: Traffic Signal Color
difficulty: Easy
tags: 
date: 2026-04-20
lang: java
---

# 3894. Traffic Signal Color

**Difficulty:** Easy | **Tags:** 

## Description

You are given an integer `timer` representing the remaining time (in seconds) on a traffic signal.

 The signal follows these rules:

 - If `timer == 0`, the signal is `"Green"`
- If `timer == 30`, the signal is `"Orange"`
- If `30 < timer <= 90`, the signal is `"Red"`

 Return the current state of the signal. If none of the above conditions are met, return `"Invalid"`.

 

 **Example 1:**

  **Input:** timer = 60

 **Output:** "Red"

 **Explanation:**

 Since `timer = 60`, and `30 < timer <= 90`, the answer is `"Red"`.

  **Example 2:**

  **Input:** timer = 5

 **Output:** "Invalid"

 **Explanation:**

 Since `timer = 5`, it does not satisfy any of the given conditions, the answer is `"Invalid"`.

  

 **Constraints:**

 - `0 <= timer <= 1000`
