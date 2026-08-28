# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오후 3:39:48 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/total-distance-traveled/submissions/)

## Code Review

**1. 시간 복잡도**  
- **O(mainTank / 5)** 로, 메인 탱크가 5리터씩 감소하면서 반복문이 수행됩니다.  
- `mainTank` 은 최대 1000 정도(문제 제한)라 실제로는 상수에 가까운 시간 복잡도이지만, 입력값에 비례해 선형적으로 증가합니다.

**2. 공간 복잡도**  
- 사용하는 추가 메모리는 `total`, `mainTank`, `additionalTank` 등 몇 개의 정수형 변수뿐이므로 **O(1)** 입니다.  
- 재귀나 컬렉션을 사용하지 않아 메모리 사용량은 일정합니다.

**3. 풀이 접근법**  
- 매 5km(=5리터)마다 주행 거리를 누적하고, 남은 연료가 5리터 미만일 때는 5km를 그대로 더해주는 **시뮬레이션** 방식입니다.  
- 추가 탱크가 있을 경우 1리터를 메인 탱크에 보충해 주는 로직을 반복문 안에 포함시켰습니다.  
- 최종 결과를 10배(1리터당 10km) 해서 반환합니다.

**4. 잘된 점**  
- **가독성**: 변수명(`mainTank`, `additionalTank`, `total`)이 문제 상황을 직관적으로 나타냅니다.  
- **불필요한 자료구조 사용 회피**: 단순한 정수 연산만으로 해결해 메모리를 최소화했습니다.  
- **경계 처리**: `Math.max(0, mainTank - 5)` 로 음수가 되는 것을 방지하고, `additionalTank > 0` 조건을 명확히 체크했습니다.

**5. 개선 사항**  
1. **루프 조건 간소화**  
   - 현재 `while (mainTank != 0)` 은 `mainTank > 0` 로 바꾸면 의미가 더 명확합니다.  
2. **거리 누적 로직 최적화**  
   - `total += Math.max(mainTank, 5);` 은 `mainTank` 가 5 이상일 때는 `5`를, 그 이하일 때는 `mainTank` 자체를 더합니다.  
   - 이를 `int travel = Math.min(5, mainTank); total += travel;` 로 바꾸면 의도가 더 분명해지고, `Math.max` 호출을 피할 수 있습니다.  
3. **추가 탱크 보충 시점 명확화**  
   - 현재은 매 5km 주행 후 바로 보충하지만, 실제 문제에서는 1리터를 보충할 때마다 바로 10km를 더할 수 있습니다.  
   - 보충 로직을 `while (additionalTank > 0 && mainTank < 5) { mainTank++; additionalTank--; }` 와 같이 5리터가 채워질 때까지 반복하면 불필요한 반복을 줄일 수 있습니다.  
4. **수식 단순화**  
   - 최종 `return total * 10;` 대신, 매 단계에서 `total += travel * 10;` 로 바로 km 단위로 누적하면 중간에 곱셈을 한 번만 수행하게 되어 약간의 연산량을 절감할 수 있습니다.  

**예시 개선 코드 (간결화 버전)**  

```java
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int distance = 0;               // km 단위 누적
        while (mainTank > 0) {
            int travel = Math.min(5, mainTank);
            distance += travel * 10;    // 1리터당 10km
            mainTank -= travel;

            // 추가 탱크에서 1리터를 보충 (가능하면)
            if (additionalTank > 0) {
                mainTank++;            // 보충 후 바로 1리터 사용 가능
                additionalTank--;
            }
        }
        return distance;
    }
}
```

위와 같이 수정하면 로직 흐름이 더 명확해지고, `Math.max`/`Math.min` 호출 횟수를 최소화하면서도 동일한 결과를 얻을 수 있습니다.
