# [Bronze I] Ребус - 19802 

[문제 링크](https://www.acmicpc.net/problem/19802) 

### 성능 요약

메모리: 14392 KB, 시간: 108 ms

### 분류

파싱, 문자열

### 제출 일자

2024년 6월 14일 00:27:58

### 문제 설명

<p>На прошлом уроке английского Пете задали домашнее задание. Оно заключалось в разгадывании ребусов. Каждый ребус --- это последовательность картинок. С двух сторон от каждой картинки могут располагаться апострофы. Каждая картинка обозначает некоторое слово. Предположим, что перед некоторой картинкой нарисовано <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D456 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>i</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$i$</span></mjx-container> апострофов, а после нее <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D457 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>j</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$j$</span></mjx-container> апострофов. Это значит, что у слова, которое сопоставляется картинке, необходимо убрать <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D456 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>i</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$i$</span></mjx-container> букв с начала и <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D457 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>j</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$j$</span></mjx-container> с конца, а оставшуюся его часть записать вместо картинки и апострофов. Так необходимо сделать с каждой картинкой и окружающими ее апострофами. После этого нужно <<склеить>> получившиеся кусочки в одно слово. Оно и будет разгадкой ребуса.</p>

<p>У Пети нет проблем с тем, чтобы сопоставить каждой картинке слово. Но ему очень лень заниматься отбрасыванием лишних букв и склеиванием слов. Поэтому он попросил вас помочь ему. Дана строка, которая состоит из маленьких латинских букв, апострофов (символов с кодом 39), а также пробелов, которые разделяют слова. Апостроф относиться к некоторому слову, если между ними нет пробела. Если апостроф стоит слева от слова, то у него необходимо убрать одну букву с начала, если справа --- с конца. Потом необходимо склеить все слова в одно.</p>

<p>Например, пусть дана строчка <<team ''''school ''olympiad'''>>. В первом слове ничего изменять не надо, так как к нему не относится ни один апостроф. Во втором необходимо убрать первые четыре буквы и получить <<ol>>, из третьего слова получится <<ymp>>. После скеливания трех кусочков получим строку <<teamolymp>>.</p>

### 입력 

 <p>В первой строке входного файла дан ребус, длиной не более <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>100</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$100$</span></mjx-container> символов, который необходимо решить. Гарантируется, что в строчке присутствуют только апострофы (код символа --- 39), пробелы и маленькие латинские буквы, а также, что ребус корректен --- нет слова, у которого нобходимо удалить букв больше, чем его длина.</p>

### 출력 

 <p>Выведите одно слово --- ответ на ребус.</p>

