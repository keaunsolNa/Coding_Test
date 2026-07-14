# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 14. 오후 2:10:09 |
| Language | oraclesql |
| Runtime | 424 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/find-followers-count/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 Followers 테이블의 모든 행을 스캔해야 하므로 시간 복잡도는 O(n)입니다. 여기서 n은 테이블의 행 수를 나타냅니다.

2. **공간 복잡도**: O(n) - 쿼리 결과는 각 user_id에 대한 follower_id의 개수를 포함하므로 공간 복잡도도 O(n)입니다. 여기서 n은 고유한 user_id의 수를 나타냅니다.

3. **풀이 접근법**: 이 쿼리는 집계 함수인 COUNT()와 GROUP BY 절을 사용하여 각 user_id에 대한 follower_id의 개수를 계산합니다. 이는 관계형 데이터베이스에서 데이터를 집계하고 요약하는 일반적인 패턴입니다.

4. **잘된 점**: 코드는 간결하고 읽기 쉽습니다. 필요한 열만 선택하고, 적절한 GROUP BY와 ORDER BY 절을 사용하여 결과를 정렬했습니다.

5. **개선 사항**: 현재 쿼리는 이미 최적화되어 있습니다. 그러나 테이블이非常 크고 성능이 중요한 경우, 인덱스를 생성하여 쿼리 성능을 향상시킬 수 있습니다. 예를 들어, user_id 열에 인덱스를 생성하면 GROUP BY와 ORDER BY 절의 성능을 향상시킬 수 있습니다. 또한, 쿼리에서 필요한 열만 선택하여 불필요한 데이터 전송을 피할 수 있습니다.
