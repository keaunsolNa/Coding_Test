# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 23. 오전 11:00:48 |
| Language | mysql |
| Runtime | 110 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/find-books-with-no-available-copies/submissions/)

## Code Review

코드 리뷰如下입니다.

1. **시간 복잡도**: 이 쿼리의 시간 복잡도는 O(n^2)입니다. 서브쿼리가 각 행마다 실행되기 때문에, 전체 행 수에 비례하는 시간이 소요됩니다. 서브쿼리 내의 COUNT 연산은 O(n) 시간 복잡도를 가지며, 이 연산이 각 행마다 반복되므로 최종 시간 복잡도는 O(n^2)가 됩니다.

2. **공간 복잡도**: 이 쿼리의 공간 복잡도는 O(n)입니다. 결과 집합은 각 책에 대한 정보를 포함하므로, 책의 수에 비례하는 공간이 소요됩니다.

3. **풀이 접근법**: 이 쿼리는 서브쿼리를 사용하여 각 책의 현재 대출자 수를 계산하고, 이 수를 총 복사 수와 비교하여 대출 가능한 복사가 없는 책을 찾습니다. 이 접근법은 문제를 해결하는 데 효과적이지만, 효율성이 떨어질 수 있습니다.

4. **잘된 점**: 이 코드는 문제를 명확하게 이해하고, 필요한 데이터를 정확하게 가져오는 데 성공했습니다. 또한, 서브쿼리를 사용하여 복잡한 조건을 처리하는 데 성공했습니다.

5. **개선 사항**: 이 쿼리를 최적화하려면, JOIN을 사용하여 테이블을 연결하고, 서브쿼리 대신 GROUP BY를 사용하여 데이터를 집계할 수 있습니다. 예를 들어, 다음과 같은 쿼리를 사용할 수 있습니다.
```mysql
SELECT T1.book_id, T1.title, T1.author, T1.genre, T1.publication_year, COUNT(T2.record_id) AS current_borrowers
FROM library_books T1
LEFT JOIN borrowing_records T2 ON T1.book_id = T2.book_id AND T2.return_date IS NULL
GROUP BY T1.book_id, T1.title, T1.author, T1.genre, T1.publication_year
HAVING COUNT(T2.record_id) >= T1.total_copies
```
이 쿼리는 JOIN과 GROUP BY를 사용하여 데이터를 집계하고, HAVING 절을 사용하여 조건을 필터링합니다. 이는 서브쿼리를 사용하는 것보다 효율적인 접근법입니다.
