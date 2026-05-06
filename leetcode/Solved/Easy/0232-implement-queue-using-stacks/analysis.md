# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026-05-06 21:18:32 |
| Language | java |
| Runtime | 0 ms (Beats 100.0%) |
| Memory | 42 MB (Beats 99.6%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/implement-queue-using-stacks/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: 이 코드의 시간 복잡도는 push 연산에서 O(n), pop, peek, empty 연산에서 O(1)입니다. 이유는 push 연산 시 스택의 요소를 다른 스택으로 모두 이동 후(push) 다시 원래 스택으로 이동(pop) 하므로 n개의 요소가 있는 스택의 경우 O(n)의 시간이 걸리게 됩니다.

2. **공간 복잡도**: 이 코드의 공간 복잡도는 O(n)입니다. 이유는 두 개의 스택을 사용하여 queue를 구현하고 있으므로, n개의 요소가 queue에 저장될 경우 두 스택을 합쳐 총 O(n)의 공간이 필요하게 됩니다.

3. **풀이 접근법**: 이 코드는 두 개의 스택을 사용하여 큐를 구현하는 알고리즘을 따르고 있습니다. 큐의 첫 번째 요소를 스택의 꼭대기로 만들기 위해 스택의 순서를 역순으로 바꾸는 개념을 사용하여 큐의 연산들을 구현하고 있습니다.

4. **잘된 점**: 코드는 스택을 사용하여 큐를 구현하는 알고리즘의 아이디어를 잘 반영하고 있으며, push, pop, peek, empty 연산들을 간결하게 구현하고 있습니다. 또한, 주석이 적절하게 달려 있으므로 코드의 이해가 쉽습니다.

5. **개선 사항**: push 연산 시 매번 두 스택을 이동하는 것을 최적화할 수 있습니다. 스택 s2를 큐의 front 요소를 담는 데 사용하고, 스택 s1에 새 요소를 추가할 때 s2가 비어있는 경우에만 스택의 모든 요소를 s2로 이동시키면 됩니다. 이를 통해 push 연산의 시간 복잡도를 O(1)로 개선할 수 있습니다. 

```java
public void push(int x) {
    s1.push(x);
}

public int pop() {
    if (s2.isEmpty()) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
    }
    return s2.pop();
}
```

이와 같은 최적화를 통해 코드의 효율성을 cao 높일 수 있습니다.
