# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 27. 오전 8:57:33 |
| Language | oraclesql |
| Runtime | 336 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/sales-person/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: 이 쿼리의 시간 복잡도는 O(n)입니다. 여기서 n은 SalesPerson, Orders, Company 테이블의 행 수를 나타냅니다. 쿼리에서 사용된 조인은 테이블의 행 수에 비례하므로 시간 복잡도는 선형입니다.

2. **공간 복잡도**: 이 쿼리의 공간 복잡도는 O(n)입니다. 쿼리 결과는 테이블의 행 수에 비례하므로 공간 복잡도도 선형입니다.

3. **풀이 접근법**: 이 쿼리에서는 조인 알고리즘을 사용하여 SalesPerson, Orders, Company 테이블을 연결했습니다. outer join을 사용하여 Company 테이블에서 'RED'가 아닌 이름을 가진 행을 포함했습니다. 이 접근법은 문제의 요구 사항을 만족합니다.

4. **잘된 점**: 코드는 문제의 요구 사항을 만족하며, outer join을 사용하여 Company 테이블에서 'RED'가 아닌 이름을 가진 행을 포함했습니다. 또한 쿼리는 간결하고 읽기 쉽습니다.

5. **개선 사항**: 쿼리에서 사용된 조인 순서는 쿼리 최적화에 영향을 줄 수 있습니다. 또한 Company 테이블에서 'RED'가 아닌 이름을 가진 행을 포함하는 조건은 인덱스를 사용하여 최적화할 수 있습니다. 또한 ANSI 조인 구문을 사용하여 코드를 더 읽기 쉽게 만들 수 있습니다. 예를 들어, 다음과 같이 수정할 수 있습니다.
```oraclesql
SELECT T3.*
  FROM SalesPerson T1
  JOIN Orders T2 ON T1.sales_id = T2.sales_id
  LEFT JOIN Company T3 ON T2.com_id = T3.com_id AND T3.name <> 'RED'
```
