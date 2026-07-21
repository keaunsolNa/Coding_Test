# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 21. 오후 5:35:39 |
| Language | oraclesql |
| Runtime | 279 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/customer-who-visited-but-did-not-make-any-transactions/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 두 테이블의 조인을 수행하며, 각 테이블의 행 수에 비례하는 시간이 소요됩니다. 여기서 n은 두 테이블의 행 수를 합친 것입니다.

2. **공간 복잡도**: O(n) - 쿼리 결과를 저장하기 위해 필요한 공간은 입력 테이블의 크기에 비례합니다.

3. **풀이 접근법**: 이 쿼리는 Outer Join을 사용하여 방문 기록이 있지만 거래가 없는 고객을 찾습니다. Outer Join은 한 테이블의 모든 행을 반환하고, 다른 테이블에 매칭되는 행이 있으면 해당 행을 반환하며, 없으면 NULL을 반환합니다.

4. **잘된 점**: 코드는 간결하고, Outer Join을 사용하여 문제를 효율적으로 해결했습니다. 또한, GROUP BY를 사용하여 중복되는 고객 ID를 제거했습니다.

5. **개선 사항**: 현재 쿼리는 방문 기록이 있지만 거래가 없는 고객을 찾는 데 사용됩니다. 하지만, 쿼리에서 GROUP BY를 사용하여 중복되는 고객 ID를 제거하고 있지만, HAVING 절을 사용하여 더 명확하게 조건을 지정할 수 있습니다. 또한, 조인 조건을 명시적으로 지정하여 코드를 더 읽기 쉽게 만들 수 있습니다. 예를 들어, 다음과 같이 수정할 수 있습니다.
```oraclesql
SELECT T2.customer_id
  FROM Visits T2
  LEFT JOIN Transactions T1 ON T1.visit_id = T2.visit_id
 WHERE T1.visit_id IS NULL
```
이 수정된 쿼리는 더 명확하게 방문 기록이 있지만 거래가 없는 고객을 찾는 데 사용됩니다.
