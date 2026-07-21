# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 21. 오후 5:32:07 |
| Language | oraclesql |
| Runtime | 432 ms (Beats 53.7%) |
| Memory | 0B (Beats 100.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/queries-quality-and-percentage/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n^2) - 서브쿼리에서 각 query_name에 대해 다시 Queries 테이블을 스캔하기 때문에 n개의 query_name에 대해 n개의 스캔이 발생하여 시간 복잡도가 O(n^2)입니다. 이는 데이터가 많을 경우 성능이 저하될 수 있습니다.

2. **공간 복잡도**: O(n) - 결과를 저장하기 위해 n개의 query_name에 대한 공간이 필요합니다. 또한, 서브쿼리에서 임시 결과를 저장하기 위해 추가적인 공간이 필요할 수 있습니다.

3. **풀이 접근법**: 이 풀이에서는 각 query_name에 대해 quality와 poor_query_percentage를 계산하기 위해 집계 함수(SUM, COUNT)와 서브쿼리를 사용했습니다. 서브쿼리는 rating이 3 미만인 query_name의 개수를 계산하기 위해 사용되었습니다.

4. **잘된 점**: 코드는 문제의 요구 사항을 명확하게 이해하고, 필요한 집계 함수와 서브쿼리를 사용하여 문제를 해결했습니다. 또한, NVL 함수를 사용하여 NULL 값을 0으로 대체하여 결과를 더 깔끔하게 만들었습니다.

5. **개선 사항**: 서브쿼리를 JOIN으로 대체하여 시간 복잡도를 개선할 수 있습니다. 예를 들어, 다음과 같이 JOIN을 사용하여 poor_query_percentage를 계산할 수 있습니다.
```oraclesql
SELECT query_name
     , NVL(ROUND((SUM(rating / position)) / COUNT(query_name), 2), 0) as quality
     , NVL(ROUND((SUM(CASE WHEN rating < 3 THEN 1 ELSE 0 END)) / COUNT(query_name) * 100, 2), 0) as poor_query_percentage
  FROM Queries
 GROUP BY query_name
```
이렇게 JOIN을 사용하면 시간 복잡도를 O(n)으로 개선할 수 있습니다.
