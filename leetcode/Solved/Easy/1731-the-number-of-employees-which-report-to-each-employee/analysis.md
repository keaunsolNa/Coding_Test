# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 16. 오후 3:37:32 |
| Language | oraclesql |
| Runtime | 283 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/the-number-of-employees-which-report-to-each-employee/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n^2) - 서브쿼리 내에서 Employees 테이블을 두 번扫描하기 때문에 시간 복잡도가 높습니다. outer query에서 각 row마다 서브쿼리를 실행하여 reports_to 값을 계산하기 때문입니다.

2. **공간 복잡도**: O(n) - Employees 테이블의 모든 row를 메모리에 로드해야 하므로 공간 복잡도는 Employees 테이블의 크기에 비례합니다.

3. **풀이 접근법**: 이 풀이에서는 서브쿼리(subquery)를 사용하여 각 employee_id에 reports_to하는 employee 수를 계산합니다. 또한, AVG 함수를 사용하여 평균 나이를 계산합니다. 이 접근법은 직관적이지만, 효율적인 풀이 방법은 아닙니다.

4. **잘된 점**: 이 코드는 직관적이고, Employees 테이블의 구조를 잘 반영하고 있습니다. 또한, 필요한 컬럼만을 SELECT하여 불필요한 데이터를 로드하지 않습니다.

5. **개선 사항**: 이 코드의 시간 복잡도를 개선하기 위해 JOIN을 사용하여 Employees 테이블을 한 번만扫描할 수 있습니다. 또한, WINDOW FUNCTION을 사용하여 reports_to 수를 계산할 수 있습니다. 예를 들어, 다음과 같이 개선할 수 있습니다.
```oraclesql
SELECT T1.employee_id
     , T1.name
     , COUNT(T2.employee_id) AS reports_to
     , AVG(T1.age) AS age
FROM Employees T1
LEFT JOIN Employees T2 ON T1.employee_id = T2.reports_to
WHERE T1.reports_to IS NOT NULL
GROUP BY T1.employee_id, T1.name
```
