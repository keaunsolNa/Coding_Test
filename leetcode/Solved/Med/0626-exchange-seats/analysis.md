# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 6. 오후 2:19:48 |
| Language | mysql |
| Runtime | 67 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/exchange-seats/submissions/)

## Code Review

리뷰 대상 코드는 LeetCode의 exchange-seats 문제를 MySQL로 해결한 것입니다. 

1. **시간 복잡도**: 이 쿼리의 시간 복잡도는 O(n)입니다. 여기서 n은 Seat 테이블의 행 수를 나타냅니다. 쿼리에서 두 테이블을 조인하여 각 행을 비교하기 때문에 시간 복잡도가 선형적으로 증가합니다.

2. **공간 복잡도**: 공간 복잡도는 O(n)입니다. 쿼리 결과는 최대 n/2 개의 행을 포함할 수 있기 때문에, 여기서 n은 원본 테이블의 행 수를 나타냅니다. 결과 집합의 크기는 입력 크기에 선형적으로 비례합니다.

3. **풀이 접근법**: 이 쿼리에서는 Self-Join을 사용하여 같은 테이블 내에서 행을 비교합니다. 각 행의 id와 id+1를 가진 행을 매칭하여 학생의 자리를 교환하는 효과를 낸습니다. 이 접근법은 문제의 요구 사항을 직접적으로 해결합니다.

4. **잘된 점**: 코드는 간결하고 문제의 요구 사항을 명확하게 이해하여 구현했습니다. Self-Join을 사용하여 같은 테이블 내에서 행을 비교하는 것은 이 문제에 적합한 접근법입니다.

5. **개선 사항**: 현재 쿼리는 홀수 번째 행에 대해서는 처리하지 못합니다. exchange-seats 문제에서는 모든 학생의 자리를 교환해야 하므로, 홀수 번째 행과 짝수 번째 행을 모두 고려해야 합니다. 이를 개선하기 위해, CASE 문을 사용하여 id가 홀수인 경우와 짝수인 경우를分别 처리할 수 있습니다. 예를 들어, 
```mysql
SELECT
    (CASE
        WHEN id % 2 = 1 AND id = (SELECT MAX(id) FROM Seat) THEN id
        WHEN id % 2 = 1 THEN id + 1
        ELSE id - 1
    END) AS id,
    student
FROM Seat
ORDER BY id;
```
이 쿼리는 모든 학생의 자리를 교환하며, 홀수 번째 행과 짝수 번째 행을 모두 고려합니다.
