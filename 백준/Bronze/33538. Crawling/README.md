# [Bronze III] Crawling - 33538 

[문제 링크](https://www.acmicpc.net/problem/33538) 

### 성능 요약

메모리: 22488 KB, 시간: 200 ms

### 분류

사칙연산, 수학

### 제출 일자

2025년 2월 19일 12:58:58

### 문제 설명

<p>Saint Alex is a swimming coach that trains his students to participate in a swimming tournament held in the FPC (Forbidden Pool for Crawling). In this tournament, participants must use the front crawl to swim to the other side of the FPC and then use the back crawl to return. Since this tournament is the most prestigious one on the planet, Alex considers winning this tournament the crown jewel of his career.\\ Being desperate to win, he spends a lot of time watching practice sessions held by other coaches and noting down the times of the students. Unfortunately, he forgot to note down the time of his own students, a crucial piece of information if he wants to know if any of his students makes a chance at all at winning the competition! Luckily, he found the results of a bachelor thesis group that measured the speeds of his students when using the front crawl and the back crawl during the final practice session. Since his number of students can be rather large (up to 10.000 students), it would take too long to check by hand if there is a student that can beat the fastest student of the rival coaches. To make matters even worse, the size of the FPC also changes every year! While it is quite the mystery how he fits and manages 10.000 students in a swimming pool during the practice session, not to mention how that bachelor thesis group managed to register them all, he asks you tell help him out.</p>

<p>You are given the task to check -- given the fastest time Alex noted down during his observations -- if there is a student that can beat the fastest student of the rival coaches. </p>

<p>For the sake of simplicity, we assume that every student swims in a perfectly straight line (thus the width of the FPC is irrelevant, don't worry it's still wide enough for everyone) and there is no delay when switching between the front and back crawl when the student reaches either side of the FPC. Furthermore, every student swims at a constant speed.</p>

### 입력 

 <p>The input is as follows. First, an integer l, $20 \leq l \leq 1000$ the length of the FPC in meters. Next, an integer n, $ 1 \leq n \leq 10000$ the number of students Alex is coaching. Then, a float t, $ 2.0 \leq t \leq 3600.0$ the time of the fastest student Alex has observed in seconds. After this, $n$ lines follow, each line containing two space separated float values $f$ and $b$ $ 0.0 < f, b \leq 1000.0$, the speed of the student when doing the front crawl and the back crawl in m/s (meter per second), respectively.</p>

### 출력 

 <p>Output "HOPE" if there is at least one student that can beat time $t$, else output "DOOMED".</p>

