---
id: 3451
slug: find-invalid-ip-addresses
title: Find Invalid IP Addresses
difficulty: Hard
tags: Database
date: 2026-04-19
lang: java
---

# 3451. Find Invalid IP Addresses

**Difficulty:** Hard | **Tags:** Database

## Description

Table: `logs`

 ```
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| log_id      | int     |
| ip          | varchar |
| status_code | int     |
+-------------+---------+
log_id is the unique key for this table.
Each row contains server access log information including IP address and HTTP status code.
```

 Write a solution to find **invalid IP addresses**. An IPv4 address is invalid if it meets any of these conditions:

 - Contains numbers **greater than** `255` in any octet
- Has **leading zeros** in any octet (like `01.02.03.04`)
- Has **less or more** than `4` octets

 Return _the result table __ordered by_ `invalid_count`, `ip` _in **descending** order respectively_.

 The result format is in the following example.

 

 **Example:**

  **Input:**

 logs table:

 ```
+--------+---------------+-------------+
| log_id | ip            | status_code | 
+--------+---------------+-------------+
| 1      | 192.168.1.1   | 200         | 
| 2      | 256.1.2.3     | 404         | 
| 3      | 192.168.001.1 | 200         | 
| 4      | 192.168.1.1   | 200         | 
| 5      | 192.168.1     | 500         | 
| 6      | 256.1.2.3     | 404         | 
| 7      | 192.168.001.1 | 200         | 
+--------+---------------+-------------+
```

 **Output:**

 ```
+---------------+--------------+
| ip            | invalid_count|
+---------------+--------------+
| 256.1.2.3     | 2            |
| 192.168.001.1 | 2            |
| 192.168.1     | 1            |
+---------------+--------------+
```

 **Explanation:**

 - 256.1.2.3 is invalid because 256 > 255
- 192.168.001.1 is invalid because of leading zeros
- 192.168.1 is invalid because it has only 3 octets

 The output table is ordered by invalid_count, ip in descending order respectively.
