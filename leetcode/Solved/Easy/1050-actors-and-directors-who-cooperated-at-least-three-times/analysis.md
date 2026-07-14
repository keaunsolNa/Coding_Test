# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 14. 오후 1:27:49 |
| Language | oraclesql |
| Runtime | 225 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/actors-and-directors-who-cooperated-at-least-three-times/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 ActorDirector 테이블의 모든 행을 스캔하여 actor_id와 director_id를 그룹화하고, 각 그룹의 행 수를 계산합니다. 따라서 시간 복잡도는 테이블의 행 수에 비례합니다.

2. **공간 복잡도**: O(n) - 쿼리는 그룹화된 결과를 임시로 저장해야 하므로, 공간 복잡도도 테이블의 행 수에 비례합니다.

3. **풀이 접근법**: 이 쿼리는 그룹화(group by)와 집계 함수(having count)를 사용하여 actor_id와 director_id가 함께 나타난 횟수를 계산합니다. 이는 관계형 데이터베이스에서 데이터를 집계하고 필터링하는 일반적인 패턴입니다.

4. **잘된 점**: 코드는 간결하고, 문제를 명확하게 해결합니다. 특히, having 절을 사용하여 그룹화된 결과를 필터링하는 부분이 잘 구현되어 있습니다.

5. **개선 사항**: 쿼리 자체는 최적화된 상태로 보입니다. 그러나, 테이블의 크기가 매우 큰 경우, 인덱스를 생성하여 쿼리 성능을 개선할 수 있습니다. 예를 들어, actor_id와 director_id 열에 인덱스를 생성하면, 그룹화와 필터링을 더 효율적으로 수행할 수 있습니다. 또한, 쿼리 결과를 캐싱하여 동일한 쿼리가 반복적으로 실행되는 경우, 성능을 개선할 수 있습니다.
