# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 20. 오전 10:53:19 |
| Language | oraclesql |
| Runtime | 259 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/employees-with-missing-information/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 employees와 Salaries 테이블을 스캔하므로, 시간 복잡도는 두 테이블의 행 수에 비례합니다. 두 테이블의 크기가 n이라고 가정하면, 쿼리는 최대 n번의 연산을 수행합니다.

2. **공간 복잡도**: O(n) - 쿼리 결과는 두 테이블의 행 수에 비례하므로, 공간 복잡도도 O(n)입니다. 쿼리 결과를 저장하기 위해 필요한 메모리 공간은 최대 n에 비례합니다.

3. **풀이 접근법**: 이 쿼리는 Outer Join을 사용하여 employees와 Salaries 테이블을 조인합니다. Outer Join은 한 테이블의 모든 행을 반환하고, 다른 테이블에 매칭되는 행이 있으면 해당 행을 반환하고, 없으면 NULL을 반환합니다. 이 쿼리에서는 Outer Join을 사용하여 employees 테이블에 존재하지만 Salaries 테이블에 존재하지 않는 행을 찾습니다.

4. **잘된 점**: 쿼리는 Outer Join을 사용하여 employees와 Salaries 테이블을 효과적으로 조인하고, 필요한 데이터를 추출합니다. 또한, 쿼리는 간결하고 읽기 쉽게 작성되어 있습니다.

5. **개선 사항**: 쿼리를 더 최적화하기 위해, 인덱스를 생성하여 조인 연산을 가속화할 수 있습니다. 또한, 쿼리에서 불필요한 열을 제거하여 데이터 전송량을 줄일 수 있습니다. 예를 들어, 다음과 같이 쿼리를 개선할 수 있습니다.
```oraclesql
SELECT T1.employee_id
  FROM employees T1
  LEFT JOIN Salaries T2
    ON T1.employee_id = T2.employee_id
 WHERE T2.employee_id IS NULL
 ORDER BY T1.employee_id;
```
이 쿼리는 Outer Join을 사용하여 employees와 Salaries 테이블을 조인하고, 필요한 데이터를 추출합니다. 또한, 인덱스를 생성하여 조인 연산을 가속화할 수 있습니다.
