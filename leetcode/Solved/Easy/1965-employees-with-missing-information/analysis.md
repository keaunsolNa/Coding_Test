# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 20. 오전 10:50:36 |
| Language | oraclesql |
| Runtime | 268 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/employees-with-missing-information/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 employees 테이블과 Salaries 테이블을 조인하여 데이터를 조회합니다. 조회하는 데이터의 양에 비례하여 시간이 소요되므로 시간 복잡도는 O(n)입니다.

2. **공간 복잡도**: O(n) - 쿼리 결과를 저장하기 위한 공간이 필요합니다. 결과 데이터의 양에 비례하여 공간이 소요되므로 공간 복잡도는 O(n)입니다.

3. **풀이 접근법**: 이 쿼리는 Outer Join을 사용하여 employees 테이블과 Salaries 테이블을 조인합니다. Outer Join은 한 테이블의 모든 레코드를 반환하고, 다른 테이블에서 매칭되는 레코드가 있으면 함께 반환합니다. 이 경우, Salaries 테이블에서 매칭되는 레코드가 없는 employees 테이블의 레코드를 반환합니다.

4. **잘된 점**: 쿼리는 간결하고 쉽게 이해할 수 있습니다. Outer Join을 사용하여 employees 테이블과 Salaries 테이블을 조인하여 필요한 데이터를 효과적으로 조회합니다.

5. **개선 사항**: 현재 쿼리는 오라클의 구식 조인 문법을 사용하고 있습니다. 최신 문법을 사용하여 LEFT OUTER JOIN을 사용할 수 있습니다. 또한, 쿼리에서 사용하는 테이블 별칭(T1, T2)은 더 명확한 이름으로 변경하여 코드의 가독성을 높일 수 있습니다. 예를 들어, 다음과 같이 개선할 수 있습니다.
```oraclesql
SELECT E.employee_id
  FROM employees E
  LEFT OUTER JOIN Salaries S
    ON E.employee_id = S.employee_id
 WHERE S.employee_id IS NULL
```
