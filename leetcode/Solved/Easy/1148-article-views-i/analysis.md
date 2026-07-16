# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 16. 오전 10:15:52 |
| Language | mysql |
| Runtime | 62 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/article-views-i/submissions/)

## Code Review

코드 리뷰를 진행하겠습니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 Views 테이블의 모든 행을 스캔해야 하므로 시간 복잡도는 테이블의 크기(n)에 비례합니다. GROUP BY 연산은 추가적인 오버헤드를 유발하지만, 이는 이미 스캔하는 과정에서 발생하는 비용에 포함됩니다.

2. **공간 복잡도**: O(n) - 쿼리 결과를 저장하기 위해 필요한 공간은 테이블의 행 수(n)에 비례합니다. GROUP BY 연산을 위해 중간 결과를 저장하는 데 필요한 공간도 고려해야 합니다.

3. **풀이 접근법**: 이 쿼리는 단순하게 Views 테이블에서 author_id와 viewer_id가 같은 행을 찾는 것을 목표로 합니다. WHERE 절을 사용하여 조건을 필터링하고, GROUP BY를 사용하여 중복된 author_id를 제거합니다. 이는 기본적인 필터링과 그룹화 알고리즘/패턴을 사용한 접근법입니다.

4. **잘된 점**: 코드는 간결하고, 목적을 명확하게 달성합니다. WHERE 절과 GROUP BY를 적절하게 사용하여 쿼리 목적을 달성했습니다.

5. **개선 사항**: 현재 쿼리는 이미 최적화된 형태로 보입니다. 그러나 테이블의 크기가 매우 큰 경우, author_id와 viewer_id에 인덱스를 생성하여 쿼리 성능을 개선할 수 있습니다. 또한, DISTINCT 키워드를 사용하여 중복된 author_id를 제거할 수도 있습니다. 하지만, 이러한 최적화는 테이블의 특성과 쿼리 패턴에 따라 달라질 수 있습니다.
