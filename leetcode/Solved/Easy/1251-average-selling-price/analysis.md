# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 14. 오후 2:57:47 |
| Language | mysql |
| Runtime | 105 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/average-selling-price/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 두 테이블의 내부 조인을 사용하여 product_id를 매칭합니다. 따라서 시간 복잡도는 두 테이블의 행 수에 비례합니다.
2. **공간 복잡도**: O(n) - 쿼리 결과는 product_id를 포함하는 테이블로, 공간 복잡도는 결과 행 수에 비례합니다.
3. **풀이 접근법**: 이 쿼리는 내부 조인(Inner Join)을 사용하여 두 테이블을 연결합니다. 이는 두 테이블에 공통으로 존재하는 product_id를 찾는 데 적합한 접근법입니다.
4. **잘된 점**: 코드는 간결하고, 필요한 조건을 명확하게 기술하여 쉽게 이해할 수 있습니다. 또한, 테이블 별칭(T1, T2)을 사용하여 코드를 더 읽기 쉽게 만들었습니다.
5. **개선 사항**: 현재 쿼리는 product_id만을 반환합니다. 그러나 평균 판매 가격을 계산하려면, 가격과 판매량을 고려하여 평균 가격을 계산하는 추가적인 계산이 필요합니다. 예를 들어, `SELECT AVG(T1.price * T2.units_sold) AS average_price FROM Prices T1 INNER JOIN UnitsSold T2 ON T1.product_id = T2.product_id`와 같은 쿼리를 사용할 수 있습니다.
