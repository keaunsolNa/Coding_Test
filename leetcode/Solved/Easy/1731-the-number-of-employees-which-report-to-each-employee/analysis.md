# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 16. 오후 3:42:29 |
| Language | oraclesql |
| Runtime | 293 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/the-number-of-employees-which-report-to-each-employee/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n^2) - 이 쿼리는 Employees 테이블을 두 번 스캔하기 때문에 시간 복잡도가 O(n^2)입니다. 서브쿼리에서 COUNT와 AVG를 계산하기 위해 Employees 테이블을 스캔하고, 외부 쿼리에서 다시 Employees 테이블을 스캔합니다.

2. **공간 복잡도**: O(n) - 쿼리 결과를 저장하기 위해 필요한 공간은 Employees 테이블의 행 수에 비례합니다. 따라서 공간 복잡도는 O(n)입니다.

3. **풀이 접근법**: 이 쿼리는 서브쿼리를 사용하여 각 직원의 부하 직원 수와 평균 나이를 계산합니다. 서브쿼리는 Employees 테이블을 스캔하여 reports_to 열이 현재 직원과 일치하는 행을 찾습니다. 이 접근법은 직원과 그 부하 직원之间의 관계를 계산하는 데 사용됩니다.

4. **잘된 점**: 코드는 직원과 그 부하 직원之间의 관계를 계산하는 데 사용된 논리를 명확하게 나타내고 있습니다. 또한, 서브쿼리를 사용하여 복잡한 계산을 단순화했습니다.

5. **개선 사항**: 쿼리의 성능을 개선하기 위해 JOIN을 사용하여 Employees 테이블을 한 번만 스캔할 수 있습니다. 예를 들어, 다음과 같이 쿼리를 수정할 수 있습니다.
```oraclesql
SELECT T1.employee_id
     , T1.name
     , COUNT(T2.employee_id) reports_count
     , ROUND(AVG(T2.age)) average_age
FROM Employees T1
LEFT JOIN Employees T2 ON T1.employee_id = T2.reports_to
GROUP BY T1.employee_id, T1.name
HAVING COUNT(T2.employee_id) > 0
```
이 수정된 쿼리는 Employees 테이블을 한 번만 스캔하기 때문에 시간 복잡도가 O(n)으로 개선됩니다.
