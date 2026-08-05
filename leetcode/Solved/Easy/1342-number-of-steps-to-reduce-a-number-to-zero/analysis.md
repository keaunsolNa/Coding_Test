# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 5. 오후 5:44:18 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.3 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(log N)입니다. while문은 num이 0이 될 때까지 반복되며, num은 매 반복마다 최대 2로 나누어지거나 1만큼 감소합니다. 따라서 반복 횟수는 num의 비트 수에 비례합니다.

2. **공간 복잡도**: O(1)입니다. 코드는 상수 공간만 사용하며, 입력 크기에 따라 동적으로 할당되는 공간은 없습니다.

3. **풀이 접근법**: 코드는 비트 조작 알고리즘을 사용하여 num을 0으로 만드는 최소 단계 수를 계산합니다. num이 짝수일 경우 2로 나누고, 홀수일 경우 1을 뺍니다. 이 과정은 num이 0이 될 때까지 반복됩니다.

4. **잘된 점**: 코드는 간결하고 읽기 쉽습니다. 변수 이름이 의미 있게 사용되었으며, while문 조건과 반복 로직이 명확하게 구현되어 있습니다.

5. **개선 사항**: 코드는 이미 최적화되어 있지만, 변수 이름을 더 자세하게 바꾸거나 주석을 추가하여 코드의 의도를 더 명확하게 할 수 있습니다. 예를 들어, 'ans' 변수를 'stepCount'로 바꾸거나, while문에 num이 0이 될 때까지 반복되는 이유에 대한 주석을 추가할 수 있습니다.
