# [Bronze II] Starship Hakodate-maru - 9151 

[문제 링크](https://www.acmicpc.net/problem/9151) 

### 성능 요약

메모리: 15264 KB, 시간: 264 ms

### 분류

사칙연산, 브루트포스 알고리즘, 수학

### 제출 일자

2024년 5월 24일 12:41:42

### 문제 설명

<p>The surveyor starship Hakodate-maru is famous for her two fuel containers with unbounded capacities. They hold the same type of atomic fuel balls.</p>

<p>There, however, is an inconvenience. The shapes of the fuel containers #1 and #2 are always cubic and regular tetrahedral respectively. Both of the fuel containers should be either empty or filled according to their shapes. Otherwise, the fuel balls become extremely unstable and may explode in the fuel containers. Thus, the number of fuel balls for the container #1 should be a cubic number (n<sup>3</sup> for some n = 0, 1, 2, 3,...) and that for the container #2 should be a tetrahedral number (n(n + 1)(n + 2)/6 for some n = 0, 1, 2, 3,...).</p>

<p>Hakodate-maru is now at the star base Gory okaku preparing for the next mission to create a precise and detailed chart of stars and interstellar matters. Both of the fuel containers are now empty. Commander Parus of Gory okaku will soon send a message to Captain Future of Hakodate-maru on how many fuel balls Gory okaku can supply. Captain Future should quickly answer to Commander Parus on how many fuel balls she requests before her ship leaves Gory okaku. Of course, Captain Future and her officers want as many fuel balls as possible.</p>

<p>For example, consider the case Commander Parus offers 151200 fuel balls. If only the fuel container #1 were available (i.e. if the fuel container #2 were unavailable), at most 148877 fuelballs could be put into the fuel container since 148877 = 53 x 53 x 53 < 151200 < 54 x 54 x 54. If only the fuel container #2 were available, at most 147440 fuel balls could be put into the fuel container since 147440 = 95 x 96 x 97 / 6 < 151200 < 96 x 97 x 98 / 6. Using both of the fuel containers #1 and #2, 151200 fuel balls can be put into the fuel containers since 151200 = 39 x 39 x 39 + 81 x 82 x 83 / 6. In this case, Captain Future's answer should be "151200".</p>

<p>Commander Parus's offer cannot be greater than 151200 because of the capacity of the fuel storages of Gory okaku. Captain Future and her officers know that well.</p>

<p>You are a fuel engineer assigned to Hakodate-maru. Your duty today is to help Captain Future with calculating the number of fuel balls she should request.</p>

### 입력 

 <p>The input is a sequence of at most 1024 positive integers. Each line contains a single integer. The sequence is followed by a zero, which indicates the end of data and should not be treated as input. You may assume that none of the input integers is greater than 151200.</p>

### 출력 

 <p>The output is composed of lines, each containing a single integer. Each output integer should be the greatest integer that is the sum of a nonnegative cubic number and a nonnegative tetrahedral number and that is not greater than the corresponding input number. No other characters should appear in the output.</p>

