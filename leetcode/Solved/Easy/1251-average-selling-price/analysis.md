# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 14. 오후 3:03:24 |
| Language | oraclesql |
| Runtime | 547 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/average-selling-price/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: 이 쿼리의 시간 복잡도는 O(n log n)입니다. 이유는 GROUP BY 연산이 포함되어 있기 때문입니다. GROUP BY는 데이터를 그룹화하기 위해 정렬을 수행해야 하므로, 시간 복잡도가 O(n log n)가 됩니다.

2. **공간 복잡도**: 이 쿼리의 공간 복잡도는 O(n)입니다. 이유는 쿼리 결과를 저장하기 위해 임시 테이블이 필요하기 때문입니다. 임시 테이블의 크기는 입력 데이터의 크기와 비례하므로, 공간 복잡도가 O(n)가 됩니다.

3. **풀이 접근법**: 이 쿼리는 JOIN과 GROUP BY를 사용하여 평균 판매 가격을 계산합니다. JOIN은 두 테이블을 연결하여 데이터를 통합하고, GROUP BY는 데이터를 그룹화하여 평균 값을 계산합니다. 이 접근법은 문제를 효율적으로 해결할 수 있습니다.

4. **잘된 점**: 이 쿼리는 문제를 명확하게 이해하고, 필요한 데이터를 효율적으로 추출합니다. 또한, ROUND 함수를 사용하여 평균 가격을 소수점 2자리까지 반올림하여 결과를 깔끔하게 출력합니다.

5. **개선 사항**: 이 쿼리는 대부분 잘 구현되어 있지만, OUTER JOIN을 사용하여 데이터를 연결하고 있습니다. Oracle 12c 이상에서 사용하는 경우, OUTER JOIN 대신 LEFT JOIN을 사용하여 코드를 더 읽기 쉽게 만들 수 있습니다. 또한, 테이블 별칭을 더 명확하게 사용하여 코드를 더 이해하기 쉽게 만들 수 있습니다. 예를 들어, `T1` 대신 `Prices`를 사용하고, `T2` 대신 `UnitsSold`를 사용할 수 있습니다.
