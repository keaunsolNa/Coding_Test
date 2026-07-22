# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 22. 오전 9:50:29 |
| Language | oraclesql |
| Runtime | 330 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/average-time-of-process-per-machine/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 코드는 Activity 테이블을 여러 번 스캔하기 때문에, 전체 데이터의 크기(n)에 비례하는 시간 복잡도를 가지게 됩니다. 서브쿼리에서 SUM을 계산하고, 메인 쿼리에서 COUNT를 계산하는 과정에서 데이터를 스캔하기 때문입니다.

2. **공간 복잡도**: O(n) - 이 코드는 중간 결과를 저장하기 위해 임시 테이블을 사용합니다. 이 임시 테이블의 크기는 입력 데이터의 크기(n)에 비례하므로, 공간 복잡도도 O(n)입니다.

3. **풀이 접근법**: 이 코드는 기본적으로 집계 함수(SUM, COUNT)를 사용하여 데이터를 처리하는 접근법을 사용하고 있습니다. 서브쿼리를 사용하여 각 머신의 시작 시간과 종료 시간의 합을 계산하고, 이를 사용하여 처리 시간을 계산합니다.

4. **잘된 점**: 코드는 비교적 간결하고, 필요한 계산을 명확하게 수행합니다. 또한, ROUND 함수를 사용하여 결과를 소수점 3자리까지 반올림하여 출력합니다.

5. **개선 사항**: 이 코드는 여러 번의 서브쿼리 호출로 인해 성능이 저하될 수 있습니다. 대안적인 접근법은 JOIN이나 WINDOW 함수를 사용하여 데이터를 처리하는 것입니다. 예를 들어, 다음과 같이 JOIN을 사용할 수 있습니다.
```oraclesql
SELECT T1.machine_id
     , ROUND((SUM(CASE WHEN T2.activity_type = 'end' THEN T2.timestamp ELSE 0 END) - 
              SUM(CASE WHEN T2.activity_type = 'start' THEN T2.timestamp ELSE 0 END)) / 
             COUNT(T2.machine_id) / 2, 3) as processing_time
  FROM (SELECT DISTINCT machine_id FROM Activity) T1
  JOIN Activity T2 ON T1.machine_id = T2.machine_id
  GROUP BY T1.machine_id
```
이러한 접근법은 서브쿼리 호출을 줄이고, 데이터를 한 번에 처리하여 성능을 개선할 수 있습니다.
