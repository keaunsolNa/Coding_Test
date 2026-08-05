# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 5. 오후 5:44:08 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.3 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(log N)입니다. while문은 num이 0이 될 때까지 반복되며, 각 반복에서 num은 2로 나누어지거나 1만큼 감소합니다. 따라서 반복 횟수는 num의 비트 수에 비례합니다.

2. **공간 복잡도**: O(1)입니다. 코드는 상수 공간만 사용하며, 입력 크기에 따라 공간 사용량이 증가하지 않습니다.

3. **풀이 접근법**: 코드는 비트 조작 알고리즘을 사용하여 숫자를 0으로 줄이는 단계 수를 계산합니다. num이 짝수이면 2로 나누고, 홀수이면 1을 뺍니다. 이 과정을 num이 0이 될 때까지 반복합니다.

4. **잘된 점**: 코드는 간결하고 이해하기 쉽습니다. 변수 이름이 명확하고, 로직이 단순하여 유지 보수가 용이합니다.

5. **개선 사항**: while문의 조건이 잘못되었습니다. 현재 코드는 num이 0일 때만 반복문을 실행하므로, num이 0이 아닌 경우에 대한 처리가 필요합니다. 또한, num이 음수인 경우에 대한 처리도 필요합니다. 이를 개선하기 위해 while문의 조건을 num이 0보다 큰 경우로 변경하고, num이 음수인 경우에 대한 예외 처리를 추가할 수 있습니다. 예를 들어, `while (num > 0)`로 변경하고, `if (num < 0)`인 경우에 대한 처리를 추가할 수 있습니다.
