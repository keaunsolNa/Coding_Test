---
id: 1154
slug: day-of-the-year
title: Day of the Year
difficulty: Easy
tags: Math, String
date: 2026-04-19
lang: java
---

# 1154. Day of the Year

**Difficulty:** Easy | **Tags:** Math, String

## Description

Given a string `date` representing a Gregorian calendar date formatted as `YYYY-MM-DD`, return _the day number of the year_.

 

 **Example 1:**

 ```
Input: date = "2019-01-09"
Output: 9
Explanation: Given date is the 9th day of the year in 2019.
```

 **Example 2:**

 ```
Input: date = "2019-02-10"
Output: 41
```

 

 **Constraints:**

 - `date.length == 10`
- `date[4] == date[7] == '-'`, and all other `date[i]`'s are digits
- `date` represents a calendar date between Jan 1^st, 1900 and Dec 31^st, 2019.
