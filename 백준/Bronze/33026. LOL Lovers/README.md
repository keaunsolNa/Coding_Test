# [Bronze III] LOL Lovers - 33026 

[문제 링크](https://www.acmicpc.net/problem/33026) 

### 성능 요약

메모리: 14376 KB, 시간: 104 ms

### 분류

구현, 문자열

### 제출 일자

2024년 12월 26일 12:55:04

### 문제 설명

<p>There are $n$ food items lying in a row on a long table. Each of these items is either a loaf of bread (denoted as a capital Latin letter '<code>L</code>' with ASCII code 76) or an onion (denoted as a capital Latin letter '<code>O</code>' with ASCII code 79). There is at least one loaf of bread and at least one onion on the table.</p>

<p>You and your friend want to divide the food on the table: you will take a prefix of this row (several leftmost items), and the friend will take the rest. However, there are several restrictions:</p>

<ol>
	<li>Each person should have at least one item.</li>
	<li>The number of your loaves should differ from the number of your friend's loaves.</li>
	<li>The number of your onions should differ from the number of your friend's onions.</li>
</ol>

<p>Find any correct division and print the number of items you take or report that there is no answer.</p>

### 입력 

 <p>The first line contains one integer $n$ ($2 \le n \le 200$) --- the number of food items on the table. The second line contains a string of length $n$ consisting of letters '<code>L</code>' and '<code>O</code>'. $i$-th symbol represents the type of the $i$-th food item on the table: '<code>L</code>' stands for a loaf of bread, and '<code>O</code>' stands for an onion. It is guaranteed that this string contains at least one letter '<code>L</code>' and at least one letter '<code>O</code>'.</p>

### 출력 

 <p>Print one integer --- a number $k$ such that, if you take $k$ leftmost items and your friend takes the remaining $n - k$ items, each of you and your friend get at least one item, your number of loaves is different from your friend's, and your number of onions is different from your friend's. If there are several possible answers, print any of them. If there are no possible answers, print the number $-1$.</p>

