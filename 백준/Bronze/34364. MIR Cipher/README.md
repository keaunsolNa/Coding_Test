# [Bronze III] MIR Cipher - 34364 

[문제 링크](https://www.acmicpc.net/problem/34364) 

### 성능 요약

메모리: 14132 KB, 시간: 100 ms

### 분류

수학, 구현, 문자열, 사칙연산

### 제출 일자

2026년 3월 30일 13:26:40

### 문제 설명

<p>Mines Internet Radio (MIR) has recently been intercepting some weird transmissions, and they believe it is some type of encoded message. They have figured out how the messages can be decoded, but are having a hard time doing it by hand with the quantity they have received, so they've tasked you with creating a program to decode the messages.</p>

<p>They've identified the following procedure for decoding the the message they received. </p>

<p>The first letter of the message is shifted by <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>1</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$1$</span></mjx-container> letter, with shifts wrapping around to the beginning of the alphabet. This means that an <code>A</code> would become a <code>B</code>, a <code>B</code> would become a <code>C</code>, etc. with a <code>Z</code> wrapping around to become an <code>A</code>. Each subsequent letter in the message is shifted by twice the amount of the previous letter, with shifts wrapping around the alphabet as with the first letter. This means the second letter in the message is shifted by <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c32"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>2</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$2$</span></mjx-container> letters, so an <code>A</code> becomes a <code>C</code>, a <code>B</code> becomes a <code>D</code>, etc. all the way down to <code>Y</code> which would become an <code>A</code> and <code>Z</code> which would become <code>B</code>. The third letter of the message is shifted by <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c34"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>4</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$4$</span></mjx-container> letters in a similar manner, and so on for the rest of the letters in the message.</p>

<p>Note that the shift amount could be more than the number of letters in the alphabet in which case you need to wrap around the alphabet multiple times.</p>

### 입력 

 <p>You will be given one line of input consisting of two parts separated by a space:</p>

<ul>
	<li>An integer <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c></mjx-mn><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mi class="mjx-i" space="4"><mjx-c class="mjx-c1D441 TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mn class="mjx-n" space="4"><mjx-c class="mjx-c36"></mjx-c><mjx-c class="mjx-c30"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>1</mn><mo>≤</mo><mi>N</mi><mo>≤</mo><mn>60</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$1 \leq N \leq 60$</span></mjx-container> representing the number of letters in the message to follow.</li>
	<li>A string of length <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D441 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>N</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$N$</span></mjx-container> consisting of only uppercase letters in the English alphabet (A-Z).</li>
</ul>

### 출력 

 <p>Output one line with the decoded string in all upper-case letters.</p>

