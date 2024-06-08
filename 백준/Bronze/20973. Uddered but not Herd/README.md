# [Bronze I] Uddered but not Herd - 20973 

[문제 링크](https://www.acmicpc.net/problem/20973) 

### 성능 요약

메모리: 14132 KB, 시간: 104 ms

### 분류

문자열

### 제출 일자

2024년 6월 8일 23:13:53

### 문제 설명

<p>A little known fact about cows is that they have their own version of the alphabet, the "cowphabet". It consists of the 26 letters 'a' through 'z', but when a cow speaks the cowphabet, she lists these letters in a specific ordering that might be different from the order 'abcdefghijklmnopqrstuvwxyz' we are used to hearing.</p>

<p>To pass the time, Bessie the cow has been humming the cowphabet over and over again, and Farmer John is curious how many times she's hummed it.</p>

<p>Given a lowercase string of letters that Farmer John has heard Bessie say, compute the minimum number of times Bessie must have hummed the entire cowphabet in order for Farmer John to have heard the given string. Farmer John isn't always paying attention to what Bessie hums, and so he might have missed some of the letters that Bessie has hummed. The string you are told consists of just the letters that he remembers hearing.</p>

### 입력 

 <p>The first line of input contains the 26 lowercase letters 'a' through 'z' in the order they appear in the cowphabet. The next line contains the string of lowercase letters that Farmer John heard Bessie say. This string has length at least <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>1</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$1$</span></mjx-container> and at most <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>1000</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$1000$</span></mjx-container>.</p>

### 출력 

 <p>Print the minimum number of times Bessie must have hummed the entire cowphabet.</p>

