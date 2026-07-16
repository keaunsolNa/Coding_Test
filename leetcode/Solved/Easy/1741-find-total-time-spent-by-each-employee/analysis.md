# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 16. 오후 1:34:56 |
| Language | oraclesql |
| Runtime | 227 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/find-total-time-spent-by-each-employee/submissions/)

## Code Review

코드 리뷰를 진행하겠습니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 Employees 테이블의 모든 행을 스캔하므로 시간 복잡도는 데이터의 크기(n)에 비례합니다. GROUP BY와 SUM 연산은 추가적인 시간 복잡도를 가하지 않습니다.

2. **공간 복잡도**: O(n) - 쿼리 결과는 각 사원과 날짜에 대한 총 시간을 포함하므로 공간 복잡도도 데이터의 크기(n)에 비례합니다.

3. **풀이 접근법**: 이 쿼리는 집계 함수(SUM)를 사용하여 각 사원과 날짜에 대한 총 시간을 계산합니다. GROUP BY 절을 사용하여 결과를 사원 ID와 날짜로 그룹화합니다. 이는 관계형 데이터베이스에서 데이터를 집계하고 요약하는 일반적인 패턴입니다.

4. **잘된 점**: 코드는 간결하고 읽기 쉽습니다. 필요한 열만 선택하고, 적절한 집계 함수와 GROUP BY 절을 사용하여 문제를 명확하게 해결했습니다.

5. **개선 사항**: 현재 쿼리는 이미 최적화되어 있습니다. 그러나 날짜 형식에 따라 out_time - in_time 연산이 올바르게 작동하는지 확인해야 합니다. 또한, Employees 테이블에 인덱스가 있는지 확인하여 쿼리 성능을 향상시킬 수 있습니다. 추가적으로, 쿼리 결과를 더 읽기 쉽게 하기 위해 날짜 형식을 지정할 수 있습니다. 예를 들어, TO_CHAR(event_day, 'YYYY-MM-DD')를 사용하여 날짜를 문자열로 변환할 수 있습니다.
