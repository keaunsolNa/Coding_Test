# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 24. 오전 10:02:23 |
| Language | java |
| Runtime | 2 ms (Beats 0.0%) |
| Memory | 42.9 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/lemonade-change/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 코드의 시간 복잡도는 입력 배열의 크기(n)와 동일합니다. 이유는 입력 배열의 각 원소를 한 번씩만 방문하기 때문입니다.

2. **공간 복잡도**: O(1) - 이 코드의 공간 복잡도는 상수입니다. 이유는 입력 배열을 제외하고 추가적인 공간을 사용하지 않기 때문입니다. 단, charg 변수를 사용하지만, 이는 상수 공간을 차지합니다.

3. **풀이 접근법**: 이 문제는 Greedy 알고리즘을 사용하여 해결할 수 있습니다. Greedy 알고리즘은 각 단계에서 최적의 선택을 하여 전체적으로 최적의 해를 찾는 알고리즘입니다. 이 문제에서는 5달러와 10달러를 사용하여 지불해야 하는 금액을 계산합니다. 5달러를 사용하여 10달러를 거스르는 경우와 10달러를 사용하여 20달러를 거스르는 경우를 고려하여 Greedy 알고리즘을 적용할 수 있습니다.

4. **잘된 점**: 이 코드는 문제를 해결하기 위해 필요한 로직을 간단하게 구현했습니다. 특히, charg 변수를 사용하여 5달러를 계산하는 부분이 간단명료합니다.

5. **개선 사항**: 이 코드는 5달러와 10달러를 사용하여 지불해야 하는 금액을 계산하는 부분에서 개선할 수 있습니다. 현재 코드에서는 charg 변수를 사용하여 5달러를 계산하지만, 10달러를 사용하여 20달러를 거스르는 경우를 고려하지 않습니다. 따라서, 5달러와 10달러를 별도로 계산하여 지불해야 하는 금액을 계산하는 것이 더 효율적입니다. 예를 들어, 5달러를 계산하는 변수와 10달러를 계산하는 변수를 별도로 사용할 수 있습니다. 또한, System.out.println문을 제거하여 코드를 더 깔끔하게 만들 수 있습니다. 

예를 들어, 다음과 같이 개선할 수 있습니다.
```java
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five == 0) return false;
                five--;
                ten++;
            } else {
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
```
