# [Silver V] finitefunc - 25033 

[문제 링크](https://www.acmicpc.net/problem/25033) 

### 성능 요약

메모리: 109544 KB, 시간: 4 ms

### 분류

자료 구조, 해시를 사용한 집합과 맵

### 제출 일자

2024년 12월 27일 17:43:09

### 문제 설명

<p>A function whose domain is a finite set can be implemented using a Python dictionary. Let <code>D</code> be such a Python dictionary corresponding to the mathematical function <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D453 TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n"><mjx-c class="mjx-c3A"></mjx-c></mjx-mo><mjx-mi class="mjx-i" space="2"><mjx-c class="mjx-c1D44B TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2192"></mjx-c></mjx-mo><mjx-mi class="mjx-i" space="4"><mjx-c class="mjx-c1D44C TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>f</mi><mo data-mjx-texclass="PUNCT">:</mo><mi>X</mi><mo accent="false" stretchy="false">→</mo><mi>Y</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$f\colon X\to Y$</span></mjx-container> where <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D44B TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>X</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$X$</span></mjx-container> is a finite set. The value of <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D453 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>f</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$f$</span></mjx-container> at <code>x</code> is <code>D[x]</code> and the domain <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D44B TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>X</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$X$</span></mjx-container> is the set of all keys of <code>D</code>. Return the range <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mo class="mjx-n"><mjx-c class="mjx-c7B"></mjx-c></mjx-mo><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D453 TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n"><mjx-c class="mjx-c28"></mjx-c></mjx-mo><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D465 TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n"><mjx-c class="mjx-c29"></mjx-c></mjx-mo><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c3A"></mjx-c></mjx-mo><mjx-mi class="mjx-i" space="4"><mjx-c class="mjx-c1D465 TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2208"></mjx-c></mjx-mo><mjx-mi class="mjx-i" space="4"><mjx-c class="mjx-c1D44B TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n"><mjx-c class="mjx-c7D"></mjx-c></mjx-mo></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mo fence="false" stretchy="false">{</mo><mi>f</mi><mo stretchy="false">(</mo><mi>x</mi><mo stretchy="false">)</mo><mo>:</mo><mi>x</mi><mo>∈</mo><mi>X</mi><mo fence="false" stretchy="false">}</mo></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$\{f(x):x\in X\}$</span></mjx-container>, in Python set.</p>

<p>Write a function <u><code>finitefunc</code></u>:</p>

<ul>
	<li>input parameter: a <code>dict</code>-type object <code>D</code>

	<ul>
		<li><code>D</code> has at most 1000 keys.</li>
		<li>Every key and value of <code>D</code> is an <code>int</code>-type object whose absolute value is less than or equal to <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>1000</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$1000$</span></mjx-container>.</li>
	</ul>
	</li>
	<li>return value: the <code>set</code>-type object <code>S</code> representing the range of the function
	<ul>
		<li>Every element of <code>S</code> should be an <code>int</code>-type object.</li>
	</ul>
	</li>
</ul>

### 입력 

 Empty

### 출력 

 Empty

