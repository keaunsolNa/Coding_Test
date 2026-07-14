# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 14. 오후 2:35:10 |
| Language | oraclesql |
| Runtime | 338 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/primary-department-for-each-employee/submissions/)

## Code Review

코드 리뷰를 진행하겠습니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 Employee 테이블의 모든 행을 스캔하므로 시간 복잡도는 데이터의 크기(n)에 비례합니다. GROUP BY 절과 COUNT 함수는 추가적인 계산을 필요로 하지만, 전체 시간 복잡도는 여전히 O(n)입니다.

2. **공간 복잡도**: O(n) - 쿼리 결과는 Employee 테이블의 행 수만큼의 공간을 필요로 하므로 공간 복잡도도 O(n)입니다. GROUP BY 절은 중간 결과를 저장하기 위해 추가적인 메모리가 필요할 수 있지만, 이는 여전히 입력 데이터의 크기에 비례합니다.

3. **풀이 접근법**: 이 쿼리는 집계 함수(COUNT)를 사용하여 각 사원의 부서 수를 계산하고, CASE 문을 사용하여 부서 수에 따라 department_id를 결정합니다. 이는 간단한 집계 및 조건문 처리를 위한 기본적인 SQL 패턴입니다.

4. **잘된 점**: 코드는 간결하고 읽기 쉽습니다. 필요한 열만 선택하고, GROUP BY와 ORDER BY 절을 적절히 사용하여 결과를 정렬했습니다. 또한, CASE 문을 사용하여 department_id를 결정하는 논리를 명확하게 표현했습니다.

5. **개선 사항**: 현재 쿼리는 Employee 테이블의 모든 행을 스캔하므로, 테이블이 매우 큰 경우 성능이 저하될 수 있습니다. 인덱스를 생성하거나, 필요한 데이터만 필터링하여 쿼리 성능을 개선할 수 있습니다. 또한, department_id를 결정하는 논리가 단순한 경우, 더 간단한 쿼리문을 사용할 수 있습니다. 예를 들어, EXISTS나 IN 연산자를 사용하여 부서 수를 확인할 수 있습니다. 그러나 현재 쿼리는 간결하고 읽기 쉽기 때문에, 큰 테이블에서 성능 이슈가 발생하지 않는다면 현재 쿼리를 사용하는 것이 좋습니다.
