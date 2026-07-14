# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 14. 오후 5:16:31 |
| Language | oraclesql |
| Runtime | 429 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/top-travellers/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n log n) - 이 쿼리는 사용자와 승차 기록을 조인하고, 그룹화하고, 정렬하는 작업을 수행합니다. 이러한 작업은 일반적으로 O(n log n)의 시간 복잡도를 가집니다. 여기서 n은 데이터의 크기를 나타냅니다.

2. **공간 복잡도**: O(n) - 쿼리 결과는 사용자 이름과 이동 거리를 포함하는 테이블을 반환합니다. 이러한 결과는 메모리에서 저장되므로 공간 복잡도는 O(n)입니다.

3. **풀이 접근법**: 이 쿼리는 사용자와 승차 기록을 조인하고, 그룹화하고, 정렬하는 작업을 수행합니다. 이는 관계형 데이터베이스에서 데이터를 집계하고 분석하는 일반적인 패턴입니다. 사용된 알고리즘은 기본적으로 SQL의 집계 함수와 정렬 기능을 활용한 것입니다.

4. **잘된 점**: 코드는 간결하고, 읽기 쉽습니다. 또한 필요한 컬럼만을 선택하여 데이터를 효율적으로 처리하고 있습니다. NVL 함수를 사용하여 NULL 값을 0으로 대체하는 것도 좋은 접근법입니다.

5. **개선 사항**: 현재 쿼리는 오라클의 구식 조인 문법을 사용하고 있습니다. 최신의 조인 문법을 사용하여 코드를 개선할 수 있습니다. 예를 들어, 다음과 같이 수정할 수 있습니다.
```oraclesql
SELECT T1.name
     , COALESCE(SUM(T2.distance), 0) AS travelled_distance 
  FROM USERS T1
  LEFT JOIN RIDES T2 ON T1.id = T2.user_id
 GROUP BY T1.name
 ORDER BY travelled_distance DESC, name
```
이렇게 수정하면 코드가 더 현대적이고 가독성이 향상됩니다.
