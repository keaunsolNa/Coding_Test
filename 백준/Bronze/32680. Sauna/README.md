# [Bronze II] Sauna - 32680 

[문제 링크](https://www.acmicpc.net/problem/32680) 

### 성능 요약

메모리: 58200 KB, 시간: 388 ms

### 분류

사칙연산, 구현, 수학

### 제출 일자

2024년 11월 12일 16:04:37

### 문제 설명

<p>Kaisa and her friends are going to the sauna!</p>

<p>Now they have to pick the temperature. Each of them has their own temperature preferences as an inclusive range of acceptable values. Can you help them find the temperatures that everyone is happy with?</p>

<p>Since there might be a large number of possible temperatures, they have asked you to just tell them how many options there are and what the lowest temperature that works for everyone is, as then the sauna will need less time to heat up.</p>

### 입력 

 <p>The first line of input contains an integer, $N$, the number of people in the group ($2 \le N \le 2 \cdot 10^5$). The next $N$ lines each contains two integers, $a_i$ and $b_i$, indicating that the $i$th person's temperature preference is between $a_i$ and $b_i$, inclusive. Temperatures are given in millidegrees Celsius, with $0 \le a_i \le b_i \le 2 \cdot 10^5$.</p>

### 출력 

 <p>Output two integers: first, the number of different temperatures (in millidegrees Celsius) that fit all preferences; and second, the lowest such value.</p>

<p>If there are no values that fit all preferences, instead output "bad news".</p>

