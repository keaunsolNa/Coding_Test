# [Bronze I] Namnsdag - 21285 

[문제 링크](https://www.acmicpc.net/problem/21285) 

### 성능 요약

메모리: 15228 KB, 시간: 164 ms

### 분류

구현, 문자열

### 제출 일자

2024년 5월 18일 22:05:33

### 문제 설명

<p>Your friend likes money. When your friend has a name day he or she gets money from their nice aunt, hence your friend really enjoys when they have a name day.</p>

<p>It happens to be your friend's name day today, and your friend is considering how they could avoid having to wait another whole year before it's time for name day again. You've been asked to help out.</p>

<p>Your friend is planning to replace exactly one letter in their name in order to have a name day as soon as possible again. Given a list of name days for the coming year, please help your friend decide how soon they can have a name day again. It's forbidden to add or erase characters, you may only replace exactly one character with exactly one other character.</p>

<p>If it's impossible to find a name that can be reached with the above listed allowed actions, your friend will simply have to wait a whole year.</p>

### 입력 

 <p>Input starts with a single string, the name of your friend. Then follows an integer <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D441 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>N</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$N$</span></mjx-container> on one row, the number of days in the coming year. After that follows <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D441 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>N</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$N$</span></mjx-container> strings, the name days for days in the coming year.</p>

<p>The <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D441 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>N</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$N$</span></mjx-container>:th name will always be the name of your friend, since it's their name day today and hence also in exactly one year again. The names in the input consist solely of characters <code>a-z</code>, contain no spaces and are at most 10 characters long. All names for the coming year will be different.</p>

### 출력 

 <p>Output a single integer on a single line: the minimum number of days before it's time for name day again, if you help your friend cheat with their name.</p>

