# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 27. 오전 8:56:14 |
| Language | mysql |
| Runtime | 139 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/sales-person/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: 이 쿼리의 시간 복잡도는 O(n^3)입니다. 이유는 세 개의 테이블(SalesPerson, Orders, Company)을 조인하기 때문입니다. 각 테이블의 레코드 수를 각각 n1, n2, n3이라고 가정하면, 조인 연산의 시간 복잡도는 O(n1 * n2 * n3)입니다. 그러나 실제 시간 복잡도는 인덱스 설정, 데이터 분포 등 다양한 요인에 의해 영향을 받습니다.

2. **공간 복잡도**: 이 쿼리의 공간 복잡도는 O(n)입니다. 쿼리 결과를 저장하기 위해 필요한 공간이기 때문입니다. 결과 집합의 크기는 최대 n1(즉, SalesPerson 테이블의 레코드 수)입니다.

3. **풀이 접근법**: 이 쿼리는 내부 조인(inner join) 알고리즘을 사용하여 세 개의 테이블을 연결합니다. 조인 조건은 각 테이블의 sales_id와 com_id 필드를 사용합니다. 또한, Company 테이블의 name 필드가 'RED'가 아닌 레코드만을 필터링합니다.

4. **잘된 점**: 이 쿼리는 문제의 요구 사항을 명확하게 이해하고, 필요한 테이블을 조인하여 결과를 도출합니다. 또한, WHERE 절을 사용하여 불필요한 레코드를 필터링하여 쿼리 성능을 향상합니다.

5. **개선 사항**: 이 쿼리는 현재 명시적 조인(explicit join) 대신 암시적 조인(implicit join)을 사용하고 있습니다. 명시적 조인을 사용하면 쿼리가 더 읽기 쉽고 유지보수하기 쉬워집니다. 예를 들어, 다음과 같이 수정할 수 있습니다.
```mysql
SELECT T1.name
  FROM SalesPerson T1
  JOIN Orders T2 ON T1.sales_id = T2.sales_id
  JOIN Company T3 ON T2.com_id = T3.com_id
 WHERE T3.name <> 'RED'
```
또한, 인덱스를 설정하여 쿼리 성능을 향상시킬 수 있습니다. 예를 들어, sales_id와 com_id 필드에 인덱스를 설정할 수 있습니다.
