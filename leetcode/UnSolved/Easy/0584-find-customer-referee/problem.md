---
id: 584
internal_id: 584
slug: find-customer-referee
title: Find Customer Referee
difficulty: Easy
tags: Database
date: 2026-04-20
lang: oraclesql
---

# 584. Find Customer Referee

**Difficulty:** Easy | **Tags:** Database

## Description

Table: `Customer`

 ```
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| id          | int     |
| name        | varchar |
| referee_id  | int     |
+-------------+---------+
In SQL, id is the primary key column for this table.
Each row of this table indicates the id of a customer, their name, and the id of the customer who referred them.
```

 

 Find the names of the customer that are either:

 1. **referred by** any customer with `id != 2`.
2. **not referred by** any customer.

 Return the result table in **any order**.

 The result format is in the following example.

 

 **Example 1:**

 ```
Input: 
Customer table:
+----+------+------------+
| id | name | referee_id |
+----+------+------------+
| 1  | Will | null       |
| 2  | Jane | null       |
| 3  | Alex | 2          |
| 4  | Bill | null       |
| 5  | Zack | 1          |
| 6  | Mark | 2          |
+----+------+------------+
Output: 
+------+
| name |
+------+
| Will |
| Jane |
| Bill |
| Zack |
+------+
```
