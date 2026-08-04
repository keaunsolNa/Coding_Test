# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 4. 오후 5:20:26 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.9 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/find-words-containing-character/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n*m) - 여기서 n은 단어의 개수, m은 평균 단어 길이입니다. indexOf 메서드는 문자열을 순회하기 때문에 O(m)의 시간 복잡도를 가지며, 이는 단어의 개수(n)만큼 반복되므로 전체 시간 복잡도는 O(n*m)입니다.

2. **공간 복잡도**: O(n) - 결과를 저장하는 리스트의 크기는 최대 단어의 개수(n)만큼 커질 수 있습니다. 따라서 공간 복잡도는 O(n)입니다.

3. **풀이 접근법**: 이 코드는 단순한 순회와 문자열 검색을 사용합니다. 각 단어를 순회하면서 indexOf 메서드를 사용하여 특정 문자가 포함되는지 확인합니다. 이는 선형 검색 알고리즘의 기본적인 형태입니다.

4. **잘된 점**: 코드는 비교적 간결하고, 문제의 요구 사항을 명확하게 이해하여 구현했습니다. 또한, 결과를 저장하는 리스트를 사용하여 문제의 요구에 맞게 반환값을 구성했습니다.

5. **개선 사항**: 문자열에 특정 문자가 포함되어 있는지 확인하는 부분에서 String의 contains 메서드를 사용할 수 있습니다. 이는 코드를 더 간결하게 만들 수 있습니다. 예를 들어, `if (str.indexOf(x + "") != -1)` 대신 `if (str.contains(String.valueOf(x)))`를 사용할 수 있습니다. 또한, enhanced for loop를 사용하여 코드를 더 읽기 쉽게 만들 수 있습니다. 예를 들어, `for (String str : words)`를 사용하여 배열의 각 요소를 순회할 수 있습니다.
