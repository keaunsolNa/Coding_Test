# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오후 3:22:45 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.2 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/submissions/)

## Code Review

**1. 시간 복잡도**  
- 현재 구현은 `while (!sandwichesStack.isEmpty())` 루프 안에서 학생 스택 전체를 매번 순회합니다.  
- 최악의 경우 학생이 한 번도 먹지 못하고 모든 샌드위치를 검사하므로 `O(n²)` (n = 학생·샌드위치 수) 가 됩니다.  

**2. 공간 복잡도**  
- 입력 배열을 그대로 복사해 두 개의 `Stack<Integer>`와 매 반복마다 새로 만드는 `afterStack`을 사용합니다.  
- 총 사용 메모리는 `O(n)` (학생·샌드위치 수에 비례) 이지만, 불필요한 스택 3개가 동시에 존재합니다.

**3. 풀이 접근법**  
- 학생과 샌드위치를 각각 스택에 넣고, 현재 샌드위치와 앞에 있는 학생을 비교하면서 일치하면 둘 다 팝, 일치하지 않으면 학생을 `afterStack`에 옮겨 순서를 유지하려는 시뮬레이션 방식입니다.  
- “학생이 현재 샌드위치를 먹을 수 없으면 뒤로 돌아간다”는 규칙을 스택을 이용해 구현하려 했습니다.

**4. 잘된 점**  
- 문제를 그대로 시뮬레이션하려는 의도가 명확합니다.  
- `Stack`을 이용해 LIFO 구조를 직접 다루며 로직을 단계별로 나눠 구현한 점이 이해하기 쉽습니다.  
- 디버깅용 `System.out.println`을 넣어 진행 과정을 확인하려는 시도가 좋습니다.

**5. 개선 사항**  
1. **알고리즘 교체**  
   - 실제로는 학생들의 선호도(0,1)만 필요하므로 큐(또는 배열 인덱스)와 카운터만으로 `O(n)` 해결이 가능합니다.  
   - 두 종류(0,1)의 학생 수를 미리 세고, 현재 샌드위치가 해당 종류의 학생이 남아 있으면 바로 소모, 없으면 그 시점부터 남은 학생 수가 답이 됩니다.

2. **스택 사용 최소화**  
   - 현재 구현은 매 라운드마다 `afterStack`을 새로 만들고, `prevLength`와 `afterStack.size()`를 비교해 종료 조건을 판단하는데, 이는 불필요한 메모리 할당과 복사를 초래합니다.  
   - `Queue<Integer>`(또는 `ArrayDeque`)를 사용하면 `poll`/`offer` 로 순환시키면서 동일한 시뮬레이션을 할 수 있고, 스택을 두 번 복사할 필요가 없습니다.

3. **루프 종료 조건 간소화**  
   - `prevLength == afterStack.size()` 로 종료를 판단하는 대신, 현재 샌드위치를 먹을 수 있는 학생이 없을 때 바로 `break` 하면 됩니다.  
   - 즉, 한 라운드 동안 아무도 먹지 못하면 바로 종료하면 되므로 `ans` 를 증가시키는 위치와 의미도 재검토가 필요합니다.

4. **불필요한 출력 제거**  
   - `System.out.println` 은 채점 시 시간 초과와 출력 오염을 일으킬 수 있으니 제거하거나 디버깅용으로만 남겨야 합니다.

5. **리턴 로직 수정**  
   - 현재 `return sandwichesStack.isEmpty() ? 0 : ans;` 은 실제 정답과 다를 수 있습니다.  
   - 문제는 “먹지 못한 학생 수”를 반환해야 하므로, 남은 `studentStack`(또는 카운터)의 크기를 반환하도록 해야 합니다.

**예시 최적화 코드 (O(n) 시간, O(1) 추가 공간)**  

```java
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] cnt = new int[2];               // 0, 1 학생 수
        for (int s : students) cnt[s]++;

        int i = 0;                            // 샌드위치 인덱스
        while (i < sandwiches.length && cnt[sandwiches[i]] > 0) {
            cnt[sandwiches[i]]--;             // 해당 종류 학생 한 명 감소
            i++;
        }
        return students.length - i;          // 남은 학생 수
    }
}
```

위와 같이 구현하면 시간·공간 모두 최적화되며, 코드 가독성도 크게 향상됩니다.
