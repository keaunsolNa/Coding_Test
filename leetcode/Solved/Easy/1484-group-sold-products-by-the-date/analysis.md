# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 14. 오후 1:47:32 |
| Language | oraclesql |
| Runtime | 300 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/group-sold-products-by-the-date/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n log n) - 이 쿼리는 Activities 테이블을 sell_date 기준으로 그룹화하고, 각 그룹 내에서 product를 정렬하여 LISTAGG 함수로 연결합니다. 이 과정에서 발생하는 시간 복잡도는 정렬 알고리즘의 시간 복잡도인 O(n log n)입니다.

2. **공간 복잡도**: O(n) - 쿼리 결과는 각 sell_date에 대한 정보를 포함하므로, 공간 복잡도는 Activities 테이블의 행 수에 비례합니다. 따라서 공간 복잡도는 O(n)입니다.

3. **풀이 접근법**: 이 쿼리는 그룹화와 집계 함수를 사용하여 Activities 테이블의 데이터를 요약합니다. 사용된 알고리즘은 기본적으로 SQL의 GROUP BY와 집계 함수의 조합입니다. LISTAGG 함수는 각 그룹 내에서 product를 정렬하여 연결합니다.

4. **잘된 점**: 코드는 간결하고, 필요한 정보만을 조회하여 효율적입니다. 또한, TO_CHAR 함수를 사용하여 sell_date를 원하는 형식으로 변환하여 출력합니다.

5. **개선 사항**: 쿼리 자체는 효율적이지만, Activities 테이블의 크기가 매우 큰 경우에는 sell_date 기준으로 인덱스를 생성하여 쿼리 성능을 개선할 수 있습니다. 또한, LISTAGG 함수의 최대 길이 제한을 고려하여, 필요에 따라 길이 제한을 설정할 수 있습니다.
