# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 26. 오후 4:36:13 |
| Language | java |
| Runtime | 0 ms (Beats 100.0%) |
| Memory | 43.4 MB (Beats 30.9%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/sum-of-left-leaves/submissions/)

## Code Review

**1. 시간 복잡도**  
- **O(N)** : 트리의 모든 노드를 한 번씩 방문합니다. `sumOfLeftLeaves` 가 재귀적으로 좌·우 서브트리를 탐색하므로 노드 수를 *N*이라 할 때 전체 연산량은 선형입니다.

**2. 공간 복잡도**  
- **O(H)** : 재귀 호출 스택에 트리 높이 *H* 만큼의 메모리가 사용됩니다. 최악의 경우(편향 트리)에는 O(N), 균형 트리이면 O(log N) 입니다.

**3. 풀이 접근법**  
- 깊이 우선 탐색(DFS) 기반의 재귀 방식으로, 현재 노드의 **왼쪽 자식**이 리프(좌·우 자식이 모두 null)인지 검사하고, 리프이면 그 값을 누적합니다. 리프가 아니면 왼쪽 서브트리를 재귀 호출하고, 오른쪽 서브트리는 무조건 재귀 호출해 왼쪽 리프만을 골라 합산합니다.

**4. 잘된 점**  
- `null` 체크를 초기에 수행해 예외 상황을 깔끔히 처리했습니다.  
- 왼쪽 자식이 리프인지 판단하는 로직(`root.left.left == null && root.left.right == null`)이 명확합니다.  
- 불필요한 전역 변수나 클래스 필드를 사용하지 않아 함수형 스타일이 유지됩니다.

**5. 개선 사항**  
1. **코드 가독성**  
   - 현재는 오른쪽 서브트리를 먼저 탐색하고, 왼쪽을 조건부로 탐색하는 흐름이 다소 뒤섞여 있습니다. 좌·우 서브트리를 모두 재귀 호출하고, 반환값을 합치는 형태로 정리하면 로직이 더 직관적입니다. 예시)

   ```java
   public int sumOfLeftLeaves(TreeNode node) {
       if (node == null) return 0;
       int sum = 0;
       if (node.left != null && node.left.left == null && node.left.right == null) {
           sum += node.left.val;
       }
       sum += sumOfLeftLeaves(node.left);
       sum += sumOfLeftLeaves(node.right);
       return sum;
   }
   ```

2. **불필요한 중복 호출 제거**  
   - 현재 구현에서는 `root.left`가 리프가 아닐 때만 `sumOfLeftLeaves(root.left)` 를 호출하고, 리프인 경우는 바로 값을 더합니다. 위와 같이 항상 두 서브트리를 호출하면 코드가 간결해지고, 리프인지 검사하는 조건만 한 번 추가하면 동일한 복잡도를 유지합니다.

3. **반복(Iterative) 방식 제안**  
   - 스택이나 큐를 이용한 반복 DFS/BFS 로 구현하면 재귀 깊이에 따른 스택 오버플로 위험을 회피할 수 있습니다. 특히 트리 깊이가 매우 클 때 안전합니다.

   ```java
   public int sumOfLeftLeaves(TreeNode root) {
       if (root == null) return 0;
       int sum = 0;
       Deque<TreeNode> stack = new ArrayDeque<>();
       stack.push(root);
       while (!stack.isEmpty()) {
           TreeNode cur = stack.pop();
           if (cur.left != null) {
               if (cur.left.left == null && cur.left.right == null) {
                   sum += cur.left.val;
               } else {
                   stack.push(cur.left);
               }
           }
           if (cur.right != null) stack.push(cur.right);
       }
       return sum;
   }
   ```

4. **주석 및 메서드 명**  
   - 현재는 LeetCode 기본 템플릿만 제공됩니다. `sumOfLeftLeaves` 가 무엇을 하는지 간단히 주석을 달면 가독성이 향상됩니다.

전반적으로 올바른 알고리즘을 구현했으며, 위와 같은 작은 리팩터링을 통해 가독성과 안전성을 높일 수 있습니다.
