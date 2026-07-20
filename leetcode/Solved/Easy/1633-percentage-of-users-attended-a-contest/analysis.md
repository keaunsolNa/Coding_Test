# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 21. 오전 8:39:01 |
| Language | oraclesql |
| Runtime | 261 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/percentage-of-users-attended-a-contest/submissions/)

## Code Review

코드 리뷰를 진행하겠습니다.

1. **시간 복잡도**: O(n) - 이 쿼리는 Users와 Register 테이블을 조인하고, 각 contest_id에 대한 사용자 수를 카운트합니다. 이 작업은 데이터의 크기에 비례하므로 시간 복잡도는 O(n)입니다.

2. **공간 복잡도**: O(n) - 쿼리 결과를 저장하기 위한 공간이 필요하며, 결과의 크기는 데이터의 크기에 비례하므로 공간 복잡도는 O(n)입니다.

3. **풀이 접근법**: 이 쿼리는 조인과 집계 함수를 사용하여 각 contest_id에 대한 사용자 수를 계산합니다. 사용된 알고리즘은 기본적인 관계형 데이터베이스 쿼리입니다.

4. **잘된 점**: 코드는 간결하고, 필요한 작업을 수행합니다. 특히, 필요한 테이블을 조인하고, 각 contest_id에 대한 사용자 수를 계산하는 부분이 잘 구현되어 있습니다.

5. **개선 사항**: 현재 쿼리는 Register 테이블의 모든 레코드를 Users 테이블과 조인합니다. 하지만, Register 테이블에 존재하지 않는 Users 테이블의 레코드는 결과에 포함되지 않습니다. 따라서, Register 테이블을 기준으로 조인하는 것이 더 효율적일 수 있습니다. 또한, COUNT(DISTINCT T1.user_id)와 COUNT(DISTINCT T2.user_id)를 사용하여 중복된 사용자 수를 제거할 수 있습니다.
