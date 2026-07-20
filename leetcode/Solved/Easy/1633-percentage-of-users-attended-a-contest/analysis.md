# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 21. 오전 8:41:21 |
| Language | oraclesql |
| Runtime | 290 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/percentage-of-users-attended-a-contest/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 Users 테이블과 Register 테이블을 조인하고, COUNT DISTINCT와 ROUND 함수를 사용합니다. 이러한 연산들은 데이터의 크기에 비례하여 시간이 소요되므로 시간 복잡도는 O(n)입니다.

2. **공간 복잡도**: O(n) - 쿼리에서 사용되는 임시 결과 집합(CNT)은 Users 테이블의 행 수에 비례하므로 공간 복잡도는 O(n)입니다.

3. **풀이 접근법**: 이 쿼리는 공통 테이블 식(CNT)과 조인을 사용하여 문제를 해결합니다. CNT에서는 사용자 수를 집계하고, 메인 쿼리에서는 각 콘테스트에 참가한 사용자 수를 계산하여 전체 사용자 수로 나눕니다. 이는 집계 함수와 조인을 사용하는 기본적인 데이터베이스 쿼리 패턴입니다.

4. **잘된 점**: 코드는 문제를 명확하게 이해하고, 필요한 데이터를 효율적으로 추출합니다. 또한, ROUND 함수를 사용하여 결과를 소수점 2자리까지 반올림하여 읽기 쉽게 합니다.

5. **개선 사항**: 현재 쿼리는 Users 테이블과 Register 테이블을 조인하여 사용자 수를 계산합니다. 하지만, Register 테이블에서만 사용자 수를 계산하면 더 효율적일 수 있습니다. 또한, CNT를 서브쿼리 대신 JOIN으로 사용할 수 있습니다. 예를 들어:
```oraclesql
SELECT T2.contest_id
     , ROUND(COUNT(DISTINCT T2.user_id) / (SELECT COUNT(DISTINCT user_id) FROM Users), 2)
  FROM Register T2
 GROUP BY T2.contest_id
```
이렇게 하면 쿼리가 더 간결하고 읽기 쉽게 됩니다.
