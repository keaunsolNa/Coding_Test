# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026-04-26 23:23:21 |
| Language | java |
| Runtime | 2100 ms (Beats 28.9%) |
| Memory | 41.9 MB (Beats 90.5%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/perfect-number/submissions/)

## Code Review

코드 리뷰

1. **시간 복잡도**: 이 코드의 시간 복잡도는 O(n)입니다. num까지 반복문을 돌아서 num의約数들을 모두 체크하기 때문입니다. num이 클수록 시간이 오래 걸ﾘ며, 이는 효율적이지 못합니다.

2. **공간 복잡도**: 공간 복잡도는 O(1)입니다. 변수의 크기가 입력 크기에 따라 변하지 않으므로 상수 공간만을 사용합니다.

3. **풀이 접근법**: 이 코드는 완전검사를 통해 약수를 모두 찾는 브루트 포스 알고리즘을 사용합니다. 이는 간단하지만 효율적이지 못하여 큰 입력에 대해 사용하기 어렵습니다.

4. **잘된 점**: 코드는 간단하고 읽기 쉽습니다. 변수의 이름도 적절하여 코드의 의도를 쉽게 파악할 수 있습니다.

5. **개선 사항**: 약수를 모두 찾을 때 num의 제곱근까지만 찾으면 됩니다. 왜냐하면 num의 약수는 언제나 num의 제곱근을 기준으로 대칭이기 때문입니다. 따라서 반복문의 경계를 num의 제곱근으로 줄이면 시간 복잡도를 개선할 수 있습니다. 또한, num자신은 약수에서 제외해야 하므로 코드를 약간 수정해야 합니다. 

 예를 들어, 다음과 같이 코드를 개선할 수 있습니다.
```java
class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num < 2) return false;
        int sum = 1; // 1은 모든 수의 약수
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i * i != num) sum += num / i;
            }
        }
        return sum == num;
    }
}
```
