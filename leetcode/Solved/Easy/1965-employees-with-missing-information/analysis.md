# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 20. 오전 10:52:47 |
| Language | oraclesql |
| Runtime | 342 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/employees-with-missing-information/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: 이 쿼리의 시간 복잡도는 O(n + m)입니다. 여기서 n은 employees 테이블의 행 수, m은 Salaries 테이블의 행 수입니다. 두 테이블을 조인하고 NULL 값을 찾는 작업이 수행되기 때문입니다.

2. **공간 복잡도**: 이 쿼리의 공간 복잡도는 O(n + m)입니다. 쿼리 결과를 저장하기 위한 공간이 필요하기 때문입니다. UNION 연산자로 결합된 두 개의 SELECT 문이 수행되므로, 결과 집합을 저장하기 위한 추가적인 공간이 필요합니다.

3. **풀이 접근법**: 이 쿼리에서는 Outer Join과 UNION 연산자를 사용하여 employees 테이블과 Salaries 테이블에서 정보가 누락된 행을 찾습니다. Outer Join을 사용하여 두 테이블을 조인하고, NULL 값을 찾는 패턴을 사용했습니다.

4. **잘된 점**: 쿼리가 직관적이고, Outer Join과 UNION 연산자를 효과적으로 사용하여 문제를 해결했습니다. 또한, ORDER BY 절을 사용하여 결과를 정렬했습니다.

5. **개선 사항**: 쿼리를 더 최적화하기 위해, EXISTS 또는 NOT EXISTS 연산자를 사용하여 NULL 값을 찾는 대신에, 조건을 만족하는 행이 있는지 여부를 확인할 수 있습니다. 또한, 조인 조건을 명시적으로 지정하여 쿼리의 가독성을 높일 수 있습니다. 예를 들어, 다음과 같이 작성할 수 있습니다.
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
또는 EXISTS를 사용하여 다음과 같이 작성할 수 있습니다.
```oraclesql
SELECT employee_id
FROM employees e
WHERE NOT EXISTS (SELECT 1 FROM Salaries s WHERE e.employee_id = s.employee_id)
UNION
SELECT employee_id
FROM Salaries s
WHERE NOT EXISTS (SELECT 1 FROM employees e WHERE s.employee_id = e.employee_id)
ORDER BY employee_id;
```
