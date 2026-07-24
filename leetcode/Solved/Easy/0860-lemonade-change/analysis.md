# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 24. 오전 10:03:50 |
| Language | java |
| Runtime | 2 ms (Beats 0.0%) |
| Memory | 42.8 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/lemonade-change/submissions/)

## Code Review

리뷰 대상 코드는 LeetCode의 lemonade-change 문제를 해결하는 자바 코드입니다. 

1. **시간 복잡도**: O(n) - 이 코드의 시간 복잡도는 입력 배열의 크기(n)에 비례합니다. 코드는 각 요소에 대해 단 한번씩 반복문을 수행하기 때문입니다.

2. **공간 복잡도**: O(1) - 이 코드의 공간 복잡도는 상수입니다. 입력 배열을 제외하고, 추가적인 공간을 사용하지 않기 때문입니다. 변수 `charg`는 상수 공간을 차지합니다.

3. **풀이 접근법**: 이 코드는 Greedy 알고리즘을 사용하여 문제를 해결합니다. 각 고객의 지불금액을 처리할 때, 이전에 받은 금액을 사용하여 현재 고객의 금액을 처리하는 방식입니다. 하지만, 현재 코드는 5달러와 10달러, 20달러를 처리하는 로직이 제대로 구현되지 않았습니다. 예를 들어, 10달러를 처리할 때는 5달러를 하나 사용하고, 20달러를 처리할 때는 10달러와 5달러를 사용하거나, 15달러를 사용하여 처리해야 합니다.

4. **잘된 점**: 코드는 간단하고, 읽기 쉽습니다. 변수명이 직관적이기 때문에 코드의 의도를 쉽게 이해할 수 있습니다.

5. **개선 사항**: 현재 코드는 문제를 완전히 해결하지 못합니다. 5달러, 10달러, 20달러를 처리하는 로직을 수정해야 합니다. 예를 들어, 10달러를 처리할 때는 5달러가 하나 이상 있는지 확인해야 합니다. 20달러를 처리할 때는 10달러와 5달러가 있는지, 또는 15달러가 있는지 확인해야 합니다. 또한, 불필요한 `System.out.println` 문을 제거하여 코드를 더 효율적으로 만들 수 있습니다. 

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
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
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
