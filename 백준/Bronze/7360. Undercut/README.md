# [Bronze II] Undercut - 7360 

[문제 링크](https://www.acmicpc.net/problem/7360) 

### 성능 요약

메모리: 31120 KB, 시간: 40 ms

### 분류

사칙연산, 많은 조건 분기, 구현, 수학

### 제출 일자

2024년 6월 22일 12:51:22

### 문제 설명

<p>Undercut is a card game where two players each have five cards numbered one through five. At each round, each player selects a card, then simultaneously reveals it. If the cards are of equal value, there is no score. Otherwise, there are two cases: the two cards are exactly one point apart (this is called an undercut), or the cards are more than one point apart. In the latter case, the person revealing the larger of the cards gets the number of points on the larger card. In the case of an undercut the player with the lower card gets the sum of the two cards. The exception to this is when the cards are 1 and 2, in which case the player with the lower card gets 6 points (instead of only 3 points). After each round, the cards are returned to the hands and they play another round.</p>

<p>For example, if there are 5 rounds and player A plays (in this order) 5, 3, 1, 3, 5 and player B plays 3, 3, 3, 3, 4, then the scoring for each round would be: A gets 5 points, no points, B gets 3 points, no points, B gets 9 points. The totals would be A: 5, B: 12.</p>

<p>In this problem you will be given card plays for both players and must determine the final scores.</p>

### 입력 

 <p>There will be multiple input instances. Each instance will be one game. The first line of input for a game will be an integer n <= 20. (A value of n = 0 terminates input.) The next two lines will each contain n integers between 1 and 5 inclusive indicating the cards played on each of n rounds. The first line are player A's card plays and the second line are player B's card plays.</p>

<p> </p>

### 출력 

 <p>Each input instance should generate one line of output of the form:</p>

<p>A has a points. B has b points.</p>

<p>where the value of a and b are for you to determine. A blank line should separate output lines.</p>

