# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 16. 오전 10:16:04 |
| Language | mysql |
| Runtime | 88 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/article-views-i/submissions/)

## Code Review

코드 리뷰를 진행하겠습니다.

1. **시간 복잡도**: 이 쿼리의 시간 복잡도는 O(n log n)입니다. 여기서 n은 테이블의 행 수를 나타냅니다. GROUP BY와 ORDER BY 연산이 포함되어 있기 때문에, 데이터를 정렬하고 그룹화하는 데 시간이 소요됩니다.

2. **공간 복잡도**: 이 쿼리의 공간 복잡도는 O(n)입니다. 쿼리 결과를 저장하기 위해 임시 테이블이 필요할 수 있으며, 이 테이블의 크기는 입력 데이터의 크기에 비례합니다.

3. **풀이 접근법**: 이 쿼리에서는 GROUP BY와 ORDER BY를 사용하여 데이터를 그룹화하고 정렬합니다. 이는 관계형 데이터베이스에서 데이터를 집계하고 정렬하는 일반적인 패턴입니다. 또한 WHERE 절을 사용하여 조건을 필터링합니다.

4. **잘된 점**: 코드는 간결하고 읽기 쉽습니다. 필요한 조건을 모두 포함하고 있으며, 결과를 정렬하여 가독성을 높입니다. 또한 GROUP BY를 사용하여 중복된 author_id를 제거하여 결과를 더 명확하게 합니다.

5. **개선 사항**: 이 쿼리는 이미 bastante 최적화되어 있습니다. 그러나 테이블의 크기가 매우 큰 경우, 인덱스를 생성하여 쿼리 성능을 개선할 수 있습니다. 예를 들어, author_id와 viewer_id 열에 인덱스를 생성하면 WHERE 절과 GROUP BY 절의 성능을 개선할 수 있습니다. 또한, 쿼리 결과가 너무 큰 경우, LIMIT 절을 사용하여 결과를 제한할 수 있습니다.
