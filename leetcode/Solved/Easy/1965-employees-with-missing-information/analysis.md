# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 20. 오전 10:50:26 |
| Language | oraclesql |
| Runtime | 302 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/employees-with-missing-information/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 두 테이블의 조인을 수행하며, 각 테이블의 행 수에 비례하는 시간 복잡도를 가지므로 O(n)입니다. 여기서 n은 테이블의 행 수를 나타냅니다.

2. **공간 복잡도**: O(n) - 쿼리 결과를 저장하기 위한 공간이 필요하며, 결과의 크기는 입력 테이블의 크기에 비례하므로 O(n)입니다.

3. **풀이 접근법**: 이 쿼리는 외부 조인(Outer Join)을 사용하여 employees 테이블과 Salaries 테이블을 조인합니다. 외부 조인은 한 테이블의 모든 행을 반환하고, 다른 테이블에 매핑되는 행이 없는 경우 NULL 값을 반환합니다. 이 경우, Salaries 테이블에 없는 employees 테이블의 행을 찾기 위해 외부 조인이 사용됩니다.

4. **잘된 점**: 코드는 간결하고, 외부 조인을 사용하여 문제를 효율적으로 해결했습니다. 또한, 필요한 열만 선택하여 불필요한 데이터를 가져오는 것을 피했습니다.

5. **개선 사항**: Oracle 12c 이상에서는 외부 조인을 위한 구식 문법 대신现代적인 조인 구문을 사용할 수 있습니다. 예를 들어, 다음과 같이 작성할 수 있습니다.
```oraclesql
SELECT T2.employee_id
  FROM employees T1
  LEFT JOIN Salaries T2
    ON T1.employee_id = T2.employee_id
 WHERE T2.employee_id IS NULL
```
이렇게하면 코드가 더 현대적이고 가독성이 향상됩니다.
