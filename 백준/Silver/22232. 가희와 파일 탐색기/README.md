# [Silver III] 가희와 파일 탐색기 - 22232 

[문제 링크](https://www.acmicpc.net/problem/22232) 

### 성능 요약

메모리: 356756 KB, 시간: 2444 ms

### 분류

자료 구조, 정렬

### 제출 일자

2024년 1월 1일 18:44:14

### 문제 설명

<p>가희는 <em>jo_test</em> 폴더에 들어와 있습니다. 가희는 <em>jo_test</em>에 있는 파일 <em>N</em>개를 아래 기준에 따라 정렬하려고 합니다.</p>

<ol>
	<li>파일명 (<em>FILENAME</em>) 사전순으로</li>
	<li>파일명 (<em>FILENAME</em>)이 같다면 가희가 설치한 OS에서 인식하는 확장자가 붙은 것이 먼저 나오게</li>
	<li>1과 2로도 순서를 결정할 수 없다면, 파일 확장자 (<em>EXTENSION</em>) 사전 순으로</li>
</ol>

<p>파일 <em>N</em>개를 문제에서 설명하는 정렬 기준에 따라 정렬해 주세요. 사전순의 기준은 아스키 코드 순입니다.</p>

### 입력 

 <p>첫 번째 줄에 jo_test 폴더에 있는 파일 개수 <em>N</em>과 가희가 설치한 OS에서 인식하는 파일 확장자의 개수 <em>M</em>이 공백으로 구분되어 주어집니다.</p>

<p>2번째 줄부터 <em>N+1</em>번째 줄까지 <em>FILENAME</em>.<em>EXTENSION </em>형식의 문자열이 주어집니다. <strong>여기서 .은 온점을 의미합니다.</strong></p>

<p><em>FILENAME</em>은 소문자와 숫자로만, <em>EXTENSION</em>은 소문자로만 이루어져 있습니다.</p>

<p>그 다음 줄 부터 <strong>가희가 설치한 OS에서 인식하는</strong> 파일 확장자 (<em>EXTENSION</em>) <em>M</em>개가 주어집니다.</p>

### 출력 

 <p>기준에 따라 정렬된 결과를 출력해 주세요.</p>

