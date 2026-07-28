# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 28. 오후 1:59:06 |
| Language | oraclesql |
| Runtime | 360 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/second-highest-salary/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n log n)입니다. ROW_NUMBER() 함수와 ORDER BY 절이 사용되는데, 이들은 데이터를 정렬해야 하므로 시간 복잡도가 O(n log n)입니다.

2. **공간 복잡도**: O(n)입니다. 서브쿼리에서 임시 결과를 저장해야 하므로 공간 복잡도가 O(n)입니다.

3. **풀이 접근법**: 이 풀이는 윈도우 함수(ROW_NUMBER())를 사용하여 급여를 내림차순으로 정렬하고, 두 번째로 높은 급여를 찾는 접근법을 사용했습니다. 이 방법은 직관적이고 효율적입니다.

4. **잘된 점**: 코드는 간결하고 읽기 쉽습니다. ROW_NUMBER() 함수를 사용하여 두 번째로 높은 급여를 찾는 것은 좋은 방법입니다. 또한, NVL 함수를 사용하여 NULL 값을 처리하는 것도 좋은 방법입니다.

5. **개선 사항**: 현재 코드는 두 번째로 높은 급여를 찾는 데 성공합니다. 그러나, 만약 두 번째로 높은 급여가 여러 개 존재하는 경우, 이 코드는 단지 하나의 값을 반환합니다. 만약 여러 개의 값을 반환하고 싶다면, DENSE_RANK() 함수를 사용할 수 있습니다. 또한, 테이블이非常 크면, 인덱스를 생성하여 성능을 개선할 수 있습니다.
