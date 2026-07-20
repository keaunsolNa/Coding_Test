# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 20. 오전 10:51:40 |
| Language | oraclesql |
| Runtime | 252 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/employees-with-missing-information/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n + m) - 이 쿼리는 employees 테이블과 Salaries 테이블을 조인하여 처리합니다. 여기서 n은 employees 테이블의 행 수, m은 Salaries 테이블의 행 수를 나타냅니다. 두 테이블을 조인하고 NULL 값을 찾는 작업이 수행되므로 시간 복잡도는 두 테이블의 행 수에 비례합니다.

2. **공간 복잡도**: O(n + m) - 쿼리 결과를 저장하기 위한 공간이 필요합니다. 결과 집합의 크기는 두 테이블의 행 수에 비례하므로 공간 복잡도도 O(n + m)입니다.

3. **풀이 접근법**: 이 쿼리는 Outer Join을 사용하여 employees 테이블과 Salaries 테이블을 조인합니다. Outer Join은 한 테이블의 모든 행을 반환하고, 다른 테이블에서 일치하는 행이 없는 경우 NULL 값을 반환합니다. 이 쿼리에서는 두 테이블에서 일치하지 않는 행을 찾기 위해 Outer Join을 사용합니다.

4. **잘된 점**: 코드는 Outer Join을 사용하여 employees 테이블과 Salaries 테이블에서 일치하지 않는 행을 효과적으로 찾습니다. 또한 UNION 연산자를 사용하여 두 테이블에서 일치하지 않는 행을 하나의 결과 집합으로 결합합니다.

5. **개선 사항**: 쿼리에서는 오라클의 구식 조인 구문을 사용합니다. 최신 오라클 버전에서는 ANSI 조인 구문을 사용하는 것이 좋습니다. 또한, 쿼리에서는 두 테이블에서 일치하지 않는 행을 찾기 위해 두 번의 Outer Join을 수행합니다. 이 쿼리를 하나의 FULL OUTER JOIN으로 대체할 수 있습니다. 예를 들어:
```oraclesql
SELECT T1.employee_id
  FROM employees T1
  FULL OUTER JOIN Salaries T2
    ON T1.employee_id = T2.employee_id
 WHERE T1.employee_id IS NULL OR T2.employee_id IS NULL
 ORDER BY employee_id;
```
이 쿼리는 동일한 결과를 반환하지만, 더 간결하고 읽기 쉽습니다.
