# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 14. 오후 2:38:49 |
| Language | oraclesql |
| Runtime | 329 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/primary-department-for-each-employee/submissions/)

## Code Review

**코드 리뷰**

1. **시간 복잡도**: O(n) - 이 쿼리는 Employee 테이블을 두 번 스캔합니다. 첫 번째 스캔은 employee_id별로 그룹화하여 primary_flag가 'Y'인 행을 찾는 것이고, 두 번째 스캔은 이러한 조건을 만족하는 행을 필터링하는 것입니다. 따라서 시간 복잡도는 데이터의 크기(n)에 비례합니다.

2. **공간 복잡도**: O(n) - 쿼리 결과를 저장하기 위한 공간이 필요합니다. 결과 집합의 크기는 입력 데이터의 크기에 비례하므로 공간 복잡도도 O(n)입니다.

3. **풀이 접근법**: 이 쿼리는 서브쿼리와 조인 대신 OR 조건을 사용하여 primary_flag가 'Y'인 행이나 각 employee_id에 대한 행이 하나만 있는 경우를 찾습니다. 이는 간단한 해결책이지만, 데이터가大量인 경우 성능이 저하될 수 있습니다.

4. **잘된 점**: 코드는 간결하고, 읽기 쉽습니다. 또한, 필요한 조건을 모두 만족하는 employee_id를 정확하게 찾습니다.

5. **개선 사항**: 현재 쿼리는 Employee 테이블을 두 번 스캔합니다. 이를 개선하기 위해, 인덱스를 생성하거나, 더 효율적인 쿼리 계획을 사용할 수 있습니다. 예를 들어, 다음과 같이 쿼리를 개선할 수 있습니다.
```oraclesql
SELECT T1.employee_id
     , T1.department_id         
  FROM Employee T1
 WHERE T1.primary_flag = 'Y'
    OR T1.employee_id IN (SELECT employee_id
                            FROM (SELECT employee_id, COUNT(*) as cnt
                                  FROM Employee
                                  GROUP BY employee_id) T2
                            WHERE T2.cnt = 1)
 ORDER BY T1.employee_id
```
이러한 개선 사항은 쿼리 성능을 향상시키고, 더 효율적인 데이터 처리를 가능하게 합니다.
