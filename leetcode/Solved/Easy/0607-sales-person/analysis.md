# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 27. 오전 8:58:56 |
| Language | oraclesql |
| Runtime | 306 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/sales-person/submissions/)

## Code Review

코드 리뷰를 시작하겠습니다.

1. **시간 복잡도**: 이 쿼리의 시간 복잡도는 O(n)입니다. 여기서 n은 Company, Orders, SalesPerson 테이블의 총 레코드 수를 의미합니다. 이유는 쿼리가 각 테이블의 레코드를 일대일로 조인하기 때문입니다.

2. **공간 복잡도**: 이 쿼리의 공간 복잡도는 O(n)입니다. 쿼리가 실행되면서 생성되는 임시 결과 집합의 크기는 입력 테이블의 크기에 비례하기 때문입니다.

3. **풀이 접근법**: 이 쿼리는 기본적으로 내부 조인과 외부 조인을 사용하여 Company, Orders, SalesPerson 테이블을 연결합니다. 이 접근법은 문제의 요구 사항을 만족하는 가장 직접적인 방법입니다.

4. **잘된 점**: 쿼리가 간결하고 문제의 요구 사항을 명확하게 반영하고 있습니다. 또한, 필요한 테이블과 조건을 모두 포함하고 있습니다.

5. **개선 사항**: 쿼리에서 사용된 조인 문법은 오라클의 구식 문법입니다. 최신 문법을 사용하여 조인을 명시적으로 지정하는 것이 좋습니다. 예를 들어, 다음과 같이 수정할 수 있습니다.
```oraclesql
SELECT T3.*
  FROM Company T1
  LEFT JOIN Orders T2 ON T1.com_id = T2.com_id
  LEFT JOIN SalesPerson T3 ON T2.sales_id = T3.sales_id
 WHERE T1.name <> 'RED'
```
이렇게 수정하면 쿼리가 더 읽기 쉽고 유지 보수하기 쉬워집니다.
