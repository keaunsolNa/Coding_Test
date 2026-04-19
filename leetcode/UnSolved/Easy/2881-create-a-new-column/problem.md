---
id: 2881
slug: create-a-new-column
title: Create a New Column
difficulty: Easy
tags: 
date: 2026-04-19
lang: java
---

# 2881. Create a New Column

**Difficulty:** Easy | **Tags:** 

## Description

```
DataFrame employees
+-------------+--------+
| Column Name | Type.  |
+-------------+--------+
| name        | object |
| salary      | int.   |
+-------------+--------+
```

 A company plans to provide its employees with a bonus.

 Write a solution to create a new column name `bonus` that contains the **doubled values** of the `salary` column.

 The result format is in the following example.

 

 **Example 1:**

 ```
Input:
DataFrame employees
+---------+--------+
| name    | salary |
+---------+--------+
| Piper   | 4548   |
| Grace   | 28150  |
| Georgia | 1103   |
| Willow  | 6593   |
| Finn    | 74576  |
| Thomas  | 24433  |
+---------+--------+
Output:
+---------+--------+--------+
| name    | salary | bonus  |
+---------+--------+--------+
| Piper   | 4548   | 9096   |
| Grace   | 28150  | 56300  |
| Georgia | 1103   | 2206   |
| Willow  | 6593   | 13186  |
| Finn    | 74576  | 149152 |
| Thomas  | 24433  | 48866  |
+---------+--------+--------+
Explanation: 
A new column bonus is created by doubling the value in the column salary.
```
