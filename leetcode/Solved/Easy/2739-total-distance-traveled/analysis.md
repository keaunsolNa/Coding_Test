# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오후 3:41:15 |
| Language | java |
| Runtime | 4 ms (Beats 0.0%) |
| Memory | 42 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/total-distance-traveled/submissions/)

## Code Review

**1. 시간 복잡도**  
- 현재 구현은 `while (mainTank >= 5)` 루프 안에서 `mainTank`을 매 반복마다 최소 5씩 감소시키고, 추가 연료가 있을 경우 1을 다시 증가시킵니다.  
- 최악의 경우 `mainTank`이 5씩 감소하면서 추가 연료가 매번 사용될 때도 한 번의 반복당 `mainTank`은 실제로 4만큼 감소합니다. 따라서 반복 횟수는 `O(mainTank)`에 비례합니다.  
- 전체 시간 복잡도: **O(mainTank)** (입력 값에 선형).

**2. 공간 복잡도**  
- 사용되는 변수는 `total`, `mainTank`, `additionalTank` 등 상수 개수뿐이며, 추가적인 배열이나 컬렉션을 사용하지 않습니다.  
- 따라서 **O(1)** (상수 공간) 입니다.

**3. 풀이 접근법**  
- 문제는 “연료 5리터당 10km 이동”하고, 1리터를 추가 연료통에서 꺼내면 1km를 더 갈 수 있다는 규칙을 시뮬레이션하는 것입니다.  
- 구현은 **시뮬레이션** 방식으로, 매 5리터(또는 남은 연료가 5 이상)마다 이동 거리를 누적하고, 가능한 경우 추가 연료통에서 1리터를 주입해 바로 1km를 추가하는 로직을 반복합니다.  

**4. 잘된 점**  
- 로직을 직관적으로 구현해 흐름을 쉽게 파악할 수 있습니다.  
- `Math.max`를 사용해 음수가 되지 않도록 방어적인 코딩을 한 점이 좋습니다.  
- 디버깅용 `System.out.println`을 넣어 중간 상태를 확인하려는 시도가 보입니다(실제 제출 시 제거하면 됩니다).

**5. 개선 사항**  
1. **불필요한 `Math.max` 제거**  
   - `total += Math.max(mainTank, 5);`는 `mainTank`이 5 이상일 때 항상 `mainTank` 자체가 5 이상이므로 `Math.max`가 필요 없습니다. `total += 5;` 로 바꾸면 의미가 명확하고 연산도 약간 빨라집니다.  

2. **루프 조건 및 연산 간소화**  
   - 현재 `mainTank = Math.max(0, mainTank - 5);` 뒤에 바로 `if (additionalTank > 0) { mainTank++; ... }` 를 수행하면, 실제로 `mainTank`이 5 이하가 될 때도 1을 더해줄 수 있습니다.  
   - 이를 `while (mainTank > 0)` 로 바꾸고, 매 반복마다 `int use = Math.min(5, mainTank); total += use; mainTank -= use;` 로 처리하면 남은 연료가 5 미만일 때도 정확히 처리할 수 있습니다.  

3. **수학적 풀이 도입**  
   - 시뮬레이션 대신 **수학적 공식**을 이용하면 O(1) 시간에 해결할 수 있습니다.  
   - 기본 이동 거리: `total = mainTank * 10;`  
   - 추가 연료통을 사용할 수 있는 횟수는 `min(additionalTank, mainTank / 5)` (5리터당 1리터를 교환) 이므로 최종 거리는  
     `answer = (mainTank + min(additionalTank, mainTank / 5)) * 10;`  
   - 이렇게 하면 루프 없이 한 줄로 답을 구할 수 있어 성능이 크게 개선됩니다.  

4. **디버깅 출력 제거**  
   - `System.out.println`은 제출 코드에 남겨두면 시간 초과 혹은 불필요한 I/O 비용이 발생합니다. 반드시 제거하거나 `debug` 플래그로 제어하도록 수정하세요.  

5. **메서드 시그니처와 변수명**  
   - `mainTank`와 `additionalTank`는 의미가 명확하지만, `totalDistance` 같은 변수명을 사용하면 가독성이 더 높아집니다.  

**요약**  
현재 코드는 시뮬레이션으로 정확히 동작하지만, 불필요한 연산과 디버깅 출력이 존재합니다. `Math.max`를 제거하고 루프를 단순화하거나, 수학적 공식을 이용해 O(1) 시간으로 해결하는 것이 더 효율적입니다. 또한 디버깅 코드는 제출 전 반드시 삭제해야 합니다.
