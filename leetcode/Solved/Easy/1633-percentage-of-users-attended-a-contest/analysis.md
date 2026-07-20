# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 21. 오전 8:39:12 |
| Language | oraclesql |
| Runtime | 301 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/percentage-of-users-attended-a-contest/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 Users 테이블과 Register 테이블을 조인하여 데이터를 가져옵니다. 조인 연산의 시간 복잡도는 일반적으로 O(n)입니다. 여기서 n은 테이블에 있는 행의 수를 나타냅니다.

2. **공간 복잡도**: O(n) - 쿼리 결과를 저장하기 위한 공간이 필요합니다. 결과 집합의 크기는 입력 테이블의 크기와 비슷할 수 있으므로 공간 복잡도는 O(n)입니다.

3. **풀이 접근법**: 이 쿼리는 내부 조인(inner join)과 그룹화(group by)를 사용하여 각 contest_id에 해당하는 사용자 수를 계산합니다. 조인 연산은 두 테이블에서 공통된 user_id를 가진 행을 연결하여 새로운 결과 집합을 생성합니다. 그룹화 연산은 contest_id를 기준으로 결과 집합을 그룹화하여 각 그룹에 대한 사용자 수를 계산합니다.

4. **잘된 점**: 코드는 간결하고 읽기 쉽습니다. 필요한 테이블을 조인하여 데이터를 가져오고, 그룹화 연산을 사용하여 각 contest_id에 해당하는 사용자 수를 계산합니다.

5. **개선 사항**: 현재 쿼리는 COUNT(T1.user_id)와 COUNT(T2.user_id)를 모두 계산합니다. 그러나 Register 테이블에 있는 user_id는 이미 Users 테이블에 있는 user_id와 조인되어 있으므로, COUNT(T1.user_id)와 COUNT(T2.user_id)의 결과는 동일할 것입니다. 따라서 COUNT(T1.user_id) 또는 COUNT(T2.user_id) 중 하나만 계산하면 충분합니다. 또한, Register 테이블에 있는 contest_id가 NULL인 경우를 고려하여 쿼리를 수정할 필요가 있습니다. 예를 들어, 다음 쿼리와 같이 수정할 수 있습니다.
```oraclesql
SELECT T2.contest_id, COUNT(T1.user_id)
FROM Users T1
JOIN Register T2 ON T1.user_id = T2.user_id
GROUP BY T2.contest_id
```
