# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 5. 오후 5:43:58 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/submissions/)

## Code Review

리뷰 대상 코드는 LeetCode의 "number-of-steps-to-reduce-a-number-to-zero" 문제를 해결하기 위한 자바 솔루션입니다. 

1. **시간 복잡도**: 코드의 시간 복잡도는 O(log n)입니다. 이는 입력 숫자를 2로 나누거나 1을 빼는 연산을 반복적으로 수행하기 때문입니다. 그러나 주어진 코드에는 논리적 오류가 존재하여, 실제로 시간 복잡도는 O(1)로 수렴합니다. 이는 while문 조건이 `num == 0`으로 설정되어 있기 때문입니다. 따라서, 입력 숫자가 0이면 while문이 실행되지 않습니다.

2. **공간 복잡도**: 코드의 공간 복잡도는 O(1)입니다. 이는 코드에서 사용하는 변수의 개수가 입력 크기에 따라 변하지 않기 때문입니다.

3. **풀이 접근법**: 코드는 비트 조작과 반복문을 사용하여 숫자를 0으로 줄이는 단계 수를 계산하려고 합니다. 그러나 while문 조건이 잘못되어, 실제로 사용된 알고리즘은 제대로 작동하지 않습니다.

4. **잘된 점**: 코드는 변수를 명확하게 선언하고, 간단한 연산을 사용하여 읽기 쉽게 작성되었습니다. 그러나 while문 조건이 잘못되어, 코드가 제대로 작동하지 않습니다.

5. **개선 사항**: while문 조건을 `num > 0`으로 변경하여, 입력 숫자가 0보다 클 때만 반복문을 실행하도록 해야 합니다. 또한, 반복문 내에서 단계 수를 증가시키는 로직을 추가해야 합니다. 예를 들어, `ans++`를 추가하여 단계 수를 증가시킬 수 있습니다. 개선된 코드는 다음과 같습니다.
```java
class Solution {
    public int numberOfSteps(int num) {
        int ans = 0;
        while (num > 0) {
            if (num % 2 == 0) num /= 2;
            else num -= 1;
            ans++;
        }
        return ans;
    }
}
```
