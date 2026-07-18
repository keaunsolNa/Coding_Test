# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 18. 오전 10:10:36 |
| Language | mysql |
| Runtime | 76 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/the-latest-login-in-2020/submissions/)

## Code Review

코드 리뷰를 진행하겠습니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 전체 로그인 기록을 스캔하므로, 시간 복잡도는 데이터의 크기(n)에 비례합니다. SUBSTR 함수의 사용은 상수 시간 내에 수행되므로, 전체 쿼리의 시간 복잡도에 영향을 미치지 않습니다.

2. **공간 복잡도**: O(n) - 쿼리 결과는 원본 데이터의 크기(n)와 비슷할 수 있으므로, 공간 복잡도도 데이터의 크기에 비례합니다. 결과 집합은 사용자 ID, 타임스탬프, 및 연도만 포함하므로, 원본 데이터보다 작을 수 있습니다.

3. **풀이 접근법**: 이 쿼리는 간단한 필터링을 사용하여 2020年の 로그인 기록을 찾습니다. WHERE 절에서 SUBSTR 함수를 사용하여 타임스탬프의 연도를 추출하고, 이를 '2020'과 비교하여 해당하는 로그인 기록만을 선택합니다.

4. **잘된 점**: 코드는 간결하고, 읽기 쉽습니다. 필요한 열만을 선택하고, WHERE 절에서 적절한 조건을 사용하여 2020年の 로그인 기록만을 필터링합니다.

5. **개선 사항**: 쿼리에서 SUBSTR 함수를 사용하여 타임스탬프의 연도를 추출하는 대신, DATE_FORMAT 함수를 사용하여 더 효율적으로 연도를 추출할 수 있습니다. 또한, 인덱스를 생성하여 쿼리의 성능을 개선할 수 있습니다. 예를 들어, 다음과 같이 쿼리를 개선할 수 있습니다.
```mysql
SELECT user_id
     , time_stamp as last_stamp
     , DATE_FORMAT(time_stamp, '%Y') as year
  FROM Logins
 WHERE DATE_FORMAT(time_stamp, '%Y') = '2020'
```
이러한 개선 사항은 쿼리의 성능과 가독성을 향상시킬 수 있습니다.
