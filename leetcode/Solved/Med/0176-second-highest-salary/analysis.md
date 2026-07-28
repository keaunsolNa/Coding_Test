# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 28. 오후 2:00:50 |
| Language | oraclesql |
| Runtime | 359 ms (Beats 71.6%) |
| Memory | 0B (Beats 100.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/second-highest-salary/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 Employee 테이블을 두 번 스캔합니다. 첫 번째 스캔은 최대 급여를 찾기 위해 전체 테이블을 스캔하며, 두 번째 스캔은 두 번째로 높은 급여를 찾기 위해 최대 급여보다 낮은 급여를 가진 행을 스캔합니다.

2. **공간 복잡도**: O(1) - 이 쿼리는 추가적인 공간을 사용하지 않습니다. 쿼리 결과는 단일 행으로 반환되며, 임시 결과를 저장하기 위해 추가적인 공간이 필요하지 않습니다.

3. **풀이 접근법**: 이 쿼리는 서브쿼리(subquery)를 사용하여 Employee 테이블에서 최대 급여를 찾은 다음, 이 값을 사용하여 두 번째로 높은 급여를 찾습니다. 이는 간단하면서도 효과적인 접근법입니다.

4. **잘된 점**: 코드는 간결하고 읽기 쉽습니다. 서브쿼리를 사용하여 최대 급여를 찾는 것은 좋은 접근법이며, 두 번째로 높은 급여를 찾기 위해 이 값을 사용하는 것은 논리적으로 일관적입니다.

5. **개선 사항**: 이 쿼리는 이미 최적화되어 있습니다. 그러나 대안적인 접근법으로는 `DENSE_RANK()` 함수를 사용하여 급여를 순위로 매기고, 두 번째로 높은 급여를 찾는 방법이 있습니다. 예를 들어, `SELECT DISTINCT salary FROM (SELECT salary, DENSE_RANK() OVER (ORDER BY salary DESC) AS rank FROM Employee) WHERE rank = 2`와 같은 쿼리를 사용할 수 있습니다. 그러나 이 접근법은 원래 쿼리보다 더 복잡하며, 성능상 이점은 없습니다.
