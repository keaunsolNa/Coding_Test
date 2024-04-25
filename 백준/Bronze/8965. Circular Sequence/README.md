# [Bronze II] Circular Sequence - 8965 

[문제 링크](https://www.acmicpc.net/problem/8965) 

### 성능 요약

메모리: 18560 KB, 시간: 172 ms

### 분류

브루트포스 알고리즘, 문자열

### 제출 일자

2024년 4월 26일 08:54:16

### 문제 설명

<p>Some DNA sequences exist in circular forms as in the following figure, which shows a circular sequence <code>CGAGTCAGCT</code>, that is, the last symbol <code>T</code> in <code>CGAGTCAGCT</code> is connected to the first symbol <code>C</code>. We always read a circular sequence in the clockwise direction.</p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/8965/1.png" style="height:145px; width:173px"></p>

<p>Since it is not easy to store a circular sequence in a computer as it is, we decided to store it as a linear sequence. However, there can be many linear sequences that are obtained from a circular sequence by cutting any place of the circular sequence. Hence, we also decided to store the linear sequence that is lexicographically smallest among all linear sequences that can be obtained from a circular sequence.</p>

<p>Your task is to find the lexicographically smallest sequence from a given circular sequence. For the example in the figure, the lexicographically smallest sequence is <code>AGCTCGAGTC</code>. If there are two or more linear sequences that are lexicographically smallest, you are to find any one of them (in fact, they are the same).</p>

### 입력 

 <p>The input consists of T test cases. The number of test cases T is given on the first line of the input file. Each test case takes one line containing a circular sequence that is written as an arbitrary linear sequence. Since the circular sequences are DNA sequences, only four symbols, <code>A</code>, <code>C</code>, <code>G</code> and <code>T</code>, are allowed. Each sequence has length at least 2 and at most 100.</p>

### 출력 

 <p>Print exactly one line for each test case. The line is to contain the lexicographically smallest sequence for the test case.</p>

