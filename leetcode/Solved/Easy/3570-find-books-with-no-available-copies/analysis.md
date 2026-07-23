# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 23. 오전 11:03:21 |
| Language | mysql |
| Runtime | 94 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/find-books-with-no-available-copies/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: 이 쿼리의 시간 복잡도는 O(n log n)입니다. 여기서 n은 borrowing_records 테이블의 레코드 수와 library_books 테이블의 레코드 수를 합친 것입니다. 이유는 GROUP BY와 ORDER BY 연산이 수행되기 때문입니다. GROUP BY는 각 book_id에 대한 레코드를 그룹화하고, ORDER BY는 결과를 정렬하기 때문입니다.

2. **공간 복잡도**: 이 쿼리의 공간 복잡도는 O(n)입니다. 여기서 n은 borrowing_records 테이블의 레코드 수와 library_books 테이블의 레코드 수를 합친 것입니다. 이유는 WITH 절에서 임시 결과 집합을 생성하고, 이 결과 집합을 JOIN 연산에서 사용하기 때문입니다.

3. **풀이 접근법**: 이 쿼리에서는 WITH 절과 JOIN을 사용하여 문제를 해결했습니다. WITH 절에서 borrowing_records 테이블을 그룹화하여 각 book_id에 대한 현재 대출 중인 레코드 수를 계산했습니다. 그리고 library_books 테이블과 JOIN하여 책의 정보를 가져왔습니다. 이 접근법은 문제를 단순하게 해결할 수 있었습니다.

4. **잘된 점**: 이 쿼리는 문제를 명확하게 이해하고, 적절한 SQL 문법을 사용하여 해결했습니다. WITH 절을 사용하여 중간 결과를 계산하고, JOIN을 사용하여 두 테이블을 연결했습니다. 또한, ORDER BY를 사용하여 결과를 정렬했습니다.

5. **개선 사항**: 이 쿼리는 이미 잘 작성되어 있지만, 몇 가지 개선 사항을 고려할 수 있습니다. 예를 들어, 테이블의 인덱스를 생성하여 쿼리 성능을 개선할 수 있습니다. 또한, 쿼리에서 사용하는 칼럼만 SELECT하여 불필요한 데이터를 가져오는 것을 피할 수 있습니다. 마지막으로, 쿼리를 더 읽기 쉽게 만들기 위해 서브쿼리나 Common Table Expression(CTE)을 사용할 수 있습니다.
