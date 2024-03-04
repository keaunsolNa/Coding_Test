# [Bronze II] Number Game - 1975 

[문제 링크](https://www.acmicpc.net/problem/1975) 

### 성능 요약

메모리: 23256 KB, 시간: 496 ms

### 분류

수학, 정수론

### 제출 일자

2024년 3월 4일 12:41:07

### 문제 설명

<p>창영이는 심심해서 혼자 재미 없는 게임을 하나 생각해냈다. 숫자 N을 먼저 정하고, 이 숫자를 2진법, 3진법, 4진법, ..., 100만진법, 100만 1진법 등등으로 바꾸어 보면서, 마지막자리에 연속된 0의 개수를 모두 더하는 것이다.</p>

<p>예를 들어 N=5라면, 2진법 101, 3진법 12, 4진법 11, 5진법 10, 6진법 5, 7진법 5, ... 등과 같으므로 답은 1이 된다. 여러분이 할 일은 주어진 N에 대해서 창영이가 구한 답을 찾는 것이다. 정확히 설명하기 위해 수학식으로 쓰자면, f(N, b)를 N을 b진법으로 나타냈을 때 마지막에 따르는 연속된 0의 개수로 정의 할 때</p>

<p style="text-align: center;"><mjx-container class="MathJax" jax="CHTML" display="true" style="font-size: 109%; position: relative;"> <mjx-math display="true" class="MJX-TEX" aria-hidden="true" style="margin-left: 0px; margin-right: 0px;"><mjx-munderover><mjx-over style="padding-bottom: 0.192em; padding-left: 0.368em;"><mjx-texatom size="s" texclass="ORD"><mjx-mi class="mjx-n"><mjx-c class="mjx-c221E"></mjx-c></mjx-mi></mjx-texatom></mjx-over><mjx-box><mjx-munder><mjx-row><mjx-base><mjx-mo class="mjx-lop"><mjx-c class="mjx-c2211 TEX-S2"></mjx-c></mjx-mo></mjx-base></mjx-row><mjx-row><mjx-under style="padding-top: 0.167em; padding-left: 0.118em;"><mjx-texatom size="s" texclass="ORD"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D44F TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n"><mjx-c class="mjx-c3D"></mjx-c></mjx-mo><mjx-mn class="mjx-n"><mjx-c class="mjx-c32"></mjx-c></mjx-mn></mjx-texatom></mjx-under></mjx-row></mjx-munder></mjx-box></mjx-munderover><mjx-texatom space="2" texclass="ORD"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D453 TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n"><mjx-c class="mjx-c28"></mjx-c></mjx-mo><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D441 TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n"><mjx-c class="mjx-c2C"></mjx-c></mjx-mo><mjx-mi class="mjx-i" space="2"><mjx-c class="mjx-c1D44F TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n"><mjx-c class="mjx-c29"></mjx-c></mjx-mo></mjx-texatom></mjx-math><mjx-assistive-mml unselectable="on" display="block"><math xmlns="http://www.w3.org/1998/Math/MathML" display="block"><munderover><mo data-mjx-texclass="OP">∑</mo><mrow data-mjx-texclass="ORD"><mi>b</mi><mo>=</mo><mn>2</mn></mrow><mrow data-mjx-texclass="ORD"><mi mathvariant="normal">∞</mi></mrow></munderover><mrow data-mjx-texclass="ORD"><mi>f</mi><mo stretchy="false">(</mo><mi>N</mi><mo>,</mo><mi>b</mi><mo stretchy="false">)</mo></mrow></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">\[\sum_{b=2}^{\infty}{f(N, b)}\]</span> </mjx-container></p>

<p>를 구하는 것이다.</p>

### 입력 

 <p>첫 줄에 테스트 케이스의 수 T가 주어진다. 다음 T줄에 걸쳐서 N이 주어진다.</p>

### 출력 

 <p>각 줄에 위 수식에 대한 답을 출력한다.</p>

