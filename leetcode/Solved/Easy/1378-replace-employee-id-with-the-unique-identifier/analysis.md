# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 16. 오전 10:28:49 |
| Language | mysql |
| Runtime | 1151 ms (Beats 86.0%) |
| Memory | 0B (Beats 100.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/replace-employee-id-with-the-unique-identifier/submissions/)

## Code Review

코드 리뷰를 진행하겠습니다.

1. **시간 복잡도**: 이 쿼리의 시간 복잡도는 O(n)입니다. 여기서 n은 Employees 테이블과 EmployeeUNI 테이블의 행 수를 합친 것입니다. 이유는 쿼리가 두 테이블을 조인하기 때문입니다. 조인 연산은 일반적으로 두 테이블의 행을 하나씩 비교하기 때문에 시간 복잡도가 O(n)입니다.

2. **공간 복잡도**: 이 쿼리의 공간 복잡도는 O(n)입니다. 쿼리가 생성하는 결과 집합의 크기는 두 테이블의 행 수에 비례하기 때문입니다. 즉, 결과 집합이 클수록 더 많은 메모리가 필요합니다.

3. **풀이 접근법**: 이 쿼리는 LEFT JOIN 알고리즘을 사용합니다. LEFT JOIN은 왼쪽 테이블의 모든 행을 결과에 포함하고, 오른쪽 테이블에서 일치하는 행이 있으면 해당 행을 포함합니다. 이 쿼리에서는 Employees 테이블의 모든 행을 결과에 포함하고, EmployeeUNI 테이블에서 일치하는 행이 있으면 unique_id를 포함합니다.

4. **잘된 점**: 이 쿼리는 간결하고 명확합니다. 필요한 열만 선택하고, 조인 조건을 명확히 지정했습니다. 또한 LEFT JOIN을 사용하여 Employees 테이블의 모든 행을 결과에 포함했습니다.

5. **개선 사항**: 이 쿼리는 이미 최적화되어 있습니다. 그러나 Employees 테이블과 EmployeeUNI 테이블에 인덱스를 생성하면 쿼리 성능을 향상시킬 수 있습니다. 특히 id 열에 인덱스를 생성하면 조인 연산의 성능을 향상시킬 수 있습니다. 또한 쿼리에서 불필요한 열을 선택하지 않도록 주의해야 합니다. 현재 쿼리는 name 열만 선택하고 있으므로 문제 없습니다.
