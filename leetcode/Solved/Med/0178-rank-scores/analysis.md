# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 30. 오후 3:24:35 |
| Language | oraclesql |
| Runtime | 458 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/rank-scores/submissions/)

## Code Review

코드 리뷰를 진행하겠습니다.

1. **시간 복잡도**: O(n log n) - DENSE_RANK() 함수는 데이터를 정렬해야 하므로 시간 복잡도는 O(n log n)입니다. 이는 데이터의 개수가 많을수록 시간이 많이 걸릴 수 있습니다.

2. **공간 복잡도**: O(n) - 쿼리 결과를 저장하기 위해 필요한 공간이므로 공간 복잡도는 O(n)입니다. 이는 데이터의 개수가 많을수록 더 많은 공간이 필요할 수 있습니다.

3. **풀이 접근법**: DENSE_RANK() 함수를 사용하여 점수를 내림차순으로 정렬하고, 순위를 매깁니다. 이는 윈도우 함수를 사용하여 순위를 매기는 일반적인 패턴입니다.

4. **잘된 점**: 코드는 간결하고, 문제를 명확하게 해결합니다. DENSE_RANK() 함수를 사용하여 순위를 매기는 것은 적절한 접근법입니다.

5. **개선 사항**: 현재 코드는 이미 최적화되어 있습니다. 그러나 데이터의 개수가非常 많을 경우, 인덱스를 생성하여 쿼리 성능을 개선할 수 있습니다. 또한, 필요한 컬럼만 선택하여 공간 복잡도를 줄일 수 있습니다. 예를 들어, `SELECT score, DENSE_RANK() OVER (ORDER BY score DESC) as rank FROM Scores` 대신 `SELECT DISTINCT score, DENSE_RANK() OVER (ORDER BY score DESC) as rank FROM Scores`를 사용할 수 있습니다.
