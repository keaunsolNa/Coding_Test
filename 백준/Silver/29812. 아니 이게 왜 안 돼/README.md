# [Silver V] 아니 이게 왜 안 돼 - 29812 

[문제 링크](https://www.acmicpc.net/problem/29812) 

### 성능 요약

메모리: 19156 KB, 시간: 208 ms

### 분류

그리디 알고리즘, 문자열

### 제출 일자

2023년 11월 22일 09:00:37

### 문제 설명

<p>과제를 하다가 잔뜩 화가 난 김한양은 분노 조절을 위해 메모장을 열어서 키보드를 내려치기 시작했다. 메모장에는 알파벳으로만 이루어진 알 수 없는 문자열이 생겼지만, 이상하게도 H, Y, U 세 종류의 알파벳만은 대문자로 쓰여있었다.</p>

<p>한양대학교를 너무 사랑하는 김한양은 다음과 같은 과정을 통해 이 문자열에서 H, Y, U 세 종류의 알파벳만 남긴 후 HYU라는 단어를 최대한 많이 만들고자 한다.</p>

<p>우선 문자열에서 H, Y, U 세 종류의 알파벳을 제외한 모든 알파벳을 지운다. 문자열에서 H, Y, U 세 종류의 알파벳만을 남길 때는 키보드의 delete 키와 마우스 드래그를 사용할 수 있다. 문자를 지우는 방법은 다음과 같다.</p>

<ol>
	<li>delete 키를 사용하여 문자열에서 한 문자를 지운다. 이때, 지울 문자는 문자열 어디에서든 선택할 수 있다.</li>
	<li>마우스로 여러 문자를 드래그한 후 delete 키를 사용하여 드래그한 문자들을 모두 지운다. 이때, 연속된 문자열만을 드래그할 수 있다.</li>
</ol>

<p>delete 키를 누를 때마다 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D437 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>D</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$D$</span></mjx-container>만큼의 에너지가 소비되고, 마우스로 드래그할 때마다 드래그한 문자열의 길이에 상관없이 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D440 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>M</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$M$</span></mjx-container>만큼의 에너지가 소비된다. 하지만, 김한양은 키보드를 내려치느라 힘이 다 빠져버렸기 때문에, 문자들을 지우는 데에 사용되는 에너지를 최소화하고자 한다.</p>

<p>문자들을 지우고 나면 남은 H, Y, U들을 조합하여 단어 HYU를 만들어야 한다. HYU를 만들 때에는 알파벳 H, Y, U가 각각 한 개씩 필요하며, 원래 문자열에서 알파벳의 상대적인 위치는 중요하지 않다. 해당 단계에서는 에너지를 소비하지 않는다.</p>

<p>메모장에 적힌 문자열이 주어졌을 때, 김한양이 소비한 에너지의 최솟값과 만들 수 있는 HYU의 최대 개수를 구하여라.</p>

### 입력 

 <p>첫 번째 줄에 문자열 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D446 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>S</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$S$</span></mjx-container>의 길이를 나타내는 정수 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D441 TEX-I"></mjx-c></mjx-mi><mjx-mtext class="mjx-n"><mjx-c class="mjx-cA0"></mjx-c></mjx-mtext><mjx-mo class="mjx-n"><mjx-c class="mjx-c28"></mjx-c></mjx-mo><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c></mjx-mn><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mi class="mjx-i" space="4"><mjx-c class="mjx-c1D441 TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mn class="mjx-n" space="4"><mjx-c class="mjx-c32"></mjx-c><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c></mjx-mn><mjx-mstyle><mjx-mspace style="width: 0.167em;"></mjx-mspace></mjx-mstyle><mjx-mn class="mjx-n"><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c></mjx-mn><mjx-mo class="mjx-n"><mjx-c class="mjx-c29"></mjx-c></mjx-mo></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>N</mi><mtext> </mtext><mo stretchy="false">(</mo><mn>1</mn><mo>≤</mo><mi>N</mi><mo>≤</mo><mn>200</mn><mstyle scriptlevel="0"><mspace width="0.167em"></mspace></mstyle><mn>000</mn><mo stretchy="false">)</mo></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$N\ (1 \leq N \leq 200\,000)$</span></mjx-container>이 주어진다.</p>

<p>두 번째 줄에 메모장에 적힌 문자열 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D446 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>S</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$S$</span></mjx-container>가 주어진다. <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D446 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>S</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$S$</span></mjx-container>는 알파벳 소문자와 대문자로만 이루어져 있다.</p>

<p>세 번째 줄에 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D437 TEX-I"></mjx-c></mjx-mi><mjx-mtext class="mjx-n"><mjx-c class="mjx-cA0"></mjx-c></mjx-mtext><mjx-mo class="mjx-n"><mjx-c class="mjx-c28"></mjx-c></mjx-mo><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c></mjx-mn><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mi class="mjx-i" space="4"><mjx-c class="mjx-c1D437 TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mn class="mjx-n" space="4"><mjx-c class="mjx-c31"></mjx-c><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c></mjx-mn><mjx-mo class="mjx-n"><mjx-c class="mjx-c29"></mjx-c></mjx-mo></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>D</mi><mtext> </mtext><mo stretchy="false">(</mo><mn>1</mn><mo>≤</mo><mi>D</mi><mo>≤</mo><mn>100</mn><mo stretchy="false">)</mo></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$D\ (1 \leq D \leq 100)$</span></mjx-container>와 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D440 TEX-I"></mjx-c></mjx-mi><mjx-mtext class="mjx-n"><mjx-c class="mjx-cA0"></mjx-c></mjx-mtext><mjx-mo class="mjx-n"><mjx-c class="mjx-c28"></mjx-c></mjx-mo><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c></mjx-mn><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mi class="mjx-i" space="4"><mjx-c class="mjx-c1D440 TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mn class="mjx-n" space="4"><mjx-c class="mjx-c31"></mjx-c><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c></mjx-mn><mjx-mo class="mjx-n"><mjx-c class="mjx-c29"></mjx-c></mjx-mo></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>M</mi><mtext> </mtext><mo stretchy="false">(</mo><mn>1</mn><mo>≤</mo><mi>M</mi><mo>≤</mo><mn>100</mn><mo stretchy="false">)</mo></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$M\ (1 \leq M \leq 100)$</span></mjx-container>이 공백으로 구분되어 주어진다.</p>

### 출력 

 <p>첫 번째 줄에 김한양이 소비한 에너지의 최솟값을 출력한다. 소비한 에너지가 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c30"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>0</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$0$</span></mjx-container>이라면 <span style="color:#e74c3c;"><code>Nalmeok</code></span>을 출력한다.</p>

<p>두 번째 줄에 김한양이 만들 수 있는 HYU의 최대 개수를 출력한다. 만들 수 있는 HYU의 개수가 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c30"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>0</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$0$</span></mjx-container>이라면 <span style="color:#e74c3c;"><code>I love HanYang University</code></span>를 출력한다.</p>

