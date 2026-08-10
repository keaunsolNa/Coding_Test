# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 10. 오후 5:20:47 |
| Language | oraclesql |
| Runtime | 968 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/friend-requests-ii-who-has-the-most-friends/submissions/)

## Code Review

코드 리뷰를 진행하겠습니다.

1. **시간 복잡도**: O(n log n) - 이 쿼리는 RequestAccepted 테이블의 모든 행을 스캔하고, 그룹화 및 정렬을 수행하므로 시간 복잡도는 O(n log n)입니다. 여기서 n은 RequestAccepted 테이블의 행 수를 나타냅니다.

2. **공간 복잡도**: O(n) - 쿼리는 중간 결과를 저장하기 위해 임시 테이블을 사용하므로 공간 복잡도는 O(n)입니다. 여기서 n은 RequestAccepted 테이블의 행 수를 나타냅니다.

3. **풀이 접근법**: 이 쿼리는 집계 함수와 그룹화, 정렬을 사용하여 풀이합니다. NVL 함수를 사용하여 NULL 값을 0으로 대체하고, COUNT 함수를 사용하여 requester_id와 accepter_id의 개수를 계산합니다. 그룹화와 정렬을 통해 가장 많은 친구를 가진 사람을 찾습니다.

4. **잘된 점**: 이 쿼리는 문제의 요구 사항을 정확하게 충족하며, 가독성과 유지보수성이 좋습니다. NVL 함수를 사용하여 NULL 값을 처리하는 방법이 좋습니다.

5. **개선 사항**: 쿼리 자체는 효율적이지만, 대량의 데이터를 처리하는 경우 성능이 저하될 수 있습니다. 이런 경우, 인덱스를 생성하거나 파티션을 사용하여 성능을 개선할 수 있습니다. 또한, ROWNUM을 사용하여 한 행만 반환하는 대신, FETCH FIRST ROW ONLY 구문을 사용할 수 있습니다. 이는 더 현대적이고 효율적인 방법입니다. 예를 들어:
```oraclesql
SELECT requester_id AS id, num
  FROM (
        SELECT NVL(COUNT(requester_id), 0) + NVL(COUNT(accepter_id), 0) num, requester_id 
          FROM RequestAccepted
         GROUP BY requester_id
         ORDER BY num DESC
       )
FETCH FIRST ROW ONLY;
```
