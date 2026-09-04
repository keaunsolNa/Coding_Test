# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 9. 4. 오후 12:32:27 |
| Language | java |
| Runtime | 0 ms (Beats 100.0%) |
| Memory | 42.1 MB (Beats 46.7%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/calculate-money-in-leetcode-bank/submissions/)

## Code Review

**1. 시간 복잡도**  
- **O(n)** : 현재 구현은 `quotient`(= n/7) 만큼 첫 번째 `for` 루프를 돌고, `remainder`(= n%7) 만큼 두 번째 `for` 루프를 돕니다. 최악의 경우 `quotient ≈ n/7` 이므로 전체 반복 횟수는 `O(n)` 입니다.  

**2. 공간 복잡도**  
- **O(1)** : 추가적인 배열이나 컬렉션을 사용하지 않으며, 몇 개의 정수 변수만 사용합니다. 따라서 상수 공간만 차지합니다.  

**3. 풀이 접근법**  
- 문제는 1주일(7일)마다 입금액이 1씩 증가하는 패턴을 이용해 총합을 구하는 것입니다.  
- `quotient`는 완전한 주(7일) 수, `remainder`는 마지막 주의 남은 일수를 나타냅니다.  
- 첫 번째 루프는 각 완전한 주마다 첫 날 입금액이 `quotient` 만큼 증가하는 누적값을 더하고, 두 번째 루프는 남은 일수에 대해 해당 주의 첫 날 입금액(`quotient+1`)부터 차례대로 더합니다.  

**4. 잘된 점**  
- 문제의 수학적 규칙을 정확히 파악하고 `quotient`와 `remainder`를 활용한 구조가 명확합니다.  
- 불필요한 배열이나 복잡한 연산 없이 간단한 정수 연산만으로 풀이를 구현했습니다.  
- 변수 이름(`quotient`, `remainder`, `ans`)이 의미를 잘 전달합니다.  

**5. 개선 사항**  
- 현재는 두 개의 `for` 루프를 사용해 `O(n)` 시간 복잡도를 갖지만, 실제로는 **수학적 등차수열** 공식을 이용해 **O(1)** 로 최적화할 수 있습니다.  
  - 완전한 주의 합: `28 * quotient + 7 * (quotient * (quotient - 1) / 2)`  
    - 여기서 `28 * quotient` 은 각 주의 기본 1~7일 합(28)이고, `7 * (quotient * (quotient - 1) / 2)` 은 주마다 첫 날이 1씩 증가하면서 발생하는 추가 합입니다.  
  - 남은 일수의 합: `remainder * (quotient + 1) + (remainder * (remainder - 1) / 2)`  
    - 첫 날 입금액은 `quotient + 1` 이고, 이후 하루씩 증가하므로 등차수열 합을 바로 계산합니다.  
- 위 공식을 적용하면 루프 없이 한 줄로 결과를 구할 수 있어 실행 속도가 크게 개선됩니다.  

**예시 개선 코드 (O(1) 버전)**  

```java
class Solution {
    public int totalMoney(int n) {
        int weeks = n / 7;
        int days  = n % 7;

        // 완전한 주의 합
        int sumWeeks = 28 * weeks + 7 * weeks * (weeks - 1) / 2;
        // 남은 일수의 합
        int sumDays  = days * (weeks + 1) + days * (days - 1) / 2;

        return sumWeeks + sumDays;
    }
}
```

- 이렇게 하면 시간 복잡도는 **O(1)**, 공간 복잡도는 그대로 **O(1)** 이 됩니다.  
- 코드 가독성도 유지하면서 성능을 크게 향상시킬 수 있습니다.
