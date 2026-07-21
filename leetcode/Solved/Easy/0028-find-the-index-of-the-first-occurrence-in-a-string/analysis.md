# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 21. 오후 12:15:36 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.8 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: indexOf 메서드는 문자열에서 부분 문자열을 찾는 데 사용되며, 이는 선형 탐색을 통해 수행됩니다. 따라서 시간 복잡도는 O(n*m)입니다. 여기서 n은 haystack의 길이, m은 needle의 길이입니다.

2. **공간 복잡도**: indexOf 메서드는 추가적인 공간을 사용하지 않으므로 공간 복잡도는 O(1)입니다.

3. **풀이 접근법**: 이 코드는 자바의 내장 메서드인 indexOf를 사용하여 문자열에서 부분 문자열을 찾는 간단한 알고리즘을 사용합니다. 이는 문자열에서 특정 부분 문자열의 첫 번째 발생 위치를 찾는 문제에 적합한 접근법입니다.

4. **잘된 점**: 코드는 매우 간결하고 읽기 쉽습니다. 또한 자바의 내장 메서드를 사용하여 문제를 효율적으로 해결하고 있습니다.

5. **개선 사항**: 이 문제는 두 개의 포인터를 사용하여 문자열을 비교하는 두 포인터 기법을 사용하여 해결할 수도 있습니다. 그러나 자바의 내장 메서드를 사용하는 것이 더 간결하고 효율적입니다. 따라서 이 코드는 이미 최적화되어 있습니다. 다만, needle이 null인 경우를 처리하는 코드를 추가하여 NullPointerException을 방지할 수 있습니다.
