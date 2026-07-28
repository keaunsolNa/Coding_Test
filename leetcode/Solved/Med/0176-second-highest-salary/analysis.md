# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 28. 오후 1:56:42 |
| Language | oraclesql |
| Runtime | 690 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/second-highest-salary/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n log n)입니다. 이유는 서브쿼리에서 Employee 테이블의 모든 레코드를 정렬하기 때문입니다. 이 정렬 작업은 일반적으로 O(n log n)의 시간 복잡도를 가지며, 여기서 n은 Employee 테이블의 레코드 수입니다.

2. **공간 복잡도**: O(n)입니다. 이유는 서브쿼리에서 Employee 테이블의 모든 레코드를 임시로 저장하기 때문입니다. 이 임시 저장 공간은 Employee 테이블의 크기와 동일하므로 O(n)의 공간 복잡도를 가집니다.

3. **풀이 접근법**: 이 코드는 서브쿼리와 정렬을 사용하여 두 번째로 높은 급여를 찾는 접근법을 사용합니다. 먼저 Employee 테이블의 모든 레코드를 급여를 기준으로 내림차순으로 정렬하고, 그 다음에 ROWNUM을 사용하여 두 번째 레코드를 선택합니다. 이는 간단한 문제 해결 패턴이지만, 대규모 데이터셋에서는 비효율적일 수 있습니다.

4. **잘된 점**: 이 코드는 간단하고 이해하기 쉽습니다. 또한, Oracle SQL의 ROWNUM 기능을 사용하여 두 번째 레코드를 선택하는 방식은 직관적입니다.

5. **개선 사항**: 이 코드는 두 번째로 높은 급여만을 찾는다는 점을 고려하여, 더 효율적인 방법으로 개선할 수 있습니다. 예를 들어, DENSE_RANK 함수를 사용하여 급여를 순위로 매기고, 순위가 2인 레코드를 선택할 수 있습니다. 이는 더 효율적이고 확장 가능합니다. 또한, NULL을 처리하는 방법을 추가하여, 두 번째로 높은 급여가 없는 경우를 처리할 수 있습니다. 예를 들어, 다음과 같이 작성할 수 있습니다:
```oraclesql
SELECT MAX(salary) as SecondHighestSalary
FROM Employee
WHERE salary < (SELECT MAX(salary) FROM Employee)
```
이 코드는 두 번째로 높은 급여를 찾는 더 효율적인 방법입니다.
