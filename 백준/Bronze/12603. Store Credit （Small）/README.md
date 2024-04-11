# [Bronze II] Store Credit (Small) - 12603 

[문제 링크](https://www.acmicpc.net/problem/12603) 

### 성능 요약

메모리: 14036 KB, 시간: 116 ms

### 분류

브루트포스 알고리즘, 구현

### 제출 일자

2024년 4월 12일 08:46:59

### 문제 설명

<p>You receive a credit <code>C</code> at a local store and would like to buy two items. You first walk through the store and create a list <code>L</code> of all available items. From this list you would like to buy two items that add up to the entire value of the credit. The solution you provide will consist of the two integers indicating the positions of the items in your list (smaller number first).</p>

### 입력 

 <p>The first line of input gives the number of cases, <strong>N</strong>. <strong>N</strong> test cases follow. For each test case there will be:</p>

<ul>
	<li>One line containing the value <strong>C</strong>, the amount of credit you have at the store.</li>
	<li>One line containing the value <strong>I</strong>, the number of items in the store.</li>
	<li>One line containing a space separated list of <strong>I</strong> integers. Each integer <strong>P</strong> indicates the price of an item in the store.</li>
	<li>Each test case will have exactly one solution.</li>
</ul>

<p>Limits</p>

<ul>
	<li>5 ≤ <strong>C</strong> ≤ 1000</li>
	<li>1 ≤ <strong>P</strong> ≤ 1000</li>
	<li><strong>N</strong> = 10</li>
	<li>3 ≤ <strong>I</strong> ≤ 100</li>
</ul>

### 출력 

 <p>For each test case, output one line containing "Case #<strong>x</strong>: " followed by the indices of the two items whose price adds up to the store credit. The lower index should be output first.</p>

