# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 16. 오전 10:28:37 |
| Language | mysql |
| Runtime | 114 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/replace-employee-id-with-the-unique-identifier/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 Employees 테이블과 EmployeeUNI 테이블을 조인하기 때문에, 두 테이블의 행 수에 비례하는 시간이 걸립니다. 따라서 시간 복잡도는 O(n)입니다.

2. **공간 복잡도**: O(n) - 쿼리 결과는 Employees 테이블과 EmployeeUNI 테이블의 행 수에 비례하는 공간을 차지하기 때문에, 공간 복잡도도 O(n)입니다.

3. **풀이 접근법**: 이 쿼리는 Employees 테이블과 EmployeeUNI 테이블을 LEFT JOIN하는 방식으로, Employees 테이블의 id와 EmployeeUNI 테이블의 id를 매칭하여 unique_id를 가져옵니다. 이는 관계형 데이터베이스에서 흔히 사용되는 JOIN 알고리즘입니다.

4. **잘된 점**: 이 쿼리는 간결하고 명확하게 작성되어 있습니다. 또한, Employees 테이블과 EmployeeUNI 테이블의 id를 매칭하여 unique_id를 가져오는 로직이 올바르게 구현되어 있습니다.

5. **개선 사항**: 쿼리 자체는 충분히 최적화되어 있지만, 테이블의 인덱스를 생성하여 JOIN 연산의 성능을 개선할 수 있습니다. 예를 들어, Employees 테이블의 id와 EmployeeUNI 테이블의 id에 인덱스를 생성하면 쿼리 성능을 향상시킬 수 있습니다. 또한, 테이블의 데이터가 매우大量일 경우, 쿼리를 분할하여 처리하거나, 캐싱을 사용하여 성능을 개선할 수 있습니다.
