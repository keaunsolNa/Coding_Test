# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 21. 오후 3:56:09 |
| Language | mysql |
| Runtime | 67 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/queries-quality-and-percentage/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 Queries 테이블의 모든 행을 스캔해야 하므로 시간 복잡도는 데이터의 크기(n)에 비례합니다. 그러나 SUM 함수와 GROUP BY 절이 함께 사용되므로 실제 시간 복잡도는 O(n log n)으로 증가할 수 있습니다.

2. **공간 복잡도**: O(n) - 쿼리는 중간 결과를 저장하기 위해 임시 테이블을 사용할 수 있으므로 공간 복잡도도 데이터의 크기(n)에 비례합니다.

3. **풀이 접근법**: 이 쿼리는 집계 함수(SUM)와 그룹화(GROUP BY)를 사용하여 각 query_name에 대한 평균 rating/position을 계산합니다. 그러나 현재 쿼리는 SUM 함수의 인자로 query_name을 사용하고 있습니다. 이는 SUM 함수의 인자로 숫자 타입의 열을 사용해야 하므로 올바르지 않습니다.

4. **잘된 점**: 쿼리는 간단하고 읽기 쉽습니다. 또한 필요한 열만 선택하여 불필요한 데이터 전송을 피하고 있습니다.

5. **개선 사항**: SUM 함수의 인자로 rating 또는 position을 사용해야 합니다. 또한 rating과 position이 0이 아닌지 확인해야 합니다. 예를 들어, 다음과 같이 수정할 수 있습니다.
```mysql
SELECT query_name
     , AVG(rating / position) AS quality
FROM Queries
GROUP BY query_name
HAVING AVG(position) > 0;
```
이 쿼리는 각 query_name에 대한 평균 rating/position을 계산하고, position의 평균이 0보다 큰 경우에만 결과를 반환합니다.
