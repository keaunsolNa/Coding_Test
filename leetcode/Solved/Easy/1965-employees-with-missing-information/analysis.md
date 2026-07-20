# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 20. 오전 10:53:36 |
| Language | oraclesql |
| Runtime | 564 ms (Beats 93.5%) |
| Memory | 0B (Beats 100.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/employees-with-missing-information/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n + m) - 이 쿼리는 employees 테이블과 Salaries 테이블을 각각 스캔하므로, 두 테이블의 행 수(n과 m)를 합친 것에 비례하는 시간 복잡도를 가지게 됩니다.

2. **공간 복잡도**: O(n + m) - 쿼리 결과를 저장하기 위해 필요한 공간이 두 테이블의 행 수에 비례하므로, 공간 복잡도도 O(n + m)입니다.

3. **풀이 접근법**: 이 쿼리는 Outer Join과 Union을 사용하여 employees 테이블과 Salaries 테이블에서 정보가 누락된 행을 찾습니다. Outer Join은 한 테이블에 있는 모든 행을 반환하고, 다른 테이블에 매칭되는 행이 없으면 NULL로 채웁니다. Union은 두 쿼리의 결과를 결합하여 중복된 행을 제거합니다.

4. **잘된 점**: 쿼리는 Outer Join과 Union을 사용하여 employees 테이블과 Salaries 테이블에서 정보가 누락된 행을 찾는 데 성공했습니다. 또한, ORDER BY 절을 사용하여 결과를 employee_id로 정렬했습니다.

5. **개선 사항**: 쿼리에서 사용된 Outer Join은 Oracle 12c부터 지원하는 FULL OUTER JOIN을 사용하여 더 명확하게 표현할 수 있습니다. 또한, EXISTS나 NOT EXISTS를 사용하여 쿼리를 더 효율적으로 작성할 수 있습니다. 예를 들어, 다음과 같이 작성할 수 있습니다:
```oraclesql
SELECT employee_id
FROM employees
WHERE employee_id NOT IN (SELECT employee_id FROM Salaries)
UNION
SELECT employee_id
FROM Salaries
WHERE employee_id NOT IN (SELECT employee_id FROM employees)
ORDER BY employee_id;
```
또는,
```oraclesql
SELECT T1.employee_id
FROM employees T1
WHERE NOT EXISTS (SELECT 1 FROM Salaries T2 WHERE T1.employee_id = T2.employee_id)
UNION
SELECT T1.employee_id
FROM Salaries T1
WHERE NOT EXISTS (SELECT 1 FROM employees T2 WHERE T1.employee_id = T2.employee_id)
ORDER BY employee_id;
```
