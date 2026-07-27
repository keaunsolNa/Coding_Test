# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 27. 오전 9:01:01 |
| Language | oraclesql |
| Runtime | 333 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/sales-person/submissions/)

## Code Review

리뷰 대상 코드는 Oracle SQL을 사용하여 'sales-person' 문제를 해결한 쿼리입니다. 

1. **시간 복잡도**: 이 쿼리의 시간 복잡도는 O(n)입니다. 여기서 n은 Company, Orders, SalesPerson 테이블의 총 레코드 수를 의미합니다. 이유는 쿼리가 각 테이블의 모든 레코드를 스캔하기 때문입니다.

2. **공간 복잡도**: 쿼리의 공간 복잡도는 O(n)입니다. 쿼리 결과를 저장하기 위한 공간이 필요하기 때문입니다. 결과 집합의 크기는 입력 테이블의 크기에 비례합니다.

3. **풀이 접근법**: 이 쿼리는 기본적으로 내부 조인과 외부 조인을 사용하여 Company, Orders, SalesPerson 테이블을 연결합니다. 조건문에서 'RED'가 아닌 회사 이름을 가진 레코드만을 필터링하여 결과를 도출합니다. 사용된 알고리즘은 단순한 관계형 데이터베이스 쿼리입니다.

4. **잘된 점**: 이 쿼리는 문제의 요구 사항을 명확하게 이해하고, 필요한 조건을 모두 포함하여 작성되었습니다. 또한, 읽기 쉽고 간결한 코드로 작성되어 이해하기 쉽습니다.

5. **개선 사항**: 이 쿼리는 현재 Oracle의 오래된 조인 구문을 사용하고 있습니다. 최신의 ANSI 조인 구문을 사용하면 코드의 가독성을 높이고, 유지 보수를 더 쉽게 할 수 있습니다. 예를 들어, 다음과 같이 수정할 수 있습니다:
```oraclesql
SELECT T3.*
FROM Company T1
LEFT JOIN Orders T2 ON T1.com_id = T2.com_id
LEFT JOIN SalesPerson T3 ON T3.sales_id = T2.sales_id
WHERE T1.name <> 'RED';
```
이러한 변경은 쿼리의 성능에 직접적인 영향을 미치지는 않지만, 코드의 가독성과 유지 보수를 향상시킵니다.
