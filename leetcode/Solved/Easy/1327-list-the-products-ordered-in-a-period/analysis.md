# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 14. 오후 4:19:19 |
| Language | oraclesql |
| Runtime | 356 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/list-the-products-ordered-in-a-period/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n log n) - 이 쿼리에서는 서브쿼리에서 그룹화 연산이 수행되며, 이는 일반적으로 O(n log n)의 시간 복잡도를 가집니다. 여기서 n은 테이블의 행 수를 나타냅니다.

2. **공간 복잡도**: O(n) - 쿼리 결과를 저장하기 위해 필요한 공간은 입력 테이블의 크기에 비례하므로 O(n)의 공간 복잡도를 가집니다.

3. **풀이 접근법**: 이 쿼리에서는 서브쿼리와 조인 연산을 사용하여 주문 기간 동안 각 제품의 주문량을 집계합니다. 이는 관계형 데이터베이스에서 데이터를 집계하고 필터링하는 일반적인 패턴입니다.

4. **잘된 점**: 코드는 읽기 쉽고, 서브쿼리를 사용하여 주문량을 집계하는 로직이 명확하게 분리되어 있습니다. 또한, 필요한 열만 선택하여 불필요한 데이터를 로드하지 않도록 최적화되어 있습니다.

5. **개선 사항**: 쿼리에서 사용된 날짜 형식이 문자열로 지정되어 있습니다. 이는 날짜 형식의 표준을 따르지 않는 것으로 보입니다. 대신, TO_DATE 함수를 사용하여 날짜를 지정하거나, 날짜 리터럴을 사용할 수 있습니다. 예를 들어, `AND T2.order_date BETWEEN TO_DATE('2020-02-01', 'YYYY-MM-DD') AND TO_DATE('2020-02-28', 'YYYY-MM-DD')`와 같이 사용할 수 있습니다. 또한, 조인 조건을 WHERE 절이 아닌 JOIN 절에서 지정하는 것이 더 표준적입니다. 예를 들어, `FROM Products T1 JOIN Orders T2 ON T1.product_id = T2.product_id`와 같이 사용할 수 있습니다.
