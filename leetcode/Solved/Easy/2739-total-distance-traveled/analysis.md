# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오후 3:41:27 |
| Language | java |
| Runtime | 3 ms (Beats 0.0%) |
| Memory | 42.4 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/total-distance-traveled/submissions/)

## Code Review

**1. 시간 복잡도**  
- 현재 구현은 `while (mainTank >= 5)` 루프 안에서 `mainTank`을 매 반복마다 최소 5씩 감소시킵니다. 따라서 반복 횟수는 `O(mainTank / 5) = O(mainTank)` 입니다. `mainTank`과 `additionalTank`의 크기에 비례하는 선형 시간 복잡도를 가집니다.  

**2. 공간 복잡도**  
- 사용되는 변수는 `total`, `mainTank`, `additionalTank` 등 상수 개수뿐이며, 추가적인 배열이나 컬렉션을 할당하지 않습니다. 따라서 **O(1)** (상수) 공간 복잡도입니다.  

**3. 풀이 접근법**  
- 문제는 “연료 1리터당 10km 이동”이라는 단순 시뮬레이션을 요구합니다.  
- 구현은 메인 탱크가 5리터 이상일 때마다 5리터를 소모하고, 추가 탱크가 남아 있으면 1리터를 메인 탱크에 보충하는 방식을 반복합니다.  
- 이는 “5리터를 소모하고 1리터를 보충한다 → 1km 추가 이동”이라는 규칙을 직접 시뮬레이션하는 **그리디 시뮬레이션** 접근법입니다.  

**4. 잘된 점**  
- 로직이 직관적이며, `Math.max`를 이용해 음수가 되지 않도록 방어적으로 구현한 점이 좋습니다.  
- `total`에 누적 거리를 바로 더하고, 마지막에 남은 연료를 한 번에 처리하는 흐름이 명확합니다.  
- 디버깅용 `System.out.println`을 넣어 진행 상황을 확인할 수 있게 한 점도 개발 단계에서는 유용합니다.  

**5. 개선 사항**  
1. **불필요한 `Math.max` 제거**  
   - `total += Math.max(mainTank, 5);`는 `mainTank >= 5` 조건이 이미 보장되므로 `Math.max`가 필요 없습니다. `total += 5;` 로 바꾸면 가독성이 높아집니다.  

2. **루프 조건 간소화**  
   - 현재 루프 안에서 `mainTank = Math.max(0, mainTank - 5);` 로 5를 차감하고 있는데, `mainTank >= 5` 조건이므로 `mainTank -= 5;` 로 충분합니다.  

3. **디버그 출력 제거**  
   - 실제 제출 코드에서는 `System.out.println`이 불필요하고 성능에 영향을 줄 수 있으니 삭제합니다.  

4. **수학적 공식 활용**  
   - 시뮬레이션 없이도 결과를 O(1) 시간에 구할 수 있습니다.  
     - 5리터당 1km 추가 이동(보충 포함) → 전체 이동 거리 = `mainTank * 10 + additionalTank * 10`?  
     - 실제 정답은 `10 * (mainTank + additionalTank)` 가 아니라, 보충이 가능한 횟수는 `min(additionalTank, mainTank / 5)` 이므로  
       ```
       int extra = Math.min(additionalTank, mainTank / 5);
       int distance = (mainTank + extra) * 10;
       ```  
     - 이렇게 하면 루프 없이 **O(1)** 로 해결할 수 있습니다.  

5. **메서드 시그니처와 변수명**  
   - `mainTank`와 `additionalTank`는 의미가 명확하지만, `totalDistance` 같은 반환값을 나타내는 변수명을 사용하면 가독성이 향상됩니다.  

**요약**  
현재 코드는 올바른 시뮬레이션을 구현했으며 시간·공간 복잡도도 만족합니다. 그러나 `Math.max`와 디버그 출력 등 불필요한 부분을 제거하고, 수학적 식을 이용하면 루프 없이 O(1) 시간에 해결할 수 있어 더욱 효율적인 구현이 가능합니다.
