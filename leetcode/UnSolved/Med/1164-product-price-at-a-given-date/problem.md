---
id: 1164
internal_id: 1278
slug: product-price-at-a-given-date
title: Product Price at a Given Date
difficulty: Medium
tags: Database
date: 2026-04-20
lang: oraclesql
---

# 1164. Product Price at a Given Date

**Difficulty:** Medium | **Tags:** Database

## Description

Table: `Products`

 ```
+---------------+---------+
| Column Name   | Type    |
+---------------+---------+
| product_id    | int     |
| new_price     | int     |
| change_date   | date    |
+---------------+---------+
(product_id, change_date) is the primary key (combination of columns with unique values) of this table.
Each row of this table indicates that the price of some product was changed to a new price at some date.
```

 Initially, all products have price 10.

 Write a solution to find the prices of all products on the date `2019-08-16`.

 Return the result table in **any order**.

 The result format is in the following example.

 

 **Example 1:**

 ```
Input: 
Products table:
+------------+-----------+-------------+
| product_id | new_price | change_date |
+------------+-----------+-------------+
| 1          | 20        | 2019-08-14  |
| 2          | 50        | 2019-08-14  |
| 1          | 30        | 2019-08-15  |
| 1          | 35        | 2019-08-16  |
| 2          | 65        | 2019-08-17  |
| 3          | 20        | 2019-08-18  |
+------------+-----------+-------------+
Output: 
+------------+-------+
| product_id | price |
+------------+-------+
| 2          | 50    |
| 1          | 35    |
| 3          | 10    |
+------------+-------+
```
