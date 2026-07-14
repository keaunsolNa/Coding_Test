# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 14. 오후 1:49:41 |
| Language | mysql |
| Runtime | 74 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/group-sold-products-by-the-date/submissions/)

## Code Review

리뷰 대상 코드는 MySQL 쿼리문으로, 'group-sold-products-by-the-date' 문제를 해결하기 위해 작성되었습니다. 

1. **시간 복잡도**: 이 쿼리의 시간 복잡도는 O(n log n)입니다. GROUP BY와 ORDER BY 연산이 포함되어 있기 때문에, 데이터를 정렬하는 시간이 추가로 소요됩니다. 여기서 n은 Activities 테이블의 행 수를 나타냅니다.

2. **공간 복잡도**: 공간 복잡도는 O(n)입니다. GROUP_CONCAT 함수를 사용하여 각 그룹의 제품을 문자열로 결합하기 때문에, 결과セット의 크기가 원본 데이터의 크기와 비슷할 수 있습니다.

3. **풀이 접근법**: 이 쿼리는 집계 함수와 GROUP BY 절을 사용하여 날짜별로 제품을 그룹화하고, 각 그룹의 제품 수를 계산합니다. 또한 GROUP_CONCAT 함수를 사용하여 각 그룹의 제품을 문자열로 결합합니다. 이는 데이터를 요약하고 분석하기 위한 일반적인 패턴입니다.

4. **잘된 점**: 이 쿼리는 문제의 요구사항을 명확하게 이해하고, 필요한 데이터를 효과적으로 추출합니다. 또한 GROUP_CONCAT 함수를 사용하여 제품을 문자열로 결합하는 방식은 결과를 쉽게 읽을 수 있게 합니다.

5. **개선 사항**: 현재 쿼리에서 GROUP BY 절에 product가 포함되어 있습니다. 그러나 문제의 목적은 날짜별로 제품을 그룹화하는 것입니다. 따라서 GROUP BY 절에서 product를 제거하고, GROUP_CONCAT 함수에서 DISTINCT 키워드를 사용하여 중복 제품을 제거할 수 있습니다. 또한, 쿼리의 성능을 개선하기 위해 적절한 인덱스를 생성하는 것이 좋습니다. 개선된 쿼리는 다음과 같습니다:
```mysql
SELECT sell_date
     , COUNT(DISTINCT product) num_sold
     , GROUP_CONCAT(DISTINCT product ORDER BY product SEPARATOR ',') products
  FROM Activities
 GROUP BY sell_date
 ORDER BY sell_date
```
