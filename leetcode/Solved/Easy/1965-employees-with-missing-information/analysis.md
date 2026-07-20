# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 20. 오전 10:48:22 |
| Language | oraclesql |
| Runtime | 262 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/employees-with-missing-information/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 employees 테이블과 Salaries 테이블을 조인하여 데이터를 조회합니다. 따라서 시간 복잡도는 두 테이블의 행 수에 비례합니다.

2. **공간 복잡도**: O(n) - 쿼리 결과를 저장하기 위한 공간이 필요하며, 결과 집합의 크기는 두 테이블의 행 수에 비례합니다.

3. **풀이 접근법**: 이 쿼리는 외부 조인(Outer Join)을 사용하여 employees 테이블과 Salaries 테이블을 조인합니다. 외부 조인은 한 테이블의 모든 행을 반환하고, 다른 테이블에 매칭되는 행이 있으면 해당 행을 반환하며, 매칭되는 행이 없으면 NULL을 반환합니다. 이 경우, employees 테이블의 행이 Salaries 테이블에 매칭되지 않는 경우를 찾기 위해 외부 조인을 사용합니다.

4. **잘된 점**: 이 쿼리는 문제를 간결하게 해결하며, 외부 조인을 사용하여 employees 테이블과 Salaries 테이블을 효과적으로 조인합니다. 또한, 필요한 데이터만 조회하여 효율적인 쿼리입니다.

5. **개선 사항**: 쿼리 자체는 효율적이지만, 더 현대적인 조인 구문을 사용하여 코드를 개선할 수 있습니다. 예를 들어, 다음과 같이 조인 구문을 사용할 수 있습니다.
```oraclesql
SELECT T2.employee_id
  FROM employees T1
  RIGHT OUTER JOIN Salaries T2
    ON T1.employee_id = T2.employee_id
 WHERE T1.employee_id IS NULL
```
또는, NOT IN 또는 NOT EXISTS 구문을 사용하여 쿼리를 작성할 수 있습니다.
```oraclesql
SELECT employee_id
  FROM Salaries
 WHERE employee_id NOT IN (SELECT employee_id FROM employees)
```
이러한 대안적 접근법은 쿼리의 가독성을 향상시키고, 더 직관적으로 문제를 해결할 수 있습니다.
