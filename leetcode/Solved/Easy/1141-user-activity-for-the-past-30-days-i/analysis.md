# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026-05-17 00:40:33 |
| Language | oraclesql |
| Runtime | 519 ms (Beats 64.5%) |
| Memory | 0B (Beats 100.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/user-activity-for-the-past-30-days-i/submissions/)

## Code Review

리뷰어의 코드 검토 결과는 다음과 같습니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 활동 테이블의 모든 레코드를 반복해서 처리합니다. 따라서 시간 복잡도는 데이터의 크기에 비례합니다.
2. **공간 복잡도**: O(n) - 쿼리 결과는 중복된 user_id를 제거하고, 개별 날에 대해 active_users를 계산합니다. 따라서 공간 복잡도도 데이터의 크기에 비례합니다.
3. **풀이 접근법**: 이 쿼리는 단순한 집계 함수를 사용하여 해결됩니다. activity_date 범위 내에서 중복되지 않는 user_id의 수를 계산합니다. 이를 위해 GROUP BY를 사용하여 날짜별로 그룹화하고, COUNT(DISTINCT user_id)를 사용하여 active_users 수를 계산합니다.
4. **잘된 점**: 쿼리는 간결하고, 요구사항을 명확하게 구현했습니다. WHERE 절에서 적절한 범위와 조건을 사용하여 불필요한 데이터를 필터링했습니다.
5. **개선 사항**: 쿼리는 현재 2019-06-28과 2019-07-27 사이의 날짜 범위를 사용하고 있습니다. 만약 날짜 범위를 동적으로 변경해야 한다면, 변수나 파라미터를 사용하여 날짜를 지정할 수 있습니다. 또한, index를 생성하여 activity_date 열을 인덱싱하면 쿼리 성능을 향상시킬 수 있습니다. 예를 들어, 다음과 같이 activity_date에 Function-Based Index를 생성할 수 있습니다: `CREATE INDEX idx_activity_date ON Activity (TO_CHAR(activity_date, 'YYYY-MM-DD'))`.
