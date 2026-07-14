# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 14. 오후 3:23:03 |
| Language | oraclesql |
| Runtime | 243 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/find-users-with-valid-e-mails/submissions/)

## Code Review

코드 리뷰를 진행하겠습니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 Users 테이블의 모든 행을 스캔하므로 시간 복잡도는 데이터의 크기(n)에 비례합니다. SUBSTR, INSTR, REGEXP_LIKE 함수는 상수 시간에 실행되므로 전체 쿼리의 시간 복잡도에 영향을 미치지 않습니다.

2. **공간 복잡도**: O(n) - 쿼리는 중첩된 SELECT 문을 사용하여 임시 결과 집합을 생성하므로 공간 복잡도도 데이터의 크기(n)에 비례합니다.

3. **풀이 접근법**: 이 쿼리는 다음과 같은 알고리즘/패턴을 사용합니다.
   - 문자열 조작: SUBSTR, INSTR 함수를 사용하여 이메일 주소를 prefix와 suffix로 분리합니다.
   - 정규식: REGEXP_LIKE 함수를 사용하여 prefix가 유효한 문자열인지 확인합니다.
   - 필터링: WHERE 절을 사용하여 suffix가 'leetcode.com'인 행과 prefix가 유효한 문자열인 행만 선택합니다.

4. **잘된 점**: 
   - 쿼리는 읽기 쉽고 이해하기 쉽게 작성되어 있습니다.
   - 필요한 열만 선택하여 불필요한 데이터 전송을 피합니다.
   - REGEXP_LIKE 함수를 사용하여 prefix의 유효성을 체크하는 것이 좋습니다.

5. **개선 사항**:
   - 쿼리에서 중첩된 SELECT 문을 사용하여 임시 결과 집합을 생성하지만, 이 경우는 단순한 필터링과 문자열 조작만 수행하므로 중첩된 SELECT 문이 꼭 필요한지 확인할 필요가 있습니다. 대신, 바로 Users 테이블에서 필터링과 문자열 조작을 수행할 수 있습니다.
   - 인덱스를 생성하여 쿼리 성능을 개선할 수 있습니다. 특히, mail 열에 인덱스를 생성하면 쿼리 성능을 개선할 수 있습니다.
