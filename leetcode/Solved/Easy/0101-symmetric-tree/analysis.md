# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 9. 2. 오후 11:32:50 |
| Language | java |
| Runtime | 0 ms (Beats 100.0%) |
| Memory | 43.4 MB (Beats 85.7%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/symmetric-tree/submissions/)

## Code Review

**1. 시간 복잡도**  
- **O(N)** : 트리의 모든 노드를 한 번씩 방문합니다. `isMirror`가 각 노드에 대해 한 번씩 재귀 호출되므로 노드 수를 N이라 할 때 선형 시간 복잡도를 가집니다.

**2. 공간 복잡도**  
- **O(H)** (최악 O(N)) : 재귀 호출 스택이 트리의 높이 H만큼 쌓입니다. 완전 균형 트리이면 H = log N, 한쪽으로 치우친 경우 H = N이 될 수 있습니다.

**3. 풀이 접근법**  
- **재귀적 대칭 검사**(Mirror Recursion) 패턴을 사용했습니다.  
  `isMirror(left, right)`가 두 서브트리가 서로 거울 대칭인지 확인하고, 좌·우 자식에 대해 교차 재귀 호출을 수행합니다. 이는 전형적인 DFS(깊이 우선 탐색) 방식입니다.

**4. 잘된 점**  
- **간결하고 직관적인 구현**: `if (leftNode == rightNode)` 로 두 노드가 모두 `null`인 경우를 한 줄로 처리해 가독성이 좋습니다.  
- **불필요한 변수 없이 바로 재귀 호출**하여 코드가 짧고 명확합니다.  
- **조건 검사 순서**가 효율적입니다. `null` 체크와 값 비교를 한 번에 수행해 불필요한 재귀 호출을 방지합니다.

**5. 개선 사항**  
1. **루트가 `null`인 경우 처리**  
   현재 `isSymmetric`에서 `root.left`와 `root.right`를 바로 넘기고 있기 때문에 `root`가 `null`이면 `NullPointerException`이 발생합니다.  
   ```java
   if (root == null) return true;
   return isMirror(root.left, root.right);
   ```
2. **재귀 깊이 제한**  
   매우 깊은 트리(예: 10⁵ 노드)에서는 스택 오버플로우 위험이 있습니다. 이를 방지하려면 **반복적 BFS**(큐 이용) 혹은 **명시적 스택**을 사용한 DFS로 구현할 수 있습니다.  
3. **메서드 접근 제한자**  
   `isMirror`는 구현 상세이므로 `private`가 맞지만, 테스트용으로 `static`으로 두면 재사용성이 높아집니다(필수는 아님).  
4. **주석 및 가독성**  
   간단한 메서드라 주석이 없어도 되지만, `isMirror`가 “좌·우 대칭을 검사한다”는 한 줄 설명을 추가하면 처음 보는 사람에게 도움이 됩니다.  

전반적으로 코드가 깔끔하고 요구사항을 정확히 만족합니다. 위의 작은 개선점을 반영하면 더욱 견고하고 확장 가능한 풀이가 됩니다.
