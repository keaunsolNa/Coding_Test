# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026-05-05 19:05:59 |
| Language | java |
| Runtime | 8 ms (Beats 91.6%) |
| Memory | 45.6 MB (Beats 95.5%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/power-of-three/submissions/)

## Code Review

코드 리뷰를 시작하겠습니다.

1. **시간 복잡도**: Big-O 표기법으로 표현하면 O(1)입니다. 이는 코드에서 상수 시간에 수행되는 연산만 존재하기 때문입니다. maxPowerOf3의 값을 미리 계산하여 저장하고, 단순히 나머지 연산을 수행하기 때문에 시간 복잡도가 일정합니다.

2. **공간 복잡도**: 역시 Big-O 표기법으로 표현하면 O(1)입니다. 코드에서 사용하는 변수의 개수는 일정하기 때문에 공간 복잡도도 일정합니다.

3. **풀이 접근법**: 이 문제는 수학적 속성을 이용하여 풀 수 있습니다. 3의 최대 가능한 지수를 미리 계산하고, 이 값이 주어진 숫자로 나누어 떨이지는지 확인하는 방식을 사용했습니다. 이를 통해 3의 거듭
