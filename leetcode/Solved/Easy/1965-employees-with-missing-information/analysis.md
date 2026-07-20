# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 20. 오전 10:53:32 |
| Language | oraclesql |
| Runtime | 462 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/employees-with-missing-information/submissions/)

## Code Review

코드 리뷰를 진행하겠습니다.

1. **시간 복잡도**: 이 쿼리의 시간 복잡도는 O(n + m)입니다. 여기서 n은 employees 테이블의 행 수, m은 Salaries 테이블의 행 수를 나타냅니다. 두 테이블을 조인하고 NULL 값을 찾는 작업이 포함되어 있기 때문에, 전체적으로는 두 테이블의 행 수에 비례하는 시간 복잡도를 가집니다.

2. **공간 복잡도**: 쿼리의 공간 복잡도는 O(n + m)입니다. 쿼리 결과를 저장하기 위한 공간이 필요하며, 결과 집합의 크기는 두 테이블의 행 수에 비례합니다.

3. **풀이 접근법**: 이 쿼리에서는 Outer Join을 사용하여 employees 테이블과 Salaries 테이블을 조인하고, 각 테이블에서 상대 테이블에 매핑되는 행이 없는 경우를 찾습니다. 이 접근법은 Missing Information 패턴을 사용하여, 두 테이블에서 정보가 누락된 행을 식별합니다.

4. **잘된 점**: 코드는 Outer Join을 사용하여 두 테이블에서 정보가 누락된 행을 효과적으로 찾습니다. 또한, UNION 연산자를 사용하여 두 테이블에서 정보가 누락된 행을 하나의 결과 집합으로 결합합니다.

5. **개선 사항**: 쿼리를 더 최적화하기 위해, FULL OUTER JOIN을 사용하여 한 번의 조인으로 두 테이블에서 정보가 누락된 행을 찾을 수 있습니다. 또한, EXISTS 또는 NOT EXISTS 연산자를 사용하여 서브쿼리를 최적화할 수 있습니다. 예를 들어, 다음 쿼리와 같이 FULL OUTER JOIN을 사용할 수 있습니다.
```oraclesql
SELECT COALESCE(T1.employee_id, T2.employee_id) AS employee_id
FROM employees T1
FULL OUTER JOIN Salaries T2
ON T1.employee_id = T2.employee_id
WHERE T1.employee_id IS NULL OR T2.employee_id IS NULL
ORDER BY employee_id;
```
이러한 최적화를 통해 쿼리의 성능을 개선할 수 있습니다.
