# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오후 3:41:51 |
| Language | java |
| Runtime | 4 ms (Beats 0.0%) |
| Memory | 41.5 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/total-distance-traveled/submissions/)

## Code Review

**코드 리뷰**

---

### 1. 시간 복잡도  
**O(mainTank)**  

`while (mainTank >= 5)` 루프는 `mainTank`가 5씩 감소하면서 반복됩니다.  
`mainTank`가 초기값 `M`이라면 최대 `⌈M/5⌉` 번 반복되므로 선형 시간 복잡도를 가집니다.  
`additionalTank`의 크기는 루프 안에서 단순히 감소시키는 연산만 수행하므로 전체 복잡도에 영향을 주지 않습니다.

---

### 2. 공간 복잡도  
**O(1)**  

사용하는 변수는 `total`, `mainTank`, `additionalTank` 세 개뿐이며, 추가적인 배열이나 컬렉션을 만들지 않으므로 상수 공간만 사용합니다.

---

### 3. 풀이 접근법  
- **시뮬레이션**: 차가 5km당 연료 1리터를 소모한다는 규칙을 그대로 구현하고, 추가 연료통이 남아 있으면 매 5km마다 1리터를 보충하는 과정을 반복합니다.  
- **그리디**: 매 5km 구간마다 가능한 한 추가 연료통을 바로 사용해 연료를 최대한 유지하려는 전략을 취합니다.

---

### 4. 잘된 점  
1. **직관적인 구현** – 문제의 규칙을 그대로 코드에 옮겨 이해하기 쉽습니다.  
2. **정확한 결과 계산** – 루프 종료 후 남은 `mainTank`을 `total`에 더하고, 최종적으로 10을 곱해 km 단위로 변환하는 로직이 올바릅니다.  
3. **불필요한 메모리 할당이 없음** – 상수 공간만 사용해 메모리 효율이 높습니다.  

---

### 5. 개선 사항  
1. **불필요한 `Math.max` 제거**  
   ```java
   total += Math.max(mainTank, 5);
   ```
   여기서는 `mainTank`가 5 이상일 때만 루프에 들어가기 때문에 `Math.max(mainTank, 5)`는 언제나 `mainTank`와 동일합니다. `total += mainTank;` 로 바꾸면 가독성이 높아집니다.

2. **루프 조건 간소화**  
   현재 `while (mainTank >= 5)` 안에서 `mainTank = Math.max(0, mainTank - 5);` 를 수행하고 있습니다.  
   `mainTank`가 5 이상이므로 `Math.max` 호출이 필요 없으며, `mainTank -= 5;` 로 충분합니다.

3. **디버그 출력 제거**  
   `System.out.println` 은 테스트용이라면 좋지만, 실제 제출 코드에서는 성능 저하와 불필요한 I/O를 초래합니다. 제거하거나 주석 처리하세요.

4. **루프 대신 수학적 식 사용**  
   전체 이동 거리는  
   ```
   distance = (mainTank + additionalTank) * 10
   ```
   이때, 추가 연료통이 사용되는 횟수는 `min(additionalTank, mainTank / 5)` 로 구할 수 있습니다.  
   따라서 반복문 없이 한 줄로 계산이 가능합니다:
   ```java
   int usedAdditional = Math.min(additionalTank, mainTank / 5);
   int totalLiters = mainTank + usedAdditional;
   return totalLiters * 10;
   ```
   이렇게 하면 시간 복잡도를 **O(1)** 로 줄일 수 있습니다.

5. **변수명 개선**  
   `mainTank`와 `additionalTank`는 의미가 명확하지만, `total` 보다는 `totalLiters` 라는 이름이 더 직관적입니다.

---

**요약**  
현재 구현은 문제를 정확히 해결하지만, `Math.max`와 `while` 루프를 제거하고 수학적 계산으로 대체하면 **O(1)** 시간 복잡도로 최적화할 수 있습니다. 또한 디버그 출력과 불필요한 연산을 정리하면 코드 가독성과 실행 효율이 더욱 향상됩니다.
