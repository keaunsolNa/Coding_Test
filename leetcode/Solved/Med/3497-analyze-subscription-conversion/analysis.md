# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 13. 오전 10:16:35 |
| Language | oraclesql |
| Runtime | 227 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/analyze-subscription-conversion/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 UserActivity 테이블의 모든 행을 스캔하기 때문에 시간 복잡도는 데이터의 크기(n)에 비례합니다. AVG 함수와 ROUND 함수의 계산 시간은 상수 시간으로 간주할 수 있으므로 전체 시간 복잡도는 O(n)입니다.

2. **공간 복잡도**: O(n) - 쿼리 결과는 user_id별로 그룹화되므로 결과 집합의 크기는 최대 n입니다. 따라서 공간 복잡도도 O(n)입니다.

3. **풀이 접근법**: 이 쿼리는 집계 함수(AVG)를 사용하여 사용자별 평균 활동 기간을 계산하고, WHERE 절을 사용하여 특정 활동 유형을 필터링합니다. 또한 ROUND 함수를 사용하여 결과를 반올림합니다. 이는 기본적인 관계형 데이터베이스 쿼리 패턴입니다.

4. **잘된 점**: 코드는 간결하고, 필요한 열만 선택하여 데이터베이스의 부담을 줄이고 있습니다. 또한 NVL 함수를 사용하여 NULL 값을 0으로 대체하여 평균 계산에서 NULL 값이 영향을 미치지 않도록 처리하고 있습니다.

5. **개선 사항**: WHERE 절에 activity_type = 'paid' AND activity_type = 'free_trial'이 사용되어 있습니다. 이는 항상 FALSE가 되므로, 쿼리 결과는 빈 집합이 됩니다. 이는 OR 조건으로 변경해야 합니다. 또한, ROUND 함수의 두 번째 인자(소수점 자릿수)를 지정하여 결과의 精度를 조정할 수 있습니다. 예를 들어, ROUND(AVG(NVL(activity_duration, 0)), 2)와 같이 사용할 수 있습니다.
