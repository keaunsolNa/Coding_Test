# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 21. 오후 3:32:26 |
| Language | java |
| Runtime | 2 ms (Beats 0.0%) |
| Memory | 42.8 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/shortest-completing-word/submissions/)

## Code Review

**코드 리뷰**

1. **시간 복잡도**: O(n*m) - 여기서 n은 단어의 개수, m은 단어의 평균 길이입니다. licensePlate의 문자열 처리와 각 단어의 처리를 위해 두 번의 반복문이 사용되기 때문입니다.
2. **공간 복잡도**: O(n*m) - licensePlate의 문자열과 각 단어를 처리하기 위한 HashMap과 TreeMap이 사용되므로, 공간 복잡도도 비슷한 수준입니다.
3. **풀이 접근법**: 이 문제는 해시 맵을 사용하여 문자열의 빈도수를 계산하는 접근법을 사용했습니다. licensePlate의 문자열을 처리하여 해시 맵에 저장하고, 이후 각 단어를 처리하여 해시 맵에 저장한 후, 두 해시 맵을 비교하여 조건을 만족하는지 확인합니다.
4. **잘된 점**: 코드는 비교적 간결하고, 해시 맵을 사용하여 문자열의 빈도수를 계산하는 부분은 잘 구현되었습니다. 또한, TreeMap을 사용하여 단어의 길이를 기준으로 정렬하는 부분도 잘 구현되었습니다.
5. **개선 사항**: 코드에서 System.out.println을 사용하여 디버깅을 하는 부분이 있습니다. 이는 실제 코드에서는 제거하는 것이 좋습니다. 또한, 변수명이 조금 더 명확하게 지어졌으면 좋았을 것입니다. 예를 들어, 'word' 변수는 'licensePlateString'으로, 'arr' 변수는 'licensePlateArray'로 지어졌으면 좋았을 것입니다. 또한, 코드에서 null 체크를 하는 부분이 있습니다. 이는 Optional 클래스를 사용하여 더 명확하게 할 수 있습니다. 마지막으로, 코드의 주석이 부족합니다. 코드의 각 부분에 주석을 추가하여 코드의 의미를 더 명확하게 할 수 있습니다.
