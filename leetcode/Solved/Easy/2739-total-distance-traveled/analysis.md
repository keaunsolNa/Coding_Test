# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오후 3:42:02 |
| Language | java |
| Runtime | 5 ms (Beats 0.0%) |
| Memory | 41.9 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/total-distance-traveled/submissions/)

## Code Review

**1. 시간 복잡도**  
- **O(mainTank)** : `while (mainTank >= 5)` 루프가 `mainTank`가 5 이하가 될 때까지 매 반복마다 `mainTank`를 최소 5씩 감소시키므로, 최악의 경우 `mainTank / 5` 번 반복한다. 이는 `mainTank`에 비례하는 선형 시간 복잡도이다.  

**2. 공간 복잡도**  
- **O(1)** : 추가적인 배열이나 컬렉션을 사용하지 않으며, 몇 개의 정수 변수(`total`, `mainTank`, `additionalTank`)만 사용한다. 따라서 상수 공간 복잡도를 가진다.  

**3. 풀이 접근법**  
- **시뮬레이션** : 매 5km(=5 단위)마다 연료 1리터를 소모하고, 추가 탱크가 남아 있으면 1리터를 메인 탱크에 보충하는 과정을 직접 구현한다. `total`에 이동한 거리(단위는 10km) 를 누적하고, 마지막에 10을 곱해 최종 거리를 반환한다.  

**4. 잘된 점**  
- **명확한 로직** : 연료 소모와 보충 과정을 순차적으로 구현해 흐름이 직관적이다.  
- **상수 공간 사용** : 불필요한 자료구조를 사용하지 않아 메모리 효율이 좋다.  
- **Math.max 활용** : `mainTank`가 5보다 작을 때도 `Math.max(mainTank,5)` 로 안전하게 처리하려는 의도가 보인다.  

**5. 개선 사항**  
1. **불필요한 `Math.max` 제거**  
   - 루프 조건이 `mainTank >= 5` 이므로 `total += Math.max(mainTank, 5);` 은 언제나 `5`와 동일하다. `total += 5;` 로 바꾸면 가독성이 높아지고 연산도 약간 감소한다.  

2. **루프 종료 후 남은 연료 처리**  
   - 현재 구현은 `mainTank`가 5 미만이 되면 루프를 종료한다. 실제 문제에서는 남은 연료가 1~4리터일 때도 10km씩 이동할 수 있다(예: 1리터당 10km). 따라서 루프 종료 후 `total += mainTank;` (또는 `total += mainTank * 10;` 전 단계) 를 추가해야 정확한 거리 계산이 가능하다.  

3. **디버그 출력 제거**  
   - `System.out.println` 은 테스트용이라면 좋지만, 제출 코드에서는 불필요한 I/O 로 시간에 영향을 줄 수 있다. 제거하거나 주석 처리한다.  

4. **변수명 개선**  
   - `total` 은 “이동한 거리(단위 10km)” 라는 의미가 모호하므로 `distanceUnits` 혹은 `segments` 와 같이 의미를 명확히 하는 이름이 좋다.  

5. **수학적 풀이 대안**  
   - 시뮬레이션 대신 **수식** 으로도 해결 가능하다.  
     - 메인 탱크가 5리터씩 소모될 때마다 추가 탱크가 1리터 보충되므로, 실제 소모되는 메인 탱크는 `mainTank + min(additionalTank, mainTank/5)` 이다.  
     - 최종 이동 거리 = `(mainTank + min(additionalTank, mainTank/5)) * 10`  
   - 이렇게 하면 루프 없이 **O(1)** 시간에 답을 구할 수 있다.  

**요약**  
현재 코드는 시뮬레이션 방식으로 정확히 동작하지만, `Math.max` 사용과 루프 종료 후 남은 연료 처리, 디버그 출력 등 개선할 부분이 있다. 또한 수학적 식을 이용하면 더 간결하고 O(1) 시간에 해결할 수 있다. 코드를 정리하고 위의 개선점을 반영하면 가독성·성능 모두 향상될 것이다.
