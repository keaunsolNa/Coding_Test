# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오후 3:23:20 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 41.8 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/submissions/)

## Code Review

**1. 시간 복잡도**  
- 현재 구현은 `while (!sandwichesStack.isEmpty())` 루프 안에서 학생 스택 전체를 매번 순회합니다. 최악의 경우 학생이 한 번도 먹지 못하고 모든 샌드위치를 확인할 때, 학생 수 `n`에 대해 `n`번의 외부 반복이 발생하므로 **O(n²)** 가 됩니다.  

**2. 공간 복잡도**  
- 입력 배열을 그대로 복사해 두 개의 `Stack<Integer>`와 중간에 사용하는 `afterStack`을 만들기 때문에 추가적인 메모리는 `O(n)` (학생 수와 샌드위치 수가 동일하다고 가정) 입니다.  

**3. 풀이 접근법**  
- 학생과 샌드위치를 각각 스택에 넣고, 현재 샌드위치와 앞에 있는 학생을 비교하면서 일치하면 둘 다 팝하고, 일치하지 않으면 학생을 `afterStack`에 옮겨 순서를 유지하려는 시뮬레이션 방식입니다.  
- 기본 아이디어는 “학생이 현재 샌드위치를 먹을 수 없으면 뒤로 넘긴다” 를 구현하려는 것이지만, 스택을 사용하면서 순환 구조를 직접 구현하지 않아 비효율적입니다.  

**4. 잘된 점**  
- 문제를 그대로 시뮬레이션하려는 의도가 명확합니다.  
- `Stack`을 이용해 `push`/`pop` 연산을 직관적으로 사용한 점은 이해하기 쉽습니다.  
- `continue` 로 조건을 분리해 흐름을 깔끔하게 만든 점도 긍정적입니다.  

**5. 개선 사항**  
1. **자료구조 교체**  
   - 스택 대신 `Queue<Integer>` (또는 `ArrayDeque`) 를 사용하면 학생들의 순환을 자연스럽게 구현할 수 있습니다.  
   - 큐에서는 `poll()` 로 앞 학생을 꺼내고, 먹지 못하면 `offer()` 로 뒤에 다시 넣으면 되므로 별도의 `afterStack`이 필요 없습니다.  

2. **시간 복잡도 최적화**  
   - 실제로는 학생들의 선호도가 0 또는 1 두 종류뿐이므로, 현재 남아있는 학생 중 해당 선호도를 가진 사람이 있는지만 확인하면 됩니다.  
   - 이를 위해 `int[] cnt = new int[2];` 로 0,1 학생 수를 미리 세고, 샌드위치가 현재 `type` 일 때 `cnt[type] > 0` 이면 `cnt[type]--` 하고 다음 샌드위치로 넘어갑니다.  
   - 이렇게 하면 **O(n)** 로 해결할 수 있습니다.  

3. **불필요한 출력 제거**  
   - 디버깅용 `System.out.println` 은 최종 제출 코드에 포함하면 시간 초과 혹은 출력 제한에 걸릴 수 있으니 삭제합니다.  

4. **루프 종료 조건 간소화**  
   - 현재 `prevLength == afterStack.size()` 로 종료를 판단하는데, 스택을 사용하면 이 조건이 의미가 모호합니다. 큐 기반 구현에서는 “학생이 현재 샌드위치를 먹을 수 없을 때 연속으로 n번 실패하면 종료” 라는 로직을 명확히 할 수 있습니다.  

5. **코드 가독성**  
   - 변수명을 `studentsQueue`, `sandwichesQueue` 와 같이 의미 있게 바꾸고, `while (!sandwichesQueue.isEmpty())` 내부 로직을 메서드로 분리하면 가독성이 향상됩니다.  

**예시 개선 코드 (O(n) 시간, O(1) 추가 공간)**  

```java
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] cnt = new int[2];               // 0, 1 학생 수
        for (int s : students) cnt[s]++;

        int i = 0;                            // 샌드위치 인덱스
        while (i < sandwiches.length && cnt[sandwiches[i]] > 0) {
            cnt[sandwiches[i]]--;             // 해당 선호도 학생 한 명 감소
            i++;
        }
        return sandwiches.length - i;        // 먹지 못한 학생 수
    }
}
```

위와 같이 구현하면 시간·공간 모두 최적화되며, 코드도 훨씬 간결해집니다.
