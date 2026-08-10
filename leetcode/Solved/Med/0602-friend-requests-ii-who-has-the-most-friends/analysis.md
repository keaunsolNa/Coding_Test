# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 10. 오후 5:30:16 |
| Language | mysql |
| Runtime | 92 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/friend-requests-ii-who-has-the-most-friends/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n log n) - 이 쿼리는 RequestAccepted 테이블의 모든 행을 스캔하고, UNION ALL을 사용하여 두 개의 결과 집합을 결합하고, GROUP BY와 ORDER BY를 사용하여 결과를 집계하고 정렬합니다. 이러한 연산들은 각각 O(n), O(n), O(n), O(n log n)의 시간 복잡도를 가지므로, 전체 시간 복잡도는 O(n log n)입니다.

2. **공간 복잡도**: O(n) - 쿼리는 중간 결과를 저장하기 위해 임시 테이블을 사용합니다. 이 임시 테이블의 크기는 RequestAccepted 테이블의 행 수에 비례하므로, 공간 복잡도는 O(n)입니다.

3. **풀이 접근법**: 이 쿼리는 집계 함수와 정렬을 사용하여 가장 많은 친구 요청을 보낸 사람 또는 받은 사람을 찾는 접근법을 사용합니다. UNION ALL을 사용하여 요청자와 수락자의 ID를 하나의 결과 집합으로 결합하고, GROUP BY를 사용하여 각 ID의 요청/수락 횟수를 집계합니다. 마지막으로, ORDER BY와 LIMIT를 사용하여 가장 많은 요청/수락을 보낸 사람 또는 받은 사람을 찾습니다.

4. **잘된 점**: 이 쿼리는 간결하고, 읽기 쉽고, 문제의 요구 사항을 정확하게 구현했습니다. 또한, UNION ALL을 사용하여 요청자와 수락자의 ID를 결합하는 것은 좋은 아이디어입니다.

5. **개선 사항**: 이 쿼리는 이미 최적화되어 있지만, RequestAccepted 테이블에 인덱스를 생성하여 쿼리 성능을 향상시킬 수 있습니다. 예를 들어, requester_id와 accepter_id 열에 인덱스를 생성하면, GROUP BY와 ORDER BY 연산의 성능을 향상시킬 수 있습니다. 또한, 쿼리를 더 간결하게 만들기 위해 서브쿼리를 사용할 수 있습니다. 그러나, 이러한 최적화는 데이터베이스의 특성과 쿼리의 사용 패턴에 따라 달라질 수 있습니다.
