# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 21. 오후 5:35:23 |
| Language | oraclesql |
| Runtime | 301 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/customer-who-visited-but-did-not-make-any-transactions/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 두 테이블의 조인을 수행하며, 각 테이블의 행 수에 비례하는 시간이 소요됩니다. 여기서 n은 두 테이블의 행 수를 합친 것입니다.

2. **공간 복잡도**: O(n) - 쿼리 결과를 저장하기 위한 공간이 필요하며, 결과의 크기는 두 테이블의 행 수에 비례합니다.

3. **풀이 접근법**: 이 쿼리에서는 Outer Join을 사용하여 방문 기록이 있지만 거래가 없는 고객을 찾습니다. 이는 문제의 요구 사항을 만족하는 간단한 해결책입니다.

4. **잘된 점**: 코드는 간결하며, Outer Join을 사용하여 문제를 효율적으로 해결했습니다. 또한, GROUP BY를 사용하여 중복된 고객 ID를 제거했습니다.

5. **개선 사항**: 현재 쿼리는 방문 기록이 있지만 거래가 없는 고객을 찾는 데 성공했습니다. 그러나 쿼리에서 사용된 오래된 조인 구문(T1, T2) 대신에, 현대적인 조인 구문을 사용하는 것이 좋습니다. 예를 들어, 다음과 같이 작성할 수 있습니다.
```oraclesql
SELECT T2.customer_id
  FROM Visits T2
  LEFT JOIN Transactions T1 ON T1.visit_id = T2.visit_id
 WHERE T1.visit_id IS NULL
```
이렇게 하면 코드의 가독성이 향상되고, 쿼리의 의도를 더 명확하게 전달할 수 있습니다.
