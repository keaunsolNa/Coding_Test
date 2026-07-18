# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 18. 오전 10:13:53 |
| Language | mysql |
| Runtime | 70 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/the-latest-login-in-2020/submissions/)

## Code Review

코드 리뷰를 진행하겠습니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 전체 로그인 기록을 스캔하기 때문에 시간 복잡도는 데이터의 크기(n)에 비례합니다. 즉, 데이터가 많을수록 쿼리 실행 시간이 길어집니다.

2. **공간 복잡도**: O(n) - 쿼리 결과는 원본 데이터의 크기(n)와 비슷한 크기의 공간을 필요로 하므로 공간 복잡도도 O(n)입니다.

3. **풀이 접근법**: 이 쿼리는 단순히 로그인 기록 테이블에서 사용자 ID, 타임스탬프, 그리고 타임스탬프의 날짜 부분을 추출하는 것입니다. 사용된 알고리즘은 기본적인 SELECT 쿼리입니다.

4. **잘된 점**: 코드는 간결하고, 필요한 컬럼만을 선택하여 가져오고 있습니다. 또한, DATE 함수를 사용하여 타임스탬프에서 날짜 부분만을 추출하는 것은 적절합니다.

5. **개선 사항**: 현재 쿼리는 사용자별 가장 최근의 로그인 기록을 가져오지 못합니다. 문제의 의도는 2020년의 가장 최근 로그인 기록을 가져오는 것인데, 현재 쿼리는 모든 로그인 기록을 가져옵니다. 이를 개선하기 위해 MAX 함수와 GROUP BY를 사용하여 사용자별 가장 최근의 로그인 기록을 가져올 수 있습니다. 예를 들어:
```mysql
SELECT user_id, MAX(time_stamp) as last_stamp
FROM Logins
WHERE YEAR(time_stamp) = 2020
GROUP BY user_id
```
