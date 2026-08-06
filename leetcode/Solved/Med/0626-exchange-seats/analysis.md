# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 6. 오후 2:18:27 |
| Language | mysql |
| Runtime | 85 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/exchange-seats/submissions/)

## Code Review

리뷰 대상 코드는 LeetCode의 exchange-seats 문제를 MySQL로 해결한 코드입니다. 

1. **시간 복잡도**: 이 코드의 시간 복잡도는 O(n^2)입니다. 이유는 서브쿼리 내에서 테이블을 다시 탐색하기 때문입니다. 각 행에 대해 최대 한 번의 서브쿼리가 실행되므로, 전체 시간 복잡도는 쿼리 내에서 반복되는 작업의 수에 비례합니다.

2. **공간 복잡도**: 이 코드의 공간 복잡도는 O(1)입니다. 이유는 추가적인 공간이 필요하지 않기 때문입니다. 쿼리 결과는 직접 반환되므로, 추가적인 메모리 할당이 필요하지 않습니다.

3. **풀이 접근법**: 이 코드는 CASE 문과 서브쿼리를 사용하여 문제를 해결합니다. CASE 문은 특정 조건에 따라 다른 값을 반환하도록 설계되었으며, 서브쿼리는 특정 조건을 만족하는 행을 찾기 위해 사용됩니다. 이 접근법은 문제의 요구 사항을 직접적으로 해결하지만, 효율성에 약간의 제한이 있습니다.

4. **잘된 점**: 이 코드는 문제의 요구 사항을 명확하게 이해하고, CASE 문과 서브쿼리를 효과적으로 사용하여 문제를 해결했습니다. 또한, 코드는 비교적 간결하고 읽기 쉽습니다.

5. **개선 사항**: 이 코드의 효율성을 개선하기 위해, JOIN이나 WINDOW 함수를 사용하여 서브쿼리를 제거할 수 있습니다. 예를 들어, LEAD 함수를 사용하여 현재 행과 다음 행을 연결할 수 있습니다. 이렇게 하면 쿼리의 시간 복잡도를 개선할 수 있습니다. 또한, 인덱스를 생성하여 쿼리 성능을 향상시킬 수 있습니다. 

예를 들어, 다음과 같이 개선할 수 있습니다:
```mysql
SELECT
    (CASE
        WHEN id % 2 = 1 AND id = (SELECT MAX(id) FROM Seat) THEN student
        WHEN id % 2 = 1 THEN (SELECT student FROM Seat WHERE id = T1.id + 1)
        ELSE (SELECT student FROM Seat WHERE id = T1.id - 1)
    END) AS student,
    id
FROM Seat T1
```
