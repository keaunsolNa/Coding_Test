# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 21. 오후 5:39:56 |
| Language | oraclesql |
| Runtime | 274 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/customer-who-visited-but-did-not-make-any-transactions/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 Visits 테이블과 Transactions 테이블을 조인하여 데이터를 처리합니다. 조인 연산의 시간 복잡도는 일반적으로 O(n)입니다. 여기서 n은 Visits 테이블의 행 수를 나타냅니다.

2. **공간 복잡도**: O(n) - 쿼리 결과를 저장하기 위해 필요한 공간은 입력 데이터의 크기와 비례합니다. 즉, Visits 테이블의 행 수에 비례하는 공간이 필요합니다.

3. **풀이 접근법**: 이 쿼리는 외조인(outer join)과 집계 함수를 사용하여 방문 기록이 있지만 거래가 없는 고객을 찾습니다. 외조인은 한 테이블의 모든 행을 다른 테이블의 匹配行과 조인하는 데 사용됩니다. 여기서는 Visits 테이블의 모든 행을 Transactions 테이블의 匹配 행과 조인하여 거래가 없는 방문 기록을 찾습니다.

4. **잘된 점**: 이 쿼리는 문제를 명확하게 이해하고, 외조인과 집계 함수를 효과적으로 사용하여 원하는 결과를 얻었습니다. 또한, HAVING 절을 사용하여 결과를 필터링하여 거래가 없는 고객만을 반환했습니다.

5. **개선 사항**: 쿼리에서 사용된 외조인은 오라클의 구식 문법입니다. 최신 문법을 사용하여 LEFT JOIN을 사용할 수 있습니다. 또한, 서브쿼리 또는 EXISTS 연산자를 사용하여 쿼리를 최적화할 수 있습니다. 예를 들어, 다음과 같이 쿼리를 작성할 수 있습니다.
```oraclesql
SELECT T1.customer_id
     , COUNT(T1.visit_id) as count_no_trans 
  FROM Visits T1
  LEFT JOIN Transactions T2
  ON T1.visit_id = T2.visit_id
 WHERE T2.visit_id IS NULL
 GROUP BY T1.customer_id
 HAVING COUNT(T1.visit_id) > 0
```
이러한 최적화는 쿼리의 성능을 향상시킬 수 있습니다.
