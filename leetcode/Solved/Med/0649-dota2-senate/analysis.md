# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 14. 오후 3:25:29 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.5 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/dota2-senate/submissions/)

## Code Review

LeetCode 솔루션 코드 리뷰입니다.

1. **시간 복잡도**: O(n), 여기서 n은 senate 문자열의 길이입니다. while 반복문이 senate 문자열의 길이만큼 실행되며, 각 반복에서 deque의 poll과 offer 연산이 수행됩니다. deque 연산의 시간 복잡도는 O(1)입니다.

2. **공간 복잡도**: O(n), 여기서 n은 senate 문자열의 길이입니다. radiantQueue와 direQueue에 senate 문자열의 모든 인덱스가 저장될 수 있으므로, 최악의 경우 deque의 크기는 n이 됩니다.

3. **풀이 접근법**: 이 문제는 큐를 사용한 그리디 알고리즘으로 해결됩니다. 각 파티의 원소들을 큐에 저장하고, 큐에서 원소를 꺼내서 비교하여 승리한 파티의 원소를 다시 큐에 저장하는 방식으로 해결됩니다.

4. **잘된 점**: 코드는 간결하고, 문제의 요구사항을 정확하게 구현했습니다. deque를 사용하여 큐를 구현하여 효율적인 연산을 수행했습니다.

5. **개선 사항**: 코드는 이미 효율적이지만, 변수명과 주석을 추가하여 코드의 가독성을 높일 수 있습니다. 예를 들어, radiantQueue와 direQueue의 변수명을 moreDescriptiveVariableName으로 변경하여 변수의 역할을 명확하게 나타낼 수 있습니다. 또한, while 반복문의 조건과 내부 로직에 대한 주석을 추가하여 코드의 흐름을 이해하기 쉽게 만들 수 있습니다.
