# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오후 3:22:07 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.6 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/submissions/)

## Code Review

**1. 시간 복잡도**  
현재 구현은 `while (sandwichesStack.isEmpty())` 와 내부 `while (studentStack.isEmpty())` 로 이루어진 이중 루프를 사용하고 있습니다.  
- 외부 루프는 샌드위치가 모두 소진될 때까지 혹은 더 이상 변화가 없을 때까지 반복되므로 최악의 경우 `O(n²)` (n = 학생·샌드위치 수) 가 됩니다.  
- 실제로는 각 학생·샌드위치를 여러 번 검사하게 되므로, 입력이 1000 정도일 때도 비효율적입니다.  

**2. 공간 복잡도**  
- `studentStack`, `sandwichesStack`, `afterStack` 세 개의 `Stack<Integer>` 를 사용합니다. 각각 최대 `n` 개의 원소를 저장하므로 **O(n)** 의 추가 메모리를 사용합니다.  
- 불필요하게 두 개 이상의 스택을 유지하고 있어 메모리 사용량이 비효율적입니다.

**3. 풀이 접근법**  
- 스택을 이용해 학생 대기열과 샌드위치 순서를 뒤집어 저장한 뒤, 앞에서부터 일치 여부를 검사하고 일치하면 양쪽 모두 pop, 일치하지 않으면 학생을 `afterStack` 으로 옮겨 순환시키는 시뮬레이션 방식입니다.  
- 기본 아이디어는 “학생이 현재 샌드위치를 먹을 수 없으면 뒤로 보낸다” 를 구현하려는 것이지만, 스택을 사용하면서 `isEmpty()` 조건을 잘못 사용해 로직이 뒤바뀌었습니다.

**4. 잘된 점**  
- 문제를 시뮬레이션으로 풀겠다는 의도는 적절합니다.  
- `Stack` 자료구조를 활용해 LIFO가 아닌 FIFO처럼 동작하도록 직접 구현하려는 시도가 보입니다.  

**5. 개선 사항**  
1. **자료구조 교체**  
   - 학생 대기열은 `Queue<Integer>` (예: `ArrayDeque`) 로, 샌드위치 순서는 단순 배열 인덱스로 관리하면 충분합니다.  
   - 이렇게 하면 `pop`/`push` 대신 `poll`/`offer` 로 O(1) 연산이 보장됩니다.

2. **알고리즘 단순화**  
   - 실제로는 “학생이 현재 샌드위치를 먹을 수 없는 경우, 전체 학생이 한 번이라도 먹지 못하면 남은 학생 모두 못 먹는다” 라는 사실을 이용해 O(n) 로 해결할 수 있습니다.  
   - 구현 예시:  
     ```java
     public int countStudents(int[] students, int[] sandwiches) {
         int[] cnt = new int[2];          // cnt[0]=바라보는 학생 수(0), cnt[1]=1
         for (int s : students) cnt[s]++;

         int i = 0;                       // 샌드위치 인덱스
         while (i < sandwiches.length && cnt[sandwiches[i]] > 0) {
             cnt[sandwiches[i]]--;        // 해당 타입 학생 한 명 감소
             i++;
         }
         return students.length - i;     // 먹지 못한 학생 수
     }
     ```
   - 시간 복잡도 **O(n)**, 공간 복잡도 **O(1)** (고정 크기 배열) 로 최적화됩니다.

3. **버그 수정**  
   - 현재 `while (sandwichesStack.isEmpty())` 와 `while (studentStack.isEmpty())` 조건은 **반대로** 작성되어 있어 루프가 한 번도 실행되지 않습니다. `!isEmpty()` 로 바꿔야 합니다.  
   - `prevLength = afterStack.size();` 를 루프 시작 전에 초기화했지만, `afterStack` 은 매번 새로 만들기 때문에 `prevLength` 가 항상 0이 됩니다. 변화 감지를 위해서는 `studentStack.size()` 를 저장해야 합니다.

4. **불필요한 출력 제거**  
   - `System.out.println` 은 디버깅용이라면 주석 처리하거나 삭제하고, 최종 제출 코드에는 포함하지 않아야 합니다.

5. **코드 가독성**  
   - 변수명 `ans` 보다 `unableCount` 와 같이 의미를 명확히 하는 이름을 사용하고, 중괄호와 들여쓰기를 일관되게 유지하면 가독성이 향상됩니다.

**요약**  
현재 코드는 스택 사용과 `isEmpty()` 조건 오류로 인해 정상 동작하지 않으며, 시간·공간 복잡도가 비효율적입니다. `Queue` 혹은 단순 배열·카운트 방식으로 교체하면 O(n) 시간, O(1) 공간으로 깔끔하게 해결할 수 있습니다. 또한 버그를 수정하고 디버깅 출력을 제거하면 제출 가능한 코드가 됩니다.
