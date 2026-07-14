# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 14. 오후 1:27:57 |
| Language | oraclesql |
| Runtime | 412 ms (Beats 62.4%) |
| Memory | 0B (Beats 100.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/actors-and-directors-who-cooperated-at-least-three-times/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 ActorDirector 테이블의 모든 행을 스캔하여 actor_id와 director_id를 그룹화하고, 각 그룹의 행 수를 계산합니다. 따라서 시간 복잡도는 테이블의 행 수에 비례합니다.

2. **공간 복잡도**: O(n) - 쿼리 결과를 저장하기 위한 공간이 필요합니다. 결과 집합의 크기는 테이블의 행 수에 비례하므로 공간 복잡도도 O(n)입니다.

3. **풀이 접근법**: 이 쿼리는 그룹화(group by)와 집계 함수(having count) 등을 사용하여 actor_id와 director_id가 최소 3번 이상 협력한 경우를 찾습니다. 이는 관계형 데이터베이스에서 일반적으로 사용되는 집계 쿼리 패턴입니다.

4. **잘된 점**: 코드는 간결하고, 의도한 바를 명확하게 표현합니다. 또한, 필요한 열만 선택하여 불필요한 데이터 전송을 피합니다.

5. **개선 사항**: 쿼리 자체는 효율적이지만, 인덱스가 적절하게 생성되어 있는지 확인하는 것이 좋습니다. actor_id와 director_id 열에 인덱스가 생성되어 있다면, 쿼리 성능을 향상시킬 수 있습니다. 또한, 테이블이 매우 크다면, 부분 범위 쿼리(partitioning) 등을 고려하여 쿼리 성능을 최적화할 수 있습니다.
