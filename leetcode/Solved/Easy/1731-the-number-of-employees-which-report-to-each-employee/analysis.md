# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 16. 오후 3:37:11 |
| Language | oraclesql |
| Runtime | 300 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/the-number-of-employees-which-report-to-each-employee/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n^2) - 서브쿼리 내에서 Employees 테이블을 스캔하는 작업이 outer query의 각 행마다 반복되므로, 전체 시간 복잡도는 O(n^2)입니다. outer query에서 Employees 테이블을 스캔하는 시간 복잡도는 O(n)이며, 서브쿼리에서도 Employees 테이블을 스캔하므로 O(n)입니다.

2. **공간 복잡도**: O(n) - 결과 집합을 저장하기 위해 필요한 공간이 Employees 테이블의 행 수에 비례하므로, 공간 복잡도는 O(n)입니다.

3. **풀이 접근법**: 이 풀이에서는 서브쿼리(subquery)를 사용하여 각 사원에게 보고하는 사원의 수를 계산합니다. outer query에서 Employees 테이블을 스캔하며, 각 사원에 대해 서브쿼리를 실행하여 보고하는 사원의 수를 계산합니다. AVG 함수를 사용하여 평균 나이를 계산합니다.

4. **잘된 점**: Employees 테이블을 스캔하여 각 사원에 대한 정보를 계산하는 방식은 직관적이고 이해하기 쉽습니다. AVG 함수를 사용하여 평균 나이를 계산하는 부분도 잘 구현되어 있습니다.

5. **개선 사항**: 현재 풀이의 시간 복잡도는 O(n^2)로, 대규모 데이터셋에서는 성능이 저하될 수 있습니다. JOIN이나 WINDOW FUNCTION을 사용하여 시간 복잡도를 개선할 수 있습니다. 예를 들어, 다음과 같이 JOIN을 사용하여 풀이할 수 있습니다.
```oraclesql
SELECT T1.employee_id
     , T1.name
     , COALESCE(T2.cnt, 0) AS reports_to
     , AVG(T1.age) AS age
FROM Employees T1
LEFT JOIN (
  SELECT reports_to, COUNT(*) AS cnt
  FROM Employees
  GROUP BY reports_to
) T2
ON T1.employee_id = T2.reports_to
GROUP BY T1.employee_id, T1.name, T2.cnt
```
이 풀이에서는 JOIN을 사용하여 서브쿼리 대신에 Employees 테이블을 스캔하여 보고하는 사원의 수를 계산합니다. 이는 시간 복잡도를 O(n)으로 개선합니다.
