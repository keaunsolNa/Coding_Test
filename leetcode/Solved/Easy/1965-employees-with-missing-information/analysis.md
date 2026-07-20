# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 20. 오전 10:49:36 |
| Language | oraclesql |
| Runtime | 366 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/employees-with-missing-information/submissions/)

## Code Review

**코드 리뷰**

1. **시간 복잡도**: O(n*m) - 크로스 조인으로 인해 employees 테이블과 Salaries 테이블의 모든 행이 조합되어 결과가 생성되므로, 시간 복잡도는 두 테이블의 행 수의 곱에 비례합니다.
2. **공간 복잡도**: O(n*m) - 크로스 조인 결과로 생성되는 임시 결과 집합의 크기는 두 테이블의 행 수의 곱에 비례하므로, 공간 복잡도도 O(n*m)입니다.
3. **풀이 접근법**: 크로스 조인과 필터링을 사용하여 풀이했습니다. 크로스 조인은 두 테이블의 모든 행을 조합하여 결과를 생성하고, WHERE 절을 사용하여 employees 테이블의 employee_id가 NULL인 행만 필터링합니다.
4. **잘된 점**: WHERE 절을 사용하여필요한 데이터만 필터링하여 결과를 생성하는 부분은 잘 구현되어 있습니다.
5. **개선 사항**: 현재 쿼리는 크로스 조인을 사용하여 모든 행을 조합하므로, 효율성이 떨어질 수 있습니다. 대안적으로, LEFT JOIN을 사용하여 employees 테이블의 행을 Salaries 테이블과 조인하고, Salaries 테이블에 매핑되지 않는 행만 필터링할 수 있습니다. 예를 들어, `SELECT T2.employee_id FROM employees T1 LEFT JOIN Salaries T2 ON T1.employee_id = T2.employee_id WHERE T1.employee_id IS NULL`와 같이 작성할 수 있습니다.
