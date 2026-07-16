# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 16. 오전 10:28:20 |
| Language | mysql |
| Runtime | 115 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/replace-employee-id-with-the-unique-identifier/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 Employees 테이블과 EmployeeUNI 테이블을 조인합니다. 조인 연산의 시간 복잡도는 일반적으로 O(n)입니다. 여기서 n은 테이블의 행 수를 나타냅니다.

2. **공간 복잡도**: O(n) - 쿼리 결과는 두 테이블의 조인 결과를 저장해야 하므로 공간 복잡도도 O(n)입니다. 여기서 n은 결과 집합의 행 수를 나타냅니다.

3. **풀이 접근법**: 이 쿼리는 RIGHT JOIN을 사용하여 Employees 테이블과 EmployeeUNI 테이블을 조인합니다. RIGHT JOIN은 EmployeeUNI 테이블의 모든 행을 포함하고, Employees 테이블에서 일치하는 행이 있는 경우에만 해당 행을 포함합니다. 이 접근법은 EmployeeUNI 테이블의 unique_id를 Employees 테이블의 이름과 함께 가져오기 위해 사용됩니다.

4. **잘된 점**: 코드는 간결하고 이해하기 쉽습니다. RIGHT JOIN을 사용하여 EmployeeUNI 테이블의 모든 행을 포함하는 것은 문제의 요구 사항을 만족합니다.

5. **개선 사항**: 쿼리에서 Employees 테이블의 이름을 가져오는 데 사용된 T1.name은 별칭이 명확하지 않습니다. 테이블 별칭을 더 명확하게 사용하거나, 테이블 이름을 더 짧게 축약하여 사용할 수 있습니다. 또한, 쿼리에서 사용된 테이블과 열 이름이 실제 테이블과 열 이름과 일치하는지 확인해야 합니다.
