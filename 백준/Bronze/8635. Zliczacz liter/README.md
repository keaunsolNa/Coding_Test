# [Bronze II] Zliczacz liter - 8635 

[문제 링크](https://www.acmicpc.net/problem/8635) 

### 성능 요약

메모리: 14244 KB, 시간: 124 ms

### 분류

구현, 문자열

### 제출 일자

2024년 5월 17일 20:54:49

### 문제 설명

<p>Koło Młodych Miłośników Łamania Szyfrów pracuje nad oprogramowaniem służącym do odszyfrowania pewnego starożytnego manuskryptu. Jądrem systemu zostanie samouczący się analizator tekstu, a jego pierwszym modułem "zliczacz liter", którego opracowanie powierzono Tobie.</p>

<p>Opracuj program, który:</p>

<ul>
	<li>wczyta ze standardowego wejścia tekst do analizy,</li>
	<li>dla każdej litery obliczy liczbę jej wystąpień w tekście,</li>
	<li>wypisze wynik na standardowe wyjście.</li>
</ul>

### 입력 

 <p>W pierwszym wierszu wejścia znajduje się liczba <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D441 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>N</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$N$</span></mjx-container>, oznaczająca liczbę wierszy tekstu do analizy (<mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D441 TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mn class="mjx-n" space="4"><mjx-c class="mjx-c31"></mjx-c><mjx-c class="mjx-c35"></mjx-c><mjx-c class="mjx-c30"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>N</mi><mo>≤</mo><mn>150</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$N ≤ 150$</span></mjx-container>). W każdym z następujących <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D441 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>N</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$N$</span></mjx-container> znajduje się ciąg złożony z maksymalnie <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c32"></mjx-c><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>200</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$200$</span></mjx-container> znaków spośród małych i wielkich liter alfabetu łacińskiego ('a'..'z', 'A'..'Z') oraz spacji.</p>

### 출력 

 <p>W kolejnych wierszach należy wypisywać litery od 'a' do 'z' i od 'A' do 'Z' (w tej kolejności), pojedyncza˛ spację oraz liczbę oznaczającą ilość wystąpień tej litery w analizowanym tekście. Litery nie występujące w tekście należy pominąć.</p>

