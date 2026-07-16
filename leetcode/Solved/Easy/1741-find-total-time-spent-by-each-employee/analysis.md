# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 16. 오후 1:35:08 |
| Language | mysql |
| Runtime | 71 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/find-total-time-spent-by-each-employee/submissions/)

## Code Review

리뷰 대상 코드는 MySQL을 사용하여 'find-total-time-spent-by-each-employee' 문제를 해결하는 쿼리입니다. 

1. **시간 복잡도**: O(n) - 이 쿼리는 Employees 테이블의 모든 행을 스캔하므로 시간 복잡도는 데이터의 크기(n)에 비례합니다. GROUP BY와 SUM 연산은 추가적인 시간 복잡도를 가질 수 있지만, 일반적으로 데이터베이스에서 이러한 연산은 효율적으로 처리됩니다.

2. **공간 복잡도**: O(n) - 쿼리 결과는 각 고유한 emp_id와 event_day 조합에 대한 총 시간을 포함하므로, 결과 집합의 크기는 입력 데이터의 크기(n)에 비례할 수 있습니다.

3. **풀이 접근법**: 이 쿼리는 집계 함수(SUM)와 그룹화(GROUP BY)를 사용하여 각 사원별로 일별 총 시간을 계산합니다. 이는 관계형 데이터베이스에서 데이터를 집계하고 요약하는 일반적인 패턴입니다.

4. **잘된 점**: 코드는 간결하고 읽기 쉽습니다. 필요한 열만 선택하고, 적절한 집계 함수와 그룹화를 사용하여 문제를 명확하게 해결했습니다.

5. **개선 사항**: 쿼리 자체는 효율적이지만, 추가적인 최적화를 고려할 수 있습니다. 예를 들어, Employees 테이블에 적절한 인덱스를 생성하여 GROUP BY와 SUM 연산의 성능을 향상시킬 수 있습니다. 또한, out_time과 in_time의 데이터 타입이 적절한지 확인해야 합니다. 시간 계산에서 오차가 발생하지 않도록 두 열의 데이터 타입이 일치하는지 확인하는 것이 중요합니다.
