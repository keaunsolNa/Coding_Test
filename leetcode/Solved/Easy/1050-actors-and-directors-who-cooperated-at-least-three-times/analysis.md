# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 14. 오후 1:23:42 |
| Language | oraclesql |
| Runtime | 254 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/actors-and-directors-who-cooperated-at-least-three-times/submissions/)

## Code Review

코드 리뷰를 진행하겠습니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 ActorDirector 테이블의 모든 행을 스캔하므로 시간 복잡도는 테이블의 행 수에 비례합니다. Big-O 표기법으로 나타내면 O(n)입니다. 여기서 n은 테이블의 행 수를 나타냅니다.

2. **공간 복잡도**: O(1) - 이 쿼리는 추가적인 공간을 사용하지 않으므로 공간 복잡도는 상수입니다. Big-O 표기법으로 나타내면 O(1)입니다.

3. **풀이 접근법**: 이 쿼리는 단순히 ActorDirector 테이블에서 actor_id와 director_id가 같은 행을 찾는 것입니다. WHERE 절을 사용하여 조건을 지정하고, SELECT 절을 사용하여 필요한 열을 선택합니다. 이 접근법은 테이블의 구조와 문제의 요구 사항에 적합합니다.

4. **잘된 점**: 코드는 간결하고 읽기 쉽습니다. WHERE 절을 사용하여 조건을 지정하고, SELECT 절을 사용하여 필요한 열을 선택하는 것은 올바른 방법입니다.

5. **개선 사항**: 하지만, 이 쿼리는 문제의 요구 사항을 만족하지 않습니다. 문제는 actor_id와 director_id가 동일한 행을 찾는 것이 아니라, 최소 3번 이상 협력한 actor_id와 director_id를 찾는 것입니다. 따라서, 쿼리를 수정하여 GROUP BY와 HAVING 절을 사용하여 최소 3번 이상 협력한 행을 찾는 것이 필요합니다. 예를 들어, 다음과 같이 수정할 수 있습니다.
```oraclesql
SELECT actor_id, director_id
FROM ActorDirector
GROUP BY actor_id, director_id
HAVING COUNT(*) >= 3
```
