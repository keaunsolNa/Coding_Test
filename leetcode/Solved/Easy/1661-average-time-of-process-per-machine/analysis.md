# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 22. 오전 9:50:11 |
| Language | oraclesql |
| Runtime | 255 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/average-time-of-process-per-machine/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n^2) - 서브쿼리 내에서 전체 데이터를 스캔하는 작업이 반복되므로, 전체 데이터의 크기(n)에 비례하는 시간이 소요됩니다. 특히, 서브쿼리에서 SUM 함수를 사용하여 데이터를 집계하는 작업이 각 행마다 수행되므로, 시간 복잡도가 증가합니다.

2. **공간 복잡도**: O(n) - 중간 결과를 저장하기 위한 임시 테이블이 사용되므로, 공간 복잡도는 전체 데이터의 크기(n)에 비례합니다.

3. **풀이 접근법**: 이 풀이에서는 서브쿼리와 집계 함수(SUM, COUNT)를 사용하여 각 머신의 처리 시간을 계산합니다. 이는 기본적인 집계 쿼리 패턴입니다. 그러나 서브쿼리가 반복적으로 실행되므로, 효율적인 쿼리 최적화가 필요합니다.

4. **잘된 점**: 코드는 비교적 간결하고, 각 머신의 처리 시간을 계산하는 로직이 명확하게 구현되어 있습니다. 또한, ROUND 함수를 사용하여 결과를 소수점 3자리까지 반올림하여 처리합니다.

5. **개선 사항**: 서브쿼리를 JOIN이나 WINDOW 함수로 대체하여 쿼리 최적화를 수행할 수 있습니다. 예를 들어, 다음과 같이 수정할 수 있습니다.
```oraclesql
SELECT machine_id
     , ROUND((SUM(CASE WHEN activity_type = 'end' THEN timestamp ELSE 0 END) - 
              SUM(CASE WHEN activity_type = 'start' THEN timestamp ELSE 0 END)) / 
             (COUNT(CASE WHEN activity_type = 'start' THEN 1 ELSE 0 END)), 3) as processing_time
  FROM Activity
  GROUP BY machine_id
```
이러한 수정으로 쿼리 성능을 개선하고, 시간 복잡도를 줄일 수 있습니다.
