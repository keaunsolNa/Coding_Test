# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 21. 오전 8:41:03 |
| Language | oraclesql |
| Runtime | 273 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/percentage-of-users-attended-a-contest/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 Users 테이블과 Register 테이블을 조인해야 하므로, 테이블에 있는 행의 수(n)에 비례하는 시간이 걸립니다. CNT 뷰는 상수 시간에 계산되므로 전체 시간 복잡도에 영향을 미치지 않습니다.

2. **공간 복잡도**: O(n) - 쿼리 결과를 저장하기 위해 필요한 공간은 입력 테이블의 크기(n)에 비례합니다. CNT 뷰는 상수 공간을 사용하므로 전체 공간 복잡도에 영향을 미치지 않습니다.

3. **풀이 접근법**: 이 쿼리는 기본적인 집계 함수와 조인을 사용하여 문제를 해결합니다. CNT 뷰를 사용하여 전체 사용자 수를 계산하고, Register 테이블을 조인하여 각 콘테스트에 참가한 사용자 수를 계산합니다.

4. **잘된 점**: 코드는 비교적 간결하고, 문제를 명확하게 해결합니다. CNT 뷰를 사용하여 전체 사용자 수를 계산하는 것은 좋은 아이디어입니다.

5. **개선 사항**: 현재 쿼리는 Register 테이블에 있는 모든 행을 처리해야 하므로, 테이블이 매우 큰 경우 성능이 저하될 수 있습니다. 이를 개선하기 위해, Register 테이블에 인덱스를 생성하여 조인 성능을 향상시킬 수 있습니다. 또한, CNT 뷰를 서브쿼리로 대체하여 쿼리를 단순화할 수 있습니다. 예를 들어:
```oraclesql
SELECT T2.contest_id
     , (SELECT COUNT(DISTINCT user_id) FROM Users) AS total_users
     , COUNT(T2.user_id) AS attended_users
  FROM Register T2
 GROUP BY T2.contest_id
```
