# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 14. 오후 5:12:38 |
| Language | oraclesql |
| Runtime | 263 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/top-travellers/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n log n) - 이 쿼리는 JOIN 연산과 GROUP BY 연산을 수행하며, ORDER BY 연산도 수행합니다. JOIN 연산의 시간 복잡도는 일반적으로 O(n^2)이나, 데이터베이스의 인덱스와 최적화에 따라 O(n log n)까지 개선될 수 있습니다. GROUP BY와 ORDER BY 연산은 일반적으로 O(n log n)의 시간 복잡도를 가집니다.

2. **공간 복잡도**: O(n) - 쿼리 결과를 저장하기 위한 공간이 필요하며, 결과의 크기는 입력 데이터의 크기에 비례합니다.

3. **풀이 접근법**: 이 쿼리는 JOIN, GROUP BY, SUM, ORDER BY와 같은 기본적인 SQL 연산을 사용하여 문제를 해결합니다. 사용된 알고리즘은 관계형 데이터베이스의 기본적인 쿼리 처리 알고리즘입니다.

4. **잘된 점**: 코드는 간결하고, 문제를 명확하게 해결합니다. JOIN과 GROUP BY를 사용하여 데이터를 처리하는 방식이 적절합니다. 또한, ORDER BY를 사용하여 결과를 정렬하는 방식도 적절합니다.

5. **개선 사항**: 현재 쿼리는 INNER JOIN을 사용하고 있습니다. 만약 USERS 테이블에 RIDES 테이블에 없는 사용자가 있다면, 해당 사용자는 결과에 포함되지 않습니다. OUTER JOIN을 사용하여 이러한 사용자도 결과에 포함할 수 있습니다. 또한, 인덱스를 생성하여 JOIN과 ORDER BY 연산의 성능을 개선할 수 있습니다. 예를 들어, USERS 테이블의 id 열과 RIDES 테이블의 user_id 열에 인덱스를 생성할 수 있습니다.
