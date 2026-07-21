# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 21. 오후 4:02:06 |
| Language | mysql |
| Runtime | 143 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/queries-quality-and-percentage/submissions/)

## Code Review

코드 리뷰를 진행하겠습니다.

1. **시간 복잡도**: 이 쿼리의 시간 복잡도는 O(n^2)입니다. 이유는 서브쿼리에서 각 query_name에 대해 rating < 3인 행의 개수를 계산하기 때문입니다. 이로 인해 전체 쿼리의 수행 시간이 데이터의 크기에 비례하여 증가합니다.

2. **공간 복잡도**: 이 쿼리의 공간 복잡도는 O(n)입니다. 이유는 쿼리 결과를 저장하기 위해 필요한 메모리 공간이 데이터의 크기에 비례하여 증가하기 때문입니다.

3. **풀이 접근법**: 이 쿼리에서는 집계 함수(SUM, COUNT)와 서브쿼리를 사용하여 질의 이름별 품질과 부적절한 질의 비율을 계산합니다. 또한 ROUND 함수를 사용하여 품질을 소수점 2자리까지 반올림합니다.

4. **잘된 점**: 이 쿼리는 문제의 요구 사항을 명확하게 이해하고, 필요한 데이터를 정확하게 계산하고 있습니다. 또한 ROUND 함수를 사용하여 결과를 깔끔하게 표시하고 있습니다.

5. **개선 사항**: 이 쿼리의 성능을 개선하기 위해 서브쿼리를 JOIN으로 대체할 수 있습니다. 또한, rating < 3인 행의 개수를 계산하는 부분을 별도의 테이블이나 임시 결과로 계산하여 재사용할 수 있습니다. 예를 들어, 다음과 같이 수정할 수 있습니다.
```mysql
SELECT Q1.query_name
     , ROUND((SUM(Q1.rating / Q1.position)) / COUNT(Q1.query_name), 2) as quality
     , (Q2.poor_count / COUNT(Q1.query_name)) * 100 as poor_query_percentage
  FROM Queries Q1
  LEFT JOIN (
    SELECT query_name, COUNT(*) as poor_count
    FROM Queries
    WHERE rating < 3
    GROUP BY query_name
  ) Q2
  ON Q1.query_name = Q2.query_name
 GROUP BY Q1.query_name
```
이러한 수정을 통해 쿼리의 성능을 개선하고, 더 효율적인解决책을 제공할 수 있습니다.
