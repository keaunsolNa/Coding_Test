# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 14. 오후 3:03:43 |
| Language | oraclesql |
| Runtime | 687 ms (Beats 99.3%) |
| Memory | 0B (Beats 100.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/average-selling-price/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: 이 쿼리의 시간 복잡도는 O(n log n)입니다. 여기서 n은 Prices와 UnitsSold 테이블의 행 수를 합친 것입니다. 이유는 GROUP BY 연산이 수행되기 때문입니다. GROUP BY는 데이터를 그룹화하기 위해 정렬을 수행해야 하므로 시간 복잡도가 O(n log n)입니다.

2. **공간 복잡도**: 이 쿼리의 공간 복잡도는 O(n)입니다. 여기서 n은 Prices와 UnitsSold 테이블의 행 수를 합친 것입니다. 이유는 쿼리 결과를 저장하기 위해 임시 공간이 필요하기 때문입니다.

3. **풀이 접근법**: 이 쿼리에서는 JOIN과 GROUP BY를 사용하여 평균 판매 가격을 계산합니다. JOIN은 두 테이블을 연결하여 데이터를 통합하고, GROUP BY는 데이터를 그룹화하여 평균 값을 계산합니다. 이 접근법은 문제를 효율적으로 해결할 수 있습니다.

4. **잘된 점**: 이 쿼리는 문제를 명확하게 이해하고, 필요한 데이터를 효율적으로 가져오는 방식으로 작성되었습니다. 또한, NVL 함수를 사용하여 NULL 값을 처리하여 결과가 더 정확해집니다.

5. **개선 사항**: 이 쿼리는 이미 효율적으로 작성되어 있지만, 일부 최적화를 수행할 수 있습니다. 예를 들어, INDEX를 생성하여 JOIN과 GROUP BY의 성능을 개선할 수 있습니다. 또한, 쿼리에서 사용되는 열만 가져오도록 SELECT 문을 수정하여 데이터 전송량을 줄일 수 있습니다. 또한, Oracle 12c 이상에서는 LEFT JOIN을 사용하여 OUTER JOIN을 대체할 수 있습니다. 예를 들어, `FROM Prices T1 LEFT JOIN UnitsSold T2 ON T1.product_id = T2.product_id AND T2.purchase_date BETWEEN T1.start_date AND T1.end_date`와 같이 작성할 수 있습니다.
