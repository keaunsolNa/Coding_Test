# [Bronze II] Personnummer - 21355 

[문제 링크](https://www.acmicpc.net/problem/21355) 

### 성능 요약

메모리: 16308 KB, 시간: 164 ms

### 분류

많은 조건 분기, 파싱, 문자열

### 제출 일자

2024년 6월 8일 23:39:07

### 문제 설명

<p>Svenska personnummer skrivs oftast med tio siffror på formatet <code>ÅÅMMDD-XXXX</code>. De sex första siffrorna utgör personens födelsedatum, så en person med personnummer 781113-3285 är t.ex. född den 13:e november 1978. En detalj som många inte känner till är att hundraplussare får ett plustecken istället för bindestreck i sitt personnummer. Detta är för att man inte ska blanda ihop dem med personer som föddes exakt <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>100</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$100$</span></mjx-container> år senare. Till exempel kan någon som föddes år 1912 ha personnummret 121212+1212, medan 121212-1212 tillhör någon som föddes 2012. </p>

<p>Skriv ett program som läser in ett personnummer på formatet ovan, och skriver ut det på <em>tolvsiffrigt</em> format, d.v.s. <code>ÅÅÅÅMMDDXXXX</code>. Du kan anta att personerna i indatan föddes mellan 1840 och 2019. För enkelhets skull kommer det inte heller finnas några personer som föddes 1920. </p>

### 입력 

 <p>En sträng bestående av siffror, bindestreck och plustecken, på formatet ovan.</p>

### 출력 

 <p>Skriv ut en sträng, personnumret i indatan omvandlat till tolvsiffrigt format.</p>

