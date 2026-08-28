# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오후 3:40:59 |
| Language | java |
| Runtime | 4 ms (Beats 0.0%) |
| Memory | 42.3 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/total-distance-traveled/submissions/)

## Code Review

**1. 시간 복잡도**  
- 현재 구현은 `while (mainTank >= 5)` 루프 안에서 `mainTank`을 매 반복마다 최소 5씩 감소시킵니다. 따라서 반복 횟수는 `O(mainTank / 5)`이며, 최악의 경우 `mainTank`이 `n`이라고 하면 **O(n)** 입니다. `additionalTank`의 크기는 루프 안에서 상수 시간 연산만 수행하므로 전체 시간 복잡도는 `O(mainTank)` 로 볼 수 있습니다.

**2. 공간 복잡도**  
- 사용되는 변수는 `total`, `mainTank`, `additionalTank` 등 몇 개의 정수형 변수뿐이며, 추가적인 자료구조를 사용하지 않습니다. 따라서 **O(1)** (상수) 공간 복잡도를 가집니다.

**3. 풀이 접근법**  
- 문제는 “연료 5리터당 10km 이동”이라는 규칙과, 추가 연료통을 1리터씩 보충할 수 있는 조건을 시뮬레이션하는 것입니다.  
- 구현은 매 5리터를 소모하면서 이동 거리를 누적하고, 남은 연료가 있을 경우 추가 연료통을 1리터씩 채워 넣는 **그리디 시뮬레이션** 방식입니다.

**4. 잘된 점**  
- 로직이 직관적이며, `mainTank`이 5 이상일 때만 반복하도록 조건을 명확히 잡아 무한 루프 위험을 방지했습니다.  
- `Math.max`를 사용해 음수가 되지 않도록 안전하게 처리한 점이 좋습니다.  
- `total * 10` 으로 최종 거리를 한 번에 변환해 반환하는 구조가 깔끔합니다.

**5. 개선 사항**  
1. **불필요한 `Math.max` 제거**  
   - `total += Math.max(mainTank, 5);` 에서 `mainTank`는 루프 시작 시 항상 `>=5`이므로 `Math.max`는 필요 없습니다. `total += 5;` 로 바꾸면 의미가 명확해지고 약간의 연산 비용을 절감할 수 있습니다.  

2. **루프 내부 로직 간소화**  
   - `mainTank = Math.max(0, mainTank - 5);` 역시 `mainTank -= 5;` 로 충분합니다. 루프 조건이 `mainTank >= 5`이므로 `mainTank`가 음수가 될 일은 없습니다.  

3. **디버그 출력 제거**  
   - `System.out.println` 은 테스트용이라면 괜찮지만, 실제 제출 코드에서는 불필요한 I/O 로 시간에 영향을 줄 수 있으니 삭제하는 것이 좋습니다.  

4. **수학적 공식 활용**  
   - 시뮬레이션 대신 수학적으로 계산할 수 있습니다.  
     - `total = mainTank * 10;` (기본 거리)  
     - 추가 연료통을 사용할 수 있는 횟수는 `min(additionalTank, mainTank / 5)` 이며, 각 1리터는 10km 를 추가합니다.  
     - 최종 거리 = `(mainTank + min(additionalTank, mainTank / 5)) * 10`  
   - 이렇게 하면 **O(1)** 시간으로 해결할 수 있어 더 효율적입니다.  

5. **메서드 시그니처와 변수명**  
   - `mainTank`와 `additionalTank`는 의미가 명확하지만, `totalDistance` 같은 변수명을 사용하면 가독성이 향상됩니다.  

**수정 예시 (수학적 접근)**  

```java
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int usableAdditional = Math.min(additionalTank, mainTank / 5);
        return (mainTank + usableAdditional) * 10;
    }
}
```

위와 같이 변경하면 코드가 간결해지고, 시간 복잡도는 **O(1)** 로 최적화됩니다. 기존 시뮬레이션 방식도 정답이지만, 위와 같은 개선을 통해 가독성과 성능을 동시에 높일 수 있습니다.
