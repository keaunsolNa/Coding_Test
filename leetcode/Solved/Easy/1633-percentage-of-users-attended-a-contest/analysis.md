# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 21. 오전 8:41:38 |
| Language | oraclesql |
| Runtime | 325 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/percentage-of-users-attended-a-contest/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리에서는 Users 테이블과 Register 테이블을 조인하고, 각 테이블의 행 수에 비례하는 시간이 소요됩니다. CNT 뷰에서 사용자 수를 계산하는 데도 시간이 소요되지만, 이는 상수 시간에 비례하므로 전체 시간 복잡도는 O(n)입니다.

2. **공간 복잡도**: O(n) - 쿼리에서 사용되는 임시 뷰(CNT)와 조인 결과에 필요한 공간은 입력 데이터의 크기에 비례합니다. 따라서 공간 복잡도는 O(n)입니다.

3. **풀이 접근법**: 이 쿼리에서는 서브쿼리와 조인을 사용하여 문제를 해결합니다. 먼저 CNT 뷰에서 전체 사용자 수를 계산하고, затем Register 테이블과 Users 테이블을 조인하여 각 콘테스트에 참가한 사용자 수를 계산합니다. 마지막으로, 참가한 사용자 수를 전체 사용자 수로 나누어 참가율을 계산합니다.

4. **잘된 점**: 코드는 비교적 간결하고, 문제를 해결하는 데 필요한 논리를 명확하게 표현합니다. 또한, ROUND 함수를 사용하여 결과를 소수점 2자리까지 반올림하여 결과를 깔끔하게 표현합니다.

5. **개선 사항**: 현재 쿼리에서는 Register 테이블과 Users 테이블을 조인하여 사용자 정보를 가져옵니다. 그러나 Users 테이블의 정보는 실제로 사용되지 않습니다. 따라서, 조인을 피하고 Register 테이블에서만 필요한 정보를 가져오는 방식으로 쿼리를 최적화할 수 있습니다. 또한, CNT 뷰를 서브쿼리에서 바로 계산하여 JOIN을 피할 수 있습니다. 예를 들어, 다음과 같이 쿼리를 개선할 수 있습니다.

```oraclesql
SELECT T1.contest_id
     , ROUND(COUNT(DISTINCT T1.user_id) / 
             (SELECT COUNT(DISTINCT user_id) FROM Users), 2) AS percentage
  FROM Register T1
 GROUP BY T1.contest_id
```
