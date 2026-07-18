# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 18. 오전 10:12:52 |
| Language | mysql |
| Runtime | 70 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/the-latest-login-in-2020/submissions/)

## Code Review

리뷰 대상 코드는 LeetCode의 "the-latest-login-in-2020" 문제를 MySQL로 해결한 것입니다. 

1. **시간 복잡도**: 이 쿼리의 시간 복잡도는 O(n)입니다. 여기서 n은 Logins 테이블의 행 수를 나타냅니다. 쿼리는 테이블의 모든 행을 스캔하여 user_id, time_stamp, 및 연도 추출을 수행하기 때문입니다.

2. **공간 복잡도**: 쿼리의 공간 복잡도는 O(n)입니다. 쿼리 결과로 반환되는 행의 수는 원본 테이블의 행 수와 동일할 수 있기 때문입니다.

3. **풀이 접근법**: 이 쿼리에서는 기본적인 SQL 문법을 사용하여 테이블에서 필요한 열을 선택하고, SUBSTR 함수를 사용하여 연도를 추출합니다. 이는 간단한 데이터 조회 및 가공을 위한 직접적인 접근법입니다.

4. **잘된 점**: 코드는 간결하고 읽기 쉽습니다. 필요한 열을 명확하게 선택하고, 연도를 추출하는 로직이 직관적입니다. 또한, 쿼리 문법이 올바르며, 필요한 결과를 반환하는 데 성공합니다.

5. **개선 사항**: 현재 쿼리는 2020년의 최신 로그인 정보를 반환하는 것이 아니라, 모든 로그인 정보에서 연도만 추출합니다. 문제의 의도에 따라 2020년의 최신 로그인 정보를 반환하려면, MAX 함수와 WHERE 절을 사용하여 2020년에 해당하는 로그인 정보만 필터링하고, 최신 시간戳를 가진 로그인을 찾는 쿼리를 작성해야 합니다. 예를 들어, 다음과 같이 수정할 수 있습니다:
```mysql
SELECT user_id, MAX(time_stamp) as last_stamp
FROM Logins
WHERE YEAR(time_stamp) = 2020
GROUP BY user_id
```
