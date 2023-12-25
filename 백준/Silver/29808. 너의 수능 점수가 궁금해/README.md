# [Silver V] 너의 수능 점수가 궁금해 - 29808 

[문제 링크](https://www.acmicpc.net/problem/29808) 

### 성능 요약

메모리: 9628 KB, 시간: 184 ms

### 분류

사칙연산, 브루트포스 알고리즘, 구현, 수학

### 제출 일자

2023년 12월 25일 11:45:13

### 문제 설명

<p>7번의 수능 끝에 한양대학교 23학번으로 입학하게 된 김한양은 당신의 도움으로 무사히 수강신청을 하고 즐거운 대학생활을 시작할 수 있었다. 즐거운 대학 생활을 만끽하던 김한양은 한양대학교 최고의 코딩 동아리 FORIF에 들어가게 된다. 그 곳에서 새벽까지 술을 마시던 그는 문득 자신의 수능 점수를 뽐내고 싶어졌다. 하지만 술을 너무 많이 마신 나머지 김한양은 본인의 수능 점수가 기억나지 않았다. 답답해진 그는 문득 한양대학교 학번이 머릿속에 떠올랐다. </p>

<p>한양대학교는 Engine of Korea라고 불리는 만큼 학번을 만들 때 특수한 공식을 사용한다. 기본적으로 한양대학교 학번을 알아내기 위해서는 정확한 수능 점수(표준 점수)를 알고 있어야 한다. </p>

<ul>
	<li>국어 점수가 영어 점수보다 높다면, 두 점수의 차에 인문관의 건물 번호 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c35"></mjx-c><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c38"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>508</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$508$</span></mjx-container>을 곱해준다. 	아니라면, 두 점수의 차에 국제관의 건물 번호 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c38"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>108</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$108$</span></mjx-container>을 곱해준다.</li>
	<li>수학 점수가 탐구 점수보다 높다면, 두 점수의 차에 제1공학관의 건물 번호 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c32"></mjx-c><mjx-c class="mjx-c31"></mjx-c><mjx-c class="mjx-c32"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>212</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$212$</span></mjx-container>를 곱해준다. 	아니라면, 두 점수의 차에 ITBT관의 건물 번호 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c33"></mjx-c><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c35"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>305</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$305$</span></mjx-container>을 곱해준다.</li>
	<li>위에서 계산한 두 값을 더한 뒤, 한양대학교의 우편번호 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c34"></mjx-c><mjx-c class="mjx-c37"></mjx-c><mjx-c class="mjx-c36"></mjx-c><mjx-c class="mjx-c33"></mjx-c></mjx-mn><mjx-mo class="mjx-n"><mjx-c class="mjx-c28"></mjx-c></mjx-mo><mjx-mo class="mjx-n"><mjx-c class="mjx-c3D"></mjx-c></mjx-mo><mjx-mn class="mjx-n" space="4"><mjx-c class="mjx-c34"></mjx-c><mjx-c class="mjx-c37"></mjx-c><mjx-c class="mjx-c36"></mjx-c><mjx-c class="mjx-c33"></mjx-c></mjx-mn><mjx-mo class="mjx-n"><mjx-c class="mjx-c29"></mjx-c></mjx-mo></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>04763</mn><mo stretchy="false">(</mo><mo>=</mo><mn>4763</mn><mo stretchy="false">)</mo></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$04763 (=4763)$</span></mjx-container>을 곱하면 학번이 나온다.</li>
</ul>

<p>그는 다시 한 번 당신에게 와서 자신의 수능 점수에 대한 정보를 찾아달라고 부탁했다. 김한양의 학번이 주어질 때, 위의 공식을 이용하여 김한양의 국어, 영어 점수의 차와 수학, 탐구 점수의 차를 출력해주는 프로그램을 작성하자. 만약 가능한 경우가 여러 가지라면 모두 출력해 주어야 한다. 김한양은 국어, 수학, 영어, 탐구를 응시하였고, 제2외국어는 응시하지 않았다. 또한, 김한양은 모든 과목에서 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c30"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>0</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$0$</span></mjx-container> 이상 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c32"></mjx-c><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>200</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$200$</span></mjx-container> 이하의 표준점수를 받았다.</p>

### 입력 

 <p>첫째 줄에 학번을 나타내는 정수 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D446 TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n"><mjx-c class="mjx-c28"></mjx-c></mjx-mo><mjx-mn class="mjx-n"><mjx-c class="mjx-c30"></mjx-c></mjx-mn><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mi class="mjx-i" space="4"><mjx-c class="mjx-c1D446 TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mn class="mjx-n" space="4"><mjx-c class="mjx-c32"></mjx-c></mjx-mn><mjx-mo class="mjx-n" space="3"><mjx-c class="mjx-cD7"></mjx-c></mjx-mo><mjx-msup space="3"><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c><mjx-c class="mjx-c30"></mjx-c></mjx-mn><mjx-script style="vertical-align: 0.393em;"><mjx-mn class="mjx-n" size="s"><mjx-c class="mjx-c39"></mjx-c></mjx-mn></mjx-script></mjx-msup><mjx-mo class="mjx-n"><mjx-c class="mjx-c29"></mjx-c></mjx-mo></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>S</mi><mo stretchy="false">(</mo><mn>0</mn><mo>≤</mo><mi>S</mi><mo>≤</mo><mn>2</mn><mo>×</mo><msup><mn>10</mn><mn>9</mn></msup><mo stretchy="false">)</mo></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$S (0 \leq S \leq 2\times 10^9)$</span></mjx-container>가 주어진다.</p>

### 출력 

 <p>가능한 경우의 수를 첫째 줄에 먼저 출력해준다.</p>

<p>가능한 경우가 없다면 그대로 프로그램을 종료하고, 가능한 경우가 있다면 국어, 영어 표준점수의 차와 수학, 탐구의 표준점수의 차를 공백으로 구분하여 출력한다. 이때, 각 과목의 점수는 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c30"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>0</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$0$</span></mjx-container> 이상 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c32"></mjx-c><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>200</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$200$</span></mjx-container> 이하의 정수여야 한다.</p>

<p>가능한 경우가 여러 가지라면 국어, 영어의 표준점수의 차가 낮은 순서대로 먼저 출력한다. 국어, 영어 표준점수의 차가 동일하다면 수학, 탐구의 표준점수의 차가 낮은 순서대로 출력한다.</p>

