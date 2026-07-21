---
id: 748
slug: shortest-completing-word
title: Shortest Completing Word
difficulty: Easy
tags: Array, Hash Table, String
date: 2026-07-21
lang: java
---

# 748. Shortest Completing Word

**Difficulty:** Easy | **Tags:** Array, Hash Table, String

## Description

Given a string `licensePlate` and an array of strings `words`, find the **shortest completing** word in `words`.

A **completing** word is a word that **contains all the letters** in `licensePlate`. **Ignore numbers and spaces** in `licensePlate`, and treat letters as **case insensitive**. If a letter appears more than once in `licensePlate`, then it must appear in the word the same number of times or more.

For example, if `licensePlate`` = "aBc 12c"`, then it contains letters `&#39;a&#39;`, `&#39;b&#39;` (ignoring case), and `&#39;c&#39;` twice. Possible **completing** words are `"abccdef"`, `"caaacab"`, and `"cbca"`.

Return *the shortest **completing** word in *`words`*.* It is guaranteed an answer exists. If there are multiple shortest **completing** words, return the **first** one that occurs in `words`.

 

Example 1:

```

Input: licensePlate = "1s3 PSt", words = ["step","steps","stripe","stepple"]
Output: "steps"
Explanation: licensePlate contains letters &#39;s&#39;, &#39;p&#39;, &#39;s&#39; (ignoring case), and &#39;t&#39;.
"step" contains &#39;t&#39; and &#39;p&#39;, but only contains 1 &#39;s&#39;.
"steps" contains &#39;t&#39;, &#39;p&#39;, and both &#39;s&#39; characters.
"stripe" is missing an &#39;s&#39;.
"stepple" is missing an &#39;s&#39;.
Since "steps" is the only word containing all the letters, that is the answer.

```

Example 2:

```

Input: licensePlate = "1s3 456", words = ["looks","pest","stew","show"]
Output: "pest"
Explanation: licensePlate only contains the letter &#39;s&#39;. All the words contain &#39;s&#39;, but among these "pest", "stew", and "show" are shortest. The answer is "pest" because it is the word that appears earliest of the 3.

```

 

**Constraints:**

	- `1 <= licensePlate.length <= 7`

	- `licensePlate` contains digits, letters (uppercase or lowercase), or space `&#39; &#39;`.

	- `1 <= words.length <= 1000`

	- `1 <= words[i].length <= 15`

	- `words[i]` consists of lower case English letters.
