# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 16. 오전 10:19:11 |
| Language | mysql |
| Runtime | 68 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/reformat-department-table/submissions/)

## Code Review

리뷰 대상 코드는 Department 테이블에서 월별 수익을 조회하는 MySQL 쿼리입니다. 

1. **시간 복잡도**: O(n) - 이 쿼리는 Department 테이블의 모든 행을 스캔하므로 시간 복잡도는 테이블의 행 수에 비례합니다.

2. **공간 복잡도**: O(n) - 쿼리 결과는 원본 테이블의 행 수에 비례하므로 공간 복잡도도 O(n)입니다.

3. **풀이 접근법**: 이 쿼리는 간단한 프로젝션과 필터링을 사용하여 원하는 데이터를 조회합니다. 그러나 현재 쿼리는 'Jan'월의 수익만을 조회하며, 다른 월의 수익을 조회하려면 추가적인 쿼리 또는 조건이 필요합니다. 따라서, 더 효율적인 풀이 접근법은 피벗(pivot) 또는 조건적 집계를 사용하여 모든 월의 수익을 한 번에 조회하는 것입니다.

4. **잘된 점**: 코드는 간결하고, 읽기 쉽습니다. 또한, 필요한 열만을 조회하여 불필요한 데이터 전송을 피합니다.

5. **개선 사항**: 현재 쿼리는 'Jan'월의 수익만을 조회합니다. 모든 월의 수익을 조회하려면 다음과 같은 쿼리를 사용할 수 있습니다.
```mysql
SELECT 
  id,
  SUM(CASE WHEN month = 'Jan' THEN revenue ELSE 0 END) AS Jan_Revenue,
  SUM(CASE WHEN month = 'Feb' THEN revenue ELSE 0 END) AS Feb_Revenue,
  ...
  SUM(CASE WHEN month = 'Dec' THEN revenue ELSE 0 END) AS Dec_Revenue
FROM Department
GROUP BY id;
```
이 쿼리는 모든 월의 수익을 한 번에 조회하며, 더 효율적인 풀이 접근법입니다.
