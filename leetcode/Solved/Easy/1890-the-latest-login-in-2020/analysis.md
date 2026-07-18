# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 18. 오전 10:13:41 |
| Language | mysql |
| Runtime | 74 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/the-latest-login-in-2020/submissions/)

## Code Review

리뷰 대상 코드는 MySQL 쿼리문으로, 2020년 최신 로그인 정보를 조회하는 문제를 해결하기 위해 작성되었습니다. 

1. **시간 복잡도**: 이 쿼리의 시간 복잡도는 O(n)입니다. 여기서 n은 Logins 테이블의 행 수를 나타냅니다. 쿼리문은 테이블의 모든 행을 스캔하여 user_id, time_stamp, DATE_FORMAT(time_stamp) 값을 조회하기 때문입니다.

2. **공간 복잡도**: 이 쿼리의 공간 복잡도는 O(n)입니다. 쿼리 결과로 반환되는 데이터의 크기가 테이블의 행 수에 비례하기 때문입니다.

3. **풀이 접근법**: 사용된 알고리즘은 단순히 테이블의 모든 행을 스캔하여 필요한 값을 조회하는 것입니다. DATE_FORMAT 함수를 사용하여 time_stamp 값을 날짜 형식으로 변환하고 있습니다.

4. **잘된 점**: 코드는 간결하고, 필요한 컬럼만을 조회하여 불필요한 데이터 전송을 피하고 있습니다. 또한, DATE_FORMAT 함수를 사용하여 날짜 형식을 일관성 있게 처리하고 있습니다.

5. **개선 사항**: 현재 쿼리문은 모든 로그인 기록을 조회합니다. 하지만 문제에서 요구하는 것은 2020년의 최신 로그인 정보입니다. 따라서, 쿼리문을 다음과 같이 수정하여 2020년의 최신 로그인 정보만을 조회할 수 있습니다.
```mysql
SELECT user_id, MAX(time_stamp) as last_stamp
FROM Logins
WHERE YEAR(time_stamp) = 2020
GROUP BY user_id
```
또한, 위 쿼리문은 user_id별로 가장 최근의 로그인 시간을 조회합니다. 만약 시간을 YYYYMMDD 형식으로 출력하고 싶다면, DATE_FORMAT 함수를 사용할 수 있습니다.
```mysql
SELECT user_id, DATE_FORMAT(MAX(time_stamp), '%Y%m%d') as last_stamp
FROM Logins
WHERE YEAR(time_stamp) = 2020
GROUP BY user_id
```
