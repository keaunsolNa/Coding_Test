# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 23. 오전 11:04:41 |
| Language | mysql |
| Runtime | 162 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/find-books-with-no-available-copies/submissions/)

## Code Review

코드 리뷰를 다음과 같이 수행합니다.

1. **시간 복잡도**: 이 쿼리의 시간 복잡도는 O(n log n)입니다. 여기서 n은 borrowing_records 테이블의 레코드 수와 library_books 테이블의 레코드 수를 합친 것입니다. 이유는 쿼리에서 GROUP BY와 ORDER BY를 사용하고 있기 때문입니다. GROUP BY는 각 book_id에 대한 레코드를 그룹화하고, ORDER BY는 결과를 정렬하기 때문에 시간 복잡도가 증가합니다.

2. **공간 복잡도**: 이 쿼리의 공간 복잡도는 O(n)입니다. 여기서 n은 borrowing_records 테이블의 레코드 수와 library_books 테이블의 레코드 수를 합친 것입니다. 이유는 WITH절에서 임시 결과 집합을 생성하고, 이 결과 집합을 메모리에 저장해야 하기 때문입니다.

3. **풀이 접근법**: 이 쿼리에서는 WITH절과 JOIN을 사용하여 문제를 해결했습니다. WITH절에서 borrowing_records 테이블을 그룹화하여 각 book_id에 대한 현재 대출 중인 레코드 수를 계산하고, 이 결과를 library_books 테이블과 JOIN하여 최종 결과를 얻었습니다. 이는 관계형 데이터베이스에서 데이터를 처리하는 일반적인 패턴입니다.

4. **잘된 점**: 이 쿼리는 문제를 명확하게 이해하고, 적절한 SQL 문법을 사용하여 해결했습니다. 또한 WITH절을 사용하여 코드를 더 읽기 쉽게 만들었습니다.

5. **개선 사항**: 이 쿼리는 이미 효율적으로 작성되어 있지만, 일부 최적화를 고려할 수 있습니다. 예를 들어, borrowing_records 테이블과 library_books 테이블에 적절한 인덱스를 생성하여 JOIN과 GROUP BY의 성능을 개선할 수 있습니다. 또한, 쿼리에서 불필요한 열을 선택하지 않도록하여 결과 집합의 크기를 줄일 수 있습니다.
