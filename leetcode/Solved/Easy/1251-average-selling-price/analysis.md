# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 14. 오후 3:02:36 |
| Language | oraclesql |
| Runtime | 297 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/average-selling-price/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도** — Big-O 표기와 설명: 
이 코드의 시간 복잡도는 O(n log n)입니다. 이는 데이터베이스의 JOIN 연산과 GROUP BY 연산이 수행되기 때문입니다. JOIN 연산의 시간 복잡도는 일반적으로 O(n^2)이나 O(n log n)이며, GROUP BY 연산의 시간 복잡도는 O(n log n)입니다.

2. **공간 복잡도** — Big-O 표기와 설명: 
이 코드의 공간 복잡도는 O(n)입니다. 이는 데이터베이스의 임시 결과를 저장하기 위한 공간이 필요하기 때문입니다. JOIN 연산과 GROUP BY 연산의 결과를 저장하기 위한 공간이 필요합니다.

3. **풀이 접근법** — 사용된 알고리즘/패턴 간단 설명: 
이 코드는 데이터베이스의 JOIN 연산과 GROUP BY 연산을 사용하여 평균 판매 가격을 계산합니다. Prices 테이블과 UnitsSold 테이블을 JOIN하여 제품별 판매 가격과 판매량을 계산하고, GROUP BY 연산을 사용하여 제품별 평균 판매 가격을 계산합니다.

4. **잘된 점** — 코드에서 잘 구현된 부분: 
코드에서 잘 구현된 부분은 JOIN 연산과 GROUP BY 연산을 사용하여 평균 판매 가격을 계산하는 것입니다. 또한, 코드는 간결하고 읽기 쉽습니다.

5. **개선 사항** — 최적화 가능한 부분이나 대안적 접근법 (있는 경우): 
코드를 최적화하기 위한 방법은 인덱스를 생성하여 JOIN 연산과 GROUP BY 연산의 성능을 개선하는 것입니다. 또한, 데이터베이스의 통계 정보를 사용하여 쿼리 최적화를 수행할 수 있습니다. 대안적 접근법으로는 데이터를 미리 계산하여 캐싱하는 방법이 있습니다. 이는 데이터가 자주 변경되지 않는 경우에 유용합니다.
