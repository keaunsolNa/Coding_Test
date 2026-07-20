# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 21. 오전 8:42:49 |
| Language | oraclesql |
| Runtime | 267 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/percentage-of-users-attended-a-contest/submissions/)

## Code Review

코드 리뷰를 진행하겠습니다.

1. **시간 복잡도**: O(n log n) - 이 쿼리는 사용자 수(n)와 관련된 데이터를 처리하고, ORDER BY 절을 사용하여 결과를 정렬하므로 시간 복잡도는 O(n log n)입니다. 특히, COUNT(DISTINCT)와 ROUND 함수의 계산이 추가적으로 시간을 소요할 수 있습니다.

2. **공간 복잡도**: O(n) - 쿼리에서 사용되는 임시 결과 집합(CNT)은 사용자 수(n)에 비례하므로 공간 복잡도는 O(n)입니다. 또한, Register 테이블과 Users 테이블의 조인 결과도 공간을 차지할 수 있습니다.

3. **풀이 접근법**: 이 쿼리는 사용자 수를 집계하고, 각 콘테스트에 참여한 사용자 수를 계산하여 전체 사용자 수에 대한 비율을 구하는 방식으로 접근합니다. WITH 절을 사용하여 중간 결과를 계산하고, 이 결과를 다시 사용하여 최종 결과를 얻습니다. 이는 임시 결과를 재사용하는 패턴입니다.

4. **잘된 점**: 코드는 비교적 간결하고, WITH 절을 사용하여 중간 결과를 계산하는 방식이 읽기 쉽습니다. 또한, ROUND 함수를 사용하여 결과를 소수점 2자리까지 반올림하여 가독성을 높였습니다.

5. **개선 사항**: 쿼리에서 사용되는 테이블 조인과 집계 함수가 성능에 영향을 줄 수 있습니다. 특히, Register 테이블과 Users 테이블의 조인 조건이 적절히 인덱싱되어 있는지 확인해야 합니다. 또한, COUNT(DISTINCT) 함수의 성능을 개선하기 위해 적절한 인덱스를 생성하는 것이 좋습니다. 마지막으로, ORDER BY 절에서 ROUND 함수를 사용하는 대신, 별도의 열로 계산하여 정렬하는 방식으로 개선할 수 있습니다. 예를 들어:
```oraclesql
WITH CNT AS (
SELECT COUNT(DISTINCT T1.user_id) cnt
  FROM Users T1
)
SELECT T2.contest_id
     , ROUND(COUNT(T2.user_id) / T3.CNT * 100, 2) AS percentage
     , COUNT(T2.user_id) / T3.CNT * 100 AS raw_percentage
  FROM Users T1
     , Register T2
     , CNT T3
 WHERE T1.user_id = T2.user_id
 GROUP BY T2.contest_id, T3.cnt
 ORDER BY raw_percentage
```
