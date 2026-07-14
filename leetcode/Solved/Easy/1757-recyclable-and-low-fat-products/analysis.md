# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 14. 오후 5:44:18 |
| Language | oraclesql |
| Runtime | 504 ms (Beats 97.5%) |
| Memory | 0B (Beats 100.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/recyclable-and-low-fat-products/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 Products 테이블의 모든 행을 스캔하기 때문에 시간 복잡도는 데이터의 크기(n)에 비례합니다. 즉, 테이블의 행이 많아질수록 쿼리의 수행 시간도 증가합니다.

2. **공간 복잡도**: O(1) - 쿼리는 추가적인 공간을 사용하지 않기 때문에 공간 복잡도는 상수입니다. 쿼리 결과는 메모리에 임시로 저장되지만, 이는 입력 데이터의 크기와는 무관합니다.

3. **풀이 접근법**: 이 쿼리는 단순한 필터링을 사용하여 low_fats와 recyclable이 'Y'인 제품을 찾습니다. WHERE 절을 사용하여 조건을 지정하고, SELECT 절을 사용하여 필요한 열만 가져옵니다. 이는 관계형 데이터베이스에서 데이터를 필터링하는 가장 기본적인 패턴입니다.

4. **잘된 점**: 코드는 간결하고 읽기 쉽습니다. WHERE 절을 사용하여 조건을 명확하게 지정하고, SELECT 절을 사용하여 필요한 데이터만 가져옵니다. 또한, low_fats와 recyclable 컬럼의 값을 정확하게 비교하여 올바른 결과를 가져옵니다.

5. **개선 사항**: 현재 쿼리는 인덱스를 사용하지 않기 때문에 대량의 데이터를 처리할 때 성능이 저하될 수 있습니다. low_fats와 recyclable 컬럼에 인덱스를 생성하여 쿼리 성능을 개선할 수 있습니다. 또한, 테이블의 구조와 데이터 분포를 고려하여 쿼리를 최적화할 수 있습니다. 예를 들어, low_fats와 recyclable 컬럼이 자주 사용된다면, 이러한 컬럼을 포함하는 복합 인덱스를 생성할 수 있습니다.
