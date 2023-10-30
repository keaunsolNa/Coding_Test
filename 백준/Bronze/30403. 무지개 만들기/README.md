# [Bronze II] 무지개 만들기 - 30403 

[문제 링크](https://www.acmicpc.net/problem/30403) 

### 성능 요약

메모리: 14144 KB, 시간: 128 ms

### 분류

구현, 문자열

### 제출 일자

2023년 10월 31일 08:37:13

### 문제 설명

<p style="text-align: center;"><img alt="" src=""></p>

<p>무지개 문자열은 <code><span style="color:#e74c3c;">R</span></code>(빨간색), <code><span style="color:#e74c3c;">O</span></code>(주황색), <code><span style="color:#e74c3c;">Y</span></code>(노란색), <code><span style="color:#e74c3c;">G</span></code>(초록색), <code><span style="color:#e74c3c;">B</span></code>(파란색), <code><span style="color:#e74c3c;">I</span></code>(남색), <code><span style="color:#e74c3c;">V</span></code>(보라색) 순으로 이루어진 문자열이며, 대소문자를 구분하지 않는다.</p>

<p>임스는 춘배에게 영어 대소문자로 이루어진 문자열을 제공하고, 해당 문자열에 있는 문자들을 활용하여 무지개 문자열을 만들 수 있는지 물어봤다.</p>

<p>임스가 춘배에게 제공한 문자열의 길이 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D441 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>N</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$N$</span></mjx-container>과, 문자열이 주어질 때, 소문자로만 이루어진 무지개를 만들 수 있으면 <span style="color:#e74c3c;"><code>yes</code></span>, 대문자로만 이루어진 무지개를 만들 수 있으면 <span style="color:#e74c3c;"><code>YES</code></span>, 두 가지 모두 만들 수 있으면 <span style="color:#e74c3c;"><code>YeS</code></span>, 두 가지 모두 만들 수 없으면 <span style="color:#e74c3c;"><code>NO!</code></span>를 출력한다.</p>

### 입력 

 <p>첫 번째 줄에는 임스가 춘배에게 제공한 문자열의 길이 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D441 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>N</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$N$</span></mjx-container>이 주어진다. <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mo class="mjx-n"><mjx-c class="mjx-c28"></mjx-c></mjx-mo><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c></mjx-mn><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mi class="mjx-i" space="4"><mjx-c class="mjx-c1D441 TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mn class="mjx-n" space="4"><mjx-c class="mjx-c31"></mjx-c><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c></mjx-mn><mjx-mo class="mjx-n"><mjx-c class="mjx-c29"></mjx-c></mjx-mo></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mo stretchy="false">(</mo><mn>1</mn><mo>≤</mo><mi>N</mi><mo>≤</mo><mn>100</mn><mo stretchy="false">)</mo></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$(1 \le N \le 100)$</span> </mjx-container></p>

<p>두 번째 줄에는 임스가 춘배에게 제공한 문자열이 주어진다.</p>

### 출력 

 <p>임스가 춘배에게 제공한 문자열로 무지개를 만들 수 있는지 출력한다.</p>

