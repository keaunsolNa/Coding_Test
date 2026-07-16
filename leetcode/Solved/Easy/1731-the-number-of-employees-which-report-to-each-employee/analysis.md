# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 16. 오후 3:38:38 |
| Language | oraclesql |
| Runtime | 231 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/the-number-of-employees-which-report-to-each-employee/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n^2) - 서브쿼리 내에서 Employees 테이블을 두 번 스캔하므로, 전체 시간 복잡도는 n^2에 비례합니다. 서브쿼리 내의 COUNT 연산은 reports_to 필드에 따라 Employees 테이블을 스캔하며, 이 작업이 Employees 테이블의 각 행에 대해 수행됩니다.

2. **공간 복잡도**: O(n) - Employees 테이블의 행 수에 비례하는 공간이 필요합니다. GROUP BY 연산 결과를 임시로 저장해야 하므로, 공간 복잡도는 n에 비례합니다.

3. **풀이 접근법**: 이 풀이에서는 서브쿼리(subquery)를 사용하여 각 사원에게 보고하는 사원의 수를 계산합니다. 또한, GROUP BY를 사용하여 각 사원의 정보를 그룹화하고, AVG 함수를 사용하여 평균 나이를 계산합니다. 이 접근법은 직관적이지만, 효율적인 쿼리 최적화가 필요합니다.

4. **잘된 점**: 코드는 직관적이고, Employees 테이블의 구조를 잘 반영하고 있습니다. 또한, 필요한 필드를 모두 포함하여 결과를 반환하고 있습니다.

5. **개선 사항**: 현재 쿼리는 서브쿼리 내에서 Employees 테이블을 스캔하기 때문에, 대량의 데이터에 대해 성능이 저하될 수 있습니다. JOIN을 사용하여 Employees 테이블을 자체적으로 조인하고, reports_to 필드를 사용하여 그룹화를 수행하는 방식으로 개선할 수 있습니다. 예를 들어, 다음과 같이 쿼리를 작성할 수 있습니다.
```oraclesql
SELECT E1.employee_id
     , E1.name
     , COUNT(E2.employee_id) AS reports_to
     , AVG(E1.age) AS age
FROM Employees E1
LEFT JOIN Employees E2 ON E1.employee_id = E2.reports_to
GROUP BY E1.employee_id, E1.name
```
