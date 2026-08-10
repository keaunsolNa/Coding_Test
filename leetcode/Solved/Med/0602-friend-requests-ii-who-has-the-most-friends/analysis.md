# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 10. 오후 5:20:08 |
| Language | oraclesql |
| Runtime | 252 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/friend-requests-ii-who-has-the-most-friends/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n log n) - 데이터베이스의 GROUP BY와 ORDER BY 연산으로 인해 발생합니다. GROUP BY는 데이터를 그룹화하는 데 O(n) 시간이 걸리고, ORDER BY는 데이터를 정렬하는 데 O(n log n) 시간이 걸립니다.

2. **공간 복잡도**: O(n) - 데이터베이스의 임시 결과 집합을 저장하기 위한 공간이 필요합니다. 이 공간의 크기는 입력 데이터의 크기와 동일할 수 있습니다.

3. **풀이 접근법**: 이 풀이에서는 집계 함수(COUNT)와 GROUP BY를 사용하여 각 요청자의 친구 수를 계산하고, ORDER BY를 사용하여 친구 수가 가장 많은 요청자를 찾습니다. 이는 관계형 데이터베이스에서 집계 연산과 정렬을 수행하는 일반적인 패턴입니다.

4. **잘된 점**: 이 코드는 간결하고, 필요한 연산만 수행하여 효율적입니다. 또한, NVL 함수를 사용하여 NULL 값을 처리하여 코드의 안정성을 높였습니다.

5. **개선 사항**: 이 코드는 이미 효율적이지만, 데이터베이스의 인덱스를 생성하여 GROUP BY와 ORDER BY의 성능을 개선할 수 있습니다. 또한, TOP-N 쿼리를 사용하여 최상단의 결과만 가져오도록 할 수 있습니다. 예를 들어, Oracle 12c 이상에서는 FETCH FIRST를 사용할 수 있습니다.
```oraclesql
SELECT requester_id
  FROM (
        SELECT NVL(COUNT(requester_id), 0) + NVL(COUNT(accepter_id), 0) CNT, requester_id 
          FROM RequestAccepted
         GROUP BY requester_id
       )
ORDER BY CNT DESC
FETCH FIRST 1 ROW ONLY;
```
