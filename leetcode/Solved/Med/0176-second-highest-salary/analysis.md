# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 28. 오후 1:57:39 |
| Language | oraclesql |
| Runtime | 286 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/second-highest-salary/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n log n) - 이 쿼리는 Employee 테이블의 모든 행을 정렬해야 하므로 시간 복잡도는 정렬 알고리즘의 시간 복잡도와 동일합니다. 일반적으로 데이터베이스에서 사용되는 정렬 알고리즘은 평균 시간 복잡도가 O(n log n)입니다.

2. **공간 복잡도**: O(n) - 이 쿼리는 Employee 테이블의 모든 행을 임시 결과 집합에 저장해야 하므로 공간 복잡도는 테이블의 행 수와 동일합니다.

3. **풀이 접근법**: 이 쿼리는 Employee 테이블의 salary 열을 내림차순으로 정렬하여 두 번째로 높은 급여를 찾는 접근법을 사용합니다. 이 접근법은 단순하고 직관적이지만 대용량 데이터를 처리하는 경우에는 비효율적일 수 있습니다.

4. **잘된 점**: 이 쿼리는 간단하고 이해하기 쉽습니다. 또한, Employee 테이블의 모든 행을 고려하여 두 번째로 높은 급여를 찾는다는 점에서 올바른 접근법을 사용하고 있습니다.

5. **개선 사항**: 이 쿼리는 두 번째로 높은 급여를 찾는 데만 관심이 있으므로, 모든 행을 정렬할 필요는 없습니다. 대신, DISTINCT 키워드를 사용하여 중복된 급여를 제거하고, LIMIT 키워드를 사용하여 두 번째로 높은 급여만 가져오는 것이 더 효율적입니다. 또한, Oracle SQL에서는 DENSE_RANK 함수를 사용하여 두 번째로 높은 급여를 찾는 것이 더 간결하고 효율적인 방법입니다. 예를 들어, 다음과 같이 쿼리를 작성할 수 있습니다.
```oraclesql
SELECT MAX(salary) as SecondHighestSalary
FROM Employee
WHERE salary < (SELECT MAX(salary) FROM Employee)
```
이 쿼리는 가장 높은 급여를 제외한 모든 급여 중에서 가장 높은 급여를 찾습니다. 이 접근법은 더 효율적이고 간결합니다.
