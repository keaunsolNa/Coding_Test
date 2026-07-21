# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 21. 오후 4:01:48 |
| Language | mysql |
| Runtime | 93 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/queries-quality-and-percentage/submissions/)

## Code Review

코드 리뷰를 진행하겠습니다.

1. **시간 복잡도**: O(n^2) - 쿼리 내에 서브쿼리가 존재하여, 전체 데이터를 반복적으로 처리하는 시간 복잡도가 발생합니다. 서브쿼리 내에서 GROUP BY와 HAVING 절을 사용하여 데이터를 처리하기 때문에, 시간 복잡도가 증가합니다.

2. **공간 복잡도**: O(n) - 쿼리 결과를 저장하기 위한 공간이 필요하여, 공간 복잡도가 발생합니다. 결과 집합의 크기가 입력 데이터의 크기와 비슷할 수 있으므로, 공간 복잡도는 선형적으로 증가합니다.

3. **풀이 접근법**: 이 쿼리는 집계 함수와 서브쿼리를 사용하여 데이터를 처리합니다. SUM, COUNT 함수를 사용하여 데이터를 집계하고, 서브쿼리를 사용하여 특정 조건을 만족하는 데이터를 필터링합니다. 이 접근법은 문제를 해결하는 데 효과적이지만, 시간 복잡도가 높을 수 있습니다.

4. **잘된 점**: 코드는 문제를 해결하는 데 필요한 논리를 포함하고 있습니다. 집계 함수와 서브쿼리를 사용하여 데이터를 처리하는 방식은 문제의 요구 사항을 만족합니다. 또한, ROUND 함수를 사용하여 결과를 소수점 2자리까지 반올림하여 출력합니다.

5. **개선 사항**: 서브쿼리를 JOIN이나 WINDOW 함수로 대체하여 시간 복잡도를 개선할 수 있습니다. 예를 들어, WINDOW 함수를 사용하여 rating < 3인 데이터를 필터링할 수 있습니다. 또한, 인덱스를 생성하여 쿼리 성능을 개선할 수 있습니다. 다음은 개선된 쿼리 예시입니다.
```mysql
SELECT query_name
     , ROUND((SUM(rating / position)) / COUNT(query_name), 2) as quality
     , ROUND(AVG(CASE WHEN rating < 3 THEN 1.0 ELSE 0 END) * 100, 2) as percentage
FROM Queries
GROUP BY query_name
```
