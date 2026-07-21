# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 21. 오후 5:34:47 |
| Language | oraclesql |
| Runtime | 339 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/customer-who-visited-but-did-not-make-any-transactions/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 두 테이블의 조인을 수행하므로, 방문 기록과 트랜잭션 기록의 총 개수에 비례하는 시간 복잡도를 가지게 됩니다. 여기서 n은 두 테이블의 행 개수를 의미합니다.

2. **공간 복잡도**: O(n) - 쿼리 결과를 저장하기 위해 필요한 공간은 방문 기록과 트랜잭션 기록의 총 개수에 비례하므로, 공간 복잡도도 O(n)입니다.

3. **풀이 접근법**: 이 쿼리는 내부 조인(inner join) 알고리즘을 사용하여 두 테이블을 연결합니다. 방문 기록 테이블과 트랜잭션 기록 테이블의 visit_id를 기준으로 조인하여 결과를 도출합니다.

4. **잘된 점**: 코드는 간결하고, 필요한 조인 조건을 명확하게 지정했습니다. 또한, 필요한 컬럼만을 선택하여 불필요한 데이터를 로드하지 않습니다.

5. **개선 사항**: 현재 쿼리는 모든 트랜잭션을 포함하는 방문 기록의 customer_id를 반환합니다. 하지만, 문제는 트랜잭션이 없는 방문 기록의 customer_id를 반환해야 합니다. 따라서, 쿼리를 수정하여 트랜잭션이 없는 방문 기록만을 반환하도록 해야 합니다. 예를 들어, 다음과 같이 수정할 수 있습니다.
```oraclesql
SELECT T2.customer_id
  FROM Visits T2
 WHERE T2.visit_id NOT IN (SELECT T1.visit_id FROM Transactions T1)
```
또는,
```oraclesql
SELECT T2.customer_id
  FROM Visits T2
  LEFT JOIN Transactions T1 ON T2.visit_id = T1.visit_id
 WHERE T1.visit_id IS NULL
```
