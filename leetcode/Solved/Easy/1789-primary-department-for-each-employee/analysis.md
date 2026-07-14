# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 14. 오후 2:32:23 |
| Language | oraclesql |
| Runtime | 277 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/primary-department-for-each-employee/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 Employee 테이블을 한 번 스캔하고, 서브쿼리를 사용하여 추가적인 스캔을 수행합니다. 그러나 서브쿼리는 인덱스를 사용하여 빠르게 수행되므로, 전체 시간 복잡도는 O(n)입니다.

2. **공간 복잡도**: O(n) - 쿼리 결과는 Employee 테이블의 행 수만큼의 공간을占有합니다. 따라서 공간 복잡도는 O(n)입니다.

3. **풀이 접근법**: 이 쿼리는 집계 함수(COUNT)를 사용하여 department_id의 개수를 세고, CASE 문을 사용하여 primary_flag가 'Y'인 department_id를 선택합니다. 이는 기본적인 집계 및 필터링 알고리즘을 사용한 접근법입니다.

4. **잘된 점**: 코드는 비교적 간결하고, 필요한 컬럼만을 선택하여 결과를 반환합니다. 또한, 서브쿼리를 사용하여 primary_flag가 'Y'인 department_id를 선택하는 방식은 직관적입니다.

5. **개선 사항**: 현재 쿼리는 GROUP BY 절에서 department_id를 포함하고 있습니다. 그러나 department_id는 결과에서 필요하지 않습니다. 따라서 GROUP BY 절에서 department_id를 제거하고, SELECT 절에서 department_id를 제거한 후, 서브쿼리에서 department_id를 선택하는 방식으로 개선할 수 있습니다. 또한, 인덱스를 생성하여 쿼리 성능을 개선할 수 있습니다. 예를 들어, Employee 테이블에 (employee_id, primary_flag) 인덱스를 생성하여 서브쿼리의 성능을 개선할 수 있습니다.
