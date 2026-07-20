# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 20. 오전 10:49:11 |
| Language | oraclesql |
| Runtime | 263 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/employees-with-missing-information/submissions/)

## Code Review

이 코드 리뷰는 Oracle SQL을 사용하여 'employees-with-missing-information' 문제를 해결하는 코드에 대한 것입니다.

1. **시간 복잡도**: 이 쿼리의 시간 복잡도는 O(n*m)입니다. 여기서 n은 employees 테이블의 행 수, m은 Salaries 테이블의 행 수입니다. CROSS JOIN을 사용하여 두 테이블의 모든 행을 조합하므로 시간 복잡도가 높을 수 있습니다.

2. **공간 복잡도**: 공간 복잡도는 O(n*m)입니다. CROSS JOIN의 결과로 생성되는 임시 결과 집합의 크기가 두 테이블의 행 수에 비례하기 때문입니다.

3. **풀이 접근법**: 이 코드는 CROSS JOIN을 사용하여 employees 테이블과 Salaries 테이블의 모든 행을 조합합니다. 그러나 이 접근법은 효율적이지 않으며, 특히 큰 테이블에서는 성능 문제를 일으킬 수 있습니다. 일반적으로는 INNER JOIN이나 LEFT JOIN과 같은 적절한 조인 조건을 사용하여 필요한 데이터만을 가져오는 것이 더 효율적입니다.

4. **잘된 점**: 코드는 간결하며, CROSS JOIN의 기본적인 사용법을 보여주고 있습니다. 그러나 이 문제를 해결하기 위한 최적의 접근법은 아닙니다.

5. **개선 사항**: 이 문제를 더 효율적으로 해결하기 위해서는, 먼저 두 테이블에서 필요한 데이터를 식별해야 합니다. employees 테이블과 Salaries 테이블에서 employee_id를 기준으로 INNER JOIN을 사용하거나, LEFT JOIN을 사용하여 employees 테이블의 모든 행과 Salaries 테이블에서 일치하는 행을 가져오는 것이 더 적절할 수 있습니다. 또한, WHERE 절을 사용하여 특정 조건을 만족하는 행만을 가져올 수 있습니다. 예를 들어, 다음과 같은 쿼리가 더 효율적일 수 있습니다:
```oraclesql
SELECT T1.employee_id
FROM employees T1
LEFT JOIN Salaries T2 ON T1.employee_id = T2.employee_id
WHERE T2.employee_id IS NULL;
```
이 쿼리는 employees 테이블에 있는 모든 employee_id 중에서 Salaries 테이블에 존재하지 않는 employee_id를 찾는 것입니다.
