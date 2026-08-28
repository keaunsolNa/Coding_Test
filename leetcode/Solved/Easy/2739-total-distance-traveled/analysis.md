# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오후 3:42:48 |
| Language | java |
| Runtime | 4 ms (Beats 100.0%) |
| Memory | 46 MB (Beats 27.8%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/total-distance-traveled/submissions/)

## Code Review

**1. 시간 복잡도**  
- **O(mainTank)** : `while (mainTank >= 5)` 루프는 매 반복마다 `mainTank`을 최소 5씩 감소시키므로, 최악의 경우 `mainTank / 5` 번 반복한다. 따라서 전체 실행 시간은 `mainTank`에 비례한다. `additionalTank`는 루프 안에서 상수 시간 연산만 수행하므로 복잡도에 영향을 주지 않는다.

**2. 공간 복잡도**  
- **O(1)** : 사용되는 변수는 `total`, `mainTank`, `additionalTank` 등 몇 개에 불과하고, 추가적인 배열이나 컬렉션을 할당하지 않는다. 따라서 메모리 사용량은 입력 크기에 독립적이다.

**3. 풀이 접근법**  
- **시뮬레이션** : 자동차가 5리터당 50km(=10 * 5) 이동하고, 남은 연료가 5리터 미만이 될 때까지 반복한다. 매 5리터를 사용한 뒤 `additionalTank`가 남아 있으면 1리터를 보충하는 과정을 직접 구현했다. 즉, “5리터당 1리터를 추가로 채우는” 규칙을 그대로 시뮬레이션한다.

**4. 잘된 점**  
- **가독성**: 변수명(`mainTank`, `additionalTank`, `total`)이 문제 의미를 잘 전달한다.  
- **간결함**: 불필요한 자료구조 없이 기본 연산만으로 해결했다.  
- **경계 처리**: `while` 루프 종료 후 남은 `mainTank`을 `total`에 더해 최종 거리를 정확히 계산한다.  
- **안전한 연산**: `Math.max(0, mainTank - 5)` 로 음수가 되지 않게 방어적으로 처리했다.

**5. 개선 사항**  
1. **루프 횟수 최소화**  
   - 현재는 매 5리터마다 한 번씩 반복한다. 실제 이동 거리와 보충 횟수는 `mainTank`과 `additionalTank`의 비율에 따라 직접 계산할 수 있다.  
   - **수학적 접근**:  
     - `totalLiters = mainTank + min(additionalTank, (mainTank - 1) / 5)`  
       - `mainTank`을 5리터씩 소모하면서 매 5리터마다 `additionalTank`에서 1리터를 채우므로, 채울 수 있는 최대 횟수는 `(mainTank - 1) / 5` (정수 나눗셈)이다.  
     - 최종 거리 = `totalLiters * 10`  
   - 이렇게 하면 **O(1)** 시간으로 해결 가능한다.

2. **불필요한 `Math.min`/`Math.max` 제거**  
   - 루프 내부에서 `total += Math.min(mainTank, 5);` 대신 `total += 5;` 로 고정해도 된다. 루프 조건이 `mainTank >= 5` 이므로 `mainTank`이 5보다 작을 때는 루프에 들어오지 않는다.

3. **코드 스타일**  
   - 중괄호 `{}` 뒤에 공백을 두고, `if` 문 안의 블록을 한 줄로 쓰기보다 다음과 같이 정렬하면 가독성이 더 좋아진다.

```java
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int totalLiters = mainTank + Math.min(additionalTank, (mainTank - 1) / 5);
        return totalLiters * 10;
    }
}
```

위와 같이 수학적 식으로 변환하면 루프 없이 O(1) 시간·공간으로 문제를 해결할 수 있다. 기존 구현도 정확하지만, 최적화 여지가 충분히 존재한다.
