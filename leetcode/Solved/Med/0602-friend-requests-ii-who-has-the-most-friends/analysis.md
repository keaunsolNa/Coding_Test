# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 10. 오후 5:22:49 |
| Language | oraclesql |
| Runtime | 235 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/friend-requests-ii-who-has-the-most-friends/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - RequestAccepted 테이블의 모든 행을 두 번扫描하기 때문에 시간 복잡도는 O(n)입니다. 여기서 n은 RequestAccepted 테이블의 행 수를 나타냅니다.

2. **공간 복잡도**: O(n) - 결과 집합은 최대 2n개의 행을 가질 수 있기 때문에 공간 복잡도도 O(n)입니다. 여기서 n은 RequestAccepted 테이블의 행 수를 나타냅니다.

3. **풀이 접근법**: 이 풀이는 집합 연산을 사용하여 requester_id와 accepter_id의 개수를 계산합니다. UNION 연산자를 사용하여 두 결과 집합을 결합합니다. 이는 간단한 집계 연산을 수행하는 경우에 적합한 접근법입니다.

4. **잘된 점**: 코드는 간결하고 읽기 쉽습니다. NVL 함수를 사용하여 NULL 값을 0으로 대체하는 것은 좋은 방법입니다. 또한 UNION 연산자를 사용하여 두 결과 집합을 결합하는 것은 직관적입니다.

5. **개선 사항**: 현재 쿼리는 두 번의 GROUP BY 연산을 수행합니다. 이는 성능을 저하할 수 있습니다. 대안적으로, 단일 쿼리에서 requester_id와 accepter_id의 개수를 계산할 수 있습니다. 예를 들어, 다음과 같이 작성할 수 있습니다:
```oraclesql
SELECT id, NVL(SUM(CASE WHEN type = 'requester' THEN 1 ELSE 0 END), 0) + 
           NVL(SUM(CASE WHEN type = 'accepter' THEN 1 ELSE 0 END), 0) AS num
FROM (
  SELECT requester_id AS id, 'requester' AS type FROM RequestAccepted
  UNION ALL
  SELECT accepter_id AS id, 'accepter' AS type FROM RequestAccepted
)
GROUP BY id
```
이 접근법은 단일 GROUP BY 연산을 수행하므로 성능을 개선할 수 있습니다.
