---
id: 3527
slug: find-the-most-common-response
title: Find the Most Common Response
difficulty: Medium
tags: Array, Hash Table, String, Counting
date: 2026-04-20
lang: java
---

# 3527. Find the Most Common Response

**Difficulty:** Medium | **Tags:** Array, Hash Table, String, Counting

## Description

You are given a 2D string array `responses` where each `responses[i]` is an array of strings representing survey responses from the `ith` day.

 Return the **most common** response across all days after removing **duplicate** responses within each `responses[i]`. If there is a tie, return the _lexicographically smallest_ response.

 

 **Example 1:**

  **Input:** responses = [["good","ok","good","ok"],["ok","bad","good","ok","ok"],["good"],["bad"]]

 **Output:** "good"

 **Explanation:**

 - After removing duplicates within each list, `responses = [["good", "ok"], ["ok", "bad", "good"], ["good"], ["bad"]]`.
- `"good"` appears 3 times, `"ok"` appears 2 times, and `"bad"` appears 2 times.
- Return `"good"` because it has the highest frequency.

  **Example 2:**

  **Input:** responses = [["good","ok","good"],["ok","bad"],["bad","notsure"],["great","good"]]

 **Output:** "bad"

 **Explanation:**

 - After removing duplicates within each list we have `responses = [["good", "ok"], ["ok", "bad"], ["bad", "notsure"], ["great", "good"]]`.
- `"bad"`, `"good"`, and `"ok"` each occur 2 times.
- The output is `"bad"` because it is the lexicographically smallest amongst the words with the highest frequency.

  

 **Constraints:**

 - `1 <= responses.length <= 1000`
- `1 <= responses[i].length <= 1000`
- `1 <= responses[i][j].length <= 10`
- `responses[i][j]` consists of only lowercase English letters
