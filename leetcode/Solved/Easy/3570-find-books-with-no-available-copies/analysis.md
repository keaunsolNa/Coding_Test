# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 23. 오전 10:57:45 |
| Language | mysql |
| Runtime | 127 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/find-books-with-no-available-copies/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n^2) - 서브쿼리 내에서 반복적으로 데이터를 조회하기 때문에 시간 복잡도가 높습니다. 서브쿼리 내의 COUNT 연산이 각 행마다 수행되기 때문입니다.

2. **공간 복잡도**: O(1) - 추가적인 공간이 필요하지 않기 때문에 공간 복잡도는 상수입니다. 단, 결과 집합의 크기는 입력 데이터의 크기에 비례합니다.

3. **풀이 접근법**: 이 풀이는 서브쿼리를 사용하여 각 책의 총 복사본 수에서 현재 대출 중인 복사본 수를 빼는 방식으로 구현되었습니다. 이는 기본적인 집계 함수와 조인 연산을 사용한 접근법입니다.

4. **잘된 점**: 코드는 비교적 간결하고, 문제의 요구 사항을 명확하게 반영하고 있습니다. 또한, 서브쿼리를 사용하여 복잡한 계산을 수행하는 방식은 직관적입니다.

5. **개선 사항**: 현재 코드의 시간 복잡도를 개선하기 위해 JOIN 연산을 사용하여 데이터를 한 번에 처리할 수 있습니다. 예를 들어, 다음과 같이 JOIN과 GROUP BY를 사용하여 개선할 수 있습니다.
```mysql
SELECT 
  T1.book_id,
  T1.title,
  T1.author,
  T1.genre,
  T1.publication_year,
  T1.total_copies - IFNULL(T2.borrowed_count, 0) AS available_copies
FROM 
  library_books T1
  LEFT JOIN (
    SELECT 
      book_id, 
      COUNT(record_id) AS borrowed_count
    FROM 
      borrowing_records
    WHERE 
      return_date IS NULL
    GROUP BY 
      book_id
  ) T2 ON T1.book_id = T2.book_id;
```
이 방식은 서브쿼리 대신 JOIN을 사용하여 한 번의 질의로 필요한 데이터를 모두 가져올 수 있으므로, 효율성이 향상됩니다.
