# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 27. 오전 9:01:52 |
| Language | oraclesql |
| Runtime | 450 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/sales-person/submissions/)

## Code Review

코드 리뷰를 진행하겠습니다.

1. **시간 복잡도**: 이 쿼리의 시간 복잡도는 O(n^2)입니다. 이유는 두 개의 테이블(SalesPerson, Orders)과 Company 테이블을 조인하여 데이터를 가져오기 때문입니다. 특히, `WHERE` 절에서 조건을 지정하여 데이터를 필터링하지만, 조인 연산이 전체 시간 복잡도에 큰 영향을 미칩니다.

2. **공간 복잡도**: 이 쿼리의 공간 복잡도는 O(n)입니다. 쿼리 결과로 반환되는 데이터의 크기가 공간 복잡도를 결정하며, 결과 집합의 크기는 입력 데이터의 크기에 비례합니다.

3. **풀이 접근법**: 이 쿼리에서는 내부 조인(inner join) 알고리즘을 사용하여 SalesPerson, Orders, Company 테이블을 연결합니다. 조인 조건은 `sales_id`와 `com_id`를 기반으로 하며, 추가적으로 `name`이 'RED'가 아닌 행만을 필터링합니다.

4. **잘된 점**: 코드는 간결하고, 필요한 조건을 모두 포함하고 있습니다. 또한, `WHERE` 절에서 조건을 지정하여 불필요한 데이터를 필터링하는 것이 좋습니다.

5. **개선 사항**: 쿼리에서 `T2.com_id = T2.com_id` 조건은 항상 참이므로, 이 조건을 제거할 수 있습니다. 또한, 조인 순서를 최적화하거나 인덱스를 생성하여 쿼리 성능을 향상시킬 수 있습니다. 예를 들어, `SalesPerson` 테이블의 `sales_id` 열과 `Orders` 테이블의 `sales_id` 열에 인덱스를 생성하면 조인 연산의 성능을 개선할 수 있습니다. 또한, `EXISTS`나 `IN` 연산자를 사용하여 쿼리를 재작성할 수 있습니다.
