# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 10. 오후 5:16:36 |
| Language | oraclesql |
| Runtime | 216 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/friend-requests-ii-who-has-the-most-friends/submissions/)

## Code Review

리뷰 대상 코드는 LeetCode의 "friend-requests-ii-who-has-the-most-friends" 문제를 해결하기 위한 Oracle SQL 쿼리입니다. 

1. **시간 복잡도**: 이 쿼리의 시간 복잡도는 O(n)입니다. 여기서 n은 RequestAccepted 테이블의 행 수를 나타냅니다. GROUP BY 연산이 수행되며, 이는 데이터를 그룹화하고 집계 함수를 적용하는 데 필요한 시간이 데이터의 크기에 비례하기 때문입니다.

2. **공간 복잡도**: 공간 복잡도는 O(n)입니다. 쿼리 결과는 각 requester_id에 대한 COUNT(requester_id) 값을 반환하며, 최악의 경우 모든 requester_id가 고유할 수 있으므로 결과 집합의 크기는 입력 데이터의 크기에 비례할 수 있습니다.

3. **풀이 접근법**: 이 쿼리는 집계 함수인 COUNT()와 GROUP BY 절을 사용하여 각 requester_id에 대한 요청 수를 계산합니다. 이는 문제를 해결하기 위한 직접적이고 효율적인 접근법입니다. GROUP BY는 데이터를 그룹화하고, COUNT()는 각 그룹의 행 수를 계산합니다.

4. **잘된 점**: 코드는 간결하고, 문제를 명확하게 이해하고 해결하려는 의도를 잘 전달합니다. 필요한 열만 선택하고, GROUP BY를 사용하여 데이터를 적절하게 그룹화합니다.

5. **개선 사항**: 현재 쿼리는 요청 수를 계산하지만, 문제는 가장 많은 친구를 가진 사람을 찾으라고 요청합니다. 따라서 쿼리를 수정하여 COUNT(requester_id)와 COUNT(accepter_id)를 모두 계산하고, 두 값을 합쳐서 가장 많은 친구를 가진 사람을 찾는 것이 필요합니다. 또한, 요청 수와 수락 수를 모두 고려하여 가장 많은 친구를 가진 사람을 찾는 쿼리를 작성할 수 있습니다. 예를 들어:
```oraclesql
SELECT id, COUNT(*) as friends_count
FROM (
  SELECT requester_id as id FROM RequestAccepted
  UNION ALL
  SELECT accepter_id as id FROM RequestAccepted
)
GROUP BY id
ORDER BY friends_count DESC;
```
이 쿼리는 requester_id와 accepter_id를 모두 고려하여 각 사용자의 친구 수를 계산하고, 가장 많은 친구를 가진 사람을 찾습니다.
