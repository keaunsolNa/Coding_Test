# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 16. 오전 10:15:26 |
| Language | mysql |
| Runtime | 82 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/article-views-i/submissions/)

## Code Review

코드 리뷰를 진행하겠습니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 Views 테이블의 모든 행을 스캔해야 하므로 시간 복잡도는 데이터의 크기(n)에 비례합니다.

2. **공간 복잡도**: O(1) - 쿼리는 추가적인 공간을 사용하지 않으므로 공간 복잡도는 상수입니다.

3. **풀이 접근법**: 이 쿼리는 단순한 필터링을 사용하여 author_id와 viewer_id가 같은 행을 찾습니다. 이는 WHERE 절을 사용하여 구현되었습니다.

4. **잘된 점**: 코드는 간결하고 읽기 쉽습니다. WHERE 절을 사용하여 조건을 지정하여 쿼리가 명확하고 이해하기 쉽습니다.

5. **개선 사항**: 현재 쿼리는 DISTINCT 또는 GROUP BY를 사용하지 않으므로 author_id가 중복될 수 있습니다. 만약 중복을 제거해야 한다면 SELECT DISTINCT author_id를 사용할 수 있습니다. 또한, 쿼리에서 필요한 열만 선택하여 데이터 전송을 최적화할 수 있습니다. 예를 들어, SELECT DISTINCT author_id FROM Views WHERE author_id = viewer_id와 같이 사용할 수 있습니다.
