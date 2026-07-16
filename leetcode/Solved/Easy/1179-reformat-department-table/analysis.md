# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 16. 오전 10:22:31 |
| Language | mysql |
| Runtime | 78 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/reformat-department-table/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 Department 테이블의 모든 행을 스캔하므로 시간 복잡도는 데이터의 크기에 비례합니다. WHERE 절에서 id = 1 조건이 있지만, 인덱스가 없다면 전체 테이블을 스캔해야 하므로 O(n)입니다.

2. **공간 복잡도**: O(n) - 쿼리 결과는 Department 테이블의 모든 행을 포함하므로 공간 복잡도도 데이터의 크기에 비례합니다.

3. **풀이 접근법**: 이 쿼리는 CASE 문을 사용하여 월별 수익을 피벗하는 방식으로 구현되었습니다. 이는 간단한 데이터 변환에 적합한 접근법입니다. 그러나 이 접근법은 월별 수익을 계산하는 데에만 적합하며, 더 복잡한 데이터 처리에는 적합하지 않을 수 있습니다.

4. **잘된 점**: 코드는 간결하고 읽기 쉽습니다. WHERE 절에서 id = 1 조건을 사용하여 특정 부서의 데이터만 가져오므로 쿼리 성능을 향상시킵니다.

5. **개선 사항**: 이 쿼리는 WHERE 절에서 id = 1 조건만 사용하므로, 실제로 특정 부서의 데이터만 필요합니다. 그러나 쿼리에서는 Department 테이블의 모든 행을 스캔합니다. 인덱스를 생성하여 쿼리 성능을 향상시킬 수 있습니다. 또한, 만약 Department 테이블에 많은 데이터가 있다면, 쿼리 결과를 캐싱하여 성능을 향상시킬 수 있습니다. 또한, 더 효율적인 쿼리 방식으로는 피벗 테이블을 사용하여 데이터를 변환할 수 있습니다. 예를 들어, 다음과 같이 쿼리를 작성할 수 있습니다.
```mysql
SELECT 
  id,
  SUM(CASE WHEN month = 'Jan' THEN revenue ELSE 0 END) AS Jan_Revenue,
  SUM(CASE WHEN month = 'Feb' THEN revenue ELSE 0 END) AS Feb_Revenue,
  ...
FROM Department
WHERE id = 1
GROUP BY id;
```
이 방식은 더 효율적이고 확장성이 뛰어난 쿼리 방식입니다.
