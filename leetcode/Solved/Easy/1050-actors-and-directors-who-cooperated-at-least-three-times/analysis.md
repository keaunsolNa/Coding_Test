# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 14. 오후 1:24:59 |
| Language | oraclesql |
| Runtime | 321 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/actors-and-directors-who-cooperated-at-least-three-times/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 ActorDirector 테이블의 모든 행을 스캔하므로 시간 복잡도는 테이블의 크기(n)에 비례합니다. 서브쿼리와 GROUP BY 연산이 추가로 수행되지만, 이는 이미 스캔된 데이터를 처리하는 것이므로 전체 시간 복잡도에 큰 영향을 미치지 않습니다.

2. **공간 복잡도**: O(n) - 쿼리 결과를 저장하기 위해 임시 테이블이 생성되며, 이 테이블의 크기는 입력 데이터의 크기에 비례합니다. 따라서 공간 복잡도도 O(n)입니다.

3. **풀이 접근법**: 이 쿼리는 서브쿼리와 GROUP BY를 사용하여 actor_id와 director_id를 기준으로 데이터를 그룹화하고, 각 그룹의 행 수를 세는 방식으로 해결합니다. 그러나 WHERE 절에서 actor_id = director_id 조건은 문제의 의도와 맞지 않습니다. 문제는 actor_id와 director_id가 동일한 경우가 아니라, 동일한 actor_id와 director_id의 조합이 3번 이상 나타나는 경우를 찾는 것입니다.

4. **잘된 점**: 코드는 비교적 간결하고, 서브쿼리와 GROUP BY를 사용하여 데이터를 그룹화하는 방식은 직관적입니다.

5. **개선 사항**: WHERE 절의 조건을 제거하고, ActorDirector 테이블을 직접 GROUP BY하여 처리하는 방식으로 개선할 수 있습니다. 또한, HAVING 절에서 COUNT(*)를 사용하여 행 수를 세는 것이 더 명확할 것입니다. 개선된 쿼리는 다음과 같습니다.
```oraclesql
SELECT actor_id, director_id
FROM ActorDirector
GROUP BY actor_id, director_id
HAVING COUNT(*) >= 3
```
