# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 21. 오전 8:38:39 |
| Language | oraclesql |
| Runtime | 301 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/percentage-of-users-attended-a-contest/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 Users 테이블과 Register 테이블의 모든 행을 스캔하므로, 시간 복잡도는 데이터의 크기와 직결됩니다. 즉, 데이터가 많을수록 쿼리 수행 시간도 길어집니다.

2. **공간 복잡도**: O(n) - 쿼리 결과를 저장하기 위한 메모리 공간이 필요하며, 결과 집합의 크기가 데이터의 크기에 비례하므로 공간 복잡도도 O(n)입니다.

3. **풀이 접근법**: 이 쿼리는 내부 조인(inner join)과 그룹화(group by)를 사용하여 Register 테이블에서 각 contest_id 별로 user_id의 개수를 세는 방법을 사용합니다. 이는 문제의 요구 사항을 직접적으로 해결하는 간단한 접근법입니다.

4. **잘된 점**: 코드는 간결하고, 문제의 요구 사항을 명확하게 이해하여 구현하였습니다. 또한, 필요한 테이블과 열을 정확하게 식별하여 사용하였습니다.

5. **개선 사항**: 현재 쿼리는 Register 테이블의 모든 행을 스캔하므로, 대량의 데이터에 대해서는 성능이 저하될 수 있습니다. 개선 사항으로는 Register 테이블에 적절한 인덱스를 생성하여 쿼리 성능을 향상시키는 것이 있습니다. 또한, 문제에서 요구하는 것은 각 contest_id 별로 user_id의 개수의 비율이기 때문에, COUNT(DISTINCT T2.user_id)와 함께 전체 사용자 수를 고려하여 비율을 계산하는 쿼리를 작성할 필요가 있습니다. 예를 들어:
```oraclesql
SELECT T2.contest_id, 
       COUNT(DISTINCT T2.user_id) / (SELECT COUNT(*) FROM Users) AS percentage
  FROM Register T2
 GROUP BY T2.contest_id
```
