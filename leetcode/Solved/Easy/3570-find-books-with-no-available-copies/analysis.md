# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 23. 오전 10:58:44 |
| Language | mysql |
| Runtime | 127 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/find-books-with-no-available-copies/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n^2) - 서브쿼리 내에서 borrowing_records 테이블을 스캔하는 작업이 library_books 테이블의 각 행마다 수행되기 때문입니다. 이는 전체 데이터셋이 커질수록 성능이 급격히 저하될 수 있습니다.

2. **공간 복잡도**: O(n) - 결과セット에 포함되는 행의 수는 library_books 테이블의 행 수와 동일하므로, 공간 복잡도는 입력 데이터의 크기에 비례합니다.

3. **풀이 접근법**: 이 풀이에서는 서브쿼리를 사용하여 각 책의 현재 대출자 수를 계산합니다. 이는 문제를 해결하는 직관적인 접근법이지만, 성능면에서 최적화가 필요합니다. JOIN이나 다른 집계 함수를 사용한 접근법도 고려할 수 있습니다.

4. **잘된 점**: 코드는 읽기 쉽고, 의도한 바를 명확하게 나타내고 있습니다. 또한, 필요한 열만 선택하여 불필요한 데이터 전송을 피하는 등 좋은 습관을 보여주고 있습니다.

5. **개선 사항**: 성능 개선을 위해 JOIN을 사용하여 대출 기록을 연결하고, GROUP BY를 사용하여 책별 대출자 수를 집계할 수 있습니다. 예를 들어, 다음과 같은 쿼리가 가능합니다:
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
이 접근법은 서브쿼리보다 효율적이며, 데이터베이스의 성능에 덜 부담을 주는 방법입니다.
