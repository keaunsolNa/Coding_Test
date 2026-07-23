# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 23. 오전 11:04:46 |
| Language | mysql |
| Runtime | 625 ms (Beats 20.6%) |
| Memory | 0B (Beats 100.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/find-books-with-no-available-copies/submissions/)

## Code Review

코드 리뷰를 수행하겠습니다.

1. **시간 복잡도**: 이 쿼리의 시간 복잡도는 O(n log n)입니다. 여기서 n은 borrowing_records 테이블의 레코드 수와 library_books 테이블의 레코드 수를 합친 것입니다. 이유는 GROUP BY와 ORDER BY 연산이 수행되기 때문입니다. GROUP BY는 각 book_id에 대한 레코드를 그룹화하고, ORDER BY는 결과를 정렬하기 때문입니다.

2. **공간 복잡도**: 이 쿼리의 공간 복잡도는 O(n)입니다. 여기서 n은 borrowing_records 테이블의 레코드 수와 library_books 테이블의 레코드 수를 합친 것입니다. 이유는 WITH 절에서 임시 결과 집합을 생성하고, 이 결과 집합을 JOIN 연산에서 사용하기 때문입니다.

3. **풀이 접근법**: 이 쿼리에서는 WITH 절을 사용하여 임시 결과 집합을 생성하고, 이 결과 집합을 JOIN 연산에서 사용합니다. 또한 GROUP BY와 ORDER BY 연산을 사용하여 결과를 집계하고 정렬합니다. 이는 데이터를 효율적으로 처리하고 결과를 추출하는 일반적인 데이터베이스 쿼리 패턴입니다.

4. **잘된 점**: 이 쿼리는 문제를 명확하게 이해하고, 필요한 데이터를 효율적으로 추출합니다. 또한 WITH 절을 사용하여 코드를 간결하게 작성하고, 가독성을 높였습니다.

5. **개선 사항**: 쿼리 자체는 효율적으로 작성되어 있지만, 일부 최적화가 가능합니다. 예를 들어, borrowing_records 테이블과 library_books 테이블에 적절한 인덱스를 생성하면 쿼리 성능을 향상시킬 수 있습니다. 또한, WITH 절에서 생성하는 임시 결과 집합의 크기를 줄이기 위해, 필요한 컬럼만 선택하여 사용할 수 있습니다. 예를 들어, `SELECT COUNT(A.record_id) current_borrowers, A.book_id FROM borrowing_records A WHERE return_date IS NULL GROUP BY A.book_id` 대신 `SELECT COUNT(A.record_id) current_borrowers, A.book_id FROM borrowing_records A WHERE return_date IS NULL AND A.book_id IN (SELECT book_id FROM library_books) GROUP BY A.book_id`을 사용할 수 있습니다.
