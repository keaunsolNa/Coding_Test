# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 18. 오전 10:08:34 |
| Language | oraclesql |
| Runtime | 425 ms (Beats 98.6%) |
| Memory | 0B (Beats 100.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/number-of-unique-subjects-taught-by-each-teacher/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 Teacher 테이블의 모든 행을 스캔하여 각 교사별로 고유한 과목 수를 계산하므로, 시간 복잡도는 테이블의 행 수에 비례합니다.

2. **공간 복잡도**: O(n) - 쿼리 결과는 각 교사별로 고유한 과목 수를 포함하므로, 공간 복잡도도 테이블의 행 수에 비례합니다.

3. **풀이 접근법**: 이 쿼리는 집계 함수인 COUNT(DISTINCT subject_id)와 GROUP BY 절을 사용하여 각 교사별로 고유한 과목 수를 계산합니다. 이는 관계형 데이터베이스에서 집계 연산을 수행하는 일반적인 패턴입니다.

4. **잘된 점**: 코드는 간결하고, 필요한 열만 선택하여 결과를 반환합니다. 또한, COUNT(DISTINCT subject_id) 함수를 사용하여 효율적으로 고유한 과목 수를 계산합니다.

5. **개선 사항**: 현재 쿼리는 Teacher 테이블의 모든 행을 스캔하므로, 대규모 테이블의 경우 성능이 저하될 수 있습니다. 인덱스를 생성하거나, 파티션 테이블을 사용하여 쿼리 성능을 개선할 수 있습니다. 또한, 쿼리 결과에 추가적인 열을 포함해야 하는 경우, JOIN이나 서브쿼리를 사용하여 필요한 데이터를 가져올 수 있습니다.
