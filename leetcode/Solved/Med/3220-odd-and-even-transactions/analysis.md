# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 13. 오전 9:30:22 |
| Language | oraclesql |
| Runtime | 236 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/odd-and-even-transactions/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도** — O(n)입니다. 이 쿼리는 transactions 테이블의 모든 행을 스캔하여 각 날짜별奇수와 짝수 금액의 합계를 계산하기 때문입니다. Big-O 표기법에서 n은 테이블의 행 수를 나타냅니다.

2. **공간 복잡도** — O(n)입니다. 쿼리 결과는 각 날짜별로 그룹화되며, 최악의 경우 테이블의 모든 행이 유니크한 날짜를 가질 수 있으므로 결과 집합의 크기는 n이 될 수 있습니다.

3. **풀이 접근법** — 이 쿼리는 그룹화(group by)와 조건부 합계(case when)를 사용하여 각 날짜별로奇수와 짝수 금액의 합계를 계산합니다. 이는 간단하면서도 효율적인 접근법입니다.

4. **잘된 점** — 쿼리는 간결하고 읽기 쉽습니다. 필요한 열만 선택하고, TO_DATE 함수를 사용하여 날짜 형식을 일관性 있게 유지하며, SUM과 CASE WHEN을 사용하여 논리적으로 계산을 수행합니다.

5. **개선 사항** — 쿼리 자체는 효율적이지만, 인덱스가 없으면 성능이 저하될 수 있습니다. 특히 transaction_date 열에 인덱스를 생성하면 쿼리 성능을 개선할 수 있습니다. 또한, 대용량 테이블의 경우 파티셔닝(partitioning)을 고려하여 쿼리 성능을 최적화할 수 있습니다.
