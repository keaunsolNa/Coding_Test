# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 27. 오전 8:59:34 |
| Language | oraclesql |
| Runtime | 304 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/sales-person/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리문은 세 개의 테이블을 조인하여 데이터를 조회합니다. 조인 연산의 시간 복잡도는 일반적으로 O(n)입니다. 여기서 n은 테이블에 있는 행의 수를 나타냅니다.

2. **공간 복잡도**: O(n) - 쿼리문은 결과를 메모리에 저장해야 하므로 공간 복잡도도 O(n)입니다. 여기서 n은 결과 집합에 있는 행의 수를 나타냅니다.

3. **풀이 접근법**: 이 쿼리문은 조인 알고리즘을 사용하여 Company, Orders, SalesPerson 테이블을 연결합니다. outer join을 사용하여 RED가 아닌 회사에 속한 모든 세일즈 퍼슨의 정보를 조회합니다.

4. **잘된 점**: 코드는 간결하고 읽기 쉽습니다. outer join을 사용하여 LEFT JOIN과 같은 결과를 얻었습니다. 또한 WHERE 절을 사용하여 RED가 아닌 회사에 속한 세일즈 퍼슨만 조회하도록 필터링했습니다.

5. **개선 사항**: 현재 쿼리문은 오라클의 고유한 문법을 사용하고 있습니다. 그러나 ANSI 표준을 사용하여 JOIN을 명시적으로 지정하는 것이 좋습니다. 예를 들어, `FROM Company T1 JOIN Orders T2 ON T1.com_id = T2.com_id JOIN SalesPerson T3 ON T2.sales_id = T3.sales_id`와 같이 작성할 수 있습니다. 또한, 테이블 별칭을 더 명확하게 사용할 수 있습니다. 예를 들어, `Company` 대신 `C`, `Orders` 대신 `O`, `SalesPerson` 대신 `SP`와 같이 작성할 수 있습니다.
