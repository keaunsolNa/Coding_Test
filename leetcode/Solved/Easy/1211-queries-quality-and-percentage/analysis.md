# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 21. 오후 4:03:04 |
| Language | mysql |
| Runtime | 67 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/queries-quality-and-percentage/submissions/)

## Code Review

코드 리뷰를 다음과 같이 진행하겠습니다.

1. **시간 복잡도**: 이 쿼리의 시간 복잡도는 O(n^2)입니다. 이는 서브쿼리에서 각 query_name에 대해 다시 Queries 테이블을 스캔하기 때문입니다. 서브쿼리는 각 query_name에 대해 실행되므로, 전체 쿼리의 시간 복잡도는 n개의 query_name에 대해 n번의 스캔을 수행하는 것과 같습니다.

2. **공간 복잡도**: 이 쿼리의 공간 복잡도는 O(n)입니다. 이는 쿼리 결과를 저장하기 위해 필요한 공간이 입력 데이터의 크기와 비례하기 때문입니다. 쿼리 결과는 각 query_name에 대한 quality와 poor_query_percentage를 포함하므로, 결과 집합의 크기는 입력 데이터의 크기와 비례합니다.

3. **풀이 접근법**: 이 쿼리에서는 집계 함수(SUM, COUNT)와 서브쿼리를 사용하여 quality와 poor_query_percentage를 계산합니다. 이는 관계형 데이터베이스에서 데이터를 집계하고 분석하는 일반적인 패턴입니다. 서브쿼리는 각 query_name에 대해 poor_query_percentage를 계산하는 데 사용됩니다.

4. **잘된 점**: 이 쿼리는 문제의 요구 사항을 명확하게 이해하고, 필요한 데이터를 효과적으로 추출하고 있습니다. 또한, ROUND 함수를 사용하여 quality를 소수점 2자리까지 반올림하여 결과를 깔끔하게 표시합니다.

5. **개선 사항**: 이 쿼리의 성능을 개선하기 위해, 서브쿼리를 JOIN으로 대체할 수 있습니다. 이는 서브쿼리가 각 query_name에 대해 다시 Queries 테이블을 스캔하는 것을 피할 수 있기 때문입니다. 예를 들어, 다음과 같이 JOIN을 사용하여 poor_query_percentage를 계산할 수 있습니다.
```mysql
SELECT T1.query_name
     , ROUND((SUM(T1.rating / T1.position)) / COUNT(T1.query_name), 2) as quality
     , (SUM(IF(T1.rating < 3, 1, 0)) / COUNT(T1.query_name)) * 100 as poor_query_percentage
  FROM Queries T1
 GROUP BY T1.query_name
```
이렇게 JOIN을 사용하면 쿼리의 시간 복잡도를 O(n)으로 개선할 수 있습니다.
