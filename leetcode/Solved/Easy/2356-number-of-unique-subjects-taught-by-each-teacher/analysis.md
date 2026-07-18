# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 18. 오전 10:08:29 |
| Language | oraclesql |
| Runtime | 228 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/number-of-unique-subjects-taught-by-each-teacher/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 Teacher 테이블의 모든 행을 스캔하므로 시간 복잡도는 테이블의 크기와 비례합니다. COUNT(DISTINCT subject_id) 연산은 추가적인 오버헤드를 유발하지만, 전체적인 시간 복잡도는 여전히 O(n)입니다.

2. **공간 복잡도**: O(n) - 쿼리 결과는 각 교사당 고유한 과목 수를 반환하므로, 결과 집합의 크기는 테이블의 크기와 비례합니다. 따라서 공간 복잡도는 O(n)입니다.

3. **풀이 접근법**: 이 쿼리는 GROUP BY와 COUNT(DISTINCT) 함수를 사용하여 각 교사가 가르치는 고유한 과목 수를 계산합니다. 이는 관계형 데이터베이스에서 집계 함수와 그룹화 함수를 사용하는典型적인 패턴입니다.

4. **잘된 점**: 쿼리는 간결하고, 읽기 쉽습니다. 필요한 열만 선택하고, COUNT(DISTINCT) 함수를 사용하여 중복을 제거하는 등, 효율적인 쿼리 작성 방법을 사용했습니다.

5. **개선 사항**: 쿼리 자체는 이미 효율적이지만, 테이블의 인덱스 설정이나 통계 정보를 최신으로 유지하는 등, 데이터베이스의 튜닝을 통해 쿼리 성능을进一步 개선할 수 있습니다. 또한, 쿼리 결과에 추가적인 처리가 필요한 경우, 서브쿼리 또는 조인 등을 사용하여 더 복잡한 쿼리를 작성할 수 있습니다.
