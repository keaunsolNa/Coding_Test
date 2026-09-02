# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 9. 2. 오후 11:32:24 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.8 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/symmetric-tree/submissions/)

## Code Review

**1. 시간 복잡도**  
- **O(N)** : 트리의 모든 노드를 한 번씩 방문합니다. `isMirror`가 재귀적으로 좌·우 서브트리를 동시에 탐색하므로, 노드 개수 N에 비례하는 시간이 소요됩니다.

**2. 공간 복잡도**  
- **O(H)** (최악 O(N)) : 재귀 호출 스택이 트리의 높이 H 만큼 쌓입니다. 완전 균형 트리이면 H = log N, 한쪽으로 치우친 경우 H = N이 됩니다.

**3. 풀이 접근법**  
- **재귀적 대칭 검사**(DFS) 패턴을 사용했습니다. 두 노드가 서로의 거울 이미지인지(`leftNode.val == rightNode.val` 및 좌·우 서브트리 교차 비교) 확인하면서 트리를 전위 순회합니다.

**4. 잘된 점**  
- `if (leftNode == rightNode)` 로 두 노드가 동시에 `null` 인 경우를 한 줄로 처리해 가독성이 좋습니다.  
- 기본적인 대칭 조건을 명확히 체크하고, 재귀 호출을 통해 코드가 간결합니다.  
- 불필요한 전역 변수나 추가 자료구조를 사용하지 않아 메모리 사용이 최소화되었습니다.

**5. 개선 사항**  
1. **루트가 `null` 인 경우 처리**  
   현재 `isSymmetric`에서 `root.left` 와 `root.right` 를 바로 호출하므로, `root` 가 `null` 일 때 `NullPointerException` 이 발생합니다.  
   ```java
   if (root == null) return true;
   return isMirror(root.left, root.right);
   ```
2. **재귀 깊이 제한**  
   매우 깊은 트리(예: 10⁵ 노드)에서는 스택 오버플로우 위험이 있습니다. 이를 방지하려면 **반복적 BFS/DFS**(Queue 혹은 Stack) 로 구현하거나, Tail‑recursion 최적화를 지원하는 언어에서는 활용할 수 있습니다.  
3. **코드 스타일**  
   - 메서드 이름 `isMirror` 보다 `isMirrorTree` 와 같이 조금 더 의미를 명확히 하면 좋습니다.  
   - `leftNode == rightNode` 체크는 `null` 비교와 값 비교를 동시에 수행하므로, `if (leftNode == null && rightNode == null) return true;` 로 풀어 쓰면 의도가 더 명확해집니다.

**요약**  
전반적으로 대칭 트리 판단을 재귀적으로 깔끔하게 구현했으며, 시간·공간 복잡도도 최적 수준입니다. 다만 `root` 가 `null` 인 경우와 재귀 깊이에 대한 방어 코드를 추가하면 더욱 견고한 솔루션이 됩니다.
