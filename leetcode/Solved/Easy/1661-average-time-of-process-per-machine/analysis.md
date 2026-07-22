# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 22. 오전 9:47:51 |
| Language | oraclesql |
| Runtime | 220 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/average-time-of-process-per-machine/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n^2) - 서브쿼리 내에서 전체 데이터를 스캔하기 때문에, 데이터가 많을 경우 성능이 저하될 수 있습니다. 서브쿼리에서 데이터를 가져오는 작업이 반복적으로 수행되기 때문입니다.

2. **공간 복잡도**: O(n) - 결과セット에 machine_id당 하나의 행이 생성되므로, 공간 복잡도는 데이터의 크기에 비례합니다.

3. **풀이 접근법**: 이 풀이에서는 서브쿼리를 사용하여 각 머신의 시작 시간과 종료 시간의 합을 계산하고, 행 수를 계산합니다. 이는 간단한 접근법이지만, 데이터가 많을 경우 성능 이슈가 발생할 수 있습니다.

4. **잘된 점**: 코드는 간결하고, 각 머신의 시작 시간과 종료 시간의 합을 계산하는 로직이 명확합니다. 또한, 필요한 데이터만을 가져오기 때문에 불필요한 데이터 전송을 피할 수 있습니다.

5. **개선 사항**: 서브쿼리를 JOIN이나 조건절에서 사용하는 것보다, 서브쿼리를 하나의 쿼리로 합치는 것이 더 효율적일 수 있습니다. 예를 들어, 다음과 같이 작성할 수 있습니다.
```oraclesql
SELECT machine_id
     , SUM(CASE WHEN activity_type = 'start' THEN timestamp ELSE 0 END) as sum_start_time
     , SUM(CASE WHEN activity_type = 'end' THEN timestamp ELSE 0 END) as sum_end_time
     , COUNT(machine_id) as cnt      
  FROM Activity
 GROUP BY machine_id
```
이렇게 하면 서브쿼리 없이도 필요한 데이터를 가져올 수 있으며, 성능이 개선될 수 있습니다.
