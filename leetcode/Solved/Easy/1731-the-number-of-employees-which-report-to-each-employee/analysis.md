# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 16. 오후 3:42:41 |
| Language | oraclesql |
| Runtime | 279 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/the-number-of-employees-which-report-to-each-employee/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n^2) - 서브쿼리가 Employees 테이블을 두 번扫描하기 때문에 시간 복잡도가 높습니다. 특히, reports_to 필드를 기준으로 Employees 테이블을 두 번扫描하는 부분에서 시간 복잡도가 증가합니다.

2. **공간 복잡도**: O(n) - Employees 테이블의 데이터를 메모리에 저장해야 하므로 공간 복잡도는 Employees 테이블의 크기에 비례합니다.

3. **풀이 접근법**: 이 풀이는 서브쿼리(subquery)를 사용하여 Employees 테이블에서 reports_to 필드를 기준으로 데이터를 집계합니다. reports_to 필드의 값에 따라 직원 수와 평균 나이를 계산합니다. 이 접근법은 직원 데이터를 집계하는 데 효과적이지만, 서브쿼리가 반복적으로 실행되므로 성능이 저하될 수 있습니다.

4. **잘된 점**: 이 코드는 Employees 테이블에서 reports_to 필드를 기준으로 데이터를 집계하는 데 성공적으로 구현되었습니다. 또한, 직원 수와 평균 나이를 계산하는 부분이 명확하게 구현되어 있습니다.

5. **개선 사항**: 이 코드의 성능을 개선하기 위해 JOIN이나 WINDOW FUNCTION을 사용할 수 있습니다. 예를 들어, Employees 테이블을 자기 자신과 JOIN하여 reports_to 필드를 기준으로 데이터를 집계할 수 있습니다.또는, WINDOW FUNCTION을 사용하여 reports_to 필드를 기준으로 데이터를 집계할 수 있습니다. 이러한 접근법은 서브쿼리가 반복적으로 실행되는 것을 피할 수 있으므로 성능이 개선될 수 있습니다. 예를 들어, 다음과 같이 JOIN을 사용할 수 있습니다.
```oraclesql
SELECT T1.employee_id
     , T1.name  
     , COUNT(T2.reports_to) reports_count
     , ROUND(AVG(T2.age)) average_age
FROM Employees T1
LEFT JOIN Employees T2 ON T1.employee_id = T2.reports_to
GROUP BY T1.employee_id, T1.name
HAVING COUNT(T2.reports_to) > 0
ORDER BY T1.employee_id
```
