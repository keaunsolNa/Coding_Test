# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 28. 오후 1:57:19 |
| Language | oraclesql |
| Runtime | 256 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/second-highest-salary/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n log n)입니다. 이유는 ORDER BY 연산이 전체 데이터를 정렬해야 하기 때문입니다. 여기서 n은 Employee 테이블의 행 수를 나타냅니다.

2. **공간 복잡도**: O(n)입니다. 이유는 서브쿼리에서 정렬된 결과를 임시로 저장해야 하기 때문입니다. 이 임시 저장공간의 크기는 최대 n이 될 수 있습니다.

3. **풀이 접근법**: 이 풀이는 정렬 알고리즘을 사용하여 최고 급여와 두 번째로 높은 급여를 찾는 접근법입니다. 서브쿼리에서 급여를 내림차순으로 정렬한 후, ROWNUM을 사용하여 두 번째 행을 선택합니다.

4. **잘된 점**: 이 코드는 간결하고 이해하기 쉽습니다. 또한, Oracle SQL의 ROWNUM 기능을 효과적으로 사용하여 두 번째로 높은 급여를 찾습니다.

5. **개선 사항**: 이 문제는 두 번째로 높은 급여를 찾는 문제이므로, DISTINCT 키워드를 사용하여 중복 급여를 제거한 후 LIMIT 또는 ROWNUM을 사용하여 두 번째 행을 선택할 수 있습니다. 또한, MAX와 MIN 함수를 사용하여 최고와 최저 급여를 찾은 후, 두 번째로 높은 급여를 찾는 방법도 있습니다. 그러나 이 경우, 서브쿼리와 조인을 사용해야 하므로, 복잡도가 증가할 수 있습니다. 예를 들어, 다음과 같이 작성할 수 있습니다:
```oraclesql
SELECT MAX(salary) as SecondHighestSalary 
FROM Employee
WHERE salary < (SELECT MAX(salary) FROM Employee)
```
