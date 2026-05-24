# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026-05-24 14:12:48 |
| Language | oraclesql |
| Runtime | 334 ms (Beats 73.0%) |
| Memory | 0B (Beats 100.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/swap-sex-of-employees/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 Salary 테이블에 있는 모든 행을 갱신해야 하므로, 시간 복잡도는 테이블의 행 수에 비례합니다.
2. **공간 복잡도**: O(1) - 이 쿼리는 추가적인 임시 테이블이나 공간을 사용하지 않으므로, 공간 복잡도는 상수입니다.
3. **풀이 접근법**: 이 쿼리는 간단한 업데이트 쿼리를 사용하며, CASE 문을 이용하여 sex 컬럼의 값을 반대로 갱신합니다. 이는 직교 프로젝션(Orthogonal Projection) 알고리즘의 예입니다.
4. **잘된 점**: 코드는 간결하며, 문제의 의도에 맞게 정확하게 구현되어 있습니다. 필요한 경우에만 CASE 문을 사용하여 코드를 복잡하게 만들지 않았습니다.
5. **개선 사항**: 이 쿼리는 이미 최적화되어 있기 때문에, 별다른 개선 사항은 없습니다. 다만, WHERE 절을 추가하여 특정 조건을 만족하는 행만 갱신하도록 할 수 있습니다. 예를 들어, `WHERE sex IS NOT NULL`을 추가하여 NULL 값을 가진 행은 갱신하지 않도록 할 수 있습니다.
