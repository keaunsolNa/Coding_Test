# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 16. 오전 10:15:40 |
| Language | mysql |
| Runtime | 75 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/article-views-i/submissions/)

## Code Review

코드 리뷰를 진행하겠습니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 Views 테이블의 모든 행을 스캔하여 author_id와 viewer_id가 일치하는 행을 찾습니다. 따라서 시간 복잡도는 테이블의 행 수에 비례합니다.

2. **공간 복잡도**: O(n) - 쿼리 결과는 author_id를 그룹화하여 반환하므로, 결과 집합의 크기는 테이블의 행 수에 비례할 수 있습니다.

3. **풀이 접근법**: 이 쿼리는 단순히 Views 테이블에서 author_id와 viewer_id가 일치하는 행을 찾는 것입니다. 여기서 사용된 알고리즘은 기본적으로 테이블 스캔이며, GROUP BY 절을 사용하여 author_id를 그룹화합니다.

4. **잘된 점**: 코드는 간결하고, 문제의 요구 사항을 명확하게 반영하고 있습니다. 특히, GROUP BY 절을 사용하여 author_id를 그룹화하여 중복을 제거하는 것은 좋은 접근법입니다.

5. **개선 사항**: 쿼리 최적화를 위해, author_id와 viewer_id에 인덱스를 생성하는 것을 고려할 수 있습니다. 이는 쿼리의 수행 속도를 향상시킬 수 있습니다. 또한, DISTINCT 키워드를 사용하여 author_id의 중복을 제거할 수도 있습니다. 예를 들어, `SELECT DISTINCT author_id FROM Views WHERE author_id = viewer_id`와 같이 작성할 수 있습니다. 이는 GROUP BY 절을 사용하는 것보다 더 간결한 방법입니다.
