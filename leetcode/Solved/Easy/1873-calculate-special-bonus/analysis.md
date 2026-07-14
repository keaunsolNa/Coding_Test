# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 14. 오후 4:48:51 |
| Language | oraclesql |
| Runtime | 770 ms (Beats 10.2%) |
| Memory | 0B (Beats 100.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/calculate-special-bonus/submissions/)

## Code Review

코드 리뷰를 진행하겠습니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 Employees 테이블의 모든 행을 스캔하므로 시간 복잡도는 데이터의 크기(n)에 비례합니다. 즉, 데이터가 많을수록 쿼리 실행 시간도 길어집니다.

2. **공간 복잡도**: O(n) - 쿼리 결과도 Employees 테이블의 크기(n)에 비례하므로 공간 복잡도 또한 O(n)입니다. 이는 쿼리 결과를 저장하기 위한 메모리 공간이 필요하기 때문입니다.

3. **풀이 접근법**: 이 쿼리는 간단한 필터링과 조건에 따른 bonus 계산을 수행합니다. CASE 문을 사용하여 employee_id와 name을 조건으로 bonus를 계산하고, 결과를 정렬합니다. 이는 기본적인 SQL 패턴입니다.

4. **잘된 점**: 코드는 간결하고, 읽기 쉽습니다. 필요한 조건을 모두 만족하며, Employees 테이블의 데이터를 효과적으로 처리합니다. 또한, ORDER BY 절을 사용하여 결과를 employee_id 순으로 정렬하여 결과를 쉽게 확인할 수 있습니다.

5. **개선 사항**: 현재 쿼리는 Employees 테이블의 모든 데이터를 스캔하므로, 대량의 데이터가 있는 경우 성능이 저하될 수 있습니다. 인덱스를 생성하거나, 필요한 데이터만 가져오는 방법을 고려할 수 있습니다. 또한, bonus 계산 로직이 복잡해질 경우, 함수를 생성하여 재사용할 수 있습니다. 그러나 현재 쿼리는 간단하고, 잘 동작하므로 추가적인 최적화는 필요하지 않습니다.
