# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 9. 4. 오후 4:19:20 |
| Language | java |
| Runtime | 0 ms (Beats 100.0%) |
| Memory | 43.1 MB (Beats 93.4%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/count-hills-and-valleys-in-an-array/submissions/)

## Code Review

**1. 시간 복잡도**  
- **O(n)**  
  - `for` 루프가 배열을 한 번만 순회하고, 루프 내부 연산은 모두 상수 시간에 수행됩니다. 따라서 입력 길이 `n`에 대해 선형 시간 복잡도를 가집니다.

**2. 공간 복잡도**  
- **O(1)**  
  - 추가로 사용하는 변수는 `hillValleyCount`, `previousDistinctIndex` 두 개뿐이며, 입력 배열 외에 별도의 동적 메모리를 할당하지 않으므로 상수 공간을 사용합니다.

**3. 풀이 접근법**  
- **인접한 서로 다른 값만을 고려하는 스캔**  
  - 현재 원소 `nums[i]`와 바로 앞에 등장한 **다른** 값(`previousDistinctIndex`)을 비교하고, 다음 원소 `nums[i+1]`와도 비교합니다.  
  - `nums[i]`가 양쪽보다 크면 **hill**, 작으면 **valley** 로 판단해 카운트합니다.  
  - 연속된 같은 값은 건너뛰어( `continue` ) 중복 카운트를 방지합니다.

**4. 잘된 점**  
- **연속된 중복값을 건너뛰는 로직**이 간결하게 구현돼 있어, 불필요한 비교를 최소화했습니다.  
- 변수 이름(`hillValleyCount`, `previousDistinctIndex`)이 의미를 잘 전달하고 있어 가독성이 좋습니다.  
- 전체 로직이 한 번의 선형 스캔으로 해결돼 효율적입니다.

**5. 개선 사항**  
1. **경계 조건 보강**  
   - 현재 `previousDistinctIndex`를 `0`으로 초기화하고 바로 `i = 1`부터 시작하지만, `nums[0]`와 `nums[1]`이 같은 경우 `previousDistinctIndex`가 여전히 `0`인 상태에서 `i = 2`에서 비교가 이루어집니다.  
   - `previousDistinctIndex`를 실제로 **다른 값**을 가리키도록 초기화하는 것이 안전합니다. 예:  
     ```java
     int previousDistinctIndex = 0;
     while (previousDistinctIndex + 1 < nums.length && nums[previousDistinctIndex] == nums[previousDistinctIndex + 1]) {
         previousDistinctIndex++;
     }
     ```
2. **불필요한 `continue` 제거**  
   - `if (nums[i] == nums[i + 1]) continue;` 로 건너뛰면 `previousDistinctIndex`가 업데이트되지 않아, 같은 값이 연속으로 여러 번 나타날 때 `previousDistinctIndex`가 오래된 인덱스를 가리키게 됩니다.  
   - 대신 `if (nums[i] == nums[i + 1]) { continue; }` 뒤에 `previousDistinctIndex = i;` 를 **조건부**로 수행하거나, `continue` 대신 `i++` 로 건너뛰는 로직을 명시적으로 작성하면 더 명확합니다.

3. **코드 간결화**  
   - `if`‑`else if` 구조를 사용해 hill / valley 판단을 하나의 조건문으로 합칠 수 있습니다.  
     ```java
     if ((nums[i] > nums[previousDistinctIndex] && nums[i] > nums[i + 1]) ||
         (nums[i] < nums[previousDistinctIndex] && nums[i] < nums[i + 1])) {
         hillValleyCount++;
     }
     ```
4. **테스트 커버리지**  
   - 모든 원소가 같은 경우, 배열 길이가 2 이하인 경우 등 경계 테스트가 누락될 수 있습니다. LeetCode에서는 입력 길이가 최소 3이라고 보장하지만, 방어적인 코드를 추가하면 더 견고합니다.

**수정 예시 (위 개선 사항 반영)**  

```java
class Solution {
    public int countHillValley(int[] nums) {
        if (nums.length < 3) return 0;

        int count = 0;
        int prev = 0;

        // prev를 실제로 다른 값이 있는 인덱스로 맞춤
        while (prev + 1 < nums.length && nums[prev] == nums[prev + 1]) {
            prev++;
        }

        for (int i = prev + 1; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) continue;

            if ((nums[i] > nums[prev] && nums[i] > nums[i + 1]) ||
                (nums[i] < nums[prev] && nums[i] < nums[i + 1])) {
                count++;
            }
            prev = i;
        }
        return count;
    }
}
```

위와 같이 경계 처리를 보강하고 조건문을 간소화하면 가독성과 안정성이 향상됩니다. 전체적인 알고리즘 자체는 최적이며, O(n) 시간·O(1) 공간이라는 좋은 복잡도를 유지합니다.
