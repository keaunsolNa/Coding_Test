# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 16. 오전 10:27:59 |
| Language | mysql |
| Runtime | 96 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/replace-employee-id-with-the-unique-identifier/submissions/)

## Code Review

리뷰 대상 코드는 MySQL 쿼리문으로, Employees 테이블과 EmployeeUNI 테이블을 조인하여 unique_id와 이름을 조회하는 구문입니다.

1. **시간 복잡도**: 이 쿼리의 시간 복잡도는 O(n)입니다. 여기서 n은 Employees 테이블과 EmployeeUNI 테이블의 행 수를 의미합니다. 두 테이블을 조인하는 과정에서 각 행을 일일히 비교해야 하므로 시간 복잡도가 선형적으로 증가합니다.

2. **공간 복잡도**: 공간 복잡도는 O(n)입니다. 쿼리 결과로 반환되는 데이터의 크기가 입력 테이블의 크기와 비례하기 때문입니다. 즉, Employees와 EmployeeUNI 테이블의 크기가 클수록 결과 집합의 크기도 커집니다.

3. **풀이 접근법**: 이 쿼리에서는 내부 조인(inner join) 알고리즘이 사용됩니다. 두 테이블의 공통 열(id)을 기준으로 행을 매칭하여 결과를 생성합니다. 이는 관계형 데이터베이스에서 두 테이블의 데이터를 연결하여 조회할 때 흔히 사용하는 패턴입니다.

4. **잘된 점**: 코드는 간결하고 읽기 쉽습니다. 필요한 열만 선택하여 조회하고, 조인 조건을 명확하게 지정했습니다. 또한, 테이블 별칭(T1, T2)을 사용하여 쿼리를 더 읽기 쉽게 만들었습니다.

5. **개선 사항**: 현재 쿼리는 내부 조인을 사용하여 Employees 테이블과 EmployeeUNI 테이블을 연결합니다. 하지만, Explicit Join 구문을 사용하면 코드의 가독성이 더 좋아질 수 있습니다. 예를 들어, `FROM Employees T1 INNER JOIN EmployeeUNI T2 ON T2.id = T1.id`와 같이 작성할 수 있습니다. 이는 암시적 조인보다 명시적 조인이 더 표준적이고 유지 보수하기 좋은 방법입니다.
