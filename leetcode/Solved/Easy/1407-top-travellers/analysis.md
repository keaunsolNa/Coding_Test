# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 14. 오후 5:15:54 |
| Language | oraclesql |
| Runtime | 291 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/top-travellers/submissions/)

## Code Review

코드 리뷰를 진행하겠습니다.

1. **시간 복잡도**: O(n log n) - 이 쿼리는 사용자와 라이드 테이블을 조인하고, 그룹화 및 정렬을 수행합니다. 조인과 그룹화의 시간 복잡도는 일반적으로 O(n)이며, 정렬의 시간 복잡도는 O(n log n)입니다. 따라서 전체 쿼리의 시간 복잡도는 O(n log n)입니다.

2. **공간 복잡도**: O(n) - 쿼리 결과를 저장하기 위한 공간이 필요합니다. 결과 집합의 크기는 사용자 수와 동일하므로 공간 복잡도는 O(n)입니다.

3. **풀이 접근법**: 이 쿼리는 Outer Join과 Group By를 사용하여 각 사용자의 이동 거리를 계산합니다. Outer Join은 사용자 테이블과 라이드 테이블을 조인하여 사용자별 라이드 정보를 가져옵니다. Group By는 사용자별로 이동 거리를 합산하여 결과를 집계합니다.

4. **잘된 점**: 코드는 간결하고, Outer Join과 Group By를 적절히 사용하여 문제를 해결했습니다. 또한, NVL 함수를 사용하여 NULL 값을 0으로 대체하여 계산 오류를 방지했습니다.

5. **개선 사항**: 쿼리 최적화를 위해 인덱스를 생성할 수 있습니다. 사용자 테이블의 id 열과 라이드 테이블의 user_id 열에 인덱스를 생성하면 조인 성능을 향상시킬 수 있습니다. 또한, 쿼리 결과를 캐시하여 동일한 쿼리가 반복적으로 실행되는 경우 성능을 향상시킬 수 있습니다.
