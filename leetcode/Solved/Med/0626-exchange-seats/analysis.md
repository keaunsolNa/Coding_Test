# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 6. 오후 12:59:45 |
| Language | mysql |
| Runtime | 86 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/exchange-seats/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 테이블의 모든 행을 스캔하므로 시간 복잡도는 데이터의 크기(n)에 비례합니다. COUNT와 MAX 함수는 추가적인 시간 복잡도를 유발하지 않습니다.

2. **공간 복잡도**: O(1) - 쿼리는 임시 테이블이나 추가적인 공간을 사용하지 않으므로 공간 복잡도는 상수입니다. 그러나 서브쿼리는 각 행마다 실행되므로 실제 공간 복잡도는 조금 더 복잡할 수 있습니다.

3. **풀이 접근법**: 이 쿼리는 CASE 문과 서브쿼리를 사용하여 학생의 좌석을 교환합니다. MOD 함수를 사용하여 행의 개수가 홀수인 경우 마지막 행의 학생을 교환하지 않습니다. 서브쿼리는 각 행의 다음 행의 학생을 가져옵니다.

4. **잘된 점**: 쿼리는 문제의 요구 사항을 정확하게 구현했습니다. CASE 문을 사용하여 특정 조건下的 학생을 교환하지 않는 로직을 구현했습니다.

5. **개선 사항**: 쿼리에서 서브쿼리를 사용하여 각 행의 다음 행의 학생을 가져옵니다. 이로 인해 쿼리의 성능이 저하될 수 있습니다. 대신 JOIN을 사용하여 테이블을 자기 자신과 조인하여 다음 행의 학생을 가져올 수 있습니다. 또한, IFNULL 함수를 사용하여 NULL 값을 처리할 수 있습니다. 예를 들어:
```mysql
SELECT T1.id, 
       IF(MOD(COUNT(T1.id), 2) = 1 AND T1.id = MAX(T1.id), T1.student, T2.student) AS student
FROM Seat T1
LEFT JOIN Seat T2 ON T1.id = T2.id - 1
```
이러한 개선을 통해 쿼리의 성능을 향상시킬 수 있습니다.
