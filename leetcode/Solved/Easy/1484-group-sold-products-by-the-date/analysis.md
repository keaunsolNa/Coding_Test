# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 14. 오후 1:51:08 |
| Language | mysql |
| Runtime | 153 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/group-sold-products-by-the-date/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n log n)입니다. GROUP BY와 ORDER BY 연산이 수행되며, GROUP_CONCAT 함수도 수행됩니다. 여기서 n은 Activities 테이블의 행 수를 나타냅니다. GROUP BY와 ORDER BY 연산은 일반적으로 O(n log n) 시간 복잡도를 가지며, GROUP_CONCAT 함수는 O(n) 시간 복잡도를 가집니다. 그러나 GROUP_CONCAT 함수 내에서 DISTINCT와 ORDER BY가 수행되므로, 전체 시간 복잡도는 O(n log n)입니다.

2. **공간 복잡도**: O(n)입니다. GROUP BY와 GROUP_CONCAT 연산을 위해 추가적인 메모리 공간이 필요합니다. 여기서 n은 Activities 테이블의 행 수를 나타냅니다. GROUP BY 연산을 위해 각 그룹의 정보를 저장해야 하며, GROUP_CONCAT 함수를 위해 각 그룹의 제품 목록을 저장해야 합니다.

3. **풀이 접근법**: 이 풀이에서는 관계형 데이터베이스의 집계 함수와 그룹화 함수를 사용했습니다. GROUP BY 함수를 사용하여 sell_date로 그룹화를 수행하고, COUNT 함수를 사용하여 각 그룹의 제품 수를 계산했습니다. 또한, GROUP_CONCAT 함수를 사용하여 각 그룹의 제품 목록을 생성했습니다. 이 접근법은 데이터를 효율적으로 그룹화하고 집계할 수 있기 때문에 적절합니다.

4. **잘된 점**: 코드는 간결하고 읽기 쉽습니다. 필요한 열만 선택하고, GROUP BY와 ORDER BY를 적절히 사용했습니다. 또한, GROUP_CONCAT 함수를 사용하여 제품 목록을 생성하는 것이 좋습니다.

5. **개선 사항**: 현재 코드는 이미 효율적입니다. 그러나sell_date의 형식이 DATE인 경우, DATE_FORMAT 함수를 사용하여 날짜 형식을 변경할 수 있습니다. 또한, 만약 Activities 테이블이非常 크다면, 인덱스를 생성하여 쿼리 성능을 개선할 수 있습니다. 예를 들어, sell_date 열에 인덱스를 생성하여 GROUP BY와 ORDER BY 연산을 빠르게 수행할 수 있습니다.
