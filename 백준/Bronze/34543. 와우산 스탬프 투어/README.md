# [Bronze IV] 와우산 스탬프 투어 - 34543 

[문제 링크](https://www.acmicpc.net/problem/34543) 

### 성능 요약

메모리: 14368 KB, 시간: 104 ms

### 분류

수학, 구현, 사칙연산

### 제출 일자

2025년 12월 4일 13:57:12

### 문제 설명

<p>홍익대학교 뒤편 와우산에는 여러 숨겨진 명소들이 있다.</p>

<p>민규는 와우산을 찾는 등산객들을 위해 '와우산 스탬프 투어'를 기획하였다.</p>

<p>투어에 참여하는 등산객들은 각 명소를 방문할 때마다 스탬프를 하나씩 받을 수 있다.</p>

<p>와우산에는 총 5개의 주요 명소가 있으며, 등산객이 이 5개의 명소 중 몇 곳을 방문했는지에 따라 '투어 점수'가 계산된다.</p>

<ul>
<li>방문한 명소 한 곳당 10점의 기본 점수를 얻는다.</li>
<li>만약 방문한 명소의 개수가 3개 이상이면, 추가로 20점을 더 받는다.</li>
<li>만약 모든 5개의 명소를 방문했다면, 기본 점수와 3개 이상 방문 추가 점수 외에, 특별 보너스로 50점을 더 받는다.</li>
<li>단, 등산객이 명소를 방문하면서 <strong>총 걸음 수가 1000보를 초과</strong>했다면, 피로가 누적되어 최종 점수에서 15점이 감점된다. <strong>점수는 0점 미만으로 내려가지 않는다.</strong></li>
</ul>

<p>주어진 등산객이 방문한 명소의 개수와 총 걸음 수를 이용하여, 해당 등산객의 최종 '투어 점수'를 계산하여 출력하라.</p>

### 입력 

 <p>첫째 줄에 등산객이 방문한 명소의 개수 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D441 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>N</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$N$</span></mjx-container>가 주어진다. (<mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c30"></mjx-c></mjx-mn><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mi class="mjx-i" space="4"><mjx-c class="mjx-c1D441 TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mn class="mjx-n" space="4"><mjx-c class="mjx-c35"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>0</mn><mo>≤</mo><mi>N</mi><mo>≤</mo><mn>5</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$0 \le N \le 5$</span></mjx-container>)</p>

<p>둘째 줄에 등산객의 총 걸음 수 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D44A TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>W</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$W$</span></mjx-container>가 주어진다. (<mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c30"></mjx-c></mjx-mn><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mi class="mjx-i" space="4"><mjx-c class="mjx-c1D44A TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mn class="mjx-n" space="4"><mjx-c class="mjx-c32"></mjx-c></mjx-mn><mjx-mtext class="mjx-n"><mjx-c class="mjx-cA0"></mjx-c></mjx-mtext><mjx-mn class="mjx-n"><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>0</mn><mo>≤</mo><mi>W</mi><mo>≤</mo><mn>2</mn><mtext> </mtext><mn>000</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$0 \le W \le 2\ 000$</span></mjx-container>)</p>

### 출력 

 <p>계산된 등산객의 최종 '투어 점수'를 출력한다.</p>

