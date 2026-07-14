# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 14. 오후 3:23:15 |
| Language | oraclesql |
| Runtime | 648 ms (Beats 77.3%) |
| Memory | 0B (Beats 100.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/find-users-with-valid-e-mails/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 Users 테이블의 모든 행을 스캔하므로 시간 복잡도는 데이터의 크기(n)에 비례합니다. SUBSTR, INSTR, REGEXP_LIKE 함수의 계산 비용은 상수 시간으로 가정할 수 있습니다.

2. **공간 복잡도**: O(n) - 쿼리 결과를 저장하기 위한 임시 공간이 필요하며, 이는 입력 데이터의 크기(n)에 비례합니다.

3. **풀이 접근법**: 이 쿼리는 서브쿼리를 사용하여 메일 주소를 prefix와 suffix로 분리하고, REGEXP_LIKE 함수를 사용하여 prefix의 유효성을 검사합니다. 이는 문자열 처리와 정규식 패턴 매칭을 사용한 간단한 알고리즘입니다.

4. **잘된 점**: 코드는 읽기 쉽고, 서브쿼리를 사용하여 메일 주소를 분리하는 부분이 명확합니다. 또한 REGEXP_LIKE 함수를 사용하여 prefix의 유효성을 검사하는 부분도 잘 구현되어 있습니다.

5. **개선 사항**: 쿼리 최적화를 위해 인덱스를 생성하는 것을 고려할 수 있습니다. 예를 들어, mail 열에 인덱스를 생성하면 쿼리 성능을 개선할 수 있습니다. 또한, 서브쿼리를 JOIN이나 다른 쿼리 방법으로 대체할 수 있는지 검토할 수 있습니다. 하지만 현재 쿼리는 간단하고 읽기 쉽기 때문에 큰 문제는 없습니다.
