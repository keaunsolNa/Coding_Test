# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오후 3:21:25 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 41.6 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/submissions/)

## Code Review

**1. 시간 복잡도**  
- 현재 구현은 `while (sandwichesStack.isEmpty())` 라는 조건이 잘못되어 무한 루프에 빠질 가능성이 높습니다. (조건이 `!sandwichesStack.isEmpty()` 이어야 함)  
- 가정대로 수정한다면, 내부에서 `studentStack` 전체를 매번 순회하면서 `afterStack`에 학생을 옮깁니다. 최악의 경우 학생이 한 번도 먹지 못하고 매 사이드마다 전체 학생을 한 번씩 검사하므로 **O(N²)** (N = 학생 수) 가 됩니다.  

**2. 공간 복잡도**  
- 입력 배열 외에 `studentStack`, `sandwichesStack`, `afterStack` 세 개의 스택을 사용합니다. 각각 최대 N개의 원소를 담을 수 있으므로 **O(N)** 의 추가 메모리를 사용합니다.  

**3. 풀이 접근법**  
- 학생과 샌드위치를 각각 스택에 넣고, 현재 샌드위치와 맞는 학생이 나올 때까지 학생 스택을 순회하며 뒤로 넘기는 시뮬레이션을 시도했습니다.  
- 기본 아이디어는 “앞에서부터 차례대로 확인하고, 먹지 못하면 뒤로 보낸다”는 **큐/스택 시뮬레이션** 방식이지만, 스택을 사용하면서 순서를 뒤집고 다시 뒤집는 비효율적인 구현이 있습니다.  

**4. 잘된 점**  
- 문제를 시뮬레이션으로 접근하려는 의도는 옳습니다.  
- `Stack` 자료구조를 활용해 `push`/`pop` 연산을 명시적으로 사용한 점은 이해를 돕습니다.  

**5. 개선 사항**  
1. **자료구조 선택**  
   - 학생들의 순서는 앞에서부터 확인하고 뒤로 보내는 것이므로 **Queue**(예: `ArrayDeque`)가 적합합니다.  
   - 샌드위치는 순서대로 꺼내면 되므로 배열 인덱스를 그대로 사용하면 충분합니다.

2. **알고리즘 단순화**  
   - 실제로는 “학생이 현재 샌드위치를 먹을 수 있는지”만 확인하면 됩니다.  
   - 학생이 현재 샌드위치를 먹지 못하면 큐의 뒤로 보낼 뿐, 전체를 다시 스캔할 필요가 없습니다.  
   - 최악의 경우 모든 학생이 현재 샌드위치를 먹지 못하면, 그때는 더 이상 진행이 불가능하므로 바로 종료할 수 있습니다.  

3. **시간 복잡도 개선**  
   - 위와 같이 큐와 인덱스를 사용하면 각 학생은 최대 한 번씩만 큐에서 꺼내지고, 각 샌드위치는 한 번씩만 처리되므로 **O(N)** 시간에 해결됩니다.

4. **코드 오류 수정**  
   - `while (sandwichesStack.isEmpty())` → `while (!sandwichesStack.isEmpty())` 로 조건을 바꿔야 합니다.  
   - `while (studentStack.isEmpty())` 도 `while (!studentStack.isEmpty())` 로 수정해야 합니다.  
   - `prevLength = afterStack.size();` 를 루프 시작 전에 초기화하고, `afterStack`을 매번 새로 만들 필요 없이 기존 큐를 재사용하거나, `int unchanged = 0;` 로 현재 라운드에서 아무도 먹지 않았는지 판단하면 됩니다.

5. **예시 개선 코드 (Java)**  

```java
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Deque<Integer> q = new ArrayDeque<>();
        for (int s : students) q.offer(s);

        int idx = 0;                     // 현재 샌드위치 인덱스
        int failCnt = 0;                 // 현재 라운드에서 먹지 못한 학생 수

        while (!q.isEmpty() && idx < sandwiches.length) {
            if (q.peek() == sandwiches[idx]) {   // 앞학생이 현재 샌드위치를 먹을 수 있음
                q.poll();                        // 학생과 샌드위치 모두 제거
                idx++;
                failCnt = 0;                     // 성공했으니 실패 카운트 초기화
            } else {
                q.offer(q.poll());               // 뒤로 보냄
                failCnt++;
                // 한 라운드에서 모든 학생이 먹지 못하면 종료
                if (failCnt == q.size()) break;
            }
        }
        return q.size();   // 먹지 못한 학생 수
    }
}
```

- 위 구현은 **O(N)** 시간, **O(N)** 공간이며, 가독성도 높고 버그 위험이 적습니다.  
- 기존 코드에서 스택을 남발하고 불필요한 복사를 하는 부분을 제거하고, 핵심 로직을 명확히 함으로써 성능과 유지보수성을 크게 향상시킬 수 있습니다.
