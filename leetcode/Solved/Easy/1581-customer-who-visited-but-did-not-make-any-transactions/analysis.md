# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 21. 오후 5:38:32 |
| Language | oraclesql |
| Runtime | 295 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/customer-who-visited-but-did-not-make-any-transactions/submissions/)

## Code Review

코드 리뷰를 진행하겠습니다.

1. **시간 복잡도**: 이 쿼리의 시간 복잡도는 O(n)입니다. 여기서 n은 Visits 테이블의 행 수를 나타냅니다. 이유는 Visits 테이블의 모든 행을 한 번씩 읽어야 하기 때문입니다.

2. **공간 복잡도**: 이 쿼리의 공간 복잡도는 O(n)입니다. 이유는 결과 집합을 저장하기 위해 추가적인 공간이 필요하기 때문입니다.

3. **풀이 접근법**: 이 쿼리는 Outer Join을 사용하여 Visits 테이블과 Transactions 테이블을 연결합니다. Outer Join은 한 테이블의 모든 행을 반환하고, 다른 테이블에 매칭되는 행이 있으면 해당 행을 반환하고, 없으면 NULL을 반환합니다. 이 경우, Visits 테이블의 모든 고객을 대상으로 하되, Transactions 테이블에 매칭되는 행이 없는 고객만을 대상으로 합니다.

4. **잘된 점**: 이 쿼리는 Outer Join을 사용하여 Visits 테이블과 Transactions 테이블을 효과적으로 연결하고 있습니다. 또한, GROUP BY 절을 사용하여 결과를 고객 ID별로 그룹화하고 있습니다.

5. **개선 사항**: 이 쿼리는 이미 비교적 간결하고 효율적으로 작성되어 있습니다. 그러나, NOT EXISTS나 NOT IN을 사용하여 쿼리를 작성할 수도 있습니다. 예를 들어, 다음과 같이 작성할 수 있습니다.
```oraclesql
SELECT customer_id
FROM Visits
WHERE visit_id NOT IN (SELECT visit_id FROM Transactions)
```
이 방법은 Outer Join을 사용하는 것보다 더 직관적이고 효율적인 방법일 수 있습니다.
