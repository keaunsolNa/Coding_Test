# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 22. 오전 9:49:59 |
| Language | oraclesql |
| Runtime | 255 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/average-time-of-process-per-machine/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n^2) - 이 코드는 서브쿼리를 사용하여 각 머신 아이디에 대해 시작 및 종료 시간의 합을 계산합니다. 이로 인해 쿼리가 Activity 테이블을 여러 번 스캔해야 하므로 시간 복잡도가 증가합니다.

2. **공간 복잡도**: O(n) - 이 코드는 중간 결과를 저장하기 위해 임시 테이블을 사용합니다. 이 임시 테이블의 크기는 Activity 테이블의 머신 아이디 수에 비례하므로 공간 복잡도는 O(n)입니다.

3. **풀이 접근법**: 이 코드는 서브쿼리와 집계 함수를 사용하여 각 머신 아이디의 평균 처리 시간을 계산합니다. 이는 문제를 해결하는 직관적인 접근법이지만, 효율적인 쿼리 최적화가 필요합니다.

4. **잘된 점**: 코드는 문제를 명확하게 이해하고, 각 머신 아이디의 평균 처리 시간을 계산하는 논리를 제대로 구현했습니다. 또한, ROUND 함수를 사용하여 결과를 3자리까지 반올림하여 출력 형식을 맞추었습니다.

5. **개선 사항**: 이 코드의 효율성을 개선하기 위해 JOIN과 집계 함수를 사용하여 서브쿼리의 반복적인 테이블 스캔을 줄일 수 있습니다. 예를 들어, 다음과 같이 수정할 수 있습니다.
```oraclesql
SELECT 
  machine_id,
  ROUND((SUM(CASE WHEN activity_type = 'end' THEN timestamp ELSE 0 END) - 
         SUM(CASE WHEN activity_type = 'start' THEN timestamp ELSE 0 END)) / 
        (COUNT(CASE WHEN activity_type = 'start' THEN 1 ELSE NULL END)), 3) AS processing_time
FROM 
  Activity
GROUP BY 
  machine_id
```
이 수정된 코드는 서브쿼리 없이도 문제를 해결할 수 있으며, 효율적인 쿼리 최적화를 통해 성능을 개선할 수 있습니다.
