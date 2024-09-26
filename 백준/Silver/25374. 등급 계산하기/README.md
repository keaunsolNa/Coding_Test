# [Silver V] 등급 계산하기 - 25374 

[문제 링크](https://www.acmicpc.net/problem/25374) 

### 성능 요약

메모리: 15816 KB, 시간: 112 ms

### 분류

사칙연산, 구현, 수학, 정렬

### 제출 일자

2024년 9월 26일 22:58:04

### 문제 설명

<p>중학교에서는 절대 평가로 내신이 산출되었다면, 동래고등학교에 재학 중인 여러분은 1등급부터 9등급까지의 등급을 받는 상대 평가로 내신과 수능 등급이 산출된다.</p>

<p>찬솔이는 고등학교를 졸업할 때까지 수능과 담을 쌓고 살았기 때문에 수능 등급을 산출하는 자세한 기준은 고등학교를 졸업한 지금도 모르고 있다. 찬솔이를 위해 한 과목에 응시한 사람의 수와 각 사람이 받은 점수가 주어지면, 1등급부터 9등급까지의 각 등급을 받는 인원수를 구해주자.</p>

<p>수능 등급을 산출하는 비율은 아래와 같다.</p>

<table class="table table-bordered">
	<thead>
		<tr>
			<th>등급</th>
			<th>누적 비율</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>1등급</td>
			<td>상위 누적 4%</td>
		</tr>
		<tr>
			<td>2등급</td>
			<td>상위 누적 11%</td>
		</tr>
		<tr>
			<td>3등급</td>
			<td>상위 누적 23%</td>
		</tr>
		<tr>
			<td>4등급</td>
			<td>상위 누적 40%</td>
		</tr>
		<tr>
			<td>5등급</td>
			<td>상위 누적 60%</td>
		</tr>
		<tr>
			<td>6등급</td>
			<td>상위 누적 77%</td>
		</tr>
		<tr>
			<td>7등급</td>
			<td>상위 누적 89%</td>
		</tr>
		<tr>
			<td>8등급</td>
			<td>상위 누적 96%</td>
		</tr>
		<tr>
			<td>9등급</td>
			<td>상위 누적 100%</td>
		</tr>
	</tbody>
</table>

<p>구체적으로, <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D456 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>i</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$i$</span></mjx-container>점부터 100점 사이에 있는 사람의 비율이 4% 이상인 가장 큰 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D456 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>i</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$i$</span></mjx-container>를 1등급의 등급구분점수라고 한다. <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D456 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>i</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$i$</span></mjx-container>점 이상의 점수를 받은 모든 학생은 1등급을 받는다. 비슷하게 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D457 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>j</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$j$</span></mjx-container>점부터 100점 사이에 있는 사람의 비율이 11% 이상인 가장 큰 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D457 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>j</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$j$</span></mjx-container>점을 2등급의 등급구분점수라고 한다. 1등급의 등급구분점수 미만이면서 2등급의 등급구분점수 이상의 점수를 받은 모든 학생은 2등급을 받는다. 만약, 1등급의 등급구분점수 이상을 받은 학생의 비율이 11% 이상이라면, 이 학생들은 모두 1등급을 받고, 2등급의 등급구분점수가 1등급의 등급구분점수와 동일하므로 2등급을 받는 학생은 없다.</p>

<p>등급을 산출하는 조건을 정리한 표와 등급블랭크와 관련한 자세한 내용은 문제의 하단을 참고하자.</p>

### 입력 

 <p>첫째 줄에 한 과목에 응시한 사람의 수 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D441 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>N</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$N$</span></mjx-container>이 주어진다.</p>

<p>둘째 줄에 각 사람이 받은 점수 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-msub><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D434 TEX-I"></mjx-c></mjx-mi><mjx-script style="vertical-align: -0.15em;"><mjx-mn class="mjx-n" size="s"><mjx-c class="mjx-c31"></mjx-c></mjx-mn></mjx-script></mjx-msub><mjx-mo class="mjx-n"><mjx-c class="mjx-c2C"></mjx-c></mjx-mo><mjx-msub space="2"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D434 TEX-I"></mjx-c></mjx-mi><mjx-script style="vertical-align: -0.15em;"><mjx-mn class="mjx-n" size="s"><mjx-c class="mjx-c32"></mjx-c></mjx-mn></mjx-script></mjx-msub><mjx-mo class="mjx-n"><mjx-c class="mjx-c2C"></mjx-c></mjx-mo><mjx-mo class="mjx-n" space="2"><mjx-c class="mjx-c22EF"></mjx-c></mjx-mo><mjx-mo class="mjx-n" space="2"><mjx-c class="mjx-c2C"></mjx-c></mjx-mo><mjx-msub space="2"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D434 TEX-I"></mjx-c></mjx-mi><mjx-script style="vertical-align: -0.15em;"><mjx-mi class="mjx-i" size="s"><mjx-c class="mjx-c1D441 TEX-I"></mjx-c></mjx-mi></mjx-script></mjx-msub></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><msub><mi>A</mi><mn>1</mn></msub><mo>,</mo><msub><mi>A</mi><mn>2</mn></msub><mo>,</mo><mo>⋯</mo><mo>,</mo><msub><mi>A</mi><mi>N</mi></msub></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$A_1, A_2, \cdots, A_N$</span></mjx-container>이 공백으로 구분되어 주어진다.</p>

### 출력 

 <p>1등급, 2등급, <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mo class="mjx-n"><mjx-c class="mjx-c22EF"></mjx-c></mjx-mo></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mo>⋯</mo></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$\cdots$</span></mjx-container>, 9등급을 받는 학생의 수를 줄마다 출력한다.</p>

<p>만약, 해당 등급을 받는 학생이 없다면 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c30"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>0</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$0$</span></mjx-container>을 출력한다.</p>

