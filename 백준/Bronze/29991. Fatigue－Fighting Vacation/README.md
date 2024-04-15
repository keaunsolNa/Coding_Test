# [Bronze III] Fatigue-Fighting Vacation - 29991 

[문제 링크](https://www.acmicpc.net/problem/29991) 

### 성능 요약

메모리: 16908 KB, 시간: 164 ms

### 분류

구현, 시뮬레이션

### 제출 일자

2024년 4월 15일 12:52:18

### 문제 설명

<p>William is planning his upcoming vacations. A recurring problem when he takes vacations is the need to deal with fatigue. Some days he does not enjoy much, as after several activities, the fatigue becomes greater than what he can deal with.</p>

<p>This time, William had an idea. He will estimate the impact on his disposition for each of the tourism activities. He noticed that some of the vacation activities, such as sports and hikes, are tiring and consume his disposition, while other activities, such as theatre plays and musicals, are invigorating and restore his disposition.</p>

<p>More precisely, William starts with D units of disposition and separates his activities into two groups: C tiring activities and R invigorating activities. Each tiring activity requires a certain amount of disposition and consumes that amount of disposition when performed. Each invigorating activity provides him with a certain amount of disposition when performed. Additionally, he arranges the activities in each group according to his preferences, as there are activities he is more willing to perform. It is important to note that activities from both sets can be interleaved, but William will never do an activity from one group without having done all the previous activities from that group, as this would not conform with his preferences.</p>

<p>Throughout his vacation, when deciding which activity to do next, he will choose the first untaken tiring activity, provided he has enough disposition to do it. Otherwise, he will perform the next untaken invigorating activity, if any remains, replenishing a certain amount of disposition. Naturally, if there are no remaining tiring activities at any point, he can simply perform all the remaining invigorating activities.</p>

<p>Considering this process, William has asked for your help to determine how many activities (including both tiring and invigorating ones) he will be able to perform.</p>

### 입력 

 <p>The first line of input contains three integer numbers, D, C, and, R, representing, respectively, the initial amount of disposition, the number of tiring activities, and the number of invigorating activities (1 ≤ D ≤ 10<sup>5</sup>, 1 ≤ C ≤ 10<sup>4</sup>, and 1 ≤ R ≤ 10<sup>4</sup>). Each of the next C lines contains an integer number C<sub>i</sub> (1 ≤ C<sub>i</sub> ≤ 10<sup>5</sup> for 1 ≤ i ≤ C), representing the required amount of disposition for a tiring activity, in order of preference. Finally, each of the next R lines contains an integer number R<sub>i</sub> (1 ≤ R<sub>i</sub> ≤ 10<sup>5</sup> for 1 ≤ i ≤ R), representing the provided amount of disposition for an invigorating activity, in order of preference.</p>

### 출력 

 <p>Print a single line with a single integer number, the total number of activities (including both tiring and invigorating ones) that William will be able to perform.</p>

