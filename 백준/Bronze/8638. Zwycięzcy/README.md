# [Bronze II] Zwycięzcy - 8638 

[문제 링크](https://www.acmicpc.net/problem/8638) 

### 성능 요약

메모리: 14184 KB, 시간: 124 ms

### 분류

구현

### 제출 일자

2024년 4월 18일 08:44:23

### 문제 설명

<p>Trwa Turniej Strzelców Wyborowych. Do następnej tury przechodzą zawodnicy, którzy zdobyli największą liczbę punktów. Aby usprawnić pracę Jury, poproszono Cię o napisanie programu wyłaniającego zawodników przechodzących do następnej rundy. Zawodnikom przyporządkowano kolejne wielkie litery alfabetu łacińskiego, poczynając od A.</p>

<p>Opracuj program, który:</p>

<ul>
	<li>wczyta ze standardowego wejścia wyniki poszczególnych zawodników,</li>
	<li>wyłoni zawodników przechodzących do następnej rundy,</li>
	<li>wypisze na standardowe wyjście ich identyfikatory.</li>
</ul>

### 입력 

 <p>Pierwszy wiersz zawiera liczbę zawodników <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D441 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>N</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$N$</span></mjx-container>. W drugim wierszu zapisano <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D441 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>N</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$N$</span></mjx-container> nieujemnych liczb całkowitych oddzielonych pojedynczymi znakami spacji - <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D456 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>i</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$i$</span></mjx-container>-ta liczba jest wynikiem <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D456 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>i</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$i$</span></mjx-container>-tego zawodnika w kolejności nadanych im identyfikatorów. Liczba punktów zdobyta przez zawodnika nie przekracza <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>1000</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$1000$</span></mjx-container>.</p>

### 출력 

 <p>W pierwszym wierszu wypisz identyfikatory zawodników (przyporządkowane im litery), którzy osiągnęli największą liczbę punktów. Litery należy wypisać w kolejności alfabetycznej bez odstępów między kolejnymi literami.</p>

