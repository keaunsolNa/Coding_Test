# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026-04-20 22:32:59 |
| Language | oraclesql |
| Runtime | 552 ms (Beats 71.0%) |
| Memory | 0B (Beats 100.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/customers-who-never-order/submissions/)

## Code Review

코드 리뷰 결과는 다음과 같습니다.

1. **시간 복잡도**: O(n^2) - 이 쿼리는 서브쿼리(Subquery)를 사용하여Customers 테이블의 각 레코드에 대해 Orders 테이블을 스캔합니다. 이로 인해 총 시간 복잡도가 O(n^2)으로 상당히 높아집니다.

2. **공간 복잡도**: O(1) - 쿼리는 추가적인 메모리 공간을 많이 사용하지 않습니다. 서브쿼리 결과를 임시로 저장할 공간이 필요할 수 있으나, 이는 상수 시간 복잡도에 해당합니다.

3. **풀이 접근법**: NOT IN 연산자를 사용한 서브쿼리 접근법 - 이 방법은 Customers 테이블의 각 레코드가 Orders 테이블에 존재하는지 확인합니다. 만약 존재하지 않는다면, 해당 고객을 결과에 포함합니다.

4. **잘된 점**: 쿼리가 간결하고 쉽게 이해할 수 있습니다. NOT IN 연산자를 사용하여 문제를 단순하게 해결했습니다.

5. **개선 사항**: EXISTS 또는 LEFT JOIN을 사용하여 쿼리를 개선할 수 있습니다. NOT IN 연산자는 NULL 값을 처리할 때 문제가 발생할 수 있고, EXISTS를 사용하면 이러한 문제를 피할 수 있습니다.또한, EXISTS는 인덱스를 사용하여 쿼리 성능을 개선할 수 있습니다.다음은 개선된 쿼리 예시입니다.
```oraclesql
SELECT T1.name Customers
FROM Customers T1
WHERE NOT EXISTS (SELECT 1
                    FROM Orders A
                    WHERE A.customerId = T1.id
)
```
