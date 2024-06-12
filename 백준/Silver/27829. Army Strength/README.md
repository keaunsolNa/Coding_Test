# [Silver V] Army Strength - 27829 

[문제 링크](https://www.acmicpc.net/problem/27829) 

### 성능 요약

메모리: 76752 KB, 시간: 2740 ms

### 분류

그리디 알고리즘, 정렬

### 제출 일자

2024년 6월 12일 12:46:18

### 문제 설명

<p>The next MechaGodzilla invasion is on its way to Earth. And once again, Earth will be the battleground for an epic war.</p>

<p>MechaGodzilla’s army consists of many nasty alien monsters, such as Space Godzilla, King Gidorah, and MechaGodzilla herself.</p>

<p>To stop them and defend Earth, Godzilla and her friends are preparing for the battle. (After this contest, you can visit <a href="http://www.atari.com/godzilla/">http://www.atari.com/godzilla/</a> to find out more about them.)</p>

<p>Each army consists of many different monsters. Each monster has a strength that can be described by a positive integer. (The larger the value, the stronger the monster.)</p>

<p>The war will consist of a series of battles. In each battle, the weakest of all the monsters that are still alive is killed.</p>

<p>If there are several weakest monsters, but all of them in the same army, one of them is killed at random. If both armies have at least one of the weakest monsters, a random weakest monster of MechaGodzilla’s army is killed.</p>

<p>The war is over if in one of the armies all monsters are dead. The dead army lost, the other one won.</p>

<p>You are given the strengths of all the monsters. Find out who wins the war.</p>

### 입력 

 <p>The first line of the input file contains an integer T specifying the number of test cases. Each test case is preceded by a blank line.</p>

<p>Each test case starts with line containing two positive integers N<sub>G</sub> and N<sub>M</sub> – the number of monsters in Godzilla’s and in MechaGodzilla’s army. Two lines follow. The first one contains N<sub>G</sub> positive integers G<sub>i</sub> – the strengths of the monsters in Godzilla’s army. Similarly, the second one contains N<sub>M</sub> positive integers M<sub>i</sub> – the strengths of the monsters in MechaGodzilla’s army.</p>

### 출력 

 <p>For each test case, output a single line with a string that describes the outcome of the battle.</p>

<p>If it is sure that Godzilla’s army wins, output the string “Godzilla”.</p>

<p>If it is sure that MechaGodzilla’s army wins, output the string “MechaGodzilla”.</p>

<p>Otherwise, output the string “uncertain”.</p>

