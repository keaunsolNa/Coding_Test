# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026-05-17 00:35:22 |
| Language | oraclesql |
| Runtime | 364 ms (Beats 76.5%) |
| Memory | 0B (Beats 100.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/classes-with-at-least-5-students/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 Courses 테이블의 모든 행을 조회하여 그룹화하고 counting을 수행하기 때문에, 시간 복잡도는 테이블의 행 수(n)에 비례합니다.

2. **공간 복잡도**: O(n) - 쿼리 결과를 저장하기 위해 필요한 메모리 공간이 필요한 만큼 공간 복잡도도 테이블의 행 수(n)에 비례합니다.

3. **풀이 접근법**: 이 문제는 SQL의 집계 함수를 사용하여 접근했습니다. GROUP BY와 HAVING을 사용하여 class별로 student 수를 계산하고, 5 이상인 경우 결과로 반환했습니다. 이는 SQL에서 데이터를 그룹화하고 필터링하는 일반적인 패턴입니다.

4. **잘된 점**: 코드는 매우 간결하고 읽기 쉽습니다. GROUP BY와 HAVING을 사용하여 데이터를 효과적으로 필터링했습니다. SQL语법도 올바르게 사용되었습니다.

5. **개선 사항**: 현재 쿼리는 Courses 테이블의 모든 행을 조회합니다. 만약 Courses 테이블의 크기가非常 크다면, 쿼리 속도 개선을 위해 인덱스를 생성하는 등의 최적화 작업이 필요할 수 있습니다. 또한, 쿼리 결과의 정렬이 필요할 경우 ORDER BY를 추가할 수 있습니다.
