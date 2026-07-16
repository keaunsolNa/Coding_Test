# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 16. 오후 3:42:47 |
| Language | oraclesql |
| Runtime | 615 ms (Beats 93.0%) |
| Memory | 0B (Beats 100.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/the-number-of-employees-which-report-to-each-employee/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n^2) - 서브쿼리 내에서 Employees 테이블을 두 번 스캔하기 때문에 시간 복잡도가 높습니다. outer query에서 각 행에 대해 서브쿼리를 수행하기 때문입니다.

2. **공간 복잡도**: O(n) - Employees 테이블의 크기에 비례하는 공간이 필요합니다. 결과 집합의 크기는 Employees 테이블의 크기에 영향을 받습니다.

3. **풀이 접근법**: 이 풀이는 서브쿼리를 사용하여 각 사원에게 보고하는 사원의 수와 평균 나이를 계산합니다. outer query에서 각 사원을 대상으로 하여 서브쿼리를 수행하여 필요한 정보를 계산합니다.

4. **잘된 점**: Employees 테이블에서 필요한 정보를 성공적으로 추출하여 결과를 도출했습니다. 또한, WHERE 절을 사용하여 reports_to 가 0 인 사원은 제외하여 효율성을 높였습니다.

5. **개선 사항**: 서브쿼리를 JOIN으로 대체하여 시간 복잡도를 개선할 수 있습니다. 또한, WINDOW FUNCTION을 사용하여 평균 나이를 계산할 수 있습니다. 예를 들어, 다음과 같이 개선할 수 있습니다.
```oraclesql
SELECT T1.employee_id
     , T1.name
     , COUNT(T2.employee_id) AS reports_count
     , ROUND(AVG(T2.age)) AS average_age
FROM Employees T1
LEFT JOIN Employees T2 ON T1.employee_id = T2.reports_to
GROUP BY T1.employee_id, T1.name
HAVING COUNT(T2.employee_id) > 0
ORDER BY T1.employee_id
```
이러한 방법으로 시간 복잡도를 O(n)으로 개선할 수 있습니다.
