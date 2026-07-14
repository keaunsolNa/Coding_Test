# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 14. 오후 2:59:38 |
| Language | oraclesql |
| Runtime | 267 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/average-selling-price/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n^2) - 이 쿼리는 두 테이블의 교차 조인으로 인해 시간 복잡도가 높을 수 있습니다. 교차 조인으로 인해 각 행마다 다른 테이블의 모든 행을 스캔해야 하기 때문입니다.

2. **공간 복잡도**: O(n) - 쿼리 결과는 각 product_id에 대한 정보를 담고 있으므로, 공간 복잡도는 결과 집합의 크기에 비례합니다.

3. **풀이 접근법**: 이 쿼리는 교차 조인과 필터링을 사용하여 문제를 해결합니다. Prices 테이블과 UnitsSold 테이블을 조인하여 purchase_date가 start_date와 end_date 사이에 있는 행을 찾습니다. 그 후, product_id로 그룹화하여 결과를 집계합니다.

4. **잘된 점**: 쿼리는 문제의 요구 사항을 명확하게 반영하고 있습니다. product_id를 기준으로 그룹화하여 결과를 집계하는 부분이 잘 구현되어 있습니다.

5. **개선 사항**: 쿼리의 성능을 개선하기 위해 인덱스를 생성할 수 있습니다. 예를 들어, Prices 테이블의 start_date와 end_date 열에 인덱스를 생성하면 쿼리의 필터링 속도를 개선할 수 있습니다. 또한, UnitsSold 테이블의 purchase_date 열에 인덱스를 생성하면 조인 속도를 개선할 수 있습니다. 또한, 조인 순서를 조정하거나, 다른 조인 알고리즘을 사용하여 쿼리 성능을 개선할 수 있습니다. 예를 들어, 다음과 같이 쿼리를 개선할 수 있습니다.
```oraclesql
SELECT T1.product_id
  FROM Prices T1
  JOIN UnitsSold T2 ON T1.product_id = T2.product_id
   AND T2.purchase_date BETWEEN T1.start_date AND T1.end_date
 GROUP BY T1.product_id
```
이러한 개선 사항을 적용하면 쿼리의 성능을 개선할 수 있습니다.
