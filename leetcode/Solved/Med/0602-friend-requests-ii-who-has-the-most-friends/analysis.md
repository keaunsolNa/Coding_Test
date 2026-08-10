# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 10. 오후 5:30:25 |
| Language | mysql |
| Runtime | 466 ms (Beats 8.5%) |
| Memory | 0B (Beats 100.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/friend-requests-ii-who-has-the-most-friends/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n log n) - 이 쿼리는 RequestAccepted 테이블의 모든 레코드를 스캔하고, UNION ALL 연산을 수행하며, 그 결과를 정렬합니다. 이러한 연산의 시간 복잡도는 일반적으로 O(n log n)입니다.

2. **공간 복잡도**: O(n) - 쿼리 결과를 임시 테이블에 저장해야 하므로, 공간 복잡도는 O(n)입니다. 여기서 n은 RequestAccepted 테이블의 레코드 수입니다.

3. **풀이 접근법**: 이 쿼리는 요청자와 수락자의 ID를 하나의 테이블로 통합하고, 각 ID의 출현 빈도를 계산하여 가장 많은 친구를 가진 사람을 찾는 접근법을 사용합니다. UNION ALL 연산을 사용하여 요청자와 수락자의 ID를 하나의 결과 집합으로 결합하고, GROUP BY와 COUNT를 사용하여 각 ID의 출현 빈도를 계산합니다.

4. **잘된 점**: 코드는 간결하고, 문제의 요구 사항을 명확하게 이해하고 있습니다. 또한, UNION ALL 연산을 사용하여 요청자와 수락자의 ID를 하나의 결과 집합으로 결합하는 부분이 잘 구현되어 있습니다.

5. **개선 사항**: 현재 쿼리는 LIMIT 1을 사용하여 가장 많은 친구를 가진 사람만을 반환합니다. 그러나, 여러 사람이 동일한 최대 친구 수를 가질 수 있는 경우, 이 쿼리는 오직 하나의 사람만을 반환합니다. 이를 개선하기 위해, 쿼리를 수정하여 최대 친구 수를 먼저 계산하고, 그 수와 일치하는 모든 사람을 반환하는 방식으로 수정할 수 있습니다. 예를 들어, 다음과 같이 쿼리를 수정할 수 있습니다.
```mysql
SELECT id, num
  FROM (
    SELECT id, COUNT(id) AS num
      FROM (
        SELECT requester_id AS id 
          FROM RequestAccepted
          UNION ALL
         SELECT accepter_id AS id 
           FROM RequestAccepted
        ) AS T1
     GROUP BY id
  ) AS T2
 WHERE num = (
   SELECT MAX(num)
     FROM (
       SELECT id, COUNT(id) AS num
         FROM (
           SELECT requester_id AS id 
             FROM RequestAccepted
             UNION ALL
            SELECT accepter_id AS id 
              FROM RequestAccepted
           ) AS T1
        GROUP BY id
     ) AS T3
 )
```
