# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 23. 오전 11:00:17 |
| Language | mysql |
| Runtime | 91 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/find-books-with-no-available-copies/submissions/)

## Code Review

코드 리뷰를 진행하겠습니다.

1. **시간 복잡도**: O(n^2) - 서브쿼리 내에서 borrowing_records 테이블을 스캔하는 작업이 library_books 테이블의 각 행마다 수행되기 때문에 시간 복잡도가 O(n^2)입니다. 여기서 n은 library_books 테이블의 행 수를 나타냅니다.

2. **공간 복잡도**: O(n) - 결과 집합은 library_books 테이블의 행 수만큼의 공간을 차지하므로 공간 복잡도는 O(n)입니다.

3. **풀이 접근법**: 이 풀이에서는 서브쿼리를 사용하여 각 책에 대한 현재 대출자 수를 계산합니다. 이는 서브쿼리 패턴을 사용한 접근법으로, 각 책에 대한 정보를 가져오고 해당 책의 대출자 수를 계산하는 것입니다.

4. **잘된 점**: 코드는 읽기 쉽고, 서브쿼리 내의 조건이 명확하게 지정되어 있습니다. 또한, 필요한 열만을 선택하여 불필요한 데이터를 가져오는 것을 피하고 있습니다.

5. **개선 사항**: 현재 풀이는 서브쿼리를 사용하여 각 책에 대한 대출자 수를 계산합니다. 그러나 이 접근법은 대용량 데이터셋에서는 성능이 저하될 수 있습니다. 대안적인 접근법으로는 JOIN을 사용하여 library_books 테이블과 borrowing_records 테이블을 연결하고, GROUP BY를 사용하여 책별 대출자 수를 계산하는 것입니다. 이는 다음과 같은 형태로 구현될 수 있습니다:
```mysql
SELECT T1.book_id
     , T1.title
     , T1.author
     , T1.genre
     , T1.publication_year
     , COUNT(T2.record_id) AS current_borrowers
  FROM library_books T1
  LEFT JOIN borrowing_records T2
    ON T1.book_id = T2.book_id AND T2.return_date IS NULL
 GROUP BY T1.book_id, T1.title, T1.author, T1.genre, T1.publication_year
```
이 접근법은 JOIN과 GROUP BY를 사용하여 대출자 수를 계산하므로, 대용량 데이터셋에서 더 효율적인 성능을 제공할 수 있습니다.
