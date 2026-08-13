# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 13. 오전 10:16:43 |
| Language | oraclesql |
| Runtime | 238 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/analyze-subscription-conversion/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 UserActivity 테이블의 모든 행을 스캔하므로 시간 복잡도는 데이터의 크기(n)에 비례합니다. AVG 함수와 ROUND 함수는 상수 시간 내에 계산되므로 전체 시간 복잡도에 영향을 미치지 않습니다.

2. **공간 복잡도**: O(n) - 쿼리 결과는 사용자 ID와 평균 활동 기간을 포함하므로 공간 복잡도도 데이터의 크기(n)에 비례합니다. GROUP BY 절은 중간 결과를 저장해야 하므로 추가적인 메모리가 필요합니다.

3. **풀이 접근법**: 이 쿼리는 기본적인 집계 함수와 필터링을 사용하여 풀이합니다. WHERE 절에서 activity_type을 필터링하고, AVG 함수로 평균 활동 기간을 계산하며, ROUND 함수로 결과를 반올림합니다. GROUP BY 절을 사용하여 사용자 ID별로 결과를 그룹화합니다.

4. **잘된 점**: 코드는 비교적 간결하고 읽기 쉽습니다. NVL 함수를 사용하여 NULL 값을 0으로 대체하여 평균 계산에서 NULL 값을 처리하는 방식은 좋습니다.

5. **개선 사항**: WHERE 절에서 activity_type을 'paid'와 'free_trial'로 필터링하는 조건이 서로 상충되므로, 이 쿼리는 실제로 아무 행도 반환하지 않을 것입니다. 이는 OR 조건으로 바꾸거나, activity_type을 UNION으로 처리하여 두 경우를 모두 포함하는 방식으로 수정할 수 있습니다. 예를 들어, WHERE activity_type IN ('paid', 'free_trial')과 같은 방식으로 수정할 수 있습니다. 또한, 쿼리 최적화를 위해 인덱스를 생성하거나 파티션 테이블을 사용하는 등 추가적인 최적화가 필요할 수 있습니다.
