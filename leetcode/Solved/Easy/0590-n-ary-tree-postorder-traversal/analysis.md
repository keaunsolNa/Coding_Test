# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 26. 오후 4:36:22 |
| Language | java |
| Runtime | 0 ms (Beats 100.0%) |
| Memory | 46.3 MB (Beats 72.4%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/n-ary-tree-postorder-traversal/submissions/)

## Code Review

**1. 시간 복잡도**  
- **O(N)** : N은 트리의 노드 수이다. `performPostorderTraversal`가 각 노드를 정확히 한 번씩 방문하고, 각 노드에서 children 리스트를 순회하므로 전체 방문 횟수는 N이다.  

**2. 공간 복잡도**  
- **O(H + N)** (최악) 또는 **O(H)** (재귀 호출 스택)  
  - `result` 리스트는 모든 노드 값을 저장하므로 O(N) 공간을 사용한다.  
  - 재귀 호출에 사용되는 스택 깊이는 트리의 높이 H에 비례한다. 최악의 경우(편향 트리) H = N 이므로 전체 공간 복잡도는 O(N)이다.  

**3. 풀이 접근법**  
- **재귀적 후위 순회**(post‑order traversal)를 이용하였다.  
- 현재 노드의 모든 자식을 먼저 재귀 호출로 탐색하고, 자식 탐색이 끝난 뒤에 현재 노드의 값을 `result`에 추가한다. 이는 전형적인 깊이 우선 탐색(DFS) 패턴이다.  

**4. 잘된 점**  
- 코드가 매우 간결하고 가독성이 좋다.  
- `null` 체크를 통해 입력이 비어 있을 때도 정상 동작한다.  
- `Node` 클래스 정의와 일치하도록 `children` 리스트를 바로 순회해 구현이 직관적이다.  
- `result`를 인스턴스 변수로 두어 재귀 메서드가 반환값을 별도로 전달할 필요가 없어 깔끔하다.  

**5. 개선 사항**  
1. **재귀 깊이 제한**  
   - Java는 기본적으로 스택 깊이가 제한적이므로, 트리 깊이가 매우 깊을 경우 `StackOverflowError`가 발생할 수 있다.  
   - 이를 방지하기 위해 **명시적 스택**(Deque) 을 사용한 반복 버전으로 구현하거나, Tail‑recursion 최적화를 지원하는 언어로 변환하는 것이 좋다.  

2. **불변성 보장**  
   - 현재 `result`가 `Solution` 객체에 필드로 남아 있어, 동일 객체에 대해 여러 번 `postorder`를 호출하면 이전 결과가 누적될 위험이 있다.  
   - `postorder` 메서드 시작 시 `result.clear()` 혹은 지역 변수로 `List<Integer> result = new ArrayList<>();` 를 선언해 매 호출마다 새 리스트를 사용하도록 하면 안전하다.  

3. **children이 null인 경우 방어 코드**  
   - LeetCode에서는 `children`이 `null`이 아닌 빈 리스트로 주어지지만, 일반적인 사용을 고려한다면 `if (node.children != null)` 검사를 추가해 NPE를 방지할 수 있다.  

4. **시간·공간 최적화는 크게 필요 없지만**  
   - 결과 리스트를 미리 크기 지정(`new ArrayList<>(N)`)하면 내부 배열 재할당을 줄일 수 있다. N은 사전에 알 수 없지만, 트리 전체 노드 수를 미리 계산한 뒤 리스트를 생성하는 방법도 있다.  

**요약**  
전형적인 재귀 기반 후위 순회 구현으로 시간·공간 복잡도 모두 최적 수준(O(N))이며 코드 가독성도 뛰어나다. 다만 재귀 깊이에 대한 방어와 메서드 재사용성을 위해 `result` 초기화와 `children` null 방어를 추가하면 더욱 견고한 구현이 된다. 필요 시 스택 기반 반복 구현으로 전환하면 스택 오버플로 위험을 완전히 없앨 수 있다.
