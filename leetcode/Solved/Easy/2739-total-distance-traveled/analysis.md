# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오후 3:40:40 |
| Language | java |
| Runtime | 4 ms (Beats 0.0%) |
| Memory | 42.2 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/total-distance-traveled/submissions/)

## Code Review

**1. 시간 복잡도**  
- 현재 구현은 `while (mainTank != 0)` 루프 안에서 `mainTank`을 매 반복마다 최소 5씩 감소시킵니다. 따라서 반복 횟수는 `⌈mainTank / 5⌉`에 비례합니다.  
- **시간 복잡도: O(mainTank / 5) = O(mainTank)**  

**2. 공간 복잡도**  
- 사용되는 변수는 `total`, `mainTank`, `additionalTank` 등 상수 개수뿐이며, 추가적인 자료구조를 할당하지 않습니다.  
- **공간 복잡도: O(1)**  

**3. 풀이 접근법**  
- 문제는 “연료 1리터당 10km 이동”하고, 5리터마다 추가 연료 1리터를 채울 수 있는 상황을 시뮬레이션하는 것입니다.  
- 구현은 매 5km(=5리터)마다 `mainTank`을 5 감소시키고, `additionalTank`가 남아 있으면 `mainTank`에 1을 보충하는 **그리디 시뮬레이션** 방식입니다.  

**4. 잘된 점**  
- 로직이 직관적이라 흐름을 이해하기 쉽습니다.  
- `Math.max`를 사용해 `mainTank`이 음수가 되는 것을 방지한 점이 안전합니다.  
- `additionalTank`가 남아 있을 때만 보충하도록 조건을 명확히 두어 오류 가능성을 줄였습니다.  

**5. 개선 사항**  
1. **불필요한 `Math.max` 제거**  
   - `mainTank`은 이미 `mainTank - 5` 이후 `Math.max(0, …)` 로 0 이하가 되지 않으므로 `total += Math.max(mainTank, 5);` 대신 `total += Math.min(mainTank, 5);` 혹은 `total += 5;` 로 바꾸면 더 명확합니다.  

2. **루프 조건 단순화**  
   - `while (mainTank > 0)` 로 바꾸면 `mainTank != 0` 보다 의미가 명확합니다.  

3. **시뮬레이션 대신 수식 활용**  
   - 전체 이동 거리는 `10 * (mainTank + additionalTank)` 가 아니라, `mainTank`가 5씩 감소하면서 추가 연료를 채우는 횟수를 미리 계산할 수 있습니다.  
   - 실제 이동 거리 = `10 * (mainTank + min(additionalTank, (mainTank + 4) / 5))` 로 O(1) 시간에 구할 수 있습니다.  

4. **디버그 출력 제거**  
   - `System.out.println`은 제출 코드에 남겨두면 시간 초과 혹은 불필요한 I/O 오버헤드를 초래합니다. 디버깅용이라면 주석 처리하거나 제거하세요.  

5. **메서드 시그니처와 변수명**  
   - `mainTank`와 `additionalTank`는 문제에서 제시된 이름과 일치하지만, `remainingMain`·`extra` 등 더 직관적인 이름을 고려해도 좋습니다.  

**수정 예시 (O(1) 풀이)**  

```java
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        // 5리터당 1리터를 추가로 채울 수 있는 횟수
        int refill = Math.min(additionalTank, (mainTank + 4) / 5);
        int totalLiters = mainTank + refill;
        return totalLiters * 10;
    }
}
```

위와 같이 수식으로 해결하면 시간·공간 모두 O(1)이며, 코드가 훨씬 간결해집니다. 기존 시뮬레이션 방식도 정확하지만, 최적화 여지가 충분히 존재합니다.
