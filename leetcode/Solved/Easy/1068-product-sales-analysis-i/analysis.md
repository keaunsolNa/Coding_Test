# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026-05-13 20:53:55 |
| Language | oraclesql |
| Runtime | 894 ms (Beats 20.5%) |
| Memory | 0B (Beats 100.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/product-sales-analysis-i/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 Sales와 Product 테이블의 모든 행을 스캔해야 하므로 시간 복잡도는 두 테이블의 행 수에 비례합니다.
2. **공간 복잡도**: O(n) - 쿼리 결과를 저장하기 위한 공간이 필요하므로 공간 복잡도도 시간 복잡도와 비슷하게 두 테이블의 행 수에 비례합니다.
3. **풀이 접근법**: 이 쿼리는 INNER JOIN을 사용하여 Sales와 Product 테이블을 연결합니다. 이 접근법은 두 테이블의 공통 column인 product_id를 기반으로 하는 INNER JOIN이므로 효율적인 쿼리입니다.
4. **잘된 점**: 두 테이블을 조인하여 필요한 데이터를 추출하는 부분은 매우 잘 구현되어 있습니다. 또한 쿼리 자체가 간결하고 이해하기 쉽습니다.
5. **개선 사항**: 현재 쿼리는 필요한 모든 column을 선택하고 있습니다. 하지만 만약 특정 column만 필요하다면 해당 column만 선택하여 쿼리 성능을 개선할 수 있습니다. 또한, index를 생성하여 쿼리 성능을 더 개선할 수 있습니다. 예를 들어, product_id column에 index를 생성하면 조인 연산이 더 빠르게 수행될 수 있습니다.
