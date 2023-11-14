# [Bronze III] Hurricane Warning - 30266 

[문제 링크](https://www.acmicpc.net/problem/30266) 

### 성능 요약

메모리: 81228 KB, 시간: 396 ms

### 분류

브루트포스 알고리즘, 구현, 문자열

### 제출 일자

2023년 11월 15일 08:57:13

### 문제 설명

<p>In the runup to a hurricane, it is extremely important to warn as many people as possible on or near the hurricane’s path. That way, they can ideally travel somewhere safer, reinforce their homes, and — if they have to stay — stock up on essentials, install backup power systems, etc. The question is then how you reach as many people as possible. If you make announcements on TV, then people who don’t watch TV may miss the warnings and instructions. Here, you will be given a description of which media different people consume, and which media the authorities are using for their warnings, and are to determine how many people received the warning.</p>

<p>Specifically, this information will be encoded as strings of letters. Each letter corresponds to one type of media, such as ‘T’ for TV, ‘F’ for Fakebook, or ‘X’ for ex-Twitter. If there is a common letter between the string for the media used and the media consumed, then the person will be informed; otherwise not.</p>

### 입력 

 <p>The first line contains a number 1 ≤ K ≤ 100, which is the number of input data sets in the file. This is followed by K data sets of the following form:</p>

<p>The first line of a data set contains an integer 0 ≤ n ≤ 10000, the number of people we are considering.</p>

<p>The next line is a string of 1–10 upper-case letters (no other symbols will occur), describing the media used to announce the hurricane. This is followed by n lines, each of 1–10 upper-case letters (again, no other symbols); line i gives the media consumed by person i.</p>

### 출력 

 <p>For each data set, first output “Data Set x:” on a line by itself, where x is its number. Then output the number of people who received the hurricane warning (through at least one type of media).</p>

<p>Each data set should be followed by a blank line.</p>

