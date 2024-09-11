# [Bronze I] SWAPC - 32158 

[문제 링크](https://www.acmicpc.net/problem/32158) 

### 성능 요약

메모리: 2024 KB, 시간: 0 ms

### 분류

구현, 문자열

### 제출 일자

2024년 9월 11일 19:35:15

### 문제 설명

<p>어쩌다 ICPC Sinchon의 캠프장이 된 당신은 대회 홍보 포스터 초안에 대회명이 잘못 적혀 있는 것을 발견했다.</p>

<p>당신은 외주 디자이너를 만나 대회명을 명확히 알려주기 위해 포스터를 가리키며 “SUAPC”라고 말했지만 불행히도 외주 디자이너는 “SWAP <span style="color:#e74c3c;"><code>P</code></span> <span style="color:#e74c3c;"><code>C</code></span>”라고 이해했다.</p>

<p>외주 디자이너는 의문에 찬 상태로 첫 번째 <span style="color:#e74c3c;"><code>P</code></span>와 첫 번째 <span style="color:#e74c3c;"><code>C</code></span>, 두 번째 <span style="color:#e74c3c;"><code>P</code></span>와 두 번째 <span style="color:#e74c3c;"><code>C</code></span>, …를 짝짓고 둘의 위치를 바꾸었다.</p>

<p><span style="color:#e74c3c;"><code>P</code></span>와 <span style="color:#e74c3c;"><code>C</code></span>가 아닌 문자와, 최대로 짝을 맺고도 남은 <span style="color:#e74c3c;"><code>P</code></span> 또는 <span style="color:#e74c3c;"><code>C</code></span>는 그대로 두었다고 할 때, 원래 문구가 주어지면 디자이너가 해당 문구를 어떻게 수정했는지 출력하여라.</p>

### 입력 

 <p>첫 번째 줄에 원래 문구를 나타내는 문자열 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D446 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>S</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$S$</span></mjx-container>의 길이가 주어진다. (<mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c></mjx-mn><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-texatom space="4" texclass="ORD"><mjx-mo class="mjx-n"><mjx-c class="mjx-c7C"></mjx-c></mjx-mo></mjx-texatom><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D446 TEX-I"></mjx-c></mjx-mi><mjx-texatom texclass="ORD"><mjx-mo class="mjx-n"><mjx-c class="mjx-c7C"></mjx-c></mjx-mo></mjx-texatom><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mn class="mjx-n" space="4"><mjx-c class="mjx-c31"></mjx-c><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>1</mn><mo>≤</mo><mrow data-mjx-texclass="ORD"><mo stretchy="false">|</mo></mrow><mi>S</mi><mrow data-mjx-texclass="ORD"><mo stretchy="false">|</mo></mrow><mo>≤</mo><mn>100</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$1 \leq |S| \leq 100$</span></mjx-container>)</p>

<p>두 번째 줄에 문자열 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D446 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>S</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$S$</span></mjx-container>가 주어진다. <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D446 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>S</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$S$</span></mjx-container>는 알파벳 대문자로만 이루어져 있으며 공백을 포함하지 않는다.</p>

### 출력 

 <p>디자이너가 수정한 이후의 문구를 나타내는 문자열을 한 줄에 출력하여라.</p>

