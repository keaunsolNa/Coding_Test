# [Bronze I] Hurtownia - 8620 

[문제 링크](https://www.acmicpc.net/problem/8620) 

### 성능 요약

메모리: 249728 KB, 시간: 740 ms

### 분류

자료 구조, 해시를 사용한 집합과 맵, 구현

### 제출 일자

2024년 5월 25일 21:09:58

### 문제 설명

<p>Szef Twojego kolegi, który pracuje w hurtowni, dzisiaj zachorował, a oto kontrola stoi u drzwi! Potrzebuje on więc możliwie szybko poznać liczbę pudeł poszczególnych towarów, jakie są aktualnie przechowywane w hurtowni. Korzystając z okazji, że odwiedziłeś go w pracy, Twój kolega poprosił Cię, żebyś pomógł mu to policzyć.</p>

<p>Na szczęście nie musisz liczyć pudeł ręcznie, gdyż chorujący szef zostawił swoje notatki, w których skrupulatnie notował każdy transport towarów, zarówno przywożonych, jak i wywożonych z hurtowni. Zapiski te leżą teraz przed Tobą - wszystkie od samego początku pracy hurtowni.</p>

<p>Oblicz, ile jest w tym momencie pudeł na składzie.</p>

<p>Napisz program, który:</p>

<ul>
	<li>wczyta ze standardowego wejścia spis transportów magazynowanych pudeł,</li>
	<li>wyznaczy aktualną liczbę pudeł każdego z rodzajów towaru na składzie,</li>
	<li>wypisze wynik na standardowe wyjście.</li>
</ul>

### 입력 

 <p>Pierwszy wiersz wejścia zawiera jedną liczbę całkowitą <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D45B TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>n</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$n$</span></mjx-container> (<mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c></mjx-mn><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mi class="mjx-i" space="4"><mjx-c class="mjx-c1D45B TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mn class="mjx-n" space="4"><mjx-c class="mjx-c31"></mjx-c></mjx-mn><mjx-mstyle><mjx-mspace style="width: 0.167em;"></mjx-mspace></mjx-mstyle><mjx-mn class="mjx-n"><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c></mjx-mn><mjx-mstyle><mjx-mspace style="width: 0.167em;"></mjx-mspace></mjx-mstyle><mjx-mn class="mjx-n"><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>1</mn><mo>≤</mo><mi>n</mi><mo>≤</mo><mn>1</mn><mstyle scriptlevel="0"><mspace width="0.167em"></mspace></mstyle><mn>000</mn><mstyle scriptlevel="0"><mspace width="0.167em"></mspace></mstyle><mn>000</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$1 ≤ n ≤ 1\,000\,000$</span></mjx-container>), oznaczającą liczbę zapisków w notatkach. W każdym z kolejnych <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D45B TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>n</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$n$</span></mjx-container> wierszy znajduje się pojedynczy zapis, dotyczący jednego transportu i składający się kolejno z:</p>

<ul>
	<li>rodzaju towaru, którego ten zapis dotyczy (poszczególne towary są oznaczone wielkimi literami alfabetu angielskiego od <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D434 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>A</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$A$</span></mjx-container> do <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D44D TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>Z</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$Z$</span></mjx-container>);</li>
	<li>pojedynczego odstępu;</li>
	<li>znaku "<mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mo class="mjx-n"><mjx-c class="mjx-c2B"></mjx-c></mjx-mo></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mo>+</mo></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$+$</span></mjx-container>" lub "<mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mo class="mjx-n"><mjx-c class="mjx-c2212"></mjx-c></mjx-mo></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mo>−</mo></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$-$</span></mjx-container>" ("<mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mo class="mjx-n"><mjx-c class="mjx-c2B"></mjx-c></mjx-mo></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mo>+</mo></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$+$</span></mjx-container>" oznacza, że pudła zostały przywiezione do hurtowni, zaś "<mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mo class="mjx-n"><mjx-c class="mjx-c2212"></mjx-c></mjx-mo></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mo>−</mo></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$-$</span></mjx-container>" - że zostały z niej wywiezione);</li>
	<li>pojedynczej dodatniej liczby całkowitej, nie większej niż <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c32"></mjx-c></mjx-mn><mjx-mstyle><mjx-mspace style="width: 0.167em;"></mjx-mspace></mjx-mstyle><mjx-mn class="mjx-n"><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>2</mn><mstyle scriptlevel="0"><mspace width="0.167em"></mspace></mstyle><mn>000</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$2\,000$</span></mjx-container> i oznaczającej liczbę pudeł, które zostały przetransportowane.</li>
</ul>

<p>Zakładamy, że przed pierwszym transportem magazyn był pusty. Możesz też założyć, że nigdy w hurtowni nie było ujemnej liczby pudeł żadnego towaru.</p>

### 출력 

 <p>Wyjście powinno zawierać po jednym wierszu dla każdego rodzaju towaru, który pojawił się na wejściu. Każdy taki wiersz powinien zawierać nazwę towaru (oznaczoną za pomocą pojedynczej wielkiej litery) i oddzieloną od niej pojedynczym odstępem liczbę pudeł tego towaru, które znajdują się aktualnie w hurtowni. Towary na wyjściu powinny być wymienione w kolejności alfabetycznej.</p>

