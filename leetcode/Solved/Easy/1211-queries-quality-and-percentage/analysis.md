# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 21. 오후 4:01:12 |
| Language | mysql |
| Runtime | 68 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/queries-quality-and-percentage/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n^2) - 서브쿼리 내에서 GROUP BY와 HAVING 절을 사용하여 데이터를 처리하는 시간이 증가합니다. 또한, outer query에서도 GROUP BY를 사용하여 데이터를 처리하기 때문에 시간 복잡도가 증가합니다.
2. **공간 복잡도**: O(n) - 쿼리 결과를 저장하기 위한 공간이 필요합니다. GROUP BY와 HAVING 절을 사용하여 데이터를 처리하기 때문에 공간 복잡도가 증가합니다.
3. **풀이 접근법**: 이 풀이에서는 서브쿼리와 GROUP BY, HAVING 절을 사용하여 데이터를 처리합니다. 이는 데이터를 집계하고 필터링하는 데 사용되는 일반적인 패턴입니다. 그러나 서브쿼리가 outer query의 각 행에 대해 실행되기 때문에 성능이 저하될 수 있습니다.
4. **잘된 점**: 코드는 문제의 요구 사항을 충족하고, 데이터를 처리하는 데 필요한 로직을 포함합니다. 또한, ROUND 함수를 사용하여 결과를 소수점 2자리까지 반올림하는 등 코드의 가독성이 좋습니다.
5. **개선 사항**: 서브쿼리를 JOIN으로 대체하여 성능을 개선할 수 있습니다. 또한, 인덱스를 생성하여 데이터를 더 효율적으로 처리할 수 있습니다. 예를 들어, query_name列에 인덱스를 생성하여 GROUP BY와 HAVING 절의 성능을 개선할 수 있습니다. 또한, 서브쿼리 대신에 WINDOW 함수를 사용하여 데이터를 처리할 수 있습니다. 이는 성능을 개선하고 코드의 가독성을 높일 수 있습니다. 

예를 들어, 다음과 같이 JOIN을 사용하여 서브쿼리를 대체할 수 있습니다.

```mysql
SELECT Q1.query_name
     , ROUND((SUM(Q1.rating / Q1.position)) / COUNT(Q1.query_name), 2) as quality
     , Q2.bad_query_count / COUNT(Q1.query_name) as percentage
FROM Queries Q1
JOIN (
  SELECT query_name, COUNT(*) as bad_query_count
  FROM Queries
  WHERE rating < 3
  GROUP BY query_name
) Q2 ON Q1.query_name = Q2.query_name
GROUP BY Q1.query_name, Q2.bad_query_count
```
