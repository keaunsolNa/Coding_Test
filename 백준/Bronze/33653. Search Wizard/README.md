# [Bronze II] Search Wizard - 33653 

[문제 링크](https://www.acmicpc.net/problem/33653) 

### 성능 요약

메모리: 21104 KB, 시간: 172 ms

### 분류

구현, 문자열

### 제출 일자

2025년 3월 26일 12:49:08

### 문제 설명

<p>You adore word searches, and have been doing them since you were little. You do them so much, you started just picking out words whenever you see a string of text! With a target string $W$ in mind, can you figure out how many times $W$ occurs in the string $S$?</p>

<p>Note that instances of $W$ may overlap partially, but every occurance has a unique starting index in $S$.</p>

### 입력 

 <p>The first line consists of a string $W$ ($1≤|W|≤10$). The second line contains a single integer $M$ ($1≤M≤10^5$). The third and final line contains the string $S$ consisting of $M$ words. Consecutive words are separated by a single space. The total length of all words in $S$ is at most $10^5$. The only characters that will appear in $W$ and all words in $S$ are lowercase alphabetical characters <code>a</code> - <code>z</code>.</p>

### 출력 

 <p>Return an integer of the number of times $W$ occurs in $S$, allowing for overlap.</p>

