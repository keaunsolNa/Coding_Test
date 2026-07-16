# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 16. 오후 1:05:12 |
| Language | oraclesql |
| Runtime | 247 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/rearrange-products-table/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 Products 테이블의 각 행을 최대 3번 스캔하므로, 시간 복잡도는 O(n)입니다. 여기서 n은 Products 테이블의 행 수를 나타냅니다.

2. **공간 복잡도**: O(n) - 쿼리의 결과는 최대 3n개의 행을 반환할 수 있으므로, 공간 복잡도는 O(n)입니다. 여기서 n은 Products 테이블의 행 수를 나타냅니다.

3. **풀이 접근법**: 이 쿼리는 단순한 UNION 연산을 사용하여 각 스토어의 가격 정보를 조회합니다. 이는 문제의 요구 사항을 직접적으로 해결하는 접근법입니다.

4. **잘된 점**: 코드는 문제의 요구 사항을 명확하게 이해하고, UNION 연산을 사용하여 각 스토어의 가격 정보를 조회하는 부분이 잘 구현되어 있습니다. 또한, NULL 값을 체크하는 부분도 올바르게 구현되어 있습니다.

5. **개선 사항**: 현재 쿼리는 Products 테이블을 3번 스캔하므로, 테이블이 매우 큰 경우 성능이 저하될 수 있습니다. 대안적인 접근법으로는 UNPIVOT 연산을 사용하여 테이블을 한 번 스캔하는 방법이 있습니다. 예를 들어, 다음과 같은 쿼리를 사용할 수 있습니다.
```oraclesql
SELECT product_id, store, price
FROM (
  SELECT product_id, store1, store2, store3
  FROM Products
)
UNPIVOT (
  price FOR store IN (store1, store2, store3)
) AS unpivot_table
WHERE price IS NOT NULL;
```
이 쿼리는 Products 테이블을 한 번 스캔하여 성능을 개선할 수 있습니다.
