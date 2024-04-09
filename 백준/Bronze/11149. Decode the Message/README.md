# [Bronze II] Decode the Message - 11149 

[문제 링크](https://www.acmicpc.net/problem/11149) 

### 성능 요약

메모리: 14108 KB, 시간: 120 ms

### 분류

구현, 문자열

### 제출 일자

2024년 4월 9일 22:34:29

### 문제 설명

<p>Two of your friends Alex and Adam have developed a secret system for sending messages to each other. The only problem is that the system has turned out to be too hard to do by hand. Therefore, Alex has asked for your help to write a program to decode the secret messages. After making you swear never to reveal the system, he explains that the coded message consists of one or more words, only consisting of lower case characters a–z, seperated by spaces. Each word corresponds to one character, a–z or space, and is found by adding the value of each character in the word and taking the remainder when dividing by 27. a is assigned the value 0, b is assigned the value 1 and so on up to z which is assigned the value 25. Based on the calculated remainder the values 0–25 corresponds to a–z as before, and the value 26 corresponds to a space.</p>

<p>Help your friend write a program which takes a coded message and outputs the decoded message.</p>

### 입력 

 <p>The first line of the input consists of a single integer T, the number of test cases. Each test case consists of a single line containing a secret message. The secret message contains only lower case characters and spaces, and there are only spaces between words and never two or more consecutive spaces.</p>

<ul>
	<li>0 < T ≤ 100</li>
	<li>Each secret message contains no more than 1000 characters</li>
</ul>

### 출력 

 <p>For each test case, output the corresponding decoded message.</p>

