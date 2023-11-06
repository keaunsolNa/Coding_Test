# [Silver V] HG 음성기호 - 25594 

[문제 링크](https://www.acmicpc.net/problem/25594) 

### 성능 요약

메모리: 91384 KB, 시간: 488 ms

### 분류

브루트포스 알고리즘, 많은 조건 분기, 문자열

### 제출 일자

2023년 11월 6일 09:26:44

### 문제 설명

<p>최근 해강이는 군대에 관심이 생겨 군대 관련 영상을 찾아 보고 있었다. 그러던 중 한 영상에서 '알파, 알파 여기는 브라보..' 이런 식으로 소통하는 모습을 봤다. 이 순간 해강이는 영상 속 인물들이 무슨 말을 하는지 궁금했고 이것이 <a href="https://ko.wikipedia.org/wiki/NATO_%EC%9D%8C%EC%84%B1_%EB%AC%B8%EC%9E%90">NATO 표준음성기호</a>였음을 알게 됐다. 그래서 해강이는 NATO 기호를 본따 자신만의 음성 기호인 HG 표준음성기호를 만들었다. 신이 난 해강이는 친구들에게 자신이 만든 HG 표준음성기호를 알려주고 이것으로 소통하자고 했다. 그런데 해강이의 친구 중 한 명인 영재는 HG 표준 음성기호를 이해하지 못해 해강이와의 소통에 어려움을 겪고 있다. 이런 영재를 위해 랜덤한 문자열이 주어지면 해당 문자열이 올바른 HG 표준음성 기호들로 표현되었는지 알려주고 올바르게 표현되었다면 원래 단어를 알려주자!</p>

<p>다음은 해강이가 만든 HG 표준음성기호 표이다.</p>

<table border="1" cellpadding="1" cellspacing="1" class="table table-bordered" style="width: 200px;">
	<tbody>
		<tr>
			<td style="text-align: center;">a</td>
			<td style="text-align: center;">aespa</td>
		</tr>
		<tr>
			<td style="text-align: center;">b</td>
			<td style="text-align: center;">baekjoon</td>
		</tr>
		<tr>
			<td style="text-align: center;">c</td>
			<td style="text-align: center;">cau</td>
		</tr>
		<tr>
			<td style="text-align: center;">d</td>
			<td style="text-align: center;">debug</td>
		</tr>
		<tr>
			<td style="text-align: center;">e</td>
			<td style="text-align: center;">edge</td>
		</tr>
		<tr>
			<td style="text-align: center;">f</td>
			<td style="text-align: center;">firefox</td>
		</tr>
		<tr>
			<td style="text-align: center;">g</td>
			<td style="text-align: center;">golang</td>
		</tr>
		<tr>
			<td style="text-align: center;">h</td>
			<td style="text-align: center;">haegang</td>
		</tr>
		<tr>
			<td style="text-align: center;">i</td>
			<td style="text-align: center;">iu</td>
		</tr>
		<tr>
			<td style="text-align: center;">j</td>
			<td style="text-align: center;">java</td>
		</tr>
		<tr>
			<td style="text-align: center;">k</td>
			<td style="text-align: center;">kotlin</td>
		</tr>
		<tr>
			<td style="text-align: center;">l</td>
			<td style="text-align: center;">lol</td>
		</tr>
		<tr>
			<td style="text-align: center;">m</td>
			<td style="text-align: center;">mips</td>
		</tr>
		<tr>
			<td style="text-align: center;">n</td>
			<td style="text-align: center;">null</td>
		</tr>
		<tr>
			<td style="text-align: center;">o</td>
			<td style="text-align: center;">os</td>
		</tr>
		<tr>
			<td style="text-align: center;">p</td>
			<td style="text-align: center;">python</td>
		</tr>
		<tr>
			<td style="text-align: center;">q</td>
			<td style="text-align: center;">query</td>
		</tr>
		<tr>
			<td style="text-align: center;">r</td>
			<td style="text-align: center;">roka</td>
		</tr>
		<tr>
			<td style="text-align: center;">s</td>
			<td style="text-align: center;">solvedac</td>
		</tr>
		<tr>
			<td style="text-align: center;">t</td>
			<td style="text-align: center;">tod</td>
		</tr>
		<tr>
			<td style="text-align: center;">u</td>
			<td style="text-align: center;">unix</td>
		</tr>
		<tr>
			<td style="text-align: center;">v</td>
			<td style="text-align: center;">virus</td>
		</tr>
		<tr>
			<td style="text-align: center;">w</td>
			<td style="text-align: center;">whale</td>
		</tr>
		<tr>
			<td style="text-align: center;">x</td>
			<td style="text-align: center;">xcode</td>
		</tr>
		<tr>
			<td style="text-align: center;">y</td>
			<td style="text-align: center;">yahoo</td>
		</tr>
		<tr>
			<td style="text-align: center;">z</td>
			<td style="text-align: center;">zebra</td>
		</tr>
	</tbody>
</table>

### 입력 

 <p>첫째 줄에 문자열 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D446 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>S</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$S$</span></mjx-container>가 주어진다.</p>

<p>문자열 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D446 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>S</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$S$</span></mjx-container>는 HG 표준 음성기호단어로 이루어질 수도 있고 아닐 수도 있다. <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mo class="mjx-n"><mjx-c class="mjx-c28"></mjx-c></mjx-mo><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c></mjx-mn><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c7C"></mjx-c></mjx-mo><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D446 TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n"><mjx-c class="mjx-c7C"></mjx-c></mjx-mo><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mn class="mjx-n" space="4"><mjx-c class="mjx-c38"></mjx-c></mjx-mn><mjx-mi class="mjx-i"><mjx-c class="mjx-cD7"></mjx-c></mjx-mi><mjx-msup><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c><mjx-c class="mjx-c30"></mjx-c></mjx-mn><mjx-script style="vertical-align: 0.393em;"><mjx-mn class="mjx-n" size="s"><mjx-c class="mjx-c36"></mjx-c></mjx-mn></mjx-script></mjx-msup><mjx-mo class="mjx-n"><mjx-c class="mjx-c29"></mjx-c></mjx-mo></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mo stretchy="false">(</mo><mn>1</mn><mo>≤</mo><mo data-mjx-texclass="OPEN" fence="false" stretchy="false">|</mo><mi>S</mi><mo data-mjx-texclass="CLOSE" fence="false" stretchy="false">|</mo><mo>≤</mo><mn>8</mn><mi>×</mi><msup><mn>10</mn><mn>6</mn></msup><mo stretchy="false">)</mo></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$(1 \le \lvert S \rvert \le 8×10^6)$</span> </mjx-container></p>

<p>모든 입력은 알파벳 소문자로만 주어진다. </p>

### 출력 

 <p>주어진 문자열 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D446 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>S</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$S$</span></mjx-container>가 전부 HG 표준 음성기호로 이루어 있다면, "<code>It's HG!</code>"를 출력하고 다음 줄에 원래 단어를 출력한다.</p>

<p>그렇지 않다면, 원래 단어를 알 수 없기에 "<code>ERROR!</code>"을 출력한다.</p>

