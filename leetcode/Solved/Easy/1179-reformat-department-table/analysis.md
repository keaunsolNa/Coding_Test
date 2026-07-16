# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 16. 오전 10:19:24 |
| Language | mysql |
| Runtime | 78 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/reformat-department-table/submissions/)

## Code Review

리뷰 대상 코드는 Department 테이블의 데이터를 재구성하여 각 월별 매출을 구하는 MySQL 쿼리입니다. 

1. **시간 복잡도**: 이 쿼리의 시간 복잡도는 O(n)입니다. 여기서 n은 Department 테이블의 행 수를 나타냅니다. 쿼리가 전체 테이블을 스캔하기 때문에 시간 복잡도는 테이블의 크기에 직접적으로 비례합니다.

2. **공간 복잡도**: 공간 복잡도 또한 O(n)입니다. 쿼리 결과는 원본 테이블의 크기와 비슷할 수 있기 때문에, 결과 집합을 저장하기 위한 추가적인 공간이 필요합니다.

3. **풀이 접근법**: 사용된 알고리즘은 기본적으로 테이블의 데이터를 필터링하고 재구성하는 것입니다. 그러나 제공된 쿼리는 'Jan' 월의 매출만을 고려하여 CASE 문을 사용하고 있습니다. 이는 특정 월의 매출을 추출하는 데 사용되는 간단한 필터링 패턴입니다.

4. **잘된 점**: 코드는 간결하고, 읽기 쉽습니다. 또한, CASE 문을 사용하여 특정 조건에 따라 데이터를 필터링하는 방법을 보여주고 있습니다.

5. **개선 사항**: 현재 쿼리는 'Jan' 월의 매출만을 고려합니다. 다른 월의 매출도 포함하려면, 쿼리를 확장하여 각 월에 대한 별도의 열을 생성해야 합니다. 예를 들어, 모든 월에 대한 매출을 포함하려면 쿼리를 다음과 같이 수정할 수 있습니다:
```mysql
SELECT 
  id,
  SUM(CASE WHEN month = 'Jan' THEN revenue ELSE 0 END) AS Jan_Revenue,
  SUM(CASE WHEN month = 'Feb' THEN revenue ELSE 0 END) AS Feb_Revenue,
  SUM(CASE WHEN month = 'Mar' THEN revenue ELSE 0 END) AS Mar_Revenue,
  -- 다른 월에 대한 열을 계속 추가합니다.
FROM Department
GROUP BY id;
```
이렇게 수정하면, 쿼리는 모든 월에 대한 매출을 포함하는 더 완전한 결과를 제공할 것입니다.
