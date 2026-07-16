# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 16. 오전 10:22:08 |
| Language | mysql |
| Runtime | 62 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/reformat-department-table/submissions/)

## Code Review

리뷰 대상 코드는 MySQL 쿼리문으로, 'reformat-department-table' 문제를 해결하기 위해 작성되었습니다. 

1. **시간 복잡도**: O(n) - 쿼리문은 Department 테이블의 모든 행을 스캔하므로, 시간 복잡도는 데이터의 크기(n)에 비례합니다. 

2. **공간 복잡도**: O(n) - 결과 집합의 크기는 입력 데이터의 크기에 비례하므로, 공간 복잡도 또한 O(n)입니다.

3. **풀이 접근법**: 이 쿼리문은 기본적으로 CASE 문을 사용하여, 각 행의 'month' 필드 값을 기반으로 해당 월의 수입을 분리합니다. 이 접근법은 간단하지만, 효율적인 방법입니다. 

4. **잘된 점**: 코드는 읽기 쉽고, 이해하기 쉽습니다. 각 월의 수입을 별도의 필드로 분리하여, 결과를 쉽게 해석할 수 있습니다.

5. **개선 사항**: 현재 쿼리문은 GROUP BY 절을 사용하고 있지만, 실제로는 각 행을 개별적으로 처리하므로, GROUP BY 절은 불필요합니다. 또한, 쿼리문은 12개의 CASE 문을 사용하고 있으므로, 코드의 중복을 줄일 수 있습니다. 하지만, 이 문제의 특성상, 각 월의 수입을 별도의 필드로 분리해야 하므로, 코드의 중복은 피할 수 없습니다. 대안적으로, PIVOT 함수를 사용할 수 있지만, MySQL에서 PIVOT 함수는 지원되지 않습니다. 따라서, 현재의 쿼리문은 문제를 해결하기 위한 적절한 방법입니다.
