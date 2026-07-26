# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 27. 오전 8:59:48 |
| Language | oraclesql |
| Runtime | 303 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/sales-person/submissions/)

## Code Review

코드 리뷰를 진행하겠습니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 Company, Orders, SalesPerson 테이블을 조인하여 데이터를 조회합니다. 조인 연산의 시간 복잡도는 일반적으로 O(n)입니다. 여기서 n은 테이블에 있는 행의 수를 나타냅니다.

2. **공간 복잡도**: O(n) - 쿼리 결과를 저장하기 위한 공간이 필요합니다. 결과 집합의 크기는 입력 테이블의 크기에 비례하므로 공간 복잡도도 O(n)입니다.

3. **풀이 접근법**: 이 쿼리는 내부 조인(inner join) 알고리즘을 사용하여 Company, Orders, SalesPerson 테이블을 연결합니다. 조인 조건은 com_id와 sales_id를 기반으로 합니다. 또한 'RED'가 아닌 회사 이름을 가진 데이터만 필터링합니다.

4. **잘된 점**: 코드는 간결하고 읽기 쉽습니다. 필요한 조인과 필터링 조건을 명확하게 지정했습니다. 또한 테이블 별칭(T1, T2, T3)을 사용하여 쿼리를 더 간결하게 만들었습니다.

5. **개선 사항**: 현재 쿼리는 오래된 조인 구문을 사용하고 있습니다. 더 현대적인 조인 구문을 사용하여 쿼리를 개선할 수 있습니다. 예를 들어, FROM 절에서 조인 조건을 명시적으로 지정할 수 있습니다. 또한, 인덱스를 생성하여 쿼리 성능을 향상시킬 수 있습니다. 개선된 쿼리는 다음과 같습니다.
```oraclesql
SELECT T3.*
  FROM Company T1
  JOIN Orders T2 ON T1.com_id = T2.com_id
  JOIN SalesPerson T3 ON T2.sales_id = T3.sales_id
 WHERE T1.name <> 'RED'
```
