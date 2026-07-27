# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 27. 오전 9:02:24 |
| Language | oraclesql |
| Runtime | 427 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/sales-person/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: 이 쿼리의 시간 복잡도는 O(n)입니다. 여기서 n은 SalesPerson, Orders, Company 테이블의 행 수를 합친 것입니다. 이유는 쿼리가 세 테이블을 조인하기 때문입니다.

2. **공간 복잡도**: 이 쿼리의 공간 복잡도는 O(n)입니다. 쿼리가 실행되면서 임시로 생성되는 결과 집합의 크기가 원본 테이블의 크기와 비슷하기 때문입니다.

3. **풀이 접근법**: 이 쿼리는 조인 알고리즘을 사용합니다. Outer Join을 사용하여 SalesPerson 테이블의 모든 행을 가져오고, Orders 테이블과 Company 테이블을 조인하여 필요한 데이터를 가져옵니다.

4. **잘된 점**: 이 쿼리는 간단하고 읽기 쉽습니다. Outer Join을 사용하여 NULL 값을 포함한 행도 가져올 수 있습니다. 또한, WHERE 절에서 'RED'라는 이름을 제외하는 조건을 추가하여 문제의 요구 사항을 만족합니다.

5. **개선 사항**: 이 쿼리는 이미 최적화되어 있습니다. 그러나, 테이블의 크기가 매우 큰 경우, 인덱스를 생성하여 쿼리 성능을 개선할 수 있습니다. 또한, 조인 순서를 변경하거나, 힌트를 사용하여 쿼리 최적화기를 조정할 수 있습니다. 그러나, 이러한 최적화는 실제 쿼리 성능을 측정하여 필요한 경우에만 적용해야 합니다.
