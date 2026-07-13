# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 13. 오후 4:46:39 |
| Language | oraclesql |
| Runtime | 287 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/find-users-with-high-token-usage/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 prompts 테이블의 모든 행을 스캔하므로 시간 복잡도는 데이터의 크기(n)에 비례합니다. GROUP BY와 HAVING 절은 추가적인 계산을 요구하지만, 이는 이미 스캔된 데이터를 처리하는 것이므로 전체 시간 복잡도에 큰 영향을 미치지 않습니다.

2. **공간 복잡도**: O(n) - 쿼리 결과를 저장하기 위해 필요한 공간은 입력 데이터의 크기(n)에 비례합니다. 특히, GROUP BY 절에서 생성되는 중간 결과의 크기가 중요하며, 이는 사용자 수와 각 사용자의 프롬프트 수에 따라 달라집니다.

3. **풀이 접근법**: 이 쿼리는 집계 함수(COUNT, AVG)와 GROUP BY, HAVING 절을 사용하여 사용자별 프롬프트 수와 평균 토큰 수를 계산합니다. 이는 관계형 데이터베이스에서 집계 연산을 수행하는 표준적인 접근법입니다.

4. **잘된 점**: 쿼리는 간결하고 읽기 쉽습니다. 필요한 열만 선택하고, ROUND 함수를 사용하여 평균 토큰 수를 소수점 2자리까지 반올림하여 결과를 깔끔하게 표시합니다.

5. **개선 사항**: 쿼리 자체는 효율적이지만, prompts 테이블이 매우 크고 자주 조회된다면, user_id 열에 인덱스를 생성하여 GROUP BY 절의 성능을 개선할 수 있습니다. 또한, HAVING 절에서 사용하는 임계값(3)을 변수나 상수로 정의하여 쿼리를 더 유연하게 만들 수 있습니다.
