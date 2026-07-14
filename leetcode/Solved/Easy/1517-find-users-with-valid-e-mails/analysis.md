# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 14. 오후 3:21:21 |
| Language | oraclesql |
| Runtime | 336 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/find-users-with-valid-e-mails/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 Users 테이블의 모든 행을 스캔하므로 시간 복잡도는 테이블의 행 수에 비례합니다. SUBSTR, INSTR, REGEXP_LIKE 함수는 상수 시간에 실행되므로 전체 쿼리의 시간 복잡도에 영향을 미치지 않습니다.

2. **공간 복잡도**: O(n) - 쿼리는 중첩된 서브쿼리를 사용하므로 결과 집합을 임시로 저장해야 합니다. 이로 인해 공간 복잡도가 테이블의 행 수에 비례합니다.

3. **풀이 접근법**: 이 쿼리는 필터링을 위해 서브쿼리와 정규식 함수를 사용합니다. 먼저, mail 열에서 '@' 기호 앞뒤의 부분 문자열을 추출하여 prefix와 suffix를 구합니다. 그런 다음, suffix가 'leetcode.com'인 행만 필터링하고, prefix가 유효한 이메일 주소 형식인지 확인하기 위해 REGEXP_LIKE 함수를 사용합니다.

4. **잘된 점**: 코드는 읽기 쉽고, 서브쿼리를 사용하여 로직을 명확하게 분리했습니다. 또한, REGEXP_LIKE 함수를 사용하여 prefix의 유효성을 체크하는 부분은 매우 효율적입니다.

5. **개선 사항**: 쿼리 자체는 효율적이지만, 테이블의 크기가 매우 클 경우 성능이 저하될 수 있습니다. 이 경우, mail 열에 인덱스를 생성하여 쿼리 성능을 개선할 수 있습니다. 또한, 서브쿼리를 JOIN이나 다른 방법으로 대체하여 쿼리의 복잡도를 줄일 수 있습니다. 그러나, 현재 쿼리는 간단하고 효율적이므로 큰 문제는 없습니다.
