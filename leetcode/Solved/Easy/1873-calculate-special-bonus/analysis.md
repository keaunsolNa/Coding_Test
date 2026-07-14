# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 14. 오후 4:47:38 |
| Language | oraclesql |
| Runtime | 271 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/calculate-special-bonus/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 Employees 테이블의 모든 행을 스캔하므로 시간 복잡도는 데이터의 크기(n)에 비례합니다. MOD 함수와 SUBSTR 함수는 상수 시간에 실행되므로 전체 쿼리의 시간 복잡도에 영향을 미치지 않습니다.

2. **공간 복잡도**: O(n) - 쿼리 결과는 Employees 테이블의 모든 행을 포함하므로 공간 복잡도도 데이터의 크기(n)에 비례합니다. 결과 집합은 원본 테이블과 동일한 수의 행을 가질 수 있으므로 공간 복잡도가 높을 수 있습니다.

3. **풀이 접근법**: 이 쿼리는 단순한 필터링과 조건부 연산을 사용하여 bonus를 계산합니다. CASE 문을 사용하여 employee_id와 name을 기반으로 bonus를 결정합니다. 이는 문제의 요구 사항을 직접적으로 해결하는 간단한 접근법입니다.

4. **잘된 점**: 코드는 읽기 쉽고, 이해하기 쉽습니다. 필요한 조건을 모두 만족하며, Employees 테이블의 모든 행을 처리합니다. 또한, CASE 문을 사용하여 bonus를 계산하는 로직이 명확합니다.

5. **개선 사항**: 현재 쿼리는 이미 최적화되어 있습니다. 하지만, Employees 테이블이非常 크면 인덱스를 생성하여 쿼리 성능을 향상시킬 수 있습니다. 예를 들어, employee_id 또는 name 열에 인덱스를 생성하여 쿼리 성능을 개선할 수 있습니다. 또한, SUBSTR 함수 대신 LIKE 연산자를 사용하여 이름이 'M'로 시작하는지 확인할 수 있습니다. 그러나, 이는 쿼리 성능에 큰 영향을 미치지 않을 수 있습니다.
