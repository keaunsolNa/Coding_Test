# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 18. 오전 10:22:14 |
| Language | mysql |
| Runtime | 67 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/the-latest-login-in-2020/submissions/)

## Code Review

LeetCode 솔루션을 검토한 결과, 다음과 같은 평가를 내릴 수 있습니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 Logins 테이블의 모든 행을 스캔해야 하므로, 시간 복잡도는 데이터의 크기(n)에 비례합니다. DATE 함수의 사용으로 인해 추가적인 연산이 발생하지만, 이는 상수 시간 내에 처리되므로 전체 시간 복잡도에 영향을 미치지 않습니다.

2. **공간 복잡도**: O(n) - 쿼리 결과는 원본 테이블의 크기(n)와 비슷한 크기로 반환되므로, 공간 복잡도도 데이터의 크기(n)에 비례합니다.

3. **풀이 접근법**: 이 쿼리는 간단한 필터링을 사용하여 2020년에 발생한 로그인 기록을 찾습니다. WHERE 절에서 DATE 함수를 사용하여 timestamp를 날짜로 변환하고, BETWEEN 연산자를 사용하여 2020년의 날짜 범위 내에 있는 로그인 기록만을 선택합니다.

4. **잘된 점**: 쿼리는 간결하고 읽기 쉽습니다. DATE 함수와 BETWEEN 연산자의 사용으로 인해 코드가 명확하고, 원하는 결과를 효과적으로 반환합니다.

5. **개선 사항**: 쿼리 자체는 효율적이지만, 인덱스를 사용하여 쿼리 성능을 개선할 수 있습니다. 예를 들어, time_stamp 열에 인덱스를 생성하면 쿼리 엔진이 더 빠르게 데이터를 필터링할 수 있습니다. 또한, 쿼리에서 불필요한 열을 선택하지 않도록 하여 데이터 전송을 줄일 수 있습니다. 예를 들어, 다음과 같이 쿼리를 수정할 수 있습니다:
```mysql
SELECT user_id, MAX(time_stamp) as last_stamp
FROM Logins
WHERE DATE(time_stamp) BETWEEN '2020-01-01' AND '2020-12-31'
GROUP BY user_id
```
이 수정된 쿼리는 각 사용자의 마지막 로그인 시간을 찾는 데 더 효율적입니다.
