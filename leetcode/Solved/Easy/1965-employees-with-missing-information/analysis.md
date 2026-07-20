# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 20. 오전 10:51:53 |
| Language | oraclesql |
| Runtime | 305 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/employees-with-missing-information/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: 이 쿼리의 시간 복잡도는 O(n + m)입니다. 여기서 n은 employees 테이블의 행 수, m은 Salaries 테이블의 행 수를 나타냅니다. 두 테이블을 조인하고 NULL 값을 찾는 작업이 수행되기 때문입니다.

2. **공간 복잡도**: 공간 복잡도는 O(n + m)입니다. 쿼리 결과를 저장하기 위한 공간이 필요하기 때문입니다. UNION 연산을 사용하여 두 개의 결과 집합을 결합하기 때문에, 결과 집합의 크기는 두 테이블의 크기와 관련이 있습니다.

3. **풀이 접근법**: 이 쿼리에서는 Outer Join과 UNION 연산을 사용하여 employees와 Salaries 테이블에서 정보가 누락된 행을 찾습니다. Outer Join은 한 테이블의 모든 행을 반환하고, 다른 테이블에 매칭되는 행이 없으면 NULL 값을 반환합니다. UNION 연산은 두 개의 결과 집합을 결합하여 중복된 행을 제거합니다.

4. **잘된 점**: 이 쿼리는 Outer Join과 UNION 연산을 효과적으로 사용하여 문제를 해결합니다. 또한, 쿼리 결과를 employee_id로 정렬하여 가독성을 향상시킵니다.

5. **개선 사항**: 이 쿼리는 Oracle의 오래된 조인 구문을 사용합니다. 최신 Oracle 버전에서는 ANSI 조인 구문을 사용하는 것이 좋습니다. 또한, NOT EXISTS 또는 NOT IN 연산자를 사용하여 쿼리를 작성할 수도 있습니다. 예를 들어, 다음과 같이 쿼리를 작성할 수 있습니다.
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
또는, EXISTS 연산자를 사용하여 다음과 같이 쿼리를 작성할 수도 있습니다.
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
