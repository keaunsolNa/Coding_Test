# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 14. 오후 5:23:00 |
| Language | oraclesql |
| Runtime | 330 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/top-travellers/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n log n) - 이 쿼리는 JOIN 연산과 GROUP BY, ORDER BY를 포함하고 있습니다. JOIN 연산의 시간 복잡도는 일반적으로 O(n^2)이나, 데이터베이스의 인덱싱과 최적화에 따라 O(n log n)까지 개선될 수 있습니다. GROUP BY와 ORDER BY 연산은 각각 O(n log n)의 시간 복잡도를 가집니다. 따라서 전체 쿼리의 시간 복잡도는 O(n log n)입니다.

2. **공간 복잡도**: O(n) - 쿼리 결과는 사용자 이름과 이동 거리를 포함하는 테이블로, 최대 n개의 행을 가질 수 있습니다. 따라서 공간 복잡도는 O(n)입니다.

3. **풀이 접근법**: 이 쿼리는 JOIN, GROUP BY, SUM, ORDER BY를 사용하여 문제를 해결합니다. 사용된 알고리즘은 기본적으로 관계형 데이터베이스의 집계 함수와 정렬을 활용한 것입니다. JOIN을 통해 사용자 정보와 이동 기록을 연결하고, GROUP BY를 통해 사용자별로 이동 거리를 집계하며, ORDER BY를 통해 결과를 정렬합니다.

4. **잘된 점**: 코드는 간결하고, 문제를 명확하게 해결합니다. NVL 함수를 사용하여 NULL 값을 0으로 대체하는 것은 좋은 접근법입니다. 또한, ORDER BY 절에서 travelled_distance와 name을 모두 고려하여 결과를 정렬하는 것은 문제의 요구 사항을满족합니다.

5. **개선 사항**: JOIN을 명시적으로 지정하여 코드의 가독성을 높일 수 있습니다. 예를 들어, `FROM USERS T1 INNER JOIN RIDES T2 ON T1.id = T2.user_id`와 같이 JOIN 조건을 명시적으로 지정할 수 있습니다. 또한, 인덱스를 생성하여 JOIN과 ORDER BY 연산의 성능을 개선할 수 있습니다. 그러나, 이러한 최적화는 데이터베이스의 특성과 데이터 분포에 따라 달라질 수 있습니다.
