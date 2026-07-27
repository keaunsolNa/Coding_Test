# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 27. 오전 9:04:38 |
| Language | oraclesql |
| Runtime | 304 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/sales-person/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n^3) - 이 쿼리는 세 개의 테이블을 조인하여 데이터를 조회합니다. 조인 연산의 시간 복잡도는 일반적으로 O(n*m)입니다. 여기서 n과 m은 조인하는 두 테이블의 행 수입니다. 세 개의 테이블을 조인하면 시간 복잡도가 O(n*m*p)가 됩니다. 여기서 p는 세 번째 테이블의 행 수입니다. 따라서 이 쿼리의 시간 복잡도는 O(n^3)입니다.

2. **공간 복잡도**: O(n) - 쿼리 결과는 SalesPerson 테이블의 sales_id를 반환합니다. 따라서 공간 복잡도는 결과 집합의 크기에 비례합니다. 결과 집합의 크기는 최대 SalesPerson 테이블의 행 수와 동일하므로 공간 복잡도는 O(n)입니다.

3. **풀이 접근법**: 이 쿼리는 내부 조인(inner join) 알고리즘을 사용하여 세 개의 테이블을 조인합니다. 조인 조건은 sales_id와 com_id를 사용하여 테이블을 연결합니다. 또한 Company 테이블의 name 열을 사용하여 특정 조건을 필터링합니다.

4. **잘된 점**: 이 쿼리는 간단명료하며, 필요한 데이터를 효과적으로 조회합니다. 또한 조인 조건과 필터링 조건이 명확하게 정의되어 있습니다.

5. **개선 사항**: 이 쿼리는 이미 достаточно 최적화되어 있습니다. 그러나 쿼리 성능을进一步 개선하기 위해 인덱스를 생성할 수 있습니다. 예를 들어, SalesPerson 테이블의 sales_id 열과 Orders 테이블의 sales_id 열, Company 테이블의 com_id 열에 인덱스를 생성하면 조인 연산의 성능을 개선할 수 있습니다. 또한, 쿼리에서 사용되는 열만 조회하여 데이터 전송량을 줄일 수 있습니다. 예를 들어, `SELECT T1.sales_id FROM ...` 대신 `SELECT DISTINCT T1.sales_id FROM ...`를 사용할 수 있습니다.
