---
id: 1108
slug: defanging-an-ip-address
title: Defanging an IP Address
difficulty: Easy
tags: String
date: 2026-04-19
lang: java
---

# 1108. Defanging an IP Address

**Difficulty:** Easy | **Tags:** String

## Description

Given a valid (IPv4) IP `address`, return a defanged version of that IP address.

 A _defanged IP address_ replaces every period `"."` with `"[.]"`.

 

 **Example 1:**

 ```
Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
```

**Example 2:**

 ```
Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"
```

 

 **Constraints:**

 - The given `address` is a valid IPv4 address.
