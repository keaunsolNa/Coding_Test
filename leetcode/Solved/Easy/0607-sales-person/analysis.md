# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 27. 오전 9:02:51 |
| Language | oraclesql |
| Runtime | 322 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/sales-person/submissions/)

## Code Review

코드 리뷰를 다음과 같이 진행하겠습니다.

1. **시간 복잡도**: 이 쿼리의 시간 복잡도는 O(n)입니다. 여기서 n은 테이블의 행 수를 의미합니다. 쿼리에서 사용된 조인은 Outer Join과 Inner Join이므로, 각 테이블의 행 수에 비례하는 시간 복잡도를 가지게 됩니다.

2. **공간 복잡도**: 쿼리의 공간 복잡도는 O(n)입니다. 쿼리에서 생성되는 임시 결과 집합의 크기는 입력 테이블의 크기에 비례하므로, 공간 복잡도도 입력 크기에 비례합니다.

3. **풀이 접근법**: 이 쿼리에서는 Outer Join과 Inner Join을 사용하여 SalesPerson, Orders, Company 테이블을 조인합니다. Outer Join은 한 테이블의 모든 행을 반환하고, 다른 테이블에 매칭되는 행이 없으면 NULL로 채워줍니다. Inner Join은 두 테이블 모두에 존재하는 행만 반환합니다. 이러한 조인 연산을 통해 RED가 아닌 이름을 가진 판매자 이름을 조회합니다.

4. **잘된 점**: 코드에서 잘 구현된 점은 Outer Join을 사용하여 Orders 테이블에 매칭되는 행이 없는 판매자도 포함시킨다는 것입니다. 또한, 이름이 'RED'가 아닌 판매자만을 조회하는 조건을 추가하여 문제의 요구 사항을 정확히 만족합니다.

5. **개선 사항**: 쿼리 최적화를 위해서는 인덱스를 생성하여 조인 연산의 성능을 향상시킬 수 있습니다. 예를 들어, SalesPerson 테이블의 sales_id 열과 Orders 테이블의 sales_id 열, Company 테이블의 com_id 열에 인덱스를 생성하면 조인 연산의 성능을 개선할 수 있습니다. 또한, 쿼리에서 사용된 테이블의 구조와 데이터 분포를 고려하여 더 효율적인 조인 순서를 결정할 수 있습니다.
