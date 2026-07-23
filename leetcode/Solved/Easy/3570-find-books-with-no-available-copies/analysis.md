# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 23. 오전 10:58:03 |
| Language | mysql |
| Runtime | 124 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/find-books-with-no-available-copies/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도** — O(n^2)입니다. 서브쿼리가 존재하여 outer query의 각 row마다 서브쿼리가 실행되기 때문입니다. 서브쿼리 내의 COUNT 연산도 O(n)입니다. 따라서 전체 시간 복잡도는 O(n^2)입니다.

2. **공간 복잡도** — O(1)입니다. 추가적인 공간이 필요하지 않기 때문입니다.ただし, 서브쿼리 결과를 임시로 저장하는 공간이 필요할 수 있습니다.

3. **풀이 접근법** — 서브쿼리를 사용하여 각 책의 현재 대출자 수를 계산합니다. outer query에서 각 책의 정보를 가져오고, 서브쿼리에서 현재 대출 중인 책의 수를 계산하여 outer query의 결과에 추가합니다.

4. **잘된 점** — 코드가 간결하고, 문제를 명확하게 이해하고 있습니다. 또한, 서브쿼리를 사용하여 문제를 해결하려는 시도가 좋습니다.

5. **개선 사항** — 서브쿼리를 JOIN으로 대체하여 시간 복잡도를 개선할 수 있습니다. 예를 들어, 다음과 같이 JOIN을 사용할 수 있습니다.
```mysql
SELECT T1.book_id
     , T1.title
     , T1.author
     , T1.genre
     , T1.publication_year
     , T1.total_copies - IFNULL(T2.current_borrowers, 0) AS current_borrowers
  FROM library_books T1
  LEFT JOIN (
    SELECT book_id, COUNT(record_id) AS current_borrowers
    FROM borrowing_records
    WHERE return_date IS NULL
    GROUP BY book_id
  ) T2
  ON T1.book_id = T2.book_id
```
이렇게 JOIN을 사용하면 시간 복잡도를 O(n)으로 개선할 수 있습니다.
