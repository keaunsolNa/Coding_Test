# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 22. 오전 9:46:58 |
| Language | oraclesql |
| Runtime | 275 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/average-time-of-process-per-machine/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n^2) - 서브쿼리 내에서 전체 테이블을 스캔하는 작업이 반복되므로, 시간 복잡도가 높습니다. 이는 쿼리 성능에 악영향을 미칠 수 있습니다.

2. **공간 복잡도**: O(n) - 쿼리 결과는 각 머신당 하나의 행을 반환하므로, 공간 복잡도는 결과 집합의 크기에 비례합니다.

3. **풀이 접근법**: 이 풀이는 서브쿼리를 사용하여 각 머신의 시작 시간을 합산합니다. 이는 간단한 접근법이지만, 효율적인 쿼리 최적화가 되지 않았습니다. 일반적으로는 JOIN이나 WINDOW FUNCTION을 사용하여 더 효율적인 쿼리를 작성할 수 있습니다.

4. **잘된 점**: 코드는 간단명료하여 이해하기 쉽습니다. 또한, 문제의 요구 사항을 만족하는 결과를 반환합니다.

5. **개선 사항**: 서브쿼리를 JOIN이나 WINDOW FUNCTION으로 대체하여 쿼리 성능을 개선할 수 있습니다. 예를 들어, 다음과 같이 작성할 수 있습니다.
```oraclesql
SELECT A.machine_id, SUM(CASE WHEN A.activity_type = 'start' THEN A.timestamp ELSE 0 END) AS total_time
FROM Activity A
GROUP BY A.machine_id
```
이렇게 하면 쿼리 성능이 개선되고, 더 효율적인 해결책을 제공할 수 있습니다.
