# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 28. 오후 5:47:13 |
| Language | mysql |
| Runtime | 119 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/nth-highest-salary/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n log n) - 이 쿼리는 Employee 테이블의 모든 행을 정렬해야 하므로, 시간 복잡도는 정렬 알고리즘의 복잡도인 O(n log n)입니다. 여기서 n은 Employee 테이블의 행 수입니다.

2. **공간 복잡도**: O(n) - 쿼리는 Employee 테이블의 모든 행을 임시로 정렬해야 하므로, 공간 복잡도는 O(n)입니다. 여기서 n은 Employee 테이블의 행 수입니다.

3. **풀이 접근법**: 이 코드는 LIMIT와 OFFSET를 사용하여 N번째로 높은 급여를 찾는 접근법을 사용했습니다. 이는 MySQL에서 제공하는 기능을 활용하여 효율적으로 문제를 해결했습니다. 사용된 알고리즘은 기본적으로 정렬 알고리즘입니다.

4. **잘된 점**: 코드는 간결하고, 문제를 명확하게 해결했습니다. 또한, LIMIT와 OFFSET를 사용하여 효율적으로 N번째로 높은 급여를 찾았습니다.

5. **개선 사항**: 이 코드는 이미 효율적으로 작성되어 있지만, 테이블이非常 크거나, N의 값이非常 크면, 성능이 저하될 수 있습니다. 이런 경우, 다른 접근법을 사용할 수 있습니다. 예를 들어, 급여를 인덱스로 설정하여 정렬을 피할 수 있습니다. 또한, WINDOW 함수를 사용하여 더 효율적으로 문제를 해결할 수 있습니다. 하지만, 이러한 접근법은 MySQL 버전에 따라 지원 여부가 다를 수 있습니다.
