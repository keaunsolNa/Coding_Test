# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 13. 오전 10:17:55 |
| Language | oraclesql |
| Runtime | 245 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/analyze-subscription-conversion/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 UserActivity 테이블의 모든 행을 스캔하므로 시간 복잡도는 데이터의 크기(n)에 비례합니다. ROUND와 AVG 함수는 상수 시간에 수행되므로 전체 시간 복잡도에 영향을 미치지 않습니다.

2. **공간 복잡도**: O(n) - 쿼리 결과는 user_id와 trial_avg_duration를 포함하므로 공간 복잡도도 데이터의 크기(n)에 비례합니다. GROUP BY 연산은 중간 결과를 저장해야 하므로 추가적인 공간이 필요합니다.

3. **풀이 접근법**: 이 쿼리는 집계 함수(AVG, GROUP BY)를 사용하여 사용자별 평균 무료 체험 기간을 계산합니다. CASE 문을 사용하여 activity_type이 'free_trial'인 경우에만 activity_duration를 고려합니다. NVL 함수를 사용하여 NULL 값을 0으로 대체합니다.

4. **잘된 점**: 코드는 간결하고 읽기 쉽습니다. 필요한 열만 선택하고, ROUND 함수를 사용하여 결과를 소수점 2자리까지 반올림합니다. 또한, ORDER BY 절을 사용하여 결과를 user_id 순으로 정렬합니다.

5. **개선 사항**: 현재 쿼리는 UserActivity 테이블의 모든 행을 스캔하므로 대량의 데이터에 대해서는 성능이 저하될 수 있습니다. 인덱스를 생성하거나, 파티션닝을 사용하여 데이터를 분할할 수 있습니다. 또한, 쿼리 최적화 도구를 사용하여 쿼리 플랜을 분석하고, 필요한 경우 힌트를 추가할 수 있습니다.
