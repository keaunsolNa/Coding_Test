# [Bronze II] Mountain Ranges - 18041 

[문제 링크](https://www.acmicpc.net/problem/18041) 

### 성능 요약

메모리: 14324 KB, 시간: 148 ms

### 분류

브루트포스 알고리즘, 구현

### 제출 일자

2024년 5월 16일 08:39:18

### 문제 설명

<p>Famous for its mountain ranges, Nlogonia attracts millions of tourists every year. The government has a dedicated budget for continuous maintenance of the hiking trails spread across the country and most of them are filled with scenic viewpoints, accessible through wooden walkways and stairs.</p>

<p>Currently on a trip through Nlogonia and with hopes of going back home with lots of breath-taking pictures, Lola and her husband want to visit as many viewpoints as possible. They plan to hike a different trail each day and explore its viewpoints. However, to avoid being exhausted at the end of the day, if moving from one viewpoint to the next requires going up more than X meters they simply call it a day and go back to their hotel in order to get some rest. Fortunately, every hiking trail in Nlogonia is equipped with modern chairlifts, so the couple can start hiking the trail at any viewpoint they decide. Once the hiking begins the couple only moves towards the peak of the mountain.</p>

<p>To make sure she doesn’t waste a day Lola only wants to hike on trails where she’ll get to a reasonable number of viewpoints. Given the altitudes of the scenic viewpoints on a hiking trail, you must determine the maximum number of viewpoints that the couple can visit.</p>

### 입력 

 <p>The first line contains two integers N (1 ≤ N ≤ 1000) and X (0 ≤ X ≤ 8848), indicating respectively the number of scenic viewpoints on the hiking trail, and the maximum number of meters that Lola and her husband are willing to go up from one viewpoint to the next. The second line contains N integers A<sub>1</sub>, A<sub>2</sub>, . . . , A<sub>N</sub> (1 ≤ A<sub>i</sub> ≤ 8848 for i = 1, 2, . . . , N), where A<sub>i</sub> is the altitude (in meters) of the i-th viewpoint. Viewpoints are given in the order they appear on the hiking trail and their altitudes are non-decreasing, that is, Ai ≤ Ai+1 for i = 1, 2, . . . , N − 1.</p>

### 출력 

 <p>Output a single line with an integer indicating the maximum number of scenic viewpoints that can be visited without going up more than X meters from one viewpoint to the next, and considering that the journey can be started at any viewpoint.</p>

