# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 21. 오전 8:42:28 |
| Language | oraclesql |
| Runtime | 281 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/percentage-of-users-attended-a-contest/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 Users 테이블과 Register 테이블을 조인하고, 각 콘테스트별로 사용자 수를 집계합니다. 따라서 시간 복잡도는 데이터의 크기(n)에 비례합니다.

2. **공간 복잡도**: O(n) - 쿼리 결과는 각 콘테스트별로 사용자 수를 포함하므로, 공간 복잡도도 데이터의 크기(n)에 비례합니다.

3. **풀이 접근법**: 이 쿼리는 사용자 수를 집계하고, 각 콘테스트별로 사용자 수를 계산하여 전체 사용자 수 대비 비율을 구하는 방법을 사용합니다. 이는 기본적인 집계 함수와 조인 연산을 사용한 접근법입니다.

4. **잘된 점**: 코드는 비교적 간결하고, 필요한 연산을 수행합니다. 또한, ROUND 함수를 사용하여 결과를 소수점 2자리까지 반올림하여 가독성을 높였습니다.

5. **개선 사항**: 현재 쿼리는 CNT라는 임시 뷰를 사용하여 전체 사용자 수를 계산하고, 이를 각 콘테스트별로 사용자 수를 계산할 때 사용합니다. 그러나 이 방법은 불필요한 중간 결과를 생성하여 성능을 저하할 수 있습니다. 대신, 서브쿼리 또는 윈도우 함수를 사용하여 전체 사용자 수를 계산할 수 있습니다. 예를 들어, 다음과 같이 수정할 수 있습니다.
```oraclesql
SELECT 
  T2.contest_id,
  ROUND(COUNT(T2.user_id) / (SELECT COUNT(DISTINCT user_id) FROM Users) * 100, 2) AS percentage
FROM 
  Users T1
  JOIN Register T2 ON T1.user_id = T2.user_id
GROUP BY 
  T2.contest_id
```
이 방법은 중간 결과를 생성하지 않고, 직접 전체 사용자 수를 계산하여 성능을 개선할 수 있습니다.
