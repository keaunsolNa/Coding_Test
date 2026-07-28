# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 28. 오후 1:56:05 |
| Language | oraclesql |
| Runtime | 743 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/second-highest-salary/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n log n)입니다. 이는 ORDER BY 연산이 전체 데이터를 정렬해야 하므로 n log n의 시간 복잡도를 가지기 때문입니다. 여기서 n은 Employee 테이블의 행 수를 나타냅니다.

2. **공간 복잡도**: O(n)입니다. 이는 서브쿼리에서 정렬된 결과를 임시로 저장해야 하므로 추가적인 공간이 필요하기 때문입니다.

3. **풀이 접근법**: 이 풀이는 서브쿼리와 ORDER BY를 사용하여 급여를 내림차순으로 정렬한 후, ROWNUM을 사용하여 두 번째로 높은 급여를 선택합니다. 이는 간단하면서도 직관적인 접근법입니다.

4. **잘된 점**: 코드는 간결하고 읽기 쉽습니다. 또한, 필요한 작업을 효율적으로 수행합니다. 특히, 서브쿼리를 사용하여 문제를 단순화한 점은 좋습니다.

5. **개선 사항**: 이 풀이는 Oracle의 특정 기능인 ROWNUM을 사용합니다. 그러나 다른 데이터베이스 시스템에서는 LIMIT나 OFFSET을 사용할 수 있습니다. 따라서, 데이터베이스 시스템에 따라 조금 다르게 구현할 수 있습니다. 또한, 만약 Employee 테이블이非常 크다면, INDEX를 생성하여 ORDER BY 연산을 최적화할 수 있습니다. 그러나 이 풀이는 이미 khá 효율적이므로, 추가적인 최적화는 실제 사용 사례에 따라 결정해야 합니다.
