# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 21. 오후 5:39:20 |
| Language | oraclesql |
| Runtime | 333 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/customer-who-visited-but-did-not-make-any-transactions/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 Visits 테이블과 Transactions 테이블을 조인하여 결과를 도출합니다. 조인 연산의 시간 복잡도는 일반적으로 O(n)입니다. 여기서 n은 Visits 테이블의 행 수를 나타냅니다.

2. **공간 복잡도**: O(n) - 쿼리 결과는 customer_id와 방문 횟수 차이를 포함하는 테이블로, 최대 n개의 행을 가질 수 있습니다. 따라서 공간 복잡도는 O(n)입니다.

3. **풀이 접근법**: 이 쿼리는 Outer Join을 사용하여 Visits 테이블과 Transactions 테이블을 조인합니다. Outer Join은 한 테이블의 모든 행을 반환하고, 다른 테이블에 일치하는 행이 없는 경우 NULL 값을 반환합니다. 이 접근법은 고객이 방문했지만 거래를 하지 않은 경우를 효과적으로 찾을 수 있습니다.

4. **잘된 점**: 이 쿼리는 간결하고 읽기 쉽습니다. Outer Join을 사용하여 문제를 효과적으로 해결했습니다. 또한, 필요한 컬럼만을 SELECT절에 포함시켜 불필요한 데이터를 반환하지 않습니다.

5. **개선 사항**: 쿼리에서 사용된 Outer Join은 오라클에서 deprecated된 기능입니다. 대신, LEFT JOIN을 사용하는 것이 좋습니다. 또한, 쿼리에서 사용된 테이블 별칭(T1, T2)은 명확하지만, 더 명확한 별칭을 사용하는 것이 좋습니다. 예를 들어, Visits를 V, Transactions를 T로 별칭을 지정할 수 있습니다. 다음과 같이 개선할 수 있습니다.
```oraclesql
SELECT V.customer_id, COUNT(V.visit_id) - COUNT(T.visit_id)
FROM Visits V
LEFT JOIN Transactions T ON V.visit_id = T.visit_id
GROUP BY V.customer_id
```
