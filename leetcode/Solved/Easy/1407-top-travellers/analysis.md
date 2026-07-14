# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 14. 오후 5:12:22 |
| Language | oraclesql |
| Runtime | 265 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/top-travellers/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n log n)입니다. 여기서 n은 데이터의 개수를 나타냅니다. ORDER BY 절이 사용되기 때문에 데이터를 정렬하는 시간이 추가로 소요됩니다. 또한, GROUP BY 절이 사용되기 때문에 데이터를 그룹화하는 시간도 고려해야 합니다.

2. **공간 복잡도**: O(n)입니다. 여기서 n은 데이터의 개수를 나타냅니다. 데이터를 그룹화하고 정렬하기 위해 임시 테이블이 생성되기 때문에 추가적인 공간이 필요합니다.

3. **풀이 접근법**: 이 문제는 JOIN과 GROUP BY를 사용하여 해결했습니다. JOIN을 사용하여 두 테이블을 연결하고, GROUP BY를 사용하여 데이터를 그룹화했습니다. SUM 함수를 사용하여 각 그룹의 거리를 계산했습니다. 이 접근법은 문제를 간단하게 해결할 수 있지만, 대량의 데이터를 처리할 때는 성능이 저하될 수 있습니다.

4. **잘된 점**: 코드는 간단하고 이해하기 쉽습니다. 필요한 절과 함수를 사용하여 문제를 해결했습니다. 또한, ORDER BY 절을 사용하여 결과를 정렬했습니다.

5. **개선 사항**: JOIN을 Explicit JOIN으로 변경할 수 있습니다. Implicit JOIN은 가독성이 좋지 않기 때문에 Explicit JOIN을 사용하는 것이 좋습니다. 또한, 테이블의 인덱스를 생성하여 성능을 개선할 수 있습니다. 예를 들어, USER_ID 열에 인덱스를 생성하면 JOIN 연산의 성능을 개선할 수 있습니다. 최적화된 코드는 다음과 같습니다.

```oraclesql
SELECT T1.name
     , SUM(T2.distance)
  FROM USERS T1
  JOIN RIDES T2 ON T1.id = T2.user_id
 GROUP BY T1.name
 ORDER BY T1.name
```
