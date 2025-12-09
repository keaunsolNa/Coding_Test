# [Bronze IV] Take It or Double It - 34584 

[문제 링크](https://www.acmicpc.net/problem/34584) 

### 성능 요약

메모리: 14132 KB, 시간: 104 ms

### 분류

수학, 사칙연산

### 제출 일자

2025년 12월 9일 16:26:48

### 문제 설명

<p>You are the host of a street experiment show called <strong>TOPC (Take Or Pass Challenge)</strong>. In the show, you approach people one by one and offer them some money. Each person can either:</p>

<ul>
<li><strong>Take it</strong>: Accept the money and end the game.</li>
<li><strong>Double it</strong>: Reject the money and ask you to double the amount and offer it to the next person.</li>
</ul>

<p>The game starts with <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D465 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>x</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$x$</span></mjx-container> dollars. You go down the street and meet <em>a random person</em>. You would like to predict in advance what each of them will say — either “take” or “double”.</p>

<p>You have a limited budget of <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D451 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>d</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$d$</span></mjx-container> dollars in your pocket. If, at any point, a person’s decision could result in an amount <strong>strictly greater</strong> than your available funds <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D451 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>d</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$d$</span></mjx-container>, you must <strong>force the person to say “take it”</strong>, regardless of what they wanted to say. Taiwanese people are very kind-hearted, so whenever they have a choice, they would always say “double it” and pass the opportunity to others — unless they are forced to take the money.</p>

<p>Your task is to simulate the game and determine if the person you meet will take the money or double it and give it to the next person.</p>

### 입력 

 <p>The input contains two integers <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D465 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>x</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$x$</span></mjx-container> and <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D451 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>d</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$d$</span></mjx-container>.</p>

### 출력 

 <p>Output a string “<code>take it</code>” or “<code>double it</code>”.</p>

