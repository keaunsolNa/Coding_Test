# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 21. 오전 8:43:11 |
| Language | oraclesql |
| Runtime | 711 ms (Beats 64.3%) |
| Memory | 0B (Beats 100.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/percentage-of-users-attended-a-contest/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n log n) - 이 쿼리는 사용자 수와 레지스터 수에 비례하는 시간을 소요합니다. 또한 ORDER BY 절이 있으므로 정렬 시간이 추가로 소요됩니다. 따라서 전체 시간 복잡도는 O(n log n)입니다.

2. **공간 복잡도**: O(n) - 쿼리에서 사용되는 임시 테이블(CNT)과 중간 결과セット의 크기는 사용자 수에 비례합니다. 따라서 공간 복잡도는 O(n)입니다.

3. **풀이 접근법**: 이 쿼리는 사용자 수를 집계하고, 각 콘테스트에参加한 사용자 수를 계산한 후, 사용자 수에 대한 퍼센트를 계산합니다. 이는 기본적인 집계 함수와 JOIN을 사용한 쿼리 패턴입니다.

4. **잘된 점**: 코드는 비교적 간결하고, 필요한 계산을 수행합니다. 또한 ROUND 함수를 사용하여 퍼센트를 소수점 2자리까지 반올림하여 결과를 깔끔하게 표시합니다.

5. **개선 사항**: 쿼리에서 CNT라는 임시 테이블을 사용하여 사용자 수를 집계합니다. 그러나 이 쿼리는 Users 테이블을 두 번 JOIN해야 하므로, 성능이 느릴 수 있습니다. 대안으로는 서브쿼리를 사용하거나, 사용자 수를 미리 계산하여 저장하는 방법을 고려할 수 있습니다. 또한, GROUP BY 절에서 T3.cnt를 포함하는 것은 불필요한 것으로 보입니다. 이는 GROUP BY 절에서 contest_id만 포함시키는 것으로 충분할 것입니다.
