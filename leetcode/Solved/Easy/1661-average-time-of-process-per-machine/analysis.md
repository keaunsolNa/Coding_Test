# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 22. 오전 9:47:25 |
| Language | oraclesql |
| Runtime | 224 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/average-time-of-process-per-machine/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n^2) - 서브쿼리가 사용되어 전체 데이터를 두 번 스캔하기 때문에 시간 복잡도가 높습니다. 각 머신 아이디에 대해 시작과 끝 시간의 합을 구하는 데에 시간이 많이 소요됩니다.

2. **공간 복잡도**: O(n) - 결과를 저장하기 위한 공간이 필요합니다. 각 머신 아이디에 대한 정보를 저장해야 하므로 공간 복잡도는 데이터의 크기에 비례합니다.

3. **풀이 접근법**: 서브쿼리(subquery)를 사용하여 각 머신 아이디에 대해 시작과 끝 시간의 합을 구했습니다. 이는 간단한 접근법이지만 효율적인 방법은 아닙니다.

4. **잘된 점**: 코드는 간단하고 이해하기 쉽습니다. 머신 아이디와 시작, 끝 시간의 합을 구하는 기본적인 로직은 잘 구현되어 있습니다.

5. **개선 사항**: JOIN이나 GROUP BY를 사용하여 한 번의 스캔으로 데이터를 처리할 수 있습니다. 예를 들어, 다음과 같이 작성할 수 있습니다.
```oraclesql
SELECT machine_id
     , SUM(CASE WHEN activity_type = 'start' THEN timestamp ELSE 0 END) sum_start_time
     , SUM(CASE WHEN activity_type = 'end' THEN timestamp ELSE 0 END) sum_end_time
  FROM Activity
 GROUP BY machine_id
```
이 방법은 한 번의 스캔으로 데이터를 처리하기 때문에 시간 복잡도를 개선할 수 있습니다.
