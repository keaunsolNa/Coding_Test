# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오후 3:42:38 |
| Language | java |
| Runtime | 3 ms (Beats 0.0%) |
| Memory | 42.4 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/total-distance-traveled/submissions/)

## Code Review

**코드 리뷰 (한국어)**  

---

### 1. 시간 복잡도  
- **O(mainTank)**  
  - `while (mainTank >= 5)` 루프는 `mainTank`가 5씩 감소하면서 반복됩니다.  
  - 매 반복마다 `mainTank`는 최소 4(5 감소 후 추가 탱크가 있으면 +1) 혹은 5만큼 감소하므로, 전체 반복 횟수는 `mainTank / 5` 정도가 됩니다. 따라서 입력값 `mainTank`에 비례하는 선형 시간 복잡도를 가집니다.  

### 2. 공간 복잡도  
- **O(1)**  
  - 사용되는 변수는 `total`, `mainTank`, `additionalTank` 등 상수 개수뿐이며, 추가적인 배열이나 컬렉션을 할당하지 않으므로 메모리 사용량은 입력 크기에 독립적입니다.  

### 3. 풀이 접근법  
- **시뮬레이션**  
  - 자동차가 5리터당 10km를 이동한다는 규칙을 그대로 구현했습니다.  
  - 매 5리터를 사용한 뒤, 추가 탱크가 남아 있으면 1리터를 메인 탱크에 보충하는 과정을 반복합니다.  
  - 최종적으로 남은 연료(`mainTank`)를 그대로 거리로 환산하고, 10을 곱해 최종 거리를 반환합니다.  

### 4. 잘된 점  
1. **알고리즘이 직관적** – 문제의 규칙을 그대로 시뮬레이션해서 구현했기 때문에 이해하기 쉽습니다.  
2. **변수 명명** – `mainTank`, `additionalTank`, `total` 등 변수명이 의미를 잘 전달합니다.  
3. **경계 처리** – `while` 루프 종료 후 남은 연료를 `total`에 더하는 로직이 정확합니다.  

### 5. 개선 사항  
1. **불필요한 `System.out.println` 제거**  
   - 디버깅용 출력은 실제 제출 코드에 포함될 필요가 없습니다. 성능에 미미한 영향을 주지만, LeetCode에서는 출력이 오히려 오답으로 처리될 수 있습니다.  

2. **루프 조건 및 연산 간소화**  
   - 현재 `total += Math.min(mainTank, 5);` 와 `mainTank = Math.max(0, mainTank - 5);` 를 매번 수행하고 있습니다.  
   - `mainTank`가 5 이상이라는 조건이 이미 보장되므로 `Math.min`·`Math.max` 대신 단순히 `total += 5; mainTank -= 5;` 로 바꾸면 가독성이 높아지고 약간의 연산 오버헤드를 줄일 수 있습니다.  

3. **루프 대신 수식 활용**  
   - 실제로는 `mainTank`와 `additionalTank`를 이용해 몇 번의 5리터 구간을 만들 수 있는지 계산할 수 있습니다.  
   - `int trips = mainTank / 5;`  
   - `int extra = Math.min(trips, additionalTank);` // 추가 탱크를 이용해 보충 가능한 횟수  
   - `int distance = (mainTank + extra) * 2;` // 1리터당 2km (10km/5L)  
   - 최종 반환값은 `distance * 5` 혹은 `distance * 10` 형태가 됩니다.  
   - 이렇게 하면 O(1) 시간으로 해결할 수 있어 더 효율적입니다.  

4. **변수 타입**  
   - 반환값이 `int`이지만 `mainTank`와 `additionalTank`가 매우 큰 경우(예: 10^9) `total * 10`이 `int` 범위를 초과할 수 있습니다. 안전을 위해 `long`을 사용하고, 최종 결과를 `int`로 캐스팅하거나 문제 제한을 확인하는 것이 좋습니다.  

---

**요약**  
현재 구현은 문제를 정확히 시뮬레이션하고 있어 올바른 결과를 도출합니다. 다만 디버깅 출력 제거, 연산 간소화, 혹은 수학적 접근을 통한 O(1) 해결법을 적용하면 코드가 더 깔끔하고 효율적이 됩니다. 필요에 따라 `long` 타입을 고려하면 오버플로 위험도 방지할 수 있습니다.
