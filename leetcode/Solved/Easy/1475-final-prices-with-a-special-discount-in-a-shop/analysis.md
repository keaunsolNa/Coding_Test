# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 4. 오후 5:52:11 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.7 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 코드의 시간 복잡도는 O(n)입니다. prices 배열의 각 원소를 한 번씩 방문하기 때문입니다. prices 배열의 길이가 n이라고 가정할 때, 코드는 n번의 연산을 수행합니다.

2. **공간 복잡도**: O(n) - 이 코드의 공간 복잡도는 O(n)입니다. prices 배열의 길이와 동일한 길이의 ans 배열을 생성하기 때문입니다. 따라서 입력 크기에 비례하는 추가적인 메모리 공간을 사용합니다.

3. **풀이 접근법**: 이 코드는 단순한 반복문을 사용하여 각 가격에 대한 최종 가격을 계산합니다. 하지만 문제에서 요구하는대로 스택을 사용하여 해결하는 것이 더 적절한 접근법입니다. 스택을 사용하면 각 가격에 대한 최종 가격을 효율적으로 계산할 수 있습니다.

4. **잘된 점**: 코드는 간결하고 이해하기 쉽습니다. 각 가격에 대한 최종 가격을 계산하는 로직은 명확합니다.

5. **개선 사항**: 현재 코드는 문제에서 요구하는대로 스택을 사용하지 않습니다. 스택을 사용하여 최종 가격을 계산하면 더 효율적이고 확장성이 좋은 코드를 작성할 수 있습니다. 또한, 현재 코드는 각 가격에 대한 최종 가격을 계산할 때 오직 다음 가격만을 고려합니다. 하지만 문제에서는 각 가격에 대한 최종 가격을 계산할 때 이후의 모든 가격을 고려해야 합니다. 따라서 스택을 사용하여 이후의 모든 가격을 고려하는 코드를 작성해야 합니다. 예를 들어, 다음과 같은 코드를 작성할 수 있습니다.
```java
class Solution {
    public int[] finalPrices(int[] prices) {
        int[] ans = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                int index = stack.pop();
                ans[index] = prices[index] - prices[i];
            }
            stack.push(i);
        }
        
        for (int i = 0; i < prices.length; i++) {
            if (ans[i] == 0) {
                ans[i] = prices[i];
            }
        }
        
        return ans;
    }
}
```
