# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 20. 오전 10:52:04 |
| Language | oraclesql |
| Runtime | 281 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/employees-with-missing-information/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 employees와 Salaries 테이블을 스캔하므로, 시간 복잡도는 두 테이블의 행 수에 비례합니다. Oracle의 쿼리 최적화기에서 적절한 인덱스를 사용한다면, 실제 시간 복잡도는 더 낮을 수 있습니다.

2. **공간 복잡도**: O(n) - 쿼리 결과는 두 테이블에서 일치하지 않는 행을 반환하므로, 공간 복잡도는 결과 집합의 크기에 비례합니다.

3. **풀이 접근법**: 이 쿼리는 Outer Join을 사용하여 employees와 Salaries 테이블에서 일치하지 않는 행을 찾습니다. Outer Join은 한 테이블의 모든 행을 반환하고, 다른 테이블에서 일치하는 행이 있으면 해당 행을 반환하고, 없으면 NULL을 반환합니다.

4. **잘된 점**: 코드는 Outer Join을 사용하여 employees와 Salaries 테이블에서 일치하지 않는 행을 찾는 문제를 잘 해결했습니다. 또한, 쿼리 결과를 employee_id로 정렬하여 결과를 더 읽기 쉽게 만들었습니다.

5. **개선 사항**: 쿼리에서 사용된 조인 방식은 오라클의 구식 조인 방식입니다. 더 현대적인 조인 방식을 사용하여 쿼리를 개선할 수 있습니다. 예를 들어, 다음과 같이 INNER JOIN과 LEFT JOIN을 사용할 수 있습니다.
```oraclesql
SELECT T1.employee_id
  FROM employees T1
  LEFT JOIN Salaries T2 ON T1.employee_id = T2.employee_id
 WHERE T2.employee_id IS NULL
UNION
SELECT T2.employee_id
  FROM Salaries T1
  LEFT JOIN employees T2 ON T1.employee_id = T2.employee_id
 WHERE T2.employee_id IS NULL
 ORDER BY employee_id;
```
또한, 쿼리에서 사용된 테이블 별칭(T1, T2)은 직관적이지 않습니다. 더 의미 있는 별칭을 사용하여 쿼리를 더 읽기 쉽게 만들 수 있습니다.
