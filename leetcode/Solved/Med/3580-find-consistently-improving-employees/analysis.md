# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 6. 오후 4:58:22 |
| Language | oraclesql |
| Runtime | 289 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/find-consistently-improving-employees/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n log n) - 이 쿼리는 JOIN 연산과 GROUP BY 연산을 포함하고 있습니다. JOIN 연산의 시간 복잡도는 일반적으로 O(n^2)이나 O(n log n)이며, GROUP BY 연산의 시간 복잡도는 O(n log n)입니다. 따라서 전체 쿼리의 시간 복잡도는 O(n log n)입니다.

2. **공간 복잡도**: O(n) - 쿼리 결과는 각 사원에 대한 정보를 포함하므로, 결과 집합의 크기는 사원 수에 비례합니다. 따라서 공간 복잡도는 O(n)입니다.

3. **풀이 접근법**: 이 쿼리는 JOIN과 GROUP BY를 사용하여 사원들의 성과 리뷰를 분석합니다. JOIN을 통해 사원 정보와 성과 리뷰를 연결하고, GROUP BY를 통해 각 사원별로 성과 리뷰를 그룹화하여 분석합니다. 이 접근법은 관계형 데이터베이스에서 데이터를 분석하는 일반적인 패턴입니다.

4. **잘된 점**: 이 쿼리는 JOIN과 GROUP BY를 효과적으로 사용하여 사원들의 성과 리뷰를 분석합니다. 또한, MAX와 MIN 함수를 사용하여 성과 리뷰의 범위를 계산하여 개선 점수를 계산합니다. 코드는 비교적 간결하고 읽기 쉽습니다.

5. **개선 사항**: 쿼리에서 사용된 JOIN은 내부 JOIN입니다. 내부 JOIN은 NULL 값을 포함하지 않는 경우에만 결과를 반환하므로, 사원 정보와 성과 리뷰가 모두 존재하는 경우에만 결과를 반환합니다. 만약 사원 정보와 성과 리뷰가 모두 존재하지 않는 경우를 포함하려면 LEFT JOIN을 사용할 수 있습니다. 또한, 성과 리뷰의 개선 점수를 계산하는 방법은 단순한 MAX-MIN 방법입니다. 더 복잡한 방법을 사용하여 개선 점수를 계산할 수 있습니다. 예를 들어, 평균 성과 리뷰 점수를 계산하여 개선 점수를 계산할 수 있습니다.
