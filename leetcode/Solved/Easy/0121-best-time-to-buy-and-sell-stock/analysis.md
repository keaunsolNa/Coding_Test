# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 6. 17. 오후 8:56:47 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 41.7 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n^2) - 이중 반복문을 사용하여 각 요소에 대해 나머지 요소들을 모두 비교하기 때문에 시간 복잡도가 O(n^2)입니다. 이는 입력 크기가 커질수록 성능이 급격히 저하됩니다.

2. **공간 복잡도**: O(1) - 입력 배열을 제외하고 추가적인 공간을 사용하지 않기 때문에 공간 복잡도는 O(1)입니다. 이는 매우 효율적인 공간 사용을 의미합니다.

3. **풀이 접근법**: 브루트 포스 알고리즘 - 이중 반복문을 사용하여 모든 가능한 경우의 수를 체크하는 브루트 포스 알고리즘을 사용했습니다. 이는 간단한 문제에 적합하지만, 입력 크기가 커질수록 비효율적입니다.

4. **잘된 점**: 코드는 매우 간단하고 이해하기 쉽습니다. 변수 이름도 명확하여 코드의 의도를 쉽게 파악할 수 있습니다.

5. **개선 사항**: 현재 코드는 O(n^2)의 시간 복잡도를 가지고 있습니다. 이를 개선하기 위해 한 번의 반복만으로 최대 이익을 계산할 수 있는 방법을 사용할 수 있습니다. 예를 들어, 최소 가격을 계속 업데이트하면서 최대 이익을 계산할 수 있습니다. 이는 O(n)의 시간 복잡도를 가지며, 훨씬 더 효율적인 해결책입니다. 

```java
class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        
        int minPrice = prices[0];
        int maxProfit = 0;
        
        for (int i = 1; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        
        return maxProfit;
    }
}
```
