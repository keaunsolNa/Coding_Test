# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026-05-14 22:40:44 |
| Language | oraclesql |
| Runtime | 559 ms (Beats 38.6%) |
| Memory | 0B (Beats 100.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/project-employees-i/submissions/)

## Code Review

이제 코드 리뷰를 시작하겠습니다.

1. **시간 복잡도**: 이 쿼리는 O(n) 时间 복잡도를 가지고 있습니다. 여기서 n은 프로젝트와 직원의 수를 합친 것입니다. 이유는 쿼리가 프로젝트와 직원 테이블을 조인하므로, 데이터베이스는 각 튜플을 읽어야 하기 때문입니다.

2. **공간 복잡도**: 이 쿼리는 O(n) 공간 복잡도를 가지고 있습니다. 쿼리가 결과를 메모리에 저장해야 하므로, 공간 복잡도는 입력 데이터의 크기에 비례합니다.

3. **풀이 접근법**: 이 쿼리는 간단한 SQL 쿼리입니다. 프로젝트와 직원 테이블을 조인하고, 프로젝트 아이디로 그룹화하여 평균 근무년 수를 계산합니다. 이 접근법은 문제를 간단하고 효율적으로 해결합니다.

4. **잘된 점**: 이 쿼리는 잘 구조화되었고, 읽기 쉽습니다. 또한 ROUND 함수를 사용하여 평균 근무년 수를 2자리까지 반올림하는 등의 유용한 기능을 구현했습니다.

5. **개선 사항**: JOIN 문법을 사용하면 쿼리가 더 읽기 쉽고, 유지보수하기 쉬워집니다. 예를 들어, INNER JOIN을 사용하여 프로젝트와 직원 테이블을 조인할 수 있습니다. 또한, 테이블 별칭을 더 직관적으로 사용하면 코드를 더 이해하기 쉽게 만들 수 있습니다. 개선된 쿼리는 다음과 같습니다.
```oraclesql
SELECT P.project_id
     , ROUND(SUM(E.experience_years) / COUNT(E.experience_years), 2) average_years
FROM Project P
INNER JOIN Employee E
ON P.employee_id = E.employee_id
GROUP BY P.project_id
```
