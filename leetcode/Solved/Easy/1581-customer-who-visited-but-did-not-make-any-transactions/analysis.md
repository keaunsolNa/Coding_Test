# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 21. 오후 5:35:11 |
| Language | oraclesql |
| Runtime | 336 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/customer-who-visited-but-did-not-make-any-transactions/submissions/)

## Code Review

코드 리뷰를 진행하겠습니다.

1. **시간 복잡도**: 이 쿼리의 시간 복잡도는 O(n)입니다. 여기서 n은 Visits 테이블과 Transactions 테이블의 행 수를 합친 것입니다. 쿼리는 두 테이블을 조인하고 그룹화하기 때문에, 각 행을 한 번씩 처리합니다.

2. **공간 복잡도**: 이 쿼리의 공간 복잡도는 O(n)입니다. 쿼리가 생성하는 임시 결과 집합은 입력 테이블의 크기에 비례합니다. 특히, 조인과 그룹화 연산을 처리하는 동안 임시 공간이 필요합니다.

3. **풀이 접근법**: 이 쿼리는 내부 조인(inner join)과 그룹화(group by) 알고리즘을 사용합니다. 조인은 두 테이블에서 일치하는 행을 결합하고, 그룹화는 customer_id 기준으로 결과를 집계합니다. 그러나 이 접근법은 원하는 결과를 얻지 못합니다. 원하는 결과는 방문했지만 거래를 하지 않은 고객의 ID를 얻는 것입니다.

4. **잘된 점**: 코드는 간결하고, 조인과 그룹화의 기본적인 사용법을 보여줍니다. 그러나 쿼리가 원하는 결과를 얻지 못하는 것은 문제입니다.

5. **개선 사항**: 현재 쿼리는 방문했지만 거래를 하지 않은 고객의 ID를 얻는 것을 목표로 하지 않습니다. 올바른 접근법은 방문 기록이 있지만 거래 기록이 없는 고객을 찾는 것입니다. 이를 위해 LEFT JOIN이나 NOT IN, NOT EXISTS와 같은 연산자를 사용할 수 있습니다. 예를 들어, 다음 쿼리는 올바른 결과를 얻을 수 있습니다.
```oraclesql
SELECT T2.customer_id
  FROM Visits T2
  LEFT JOIN Transactions T1 ON T1.visit_id = T2.visit_id
 WHERE T1.visit_id IS NULL;
```
이 쿼리는 방문 기록이 있지만 거래 기록이 없는 고객의 ID를 반환합니다.
