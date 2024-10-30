# [Bronze III] Dragged-out Duel - 32587 

[문제 링크](https://www.acmicpc.net/problem/32587) 

### 성능 요약

메모리: 14288 KB, 시간: 108 ms

### 분류

구현

### 제출 일자

2024년 10월 30일 20:49:28

### 문제 설명

<p>Your friend Guile and you have decided to spend an afternoon playing the new Street Fighter game, but you both want to start on the left, because you have both only practiced all your combos starting from the left. You decide to determine who starts on the left like true men -- with an intense grueling, and exhausting duel of rock-paper-scissors.</p>

<p>The duel will be a best-of-<mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D45B TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>n</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$n$</span></mjx-container>, consisting of <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D45B TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>n</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$n$</span></mjx-container> single rounds of rock-paper-scissors (yes, you may have to play rock-paper-scissors <em>ten thousand times</em>, truly a war of attrition), and whoever wins more rounds, gets to start on the left. If you both pick the same option in an individual game, it is not replayed. To keep track of who wins, you decide to write a program, that determines whether you beat Guile in this great duel.</p>

<p>As a reminder: rock beats scissors, scissors beats paper, paper beats rock. If you both make the same choice, the round is a draw.</p>

### 입력 

 <p>The input consists of:</p>

<ul>
	<li>One line with a single integer <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D45B TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>n</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$n$</span></mjx-container> (<mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c></mjx-mn><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mi class="mjx-i" space="4"><mjx-c class="mjx-c1D45B TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mn class="mjx-n" space="4"><mjx-c class="mjx-c31"></mjx-c><mjx-c class="mjx-c30"></mjx-c></mjx-mn><mjx-mstyle><mjx-mspace style="width: 0.167em;"></mjx-mspace></mjx-mstyle><mjx-mn class="mjx-n"><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>1</mn><mo>≤</mo><mi>n</mi><mo>≤</mo><mn>10</mn><mstyle scriptlevel="0"><mspace width="0.167em"></mspace></mstyle><mn>000</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$1\leq n\leq 10\,000$</span></mjx-container>), the number of individual games.</li>
	<li>Two lines with <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D45B TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>n</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$n$</span></mjx-container> characters, each character being either '<code>R</code>' for rock, '<code>P</code>' for paper, or '<code>S</code>' for scissors. The first line represents your choices in each round, and the second line represents Guile's choices in each round.</li>
</ul>

### 출력 

 <p>If you have won the most rounds of rock-paper-scissors, output "<code>victory</code>". If Guile has won the most rounds of rock-paper-scissors, output "<code>defeat</code>".</p>

<p>It is guaranteed that the both of you will not have the same number of wins.</p>

