# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 24. 오전 10:02:52 |
| Language | java |
| Runtime | 2 ms (Beats 0.0%) |
| Memory | 42.8 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/lemonade-change/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 코드의 시간 복잡도는 입력 배열의 크기(n)에 비례합니다. 즉, 배열의 각 원소를 한 번씩만 방문하기 때문입니다.

2. **공간 복잡도**: O(1) - 이 코드의 공간 복잡도는 상수입니다. 입력 배열을 제외하고, 추가적인 공간을 사용하지 않기 때문입니다. 단, charg 변수를 사용하지만, 이는 상수 공간을 차지합니다.

3. **풀이 접근법**: 이 문제는 Greedy 알고리즘을 사용하여 해결할 수 있습니다. Greedy 알고리즘은 각 단계에서 최적의 선택을 하여 전체적으로 최적의 해를 찾는 방법입니다. 이 경우, 5달러와 10달러를 받았을 때, 5달러를 거스름돈으로 사용할 수 있는지 여부를 확인하여 최적의 선택을 합니다.

4. **잘된 점**: 이 코드는 Greedy 알고리즘을 사용하여 문제를 간단하게 해결했습니다. 또한, charg 변수를 사용하여 5달러의 개수를 효율적으로 관리했습니다.

5. **개선 사항**: 이 코드는 대부분 잘 작동하지만, 몇 가지 개선할 점이 있습니다. 예를 들어, charg 변수의 이름을 더 명확하게 변경할 수 있습니다. 또한, 20달러를 받았을 때의 처리가 누락되어 있습니다. 20달러를 받았을 때, 10달러와 5달러, 또는 5달러 3개를 사용하여 거스름돈을 줄 수 있습니다. 따라서, 이 경우를 추가로 처리해야 합니다. 또한, System.out.println 문은 제거하는 것이 좋습니다. 최종적으로, 코드를 더 명확하게 작성하기 위해 주석을 추가할 수 있습니다. 

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
