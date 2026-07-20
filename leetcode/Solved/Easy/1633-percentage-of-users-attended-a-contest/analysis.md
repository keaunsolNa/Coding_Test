# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 21. 오전 8:41:54 |
| Language | oraclesql |
| Runtime | 287 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/percentage-of-users-attended-a-contest/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 사용자와 등록 테이블을 조인하고, 사용자 수를 카운트하는 작업을 수행하므로, 전체 사용자 수에 비례하는 시간 복잡도를 가집니다. 여기서 n은 사용자 수를 의미합니다.

2. **공간 복잡도**: O(n) - 쿼리 결과를 임시로 저장하기 위해 사용되는 메모리 공간은 사용자 수에 비례하므로, 공간 복잡도도 O(n)입니다.

3. **풀이 접근법**: 이 쿼리는 공통 테이블 식 (CTE, Common Table Expression)을 사용하여 전체 사용자 수를 계산하고, 이를 등록 테이블과 조인하여 각 콘테스트의 사용자 참여율을 계산합니다. 이는 관계형 데이터베이스에서 데이터를 집계하고 조인하는 일반적인 패턴입니다.

4. **잘된 점**: 코드는 읽기 쉽고, 의미 있는 테이블 별칭을 사용하여 가독성을 높였습니다. 또한, 필요한 계산을 효율적으로 수행하는 방식으로 작성되어 있습니다.

5. **개선 사항**: 현재 쿼리는 등록 테이블과 사용자 테이블을 조인하여 사용자 수를 계산하고 있습니다. 하지만, 등록 테이블에서만 사용자 수를 계산하면 더 효율적일 수 있습니다. 또한, CTE 대신 서브쿼리를 사용하여 전체 사용자 수를 계산할 수 있습니다. 예를 들어, 다음과 같이 수정할 수 있습니다.
```oraclesql
SELECT T2.contest_id
     , ROUND(COUNT(T2.user_id) / (SELECT COUNT(DISTINCT user_id) FROM Users), 2) AS percentage
  FROM Register T2
 GROUP BY T2.contest_id
```
이 방식은 더 간결하고, 읽기 쉽습니다.
