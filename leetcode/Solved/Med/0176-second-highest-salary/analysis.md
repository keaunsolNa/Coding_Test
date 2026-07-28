# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 28. 오후 1:57:51 |
| Language | oraclesql |
| Runtime | 313 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/second-highest-salary/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n log n)입니다. 이유는 ORDER BY 연산이 전체 데이터를 정렬해야 하기 때문입니다. 이 경우, 데이터의 개수가 n개일 때, 정렬에 필요한 시간이 n log n이 됩니다.

2. **공간 복잡도**: O(n)입니다. 이유는 서브쿼리에서 정렬된 결과를 임시로 저장해야 하기 때문입니다. 이 경우, 데이터의 개수가 n개일 때, 필요한 공간이 n이 됩니다.

3. **풀이 접근법**: 이 풀이에서는 정렬 알고리즘을 사용했습니다. 먼저 Employee 테이블의 salary 열을 내림차순으로 정렬하고, 그다음 ROWNUM을 사용하여 두 번째로 높은 급여를 찾습니다. 이는 간단하면서도 직관적인 접근법입니다.

4. **잘된 점**: 코드는 간결하고 이해하기 쉽습니다. 또한, 필요한 데이터만을 조회하여 불필요한 데이터 처리를 피했습니다. 이는 효율적인 데이터 처리를 위한 좋은 방법입니다.

5. **개선 사항**: 이 코드는 Oracle의 특정 기능인 ROWNUM을 사용합니다. 다른 데이터베이스 시스템에서는 LIMIT나 OFFSET을 사용하여 같은 결과를 얻을 수 있습니다. 또한, 이 풀이는 데이터가 많을 때 성능이 저하될 수 있습니다. 대안으로는 DISTINCT와 MAX 함수를 사용하여 최고 급여를 찾은 다음, 그다음으로 높은 급여를 찾는 방법이 있습니다. 이는 다음과 같은 쿼리로 구현할 수 있습니다: 
```sql
SELECT MAX(salary) as SecondHighestSalary 
FROM Employee
WHERE salary < (SELECT MAX(salary) FROM Employee)
```
