# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 14. 오전 10:47:45 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.6 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/pascals-triangle/submissions/)

## Code Review

pascals-triangle 문제의 Java 솔루션을 검토한 결과 다음과 같은 내용을 확인했습니다.

1. **시간 복잡도**: O(n^2) - 파스칼의 삼각형을 생성하기 위해 2중 반복문을 사용하여 각 행을 계산하는 데 필요한 시간이 행의 수에 비례하여 증가합니다. outer loop는 `numRows`만큼 반복되고, inner loop는 이전 행의 크기만큼 반복되기 때문입니다.

2. **공간 복잡도**: O(n^2) - 파스칼의 삼각형을 저장하기 위해 사용되는 공간이 행의 수와 각 행의 원소 수에 비례하여 증가합니다. 따라서 공간 복잡도도 O(n^2)입니다.

3. **풀이 접근법**: 동적 프로그래밍(Dynamic Programming) 알고리즘을 사용하여 파스칼의 삼각형을 생성했습니다. 이전 행의 값을 사용하여 다음 행을 계산하는 방식으로, 이 접근법은 문제의 특성을 잘 활용하고 있습니다.

4. **잘된 점**: 코드는 비교적 간결하고, 각 행을 계산하는 로직이 명확하게 구현되어 있습니다. 또한, 초기 조건을 체크하여 numRows가 1이나 2일 때를 별도로 처리하여 코드의 효율성을 높였습니다.

5. **개선 사항**: 코드는 이미 비교적 효율적이지만, 변수 이름을 더 의미 있게 변경하여 코드의 가독성을 높일 수 있습니다. 예를 들어, `list`를 `triangle`로, `first`와 `second`를 `firstRow`와 `secondRow`로 변경할 수 있습니다. 또한, 주석을 추가하여 코드의 로직을 설명하면 코드의 이해도를 높일 수 있습니다.
