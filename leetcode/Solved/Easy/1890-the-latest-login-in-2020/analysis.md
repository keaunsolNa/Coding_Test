# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 18. 오전 10:13:22 |
| Language | mysql |
| Runtime | 466 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/the-latest-login-in-2020/submissions/)

## Code Review

리뷰 대상 코드는 MySQL 쿼리문으로, 2020년 최신 로그인 시간을 찾는 문제를 해결하기 위해 작성되었습니다. 

1. **시간 복잡도**: 이 쿼리의 시간 복잡도는 O(n)입니다. 여기서 n은 Logins 테이블의 행 수를 나타냅니다. 쿼리문은 테이블의 모든 행을 스캔하여 user_id, time_stamp, 및 연도 추출을 수행하기 때문입니다.

2. **공간 복잡도**: 쿼리의 공간 복잡도는 O(n)입니다. 쿼리 결과는 테이블의 모든 행을 포함하므로, 결과 집합의 크기는 입력 테이블의 크기와 동일할 수 있습니다.

3. **풀이 접근법**: 이 쿼리에서는 기본적인 MySQL 함수를 사용하여 문제를 해결합니다. DATE_FORMAT 함수를 사용하여 timestamp를 날짜 형식으로 변환하고, SUBSTR 함수를 사용하여 연도를 추출합니다. 이는 간단한 문자열 처리와 날짜 변환을 위한 직접적인 접근법입니다.

4. **잘된 점**: 코드는 간결하며, 필요한 열을 정확하게 추출합니다. 또한, DATE_FORMAT과 SUBSTR 함수의 사용이 적절하여 코드의 가독성이 좋습니다.

5. **개선 사항**: 현재 쿼리는 2020년의 최신 로그인 시간을 찾는 문제를 완전히 해결하지 못합니다. 쿼리문은 모든 로그인 기록을 반환하며, 최신 로그인 시간을 찾기 위해서는 MAX 함수나 ORDER BY와 LIMIT를 사용해야 합니다. 예를 들어, 다음과 같이 수정할 수 있습니다:
```mysql
SELECT user_id, MAX(time_stamp) as last_stamp
FROM Logins
WHERE YEAR(time_stamp) = 2020
GROUP BY user_id
```
이 수정된 쿼리는 2020年の 각 사용자의 최신 로그인 시간을 찾는 문제를 해결합니다.
