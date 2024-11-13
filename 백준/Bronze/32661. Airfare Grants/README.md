# [Bronze III] Airfare Grants - 32661 

[문제 링크](https://www.acmicpc.net/problem/32661) 

### 성능 요약

메모리: 14136 KB, 시간: 108 ms

### 분류

사칙연산, 수학

### 제출 일자

2024년 11월 13일 12:25:07

### 문제 설명

<p>Congratulations! Your team has advanced to the next round of the International Cupcake Production Competition (ICPC)!</p>

<p>To participate in the competition, you are going to fly to Cupcake City from your hometown. The competition organizers have just shared good news: generous sponsors will support you with your flight ticket!</p>

<p>Here's how it works.</p>

<p>You have already obtained a list of available flights.</p>

<p>Among those options, you first report the price of any one potential flight. This determines the <em>reimbursement limit</em> of your trip; sponsors would pay you <em>up to half that price</em>.</p>

<p>Next, you actually purchase your flight ticket. This flight may or may not be the same as the flight you report for the reimbursement limit.</p>

<p>Finally, you show the receipt of your purchase, and sponsors will reimburse you the minimum of your actual cost and the reimbursement limit.</p>

<p>Now, you want to figure out your minimum possible <em>net</em> cost---the price you pay, minus the amount you get reimbursed.</p>

<p>Naturally, you will report the price of the most expensive flight ticket and buy the cheapest flight ticket.</p>

### 입력 

 <p>The first line of input is an integer, $N$ ($1 \leq N \leq 50$), the number of available flights.</p>

<p>Each of the next $N$ lines contains an integer $P$ ($10 \leq P \leq 10^5$), which is the price of a flight ticket from your hometown to Cupcake City, in dollars. It is guaranteed that $P$ is a multiple of $10$.</p>

### 출력 

 <p>Output a single integer, the minimum amount, in dollars, that you have to pay for a flight ticket, excluding the amount of travel support from sponsors.</p>

