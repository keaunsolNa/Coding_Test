# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 20. 오전 10:50:08 |
| Language | oraclesql |
| Runtime | 339 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/employees-with-missing-information/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 두 테이블의 조인을 수행하므로, 테이블에 있는 행의 수에 비례하는 시간이 걸립니다. outer join을 사용하여 데이터를 가져오기 때문에, 데이터의 양에 따라 시간 복잡도가 증가할 수 있습니다.

2. **공간 복잡도**: O(n) - 쿼리 결과를 저장하기 위한 공간이 필요합니다. 결과 집합의 크기는 두 테이블의 조인 결과에 따라 결정되므로, 데이터의 양에 따라 공간 복잡도가 증가할 수 있습니다.

3. **풀이 접근법**: 이 쿼리는 outer join을 사용하여 employees 테이블과 Salaries 테이블을 조인합니다. outer join은 한 테이블에 매칭되는 행이 다른 테이블에 없을 경우에도 결과에 포함시킵니다. 이 경우, Salaries 테이블에 없는 employees 테이블의 행도 결과에 포함됩니다.

4. **잘된 점**: 코드는 간결하고, outer join을 사용하여 employees 테이블과 Salaries 테이블을 조인하는 것을 잘 구현했습니다. 또한, 필요한 컬럼만을 선택하여 결과를 반환합니다.

5. **개선 사항**: 현재 쿼리는 Oracle의 오래된 조인 구문을 사용하고 있습니다. 이를现代적인 조인 구문으로 변경하여 가독성을 높일 수 있습니다. 예를 들어, 다음과 같이 변경할 수 있습니다.
```oraclesql
SELECT T2.employee_id
  FROM employees T1
  LEFT OUTER JOIN Salaries T2
  ON T1.employee_id = T2.employee_id
```
이러한 변경으로 쿼리의 가독성이提高되고, 유지 보수가 용이해집니다.
