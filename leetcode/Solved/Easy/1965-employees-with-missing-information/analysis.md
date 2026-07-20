# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 20. 오전 10:53:01 |
| Language | oraclesql |
| Runtime | 317 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/employees-with-missing-information/submissions/)

## Code Review

이 Oracle SQL 쿼리 코드 리뷰에서는 다음과 같은 점들을 평가합니다.

1. **시간 복잡도**: 이 쿼리의 시간 복잡도는 O(n + m)입니다. 여기서 n은 `employees` 테이블의 행 수, m은 `Salaries` 테이블의 행 수를 나타냅니다. 이유는 두 테이블을 outer join하여 각 테이블의 모든 행을 한 번씩 스캔하기 때문입니다.

2. **공간 복잡도**: 공간 복잡도는 O(n + m)입니다. 쿼리 결과로 반환되는 데이터의 크기가 두 테이블의 크기에 비례하기 때문입니다.

3. **풀이 접근법**: 이 쿼리에서는 outer join을 사용하여 두 테이블을 결합하고, 한 테이블에 존재하지만 다른 테이블에 존재하지 않는 행을 찾는 접근법을 사용했습니다. outer join은 한 테이블의 모든 행을 반환하고, 다른 테이블에서 일치하는 행이 없는 경우 NULL로 채워지는 결과를 반환합니다.

4. **잘된 점**: 이 코드는 outer join을 사용하여 employees 테이블과 Salaries 테이블에서 일치하지 않는 행을 찾는 문제를 잘 해결했습니다. 또한, 쿼리 결과를 employee_id 기준으로 정렬하여 가독성을 높였습니다.

5. **개선 사항**: 이 쿼리는 이미 최적화되어 있지만, 더 현대적인 SQL 구문을 사용하여 outer join을 작성할 수 있습니다. 예를 들어, 다음과 같이 작성할 수 있습니다:
```oraclesql
SELECT T1.employee_id
  FROM employees T1
  LEFT JOIN Salaries T2 ON T1.employee_id = T2.employee_id
 WHERE T2.employee_id IS NULL
 UNION 
SELECT T1.employee_id
  FROM Salaries T1
  LEFT JOIN employees T2 ON T1.employee_id = T2.employee_id
 WHERE T2.employee_id IS NULL
 ORDER BY employee_id;
```
또한, 두 개의 쿼리를 UNION으로 결합하는 대신, FULL OUTER JOIN을 사용하여 한 번의 쿼리로 결과를 얻을 수 있습니다. 그러나 Oracle에서 FULL OUTER JOIN을 사용하는 경우 다음과 같이 작성해야 합니다:
```oraclesql
SELECT COALESCE(T1.employee_id, T2.employee_id) AS employee_id
  FROM employees T1
  FULL OUTER JOIN Salaries T2 ON T1.employee_id = T2.employee_id
 WHERE T1.employee_id IS NULL OR T2.employee_id IS NULL
 ORDER BY employee_id;
```
