# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 14. 오후 1:50:15 |
| Language | mysql |
| Runtime | 77 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/group-sold-products-by-the-date/submissions/)

## Code Review

코드 리뷰를 진행하겠습니다.

1. **시간 복잡도**: O(n log n) - GROUP BY 및 ORDER BY 연산으로 인해 데이터를 정렬해야 하므로 시간 복잡도가 증가합니다. 여기서 n은 Activities 테이블의 행 수를 나타냅니다.

2. **공간 복잡도**: O(n) - GROUP_CONCAT 함수를 사용하여 각 그룹의 제품을 문자열로 결합해야 하므로 추가적인 메모리가 필요합니다. 여기서 n은 각 그룹의 제품 수를 나타냅니다.

3. **풀이 접근법**: 이 풀이에서는 SQL의 집계 함수(GROUP BY, COUNT, GROUP_CONCAT)와 정렬 함수(ORDER BY)를 사용하여 데이터를 그룹화하고 정렬합니다. 이는 관계형 데이터베이스에서 데이터를 집계하고 분석하는 일반적인 패턴입니다.

4. **잘된 점**: 코드는 간결하고 읽기 쉽습니다. 또한, 필요한 열만 선택하여 데이터를 효율적으로 처리합니다. GROUP_CONCAT 함수를 사용하여 각 그룹의 제품을 문자열로 결합하는 것도 좋은 접근법입니다.

5. **개선 사항**: 현재 코드는 Activities 테이블의 모든 행을 처리합니다. 만약 테이블이 매우 크다면, sell_date 열에 인덱스를 생성하여 GROUP BY 및 ORDER BY 연산의 성능을 개선할 수 있습니다. 또한, GROUP_CONCAT 함수의 최대 길이를 설정하여 메모리 사용량을 제한할 수 있습니다. 예를 들어, `GROUP_CONCAT(product, '' ORDER BY product SEPARATOR ',' LIMIT 100)`와 같이 설정할 수 있습니다.
