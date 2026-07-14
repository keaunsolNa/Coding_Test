# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 14. 오후 5:25:45 |
| Language | oraclesql |
| Runtime | 814 ms (Beats 51.9%) |
| Memory | 0B (Beats 100.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/top-travellers/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n log n) - 이 쿼리는 사용자와 라이드 테이블을 조인하고, 그룹화하고, 정렬하기 때문에 시간 복잡도는 O(n log n)입니다. 여기서 n은 사용자와 라이드 테이블의 행 수를 합친 것입니다.

2. **공간 복잡도**: O(n) - 쿼리는 사용자와 라이드 테이블의 데이터를 임시로 저장해야 하므로 공간 복잡도는 O(n)입니다. 여기서 n은 사용자와 라이드 테이블의 행 수를 합친 것입니다.

3. **풀이 접근법**: 이 쿼리는 사용자와 라이드 테이블을 조인하고, 그룹화하고, 정렬하는 방식으로 접근합니다. outer join을 사용하여 사용자가 라이드를 타지 않은 경우도 포함하고, NVL 함수를 사용하여 null 값을 0으로 대체합니다.

4. **잘된 점**: 코드는 간결하고, 읽기 쉽습니다. outer join과 NVL 함수를 사용하여 사용자가 라이드를 타지 않은 경우도 포함하고, null 값을 처리하는 방식이 좋습니다.

5. **개선 사항**: 쿼리에서 사용된 테이블의 인덱스를 확인하여 쿼리 성능을 개선할 수 있습니다. 또한, 사용자와 라이드 테이블의 데이터가大量인 경우, 데이터를 파티션화하거나, 캐싱을 사용하여 쿼리 성능을 개선할 수 있습니다. 또한, ANSI 표준의 JOIN 문법을 사용하여 코드를 더 현대적으로 만들 수 있습니다. 예를 들어, `FROM USERS T1, RIDES T2 WHERE T1.id = T2.user_id(+)` 대신 `FROM USERS T1 LEFT JOIN RIDES T2 ON T1.id = T2.user_id`를 사용할 수 있습니다.
