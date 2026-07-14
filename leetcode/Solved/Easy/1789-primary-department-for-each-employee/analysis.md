# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 14. 오후 2:38:56 |
| Language | oraclesql |
| Runtime | 807 ms (Beats 10.4%) |
| Memory | 0B (Beats 100.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/primary-department-for-each-employee/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 Employee 테이블을 두 번 스캔합니다. 첫 번째 스캔은 서브쿼리에서 employee_id를 그룹화하고, 두 번째 스캔은 메인 쿼리에서 데이터를 가져옵니다. 따라서 시간 복잡도는 O(n)입니다.

2. **공간 복잡도**: O(n) - 쿼리 결과를 저장하기 위해 필요한 공간이 있습니다. 결과 집합의 크기는 Employee 테이블의 행 수에 비례하므로 공간 복잡도는 O(n)입니다.

3. **풀이 접근법**: 이 쿼리는 서브쿼리와 메인 쿼리를 조합하여 primary-department-for-each-employee 문제를 해결합니다. 서브쿼리는 각 employee_id의 행 수를 계산하고, 메인 쿼리는 primary_flag가 'Y'인 행이나 서브쿼리에서 반환된 employee_id를 가진 행을 선택합니다. 이는 기본적으로 필터링과 정렬을 수행하는 알고리즘입니다.

4. **잘된 점**: 코드는 간결하고 읽기 쉽습니다. 서브쿼리와 메인 쿼리를 명확하게 분리하여 문제를 해결했습니다. 또한, ORDER BY 절을 사용하여 결과를 employee_id 순으로 정렬했습니다.

5. **개선 사항**: 쿼리 최적화를 위해 인덱스를 생성할 수 있습니다. Employee 테이블의 employee_id와 department_id 열에 인덱스를 생성하면 쿼리 성능을 향상시킬 수 있습니다. 또한, 서브쿼리를 JOIN으로 대체하여 쿼리를 더 효율적으로 만들 수 있습니다. 예를 들어, 다음과 같이 JOIN을 사용할 수 있습니다.
```oraclesql
SELECT T1.employee_id
     , T1.department_id
  FROM Employee T1
  LEFT JOIN (
    SELECT employee_id
      FROM Employee
     GROUP BY employee_id
     HAVING count(*) > 1
  ) T2
  ON T1.employee_id = T2.employee_id
 WHERE T2.employee_id IS NULL OR T1.primary_flag = 'Y'
 ORDER BY T1.employee_id
```
