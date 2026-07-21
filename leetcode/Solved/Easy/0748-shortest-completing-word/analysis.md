# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 21. 오후 3:32:44 |
| Language | java |
| Runtime | 22 ms (Beats 7.4%) |
| Memory | 47.8 MB (Beats 5.3%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/shortest-completing-word/submissions/)

## Code Review

**코드 리뷰**

1. **시간 복잡도**: O(n*m) - 여기서 n은 단어의 개수, m은 단어의 평균 길이입니다. licensePlate의 문자열 처리와 단어의 반복문 처리로 인해 시간 복잡도가 증가합니다.
2. **공간 복잡도**: O(n*m) - licensePlate와 각 단어의 문자열을 처리하기 위한 HashMap과 TreeMap을 사용하여 공간 복잡도가 증가합니다.
3. **풀이 접근법**: 해시 맵(HashMap)을 사용하여 각 문자의 빈도수를 계산하고, TreeMap을 사용하여 단어의 길이를 기준으로 정렬합니다. 이 접근법은 문제를 효율적으로 해결할 수 있습니다.
4. **잘된 점**: 코드는 문제를 명확하게 이해하고, 해시 맵을 사용하여 문자의 빈도수를 계산하는 부분이 잘 구현되어 있습니다. 또한, TreeMap을 사용하여 단어의 길이를 기준으로 정렬하는 부분도 잘 구현되어 있습니다.
5. **개선 사항**: licensePlate의 문자열 처리 부분에서 정규식을 사용하여 공백과 숫자를 제거하는 부분이 있습니다. 이 부분을 따로 분리하여 함수로 만들면 코드의 가독성이提高될 것입니다. 또한, 변수명이 조금 더 명확하게 변경되어도 좋을 것입니다. 예를 들어, `word` 변수를 `licensePlateText`로 변경하여 변수의 목적을 명확하게 나타낼 수 있습니다.
