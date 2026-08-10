# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 10. 오후 5:17:13 |
| Language | oraclesql |
| Runtime | 219 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/friend-requests-ii-who-has-the-most-friends/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: 이 쿼리의 시간 복잡도는 O(n)입니다. 여기서 n은 RequestAccepted 테이블의 행 수를 나타냅니다. 쿼리는 GROUP BY 절을 사용하여 requester_id 기준으로 그룹화하고, COUNT 함수를 사용하여 각 그룹의 requester_id와 accepter_id의 수를 계산합니다. 이러한 연산은 테이블의 각 행을 한 번씩 처리하므로 시간 복잡도는 O(n)입니다.

2. **공간 복잡도**: 이 쿼리의 공간 복잡도는 O(n)입니다. 쿼리는 GROUP BY 절을 사용하여 중간 결과를 저장해야 하므로, 최악의 경우 테이블의 모든 행을 메모리에 저장해야 할 수 있습니다. 따라서 공간 복잡도는 O(n)입니다.

3. **풀이 접근법**: 이 쿼리는 집계 함수와 GROUP BY 절을 사용하여 requester_id 기준으로 그룹화하고, 각 그룹의 requester_id와 accepter_id의 수를 계산합니다. 이는 관계형 데이터베이스에서 데이터를 집계하고 분석하는 일반적인 패턴입니다.

4. **잘된 점**: 이 쿼리는 요청된 결과를 반환하는 데 성공합니다. NVL 함수를 사용하여 NULL 값을 0으로 대체하는 것도 좋은 접근법입니다. 또한, GROUP BY 절을 사용하여 requester_id 기준으로 그룹화하는 것은 올바른 방법입니다.

5. **개선 사항**: 이 쿼리는 이미 간결하고 효율적입니다. 그러나, 쿼리에서 COUNT(requester_id)와 COUNT(accepter_id)를 별도로 계산하는 대신, UNION ALL을 사용하여 requester_id와 accepter_id를 하나의 열로 결합한 다음 COUNT를 사용할 수 있습니다. 하지만, 이 접근법은 쿼리의 가독성을 저하할 수 있으므로, 현재의 구현이 더 나은 선택일 수 있습니다.
