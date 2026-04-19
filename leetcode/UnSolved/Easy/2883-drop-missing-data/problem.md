---
id: 2883
slug: drop-missing-data
title: Drop Missing Data
difficulty: Easy
tags: 
date: 2026-04-19
lang: java
---

# 2883. Drop Missing Data

**Difficulty:** Easy | **Tags:** 

## Description

```
DataFrame students
+-------------+--------+
| Column Name | Type   |
+-------------+--------+
| student_id  | int    |
| name        | object |
| age         | int    |
+-------------+--------+
```

 There are some rows having missing values in the `name` column.

 Write a solution to remove the rows with missing values.

 The result format is in the following example.

 

 **Example 1:**

 ```
Input:
+------------+---------+-----+
| student_id | name    | age |
+------------+---------+-----+
| 32         | Piper   | 5   |
| 217        | None    | 19  |
| 779        | Georgia | 20  |
| 849        | Willow  | 14  |
+------------+---------+-----+
Output:
+------------+---------+-----+
| student_id | name    | age |
+------------+---------+-----+
| 32         | Piper   | 5   |
| 779        | Georgia | 20  | 
| 849        | Willow  | 14  | 
+------------+---------+-----+
Explanation: 
Student with id 217 havs empty value in the name column, so it will be removed.
```
