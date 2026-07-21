# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 21. 오후 3:55:57 |
| Language | mysql |
| Runtime | 62 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/queries-quality-and-percentage/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 쿼리문이 테이블의 모든 행을 스캔하기 때문에 시간 복잡도는 선형입니다. 그러나 `GROUP B` 구문이 올바르지 않아 현재 쿼리는 실행되지 않습니다.

2. **공간 복잡도**: O(n) - 쿼리 결과를 저장하기 위해 필요한 공간은 입력 데이터의 크기에 비례합니다.

3. **풀이 접근법**: 이 문제는 데이터베이스 쿼리 문제로, 사용된 알고리즘은 단순한 집계 함수와 그룹화입니다. 그러나 현재 쿼리문에는 오류가 있어 올바른 풀이 접근법을 적용하지 못하고 있습니다.

4. **잘된 점**: 현재 코드에서는 쿼리 이름을 선택하고, 평점과 위치를 계산하는 것을 시도하고 있습니다. 그러나 `sum(query_name)`이 올바르지 않으며, `GROUP BY` 구문이 올바르지 않습니다.

5. **개선 사항**: 쿼리문을 수정하여 올바른 결과를 얻을 수 있도록 해야 합니다. 예를 들어, `query_name`을 그룹화하고, 각 그룹의 평점과 위치를 계산할 수 있습니다. 또한 `sum(query_name)`은 의미가 없으므로, 다른 집계 함수를 사용해야 합니다. 올바른 쿼리문은 다음과 같습니다.
```mysql
SELECT query_name, 
       (rating / position) / (SELECT SUM(rating / position) FROM Queries) AS quality
FROM Queries
GROUP BY query_name;
```
이 쿼리문은 각 쿼리의 질을 계산하고, 질의 총합을 계산하여 각 쿼리의 질을 나타내는 비율을 계산합니다.
