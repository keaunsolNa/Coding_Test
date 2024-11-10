# [Bronze II] #TheDress - 31368 

[문제 링크](https://www.acmicpc.net/problem/31368) 

### 성능 요약

메모리: 14648 KB, 시간: 116 ms

### 분류

사칙연산, 구현, 수학, 문자열

### 제출 일자

2024년 11월 11일 00:20:58

### 문제 설명

<p>After landing on planet i1c5l people noticed that blue and black clothes are quite popular among the locals. Each aboriginal has at least one blue-and-black piece of clothing in their wardrobe. This makes no interest except one curious detail: the locals claimed that these colors weren’t blue and black but white and gold.</p>

<p>Thus a simple test was created to differ a human being from an alien. On one of the wedding parties people took a picture of the blue-and-black groom mother’s dress. This picture was shown to some respondents who were asked the color of the dress. If the answer contained <<blue>> and <<black>> then there was no doubt that the respondent was from the Earth. The answer containing <<white>> and <<gold>> pointed to the person of planet i1c5l origin. If the answer contained neither of word pairs then it was clear that the respondent was a creature from another planet.</p>

<p>You have the complete survey log from planet i1c5l. Your task is to determine the constitution of the planet’s population based on the survey.</p>

### 입력 

 <p>The first line contains single integer $N$ --- the number of respondents ($1 \le N \le 100$). The following $N$ lines contain the answers. No line is empty and no line is longer than 100 characters. The answer contains only lower-case Latin letters and spaces. It is guaranteed that no answer can contain <<blue>>, <<black>>, <<white>>, and <<gold>> simultaneously.</p>

### 출력 

 <p>Output three numbers that describe the planet’s population, each on separate line.</p>

<p>The first number --- percentage of earthlings in population.</p>

<p>The second number --- percentage of aboriginals in population.</p>

<p>The third number --- percentage of another planet creatures in population.</p>

<p>Output all numbers with $10^{-5}$ accuracy.</p>

