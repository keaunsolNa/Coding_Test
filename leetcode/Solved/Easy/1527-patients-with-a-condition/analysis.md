# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 14. 오후 5:31:52 |
| Language | oraclesql |
| Runtime | 400 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/patients-with-a-condition/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 Patients 테이블의 모든 행을 스캔해야 하므로, 시간 복잡도는 테이블의 행 수에 비례합니다. LIKE 연산자로 인해 전체 테이블을 스캔해야 하므로, 효율적인 인덱스를 사용할 수 없습니다.

2. **공간 복잡도**: O(1) - 이 쿼리는 추가적인 메모리 공간을 사용하지 않으므로, 공간 복잡도는 상수입니다. 쿼리 결과는 Patients 테이블의 행 수에 비례하지만, 이는 공간 복잡도에 영향을 미치지 않습니다.

3. **풀이 접근법**: 이 쿼리는 LIKE 연산자를 사용하여 conditions 컬럼에서 'DIAB1'을 포함하는 행을 찾습니다. 이는 문자열 검색 알고리즘의 기본적인 접근법입니다.

4. **잘된 점**: 이 쿼리는 간단하고 읽기 쉽습니다. 필요한 컬럼만 선택하여 불필요한 데이터를 로드하지 않습니다.

5. **개선 사항**: LIKE 연산자는 효율적인 인덱스를 사용할 수 없으므로, 대량의 데이터를 처리하는 경우 성능이 저하될 수 있습니다. 대안적인 접근법으로는 Full-Text Search를 지원하는 Oracle Text를 사용하거나, conditions 컬럼을 별도의 테이블로 분리하여 인덱스를 생성하는 것입니다. 또한, '%DIAB1%' 대신 'DIAB1%'를 사용하여 prefix 인덱스를 사용할 수 있습니다.
