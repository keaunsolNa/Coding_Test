# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 21. 오후 5:40:03 |
| Language | oraclesql |
| Runtime | 1070 ms (Beats 78.2%) |
| Memory | 0B (Beats 100.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/customer-who-visited-but-did-not-make-any-transactions/submissions/)

## Code Review

코드 리뷰를 진행하겠습니다.

1. **시간 복잡도**: 이 쿼리의 시간 복잡도는 O(n)입니다. 여기서 n은 Visits 테이블의 행 수를 나타냅니다. 이유는 Visits 테이블의 모든 행을 스캔하여 Transactions 테이블과 조인하기 때문입니다.

2. **공간 복잡도**: 이 쿼리의 공간 복잡도는 O(n)입니다. 이유는 결과 집합을 저장하기 위한 메모리 공간이 필요하기 때문입니다. 결과 집합의 크기는 Visits 테이블의 행 수에 비례합니다.

3. **풀이 접근법**: 이 쿼리는 조인과 집계 함수를 사용하여 문제를 해결합니다. Outer Join을 사용하여 Visits 테이블의 모든 행을 포함하고, Transactions 테이블의 행이 존재하는 경우에만 매칭합니다. 집계 함수인 COUNT를 사용하여 각 고객의 방문 횟수와 거래 횟수를 계산합니다.

4. **잘된 점**: 이 쿼리는 문제를 명확하게 이해하고, Outer Join과 집계 함수를 적절하게 사용하여 문제를 해결했습니다. 또한, HAVING 절을 사용하여 결과를 필터링하여 필요한 고객 정보만을 반환합니다.

5. **개선 사항**: 이 쿼리는 이미 khá 최적화되어 있습니다. 그러나, 다음과 같은 점을 고려할 수 있습니다. 
- 인덱스를 생성하여 조인과 집계 함수의 성능을 개선할 수 있습니다.
- EXISTS 또는 NOT EXISTS를 사용하여 쿼리를 재작성할 수 있습니다. 이는 Outer Join보다 더 효율적인 경우가 있습니다.
- 서브쿼리를 사용하여 쿼리를 재작성할 수 있습니다. 이는 더 읽기 쉬운 쿼리를 생성할 수 있습니다.
