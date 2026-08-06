# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 6. 오후 5:12:48 |
| Language | oraclesql |
| Runtime | 293 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/find-consistently-improving-employees/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: 이 쿼리의 시간 복잡도는 O(n log n)입니다. 이는 ROW_NUMBER() 및 LAG() 함수가 사용되면서 발생하는 정렬 및 윈도우 함수 계산에 의한 것입니다. 여기서 n은 performance_reviews 테이블의 행 수를 나타냅니다.

2. **공간 복잡도**: 이 쿼리의 공간 복잡도는 O(n)입니다. 이는 recent 뷰에서 생성되는 임시 결과 집합의 크기가 원본 테이블의 행 수에 비례하기 때문입니다.

3. **풀이 접근법**: 이 쿼리에서는 윈도우 함수(ROW_NUMBER(), LAG())를 사용하여 직원의 최근 3개의 리뷰를 분석하고, delta 열을 계산하여 직원의 평점이 개선되는지 여부를 판단합니다. 또한 JOIN 및 GROUP BY를 사용하여 관련된 직원 정보를 결합하고 집계합니다.

4. **잘된 점**: 이 쿼리는 직원의 최근 리뷰를 분석하여 평점이 개선되는 직원을 찾는 문제를 잘 해결합니다. 특히, ROW_NUMBER()와 LAG() 함수를 사용하여 직원의 리뷰를 순차적으로 분석하는 접근법이 효율적입니다. 또한, HAVING 절에서 COUNT(*) = 2 및 MIN(delta) > 0 조건을 사용하여 2개의 연속적인 리뷰에서 평점이 개선되는 직원을 정확하게 필터링합니다.

5. **개선 사항**: 쿼리 최적화를 위해 인덱스를 생성하여 테이블의 조회 성능을 향상시킬 수 있습니다. 예를 들어, employee_id 및 review_date 열에 인덱스를 생성하면 쿼리의 수행 속도를 개선할 수 있습니다. 또한, recent 뷰를 인라인 뷰로 대체하거나, Common Table Expression(CTE) 대신 임시 테이블을 사용하여 성능을 개선할 수 있습니다. 그러나 이러한 최적화는 실제 데이터의 크기와 분포에 따라 달라질 수 있으므로, 실제 쿼리 수행 계획과 성능을 분석하여 최적의 접근법을 결정해야 합니다.
