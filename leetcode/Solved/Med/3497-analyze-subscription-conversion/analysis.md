# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 13. 오전 10:17:07 |
| Language | oraclesql |
| Runtime | 283 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/analyze-subscription-conversion/submissions/)

## Code Review

코드 리뷰를 다음과 같이 진행하겠습니다.

1. **시간 복잡도**: 이 쿼리의 시간 복잡도는 O(n)입니다. 여기서 n은 UserActivity 테이블의 행 수를 나타냅니다. 이유는 쿼리가 테이블의 모든 행을 스캔하여 필요한 데이터를 추출하기 때문입니다.

2. **공간 복잡도**: 이 쿼리의 공간 복잡도는 O(n)입니다. 쿼리가 결과를 반환하기 위해 중간 결과를 저장해야 하기 때문입니다. 특히, GROUP BY 연산과 AVG 함수를 사용하여 결과를 집계해야 하므로, 필요한 공간이 입력 데이터의 크기에 비례합니다.

3. **풀이 접근법**: 이 쿼리는 기본적인 집계 함수와 GROUP BY를 사용하여 필요한 데이터를 추출합니다. 사용된 알고리즘은 다음과 같습니다. 
   - 먼저, WHERE 절을 사용하여 'paid'와 'free_trial' 유형의 행만 필터링합니다.
   - затем, GROUP BY 절을 사용하여 user_id별로 행을 그룹화합니다.
   - 마지막으로, AVG 함수와 NVL 함수를 사용하여 각 그룹의 activity_duration의 평균을 계산합니다.

4. **잘된 점**: 이 쿼리는 필요한 데이터를 효율적으로 추출하는 간단하고 명료한 구조를 가지고 있습니다. 특히, NVL 함수를 사용하여 NULL 값을 0으로 대체하는 것은 좋은 접근법입니다.

5. **개선 사항**: 쿼리 자체는 효율적이지만, 다음과 같은 최적화를 고려할 수 있습니다.
   - 인덱스를 생성하여 쿼리 성능을 향상시킬 수 있습니다. 예를 들어, user_id와 activity_type에 인덱스를 생성하면 쿼리 성능을 개선할 수 있습니다.
   - 또한, 테이블이 매우 큰 경우, 파티셔닝을 사용하여 쿼리 성능을 향상시킬 수 있습니다.
