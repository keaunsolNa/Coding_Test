# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 9. 14. 오후 4:53:00 |
| Language | java |
| Runtime | 0 ms (Beats 100.0%) |
| Memory | 42.8 MB (Beats 78.2%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/univalued-binary-tree/submissions/)

## Code Review

**1. 시간 복잡도**  
- **O(N)** : N은 트리 노드 수. DFS 로 모든 노드를 한 번씩 방문하므로 선형 시간 복잡도를 가집니다.  

**2. 공간 복잡도**  
- **O(H)** : 재귀 호출 스택에 트리의 높이 H 만큼의 공간이 필요합니다. 최악의 경우(편향 트리) H = N 이 되어 O(N) 가 될 수 있지만, 평균적인 균형 트리에서는 O(log N) 입니다.  

**3. 풀이 접근법**  
- 전역 변수 `universalValue`에 루트 값 하나를 저장하고, **전위 순회(pre‑order) DFS** 로 각 노드의 값이 동일한지 검사합니다.  
- `node == null` 인 경우 true 를 반환해 리프 아래의 빈 서브트리를 자동으로 통과시킵니다.  

**4. 잘된 점**  
- 문제의 핵심을 정확히 파악하여 불필요한 자료구조 없이 재귀만으로 해결했습니다.  
- `null` 체크를 가장 먼저 수행해 간결하고 안전한 구현을 했습니다.  
- 메서드 이름(`isUnivalTreeDFS`)이 수행 역할을 잘 나타내어 가독성이 좋습니다.  

**5. 개선 사항**  
1. **전역 변수 최소화**  
   - `universalValue`를 인스턴스 필드가 아니라 메서드 인자로 전달하면 함수형 스타일에 더 가깝고, 멀티스레드 환경에서도 안전합니다. 예: `private boolean dfs(TreeNode node, int target)`  

2. **재귀 대신 반복(BFS/DFS 스택) 사용**  
   - 재귀 깊이가 트리 높이와 동일해 스택 오버플로우 위험이 있습니다. `Deque<TreeNode>` 를 이용한 명시적 스택 혹은 큐 기반 BFS 로 구현하면 최악의 경우에도 O(N) 메모리만 사용합니다.  

3. **루트가 null 인 경우 처리**  
   - 현재 구현은 `root` 가 null 일 때 `root.val` 접근으로 NPE가 발생합니다. `if (root == null) return true;` 와 같은 방어 코드를 추가하면 완전한 함수가 됩니다.  

4. **불필요한 변수 제거**  
   - `universalValue` 를 한 번만 사용하므로 `final int target = root.val;` 로 로컬 상수화하면 코드가 더 명확해집니다.  

**예시 개선 코드 (반복 버전)**  

```java
class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) return true;
        int target = root.val;
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            if (cur.val != target) return false;
            if (cur.left != null)  stack.push(cur.left);
            if (cur.right != null) stack.push(cur.right);
        }
        return true;
    }
}
```

위와 같이 수정하면 재귀 깊이에 대한 위험을 없애고, 변수 스코프를 최소화하면서도 동일한 O(N) 시간·O(H) (스택 사용 시 최악 O(N)) 복잡도를 유지할 수 있습니다.
