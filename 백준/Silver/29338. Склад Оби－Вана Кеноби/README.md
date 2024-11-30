# [Silver IV] Склад Оби-Вана Кеноби - 29338 

[문제 링크](https://www.acmicpc.net/problem/29338) 

### 성능 요약

메모리: 40260 KB, 시간: 4656 ms

### 분류

자료 구조, 덱, 구현, 스택

### 제출 일자

2024년 11월 30일 18:25:31

### 문제 설명

<p>Оби-Ван Кеноби --- один из последних представителей ордена рыцарей джедаев. Оби-Ван Кеноби родом с планеты Стьюджон, где абсолютно все жители чтут порядок, и Оби-Ван Кеноби --- не исключение.</p>

<p>Во всех эпизодах <<Звездных войн>> Оби-Ван Кеноби орудует синим световым мечом, но мало кто знает, что на самом деле у него их много, причем все мечи Кеноби пронумерованы. Оби-Ван Кеноби хранит все свои мечи на очень длинном столе. Когда он хочет вооружиться, то он берет самый правый меч со стола, и идет по своим делам. Оби-Ван Кеноби орудует взятым мечом пока не потеряет или не сломает его.</p>

<p>Иногда кто-нибудь дарит Оби-Вану Кеноби новый меч, и тогда он просто кладет его на стол справа к тем, что уже лежат там. Но самое страшное случается тогда, когда к столу подходит мама Оби-Вана Кеноби. Мама тоже житель планеты Стьюджон, и поэтому она всегда возмущается, что мечи лежат неупорядоченно. Чтобы исправить это, она забирает всю левую половину мечей (если мечей на столе было нечетное количество, то мама забирает наибольшее целое число мечей, меньшее половины их общего количества) и начинает их подкладывать справа к оставшимся. Причем сначала она кладет меч, который изначально был самым левым, потом правее от него кладет второй меч и так далее.</p>

<p>Определите, в каком порядке лежат мечи у Оби-Вану Кеноби на данный момент. У каждого меча есть свой личный номер, который известен только Оби-Вану Кеноби. Ну и, конечно, вам. </p>

### 입력 

 <p>В первой строке входного файла дано натуральное числа <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D45B TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>n</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$n$</span></mjx-container> --- количество изменений, произошедших на столе (<mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c></mjx-mn><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mi class="mjx-i" space="4"><mjx-c class="mjx-c1D45B TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-msup space="4"><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c><mjx-c class="mjx-c30"></mjx-c></mjx-mn><mjx-script style="vertical-align: 0.393em;"><mjx-mn class="mjx-n" size="s"><mjx-c class="mjx-c36"></mjx-c></mjx-mn></mjx-script></mjx-msup></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>1</mn><mo>≤</mo><mi>n</mi><mo>≤</mo><msup><mn>10</mn><mn>6</mn></msup></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$1 \le n \le 10^6$</span></mjx-container>). В следующих <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D45B TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>n</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$n$</span></mjx-container> строках заданы описания изменений в следующем формате:</p>

<ul>
	<li>если строка начинается со слова <code>add</code>, то в той же строке через пробел находится число <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D465 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>x</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$x$</span></mjx-container> (<mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c></mjx-mn><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mi class="mjx-i" space="4"><mjx-c class="mjx-c1D465 TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mi class="mjx-i" space="4"><mjx-c class="mjx-c1D45B TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>1</mn><mo>≤</mo><mi>x</mi><mo>≤</mo><mi>n</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$1 \le x \le n$</span></mjx-container>) --- личный номер меча, подаренного Оби-Вану Кеноби. Гарантируется, что мечей с таким номером Оби-Вану Кеноби раньше не дарили и больше не подарят.</li>
	<li>если строка содержит единственное слово <code>take</code>, то это обозначает, что Оби-Ван Кеноби забрал самый правый меч со стола с собой. Если на столе не было мечей, то ничего не произошло.</li>
	<li>если же строка содержит единственное слово <code>mum!</code>, то это обозначает, что к столу подошла мама и навела порядок. Если на столе было меньше двух мечей, то ничего не произошло. </li>
</ul>

<p>Изначально стол был пуст.</p>

### 출력 

 <p>В первой строке выходного файла выведите число <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D458 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>k</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$k$</span></mjx-container> --- количество мечей, лежащих на данный момент на столе у Оби-Вана Кеноби. В следующей строке выведите <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D458 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>k</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$k$</span></mjx-container> чисел через пробел --- личные номера мечей, лежащих на столе, в том порядке, в котором они на нем лежат (слева направо).</p>

