# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026-05-17 00:44:53 |
| Language | oraclesql |
| Runtime | 811 ms (Beats 45.7%) |
| Memory | 0B (Beats 100.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/bank-account-summary-ii/submissions/)

## Code Review

코드 리뷰를 진행하겠습니다.

1. **시간 복잡도**: O(n log n) - 이 쿼리는 조인 작업과 그룹화 작업을 수행합니다. Oracle SQL에서 조인은 일반적으로 O(n log n)으로 수행되며, 그룹화 또한 O(n log n)으로 수행됩니다. 따라서 전체 쿼리의 시간 복잡도는 O(n log n)입니다.

2. **공간 복잡도**: O(n) - 쿼리는 임시 테이블이나 인덱스와 같은 추가적인 공간을 사용하지 않습니다. 하지만 메모리에서 데이터를 처리하기 위해 일부 공간을 사용할 수 있습니다. 따라서 공간 복잡도는 O(n)으로 볼 수 있습니다.

3. **풀이 접근법**: 이 쿼리에서는 Users 테이블과 Transactions 테이블을 조인한 뒤, 각 사용자의 거래 금액을 합산하여 총 잔액을 계산합니다.接着, HAVING 절을 사용하여 잔액이 10,000 이상인 사용자만을 필터링합니다. 사용된 알고리즘은 기본적인 SQL 조인과 집계 함수입니다.

4. **잘된 점**: 코드는 매우 간결하고 읽기 쉽습니다. 필요한 테이블을 조인하고, 적절한 그룹화와 필터링을 수행하여 문제의 요구 사항을 잘满족합니다.

5. **개선 사항**: 현재 쿼리는 Users 테이블과 Transactions 테이블을 조인할 때 내부 조인(inner join)을 수행합니다. 하지만, 실제 상황에 따라 왼쪽 조인(left join) 또는 전체 외부 조인(full outer join)이 필요한 경우가 있을 수 있습니다. 또한, 테이블에 인덱스를 생성하여 쿼리 성능을 개선할 수 있습니다. 또한, HAVING 절에서 필터링을 수행하기 전에, WHERE 절에서 가능한한 많은 필터링을 수행하여 쿼리 성능을 개선하는 것이 좋습니다.
