# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 16. 오후 3:41:32 |
| Language | oraclesql |
| Runtime | 240 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/the-number-of-employees-which-report-to-each-employee/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n^2)입니다. 이유는 Employees 테이블을 두 번 스캔하기 때문입니다. 첫 번째 스캔은 T1을 스캔하고, 두 번째 스캔은 T2를 reports_to 조건으로 스캔하기 때문입니다.

2. **공간 복잡도**: O(1)입니다. 이유는 추가적인 공간을 사용하지 않기 때문입니다. 결과를 저장하기 위한 공간은 이미 존재하는 Employees 테이블의 크기와 동일합니다.

3. **풀이 접근법**: 서브쿼리(subquery)를 사용하여 reports_to 조건에 맞는 데이터를 조회하고, COUNT와 AVG 함수를 사용하여 reports_count와 average_age를 계산합니다. 이 접근법은 간단하고 직관적이지만, 대규모 데이터에서는 성능 이슈가 있을 수 있습니다.

4. **잘된 점**: 코드는 간결하고, 읽기 쉽습니다. 서브쿼리를 사용하여 reports_to 조건에 맞는 데이터를 조회하는 방법은 직관적입니다.

5. **개선 사항**: 대규모 데이터에서는 서브쿼리 대신 JOIN을 사용하여 성능을 개선할 수 있습니다. 또한, WINDOW FUNCTION을 사용하여 reports_count와 average_age를 계산할 수 있습니다. 예를 들어, 다음과 같이 JOIN과 WINDOW FUNCTION을 사용할 수 있습니다.
```oraclesql
SELECT T1.employee_id
     , T1.name  
     , COUNT(T2.employee_id) OVER (PARTITION BY T1.employee_id) reports_count
     , AVG(T2.age) OVER (PARTITION BY T1.employee_id) average_age
 FROM Employees T1
 LEFT JOIN Employees T2 ON T1.employee_id = T2.reports_to
GROUP BY T1.employee_id, T1.name
```
