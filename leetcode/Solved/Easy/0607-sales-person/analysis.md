# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 27. 오전 8:58:26 |
| Language | oraclesql |
| Runtime | 407 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/sales-person/submissions/)

## Code Review

코드 리뷰를 진행하겠습니다.

1. **시간 복잡도**: 이 쿼리의 시간 복잡도는 O(n)입니다. 여기서 n은 Company, Orders, SalesPerson 테이블의 총 레코드 수를 의미합니다. 이는 쿼리가 각 테이블의 모든 레코드를 스캔하기 때문입니다.

2. **공간 복잡도**: 공간 복잡도는 O(n)입니다. 쿼리 결과를 저장하기 위해 필요한 공간이 입력 테이블의 크기에 비례하기 때문입니다.

3. **풀이 접근법**: 이 쿼리는 내부 조인과 외부 조인을 사용하여 SalesPerson 테이블에서 'RED'가 아닌 이름을 가진 사람들의 정보를 조회합니다. 사용된 알고리즘은 기본적인 관계형 데이터베이스 쿼리입니다.

4. **잘된 점**: 코드는 간결하고 읽기 쉽습니다. 또한, 필요한 조건을 모두 만족하는 쿼리를 작성했습니다. outer join을 사용하여 NULL 값을 포함한 결과도 제대로 처리하고 있습니다.

5. **개선 사항**: 쿼리에서 사용된 조인 방식은 오라클의 구식 문법입니다. 현재는 ANSI 조인 문법을 사용하는 것이 더 현대적이고 가독성이 좋습니다. 예를 들어, 다음과 같이 쿼리를 개선할 수 있습니다.
```oraclesql
SELECT T3.*
  FROM Company T1
  LEFT JOIN Orders T2 ON T1.com_id = T2.com_id
  LEFT JOIN SalesPerson T3 ON T2.sales_id = T3.sales_id AND T3.name <> 'RED'
```
또한, 인덱스를 생성하여 쿼리 성능을 개선할 수 있습니다. 특히, com_id, sales_id 컬럼에 인덱스를 생성하면 조인 성능을 개선할 수 있습니다.
