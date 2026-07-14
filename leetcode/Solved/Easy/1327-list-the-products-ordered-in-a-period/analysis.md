# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 14. 오후 4:17:25 |
| Language | oraclesql |
| Runtime | 282 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/list-the-products-ordered-in-a-period/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리에서는 Products 테이블과 Orders 테이블을 조인하여 데이터를 조회합니다. 조회되는 데이터의 양에 비례하여 시간이 소요되므로 시간 복잡도는 O(n)입니다.

2. **공간 복잡도**: O(n) - 쿼리 결과를 저장하기 위해 필요한 공간은 조회되는 데이터의 양에 비례하므로 공간 복잡도는 O(n)입니다.

3. **풀이 접근법**: 이 쿼리에서는 내부 조인(inner join) 알고리즘을 사용하여 Products 테이블과 Orders 테이블을 연결하고, WHERE 절을 사용하여 특정 기간에 주문된 제품을 필터링합니다. 또한, GROUP BY 절을 사용하여 제품 이름별로 주문량을 집계합니다.

4. **잘된 점**: 코드는 간결하고 읽기 쉽습니다. 필요한 테이블을 조인하여 데이터를 조회하고, WHERE 절과 GROUP BY 절을 사용하여 데이터를 필터링하고 집계하는 부분이 잘 구현되어 있습니다.

5. **개선 사항**: 쿼리에서 사용된 날짜 형식('20200201'과 '20200228')이 문자열 형식입니다. 날짜 형식으로 변경하여 사용하는 것이 좋습니다. 또한, BETWEEN 연산자는 포함 연산자이므로 '20200228' 날짜의 데이터도 포함됩니다. 따라서, 날짜를 정확하게 필터링하기 위해서는 '<' 연산자를 사용하여 '20200229' 이전의 데이터를 조회하는 것이 좋습니다. 예를 들어, `T2.order_date >= DATE '2020-02-01' AND T2.order_date < DATE '2020-03-01'`과 같이 사용할 수 있습니다.
