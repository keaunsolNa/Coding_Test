# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 16. 오후 3:41:50 |
| Language | oraclesql |
| Runtime | 256 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/the-number-of-employees-which-report-to-each-employee/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n^2) - 쿼리 내에 서브쿼리가 존재하여, Employees 테이블을 두 번扫描하게 됩니다. 서브쿼리 내의 COUNT와 AVG 함수도 각 row마다 계산되어야 하므로, 시간 복잡도가 높아집니다.

2. **공간 복잡도**: O(n) - Employees 테이블의 모든 row를 메모리에 로드해야 하므로, 공간 복잡도는 테이블의 크기에 비례합니다.

3. **풀이 접근법**: 이 쿼리는 Employees 테이블을 스캔하여 각 employee_id에 해당하는 reports_to의 개수와 평균 나이를 계산합니다. 서브쿼리를 사용하여 reports_to와 일치하는 row의 개수와 평균 나이를 계산합니다.

4. **잘된 점**: 쿼리는 요구 사항을 명확하게 이해하고, Employees 테이블의 구조를 잘 파악하여 필요한 데이터를 추출했습니다. 또한, ROUND 함수를 사용하여 평균 나이를 반올림했습니다.

5. **개선 사항**: WHERE 절이 누락되어 있습니다. WHERE 절을 추가하여 특정 조건을 만족하는 row만 추출할 수 있습니다. 또한, JOIN을 사용하여 서브쿼리를 대체할 수 있습니다. 예를 들어, 다음과 같이 JOIN을 사용할 수 있습니다.
```oraclesql
SELECT T1.employee_id
     , T1.name  
     , COUNT(T2.reports_to) reports_count
     , ROUND(AVG(T2.age)) average_age
 FROM Employees T1
 LEFT JOIN Employees T2 ON T1.employee_id = T2.reports_to
 GROUP BY T1.employee_id, T1.name
```
