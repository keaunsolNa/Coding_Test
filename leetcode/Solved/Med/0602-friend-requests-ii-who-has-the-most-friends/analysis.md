# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 10. 오후 5:22:21 |
| Language | oraclesql |
| Runtime | 270 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/friend-requests-ii-who-has-the-most-friends/submissions/)

## Code Review

리뷰 대상 코드는 LeetCode의 "friend-requests-ii-who-has-the-most-friends" 문제를 해결하는 오라클 SQL 쿼리입니다. 

1. **시간 복잡도**: 이 쿼리의 시간 복잡도는 O(n log n)입니다. 여기서 n은 RequestAccepted 테이블의 행 수를 나타냅니다. GROUP BY와 ORDER BY 연산이 포함되어 있기 때문에 이러한 복잡도가 발생합니다. GROUP BY는 데이터를 그룹화하여 requester_id별로 COUNT를 수행하고, ORDER BY는 그 결과를 내림차순으로 정렬합니다.

2. **공간 복잡도**: 공간 복잡도는 O(n)입니다. 쿼리 결과는 최대 n개의 행을 포함할 수 있기 때문에, 여기서 n은 고유한 requester_id의 수를 나타냅니다. GROUP BY 연산이 중간 결과를 생성하고, 이 중간 결과는 최대 n개의 행을 포함할 수 있습니다.

3. **풀이 접근법**: 이 쿼리는 집계 함수(COUNT)와 그룹화(GROUP BY)를 사용하여 requester_id별로 수락된 요청의 수를 계산합니다. 또한, NVL 함수를 사용하여 NULL 값을 0으로 대체합니다. ORDER BY를 사용하여 결과를 내림차순으로 정렬하여 가장 많은 친구를 가진 사람을 찾습니다.

4. **잘된 점**: 이 쿼리는 간결하고, 문제의 요구 사항을 명확하게 반영하고 있습니다. 특히, NVL 함수를 사용하여 NULL 값을 처리하는 부분이 잘 구현되어 있습니다. 또한, 필요한 열만 선택하여 쿼리 결과를 효율적으로 반환합니다.

5. **개선 사항**: 현재 쿼리는 requester_id별로 가장 많은 수락된 요청을 반환하지만, 문제는 "who has the most friends"를 묻고 있습니다. 따라서, 실제로는 accepter_id도 고려해야 합니다. 즉, 요청을 보낸 사람(requester_id)과 수락한 사람(accepter_id) 모두를 고려하여 친구 수를 계산해야 합니다. 이를 위해서는 UNION ALL을 사용하여 requester_id와 accepter_id를 하나의 열로 결합한 후, COUNT를 수행할 수 있습니다. 예를 들어:
```oraclesql
SELECT id, COUNT(*) as num
FROM (
  SELECT requester_id as id FROM RequestAccepted
  UNION ALL
  SELECT accepter_id as id FROM RequestAccepted
)
GROUP BY id
ORDER BY num DESC;
```
이러한 접근법으로 친구 수를 더 정확하게 계산할 수 있습니다.
