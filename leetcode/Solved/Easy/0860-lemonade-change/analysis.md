# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 24. 오전 10:11:15 |
| Language | java |
| Runtime | 4 ms (Beats 0.0%) |
| Memory | 42.9 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/lemonade-change/submissions/)

## Code Review

리뷰 대상 코드는 LeetCode의 lemonade-change 문제를 해결하는 자바 코드입니다. 

1. **시간 복잡도**: O(n) - 이 코드의 시간 복잡도는 입력 배열의 크기(n)와 동일합니다. 각 요소를 한 번씩만 반복하기 때문입니다.

2. **공간 복잡도**: O(1) - 공간 복잡도는 상수입니다. 입력 배열의 크기와 상관없이 charg 배열의 크기는 항상 3으로 고정되어 있기 때문입니다.

3. **풀이 접근법**: 이 코드는 Greedy 알고리즘을 사용합니다. 각 고객의 지불금액에 대해, 가능한 한 가장 큰 금액의 지폐를 사용하여 거스름돈을 계산합니다. 5달러와 10달러 지폐를 사용하여 20달러를 거스름돈으로 계산하는 로직이 구현되어 있습니다.

4. **잘된 점**: 코드는 문제를 명확하게 이해하고, Greedy 알고리즘을 적절히 적용하여 문제를 해결했습니다. 또한, charg 배열을 사용하여 각 금액의 지폐 개수를 효율적으로 관리하고 있습니다.

5. **개선 사항**: 코드는 대부분 잘 작동하지만, return 문이 반복문 안에 중복되어 있습니다. 이 부분을 개선하여 함수의 마지막 부분에 한 번만 return 문을 사용하는 것이 좋습니다. 또한, System.out.println 문은 디버깅 목적으로 사용되므로, 실제 제출 시에는 제거하는 것이 좋습니다. 다음과 같이 개선할 수 있습니다.

```java
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] charg = new int[] {0, 0, 0};

        for (int pay : bills) {
            switch (pay) {
                case 5 : charg[0]++; break;
                case 10 : 
                    if (charg[0] == 0) return false;
                    charg[1]++;
                    charg[0]--;
                    break;
                case 20 : 
                    if (charg[0] > 0 && charg[1] > 0) {
                        charg[0]--;
                        charg[1]--;
                        charg[2]++;
                    }
                    else if (charg[0] > 2) {
                        charg[0] -= 3;
                        charg[2]++;
                    }
                    else return false;
            }
        }   
        return true;
    }
}
```
