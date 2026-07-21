# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 21. 오후 4:03:24 |
| Language | mysql |
| Runtime | 73 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/queries-quality-and-percentage/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: 이 쿼리의 시간 복잡도는 O(n^2)입니다. 이유는 서브쿼리에서 각 query_name에 대해 다시 Queries 테이블을 스캔하기 때문입니다. 서브쿼리는 outer 쿼리에서 각 row에 대해 실행되므로, 전체 시간 복잡도가 증가합니다.

2. **공간 복잡도**: 이 쿼리의 공간 복잡도는 O(n)입니다. 이유는 쿼리 결과를 저장하기 위해 필요한 공간이 입력 데이터의 크기에 비례하기 때문입니다.

3. **풀이 접근법**: 이 쿼리에서는 집계 함수(SUM, COUNT)와 서브쿼리를 사용하여 quality와 poor_query_percentage를 계산합니다. 또한 ROUND 함수를 사용하여 결과를 소수점 둘째 자리까지 반올림합니다.

4. **잘된 점**: 이 쿼리는 문제의 요구 사항을 정확하게 구현했습니다. 또한 ROUND 함수를 사용하여 결과를 정리했으며, query_name을 그룹화하여 각 query_name에 대한 quality와 poor_query_percentage를 계산했습니다.

5. **개선 사항**: 쿼리의 성능을 개선하기 위해 서브쿼리를 JOIN으로 대체할 수 있습니다. 또한, 인덱스를 생성하여 쿼리 성능을 개선할 수 있습니다. 예를 들어, query_name과 rating에 인덱스를 생성하면 쿼리 성능이 개선될 수 있습니다. 또한, 서브쿼리 대신에 JOIN과 조건문을 사용하여 poor_query_percentage를 계산할 수 있습니다. 예를 들어, 다음과 같이 수정할 수 있습니다.
```mysql
SELECT T1.query_name
     , ROUND((SUM(T1.rating / T1.position)) / COUNT(T1.query_name), 2) as quality
     , ROUND((SUM(IF(T1.rating < 3, 1, 0)) / COUNT(T1.query_name)) * 100, 2) as poor_query_percentage
  FROM Queries T1
 GROUP BY T1.query_name
```
이 수정된 쿼리는 서브쿼리 없이 poor_query_percentage를 계산하며, 성능이 개선될 수 있습니다.
