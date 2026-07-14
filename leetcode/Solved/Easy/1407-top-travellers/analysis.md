# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 14. 오후 5:11:40 |
| Language | oraclesql |
| Runtime | 262 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/top-travellers/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n log n)입니다. 여기서 n은 USERS 테이블과 RIDES 테이블의 행 수를 합친 것입니다. 이유는 GROUP BY 연산이 내부적으로 정렬을 수행하기 때문입니다.

2. **공간 복잡도**: O(n)입니다. 여기서 n은 USERS 테이블과 RIDES 테이블의 행 수를 합친 것입니다. 이유는 JOIN 연산 결과가 임시로 메모리에 저장되기 때문입니다.

3. **풀이 접근법**: 이 풀이는 JOIN과 GROUP BY를 사용하여 사용자별 총 거리를 계산합니다. 이는 관계형 데이터베이스에서 집계 연산을 수행하는 일반적인 패턴입니다.

4. **잘된 점**: 코드는 간결하고 읽기 쉽습니다. 또한, 필요한 열만 선택하여 데이터베이스의 부담을 줄이고 있습니다.

5. **개선 사항**: Explicit JOIN을 사용하여 코드를 더 읽기 쉽게 만들 수 있습니다. 또한, 테이블 별칭을 더 명확하게 사용할 수 있습니다. 예를 들어, 다음과 같이 수정할 수 있습니다.
```oraclesql
SELECT U.name
     , SUM(R.distance)
  FROM USERS U
  JOIN RIDES R ON U.id = R.user_id
 GROUP BY U.name
```
