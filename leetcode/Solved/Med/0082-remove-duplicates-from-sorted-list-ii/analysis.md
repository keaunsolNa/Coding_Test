# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 13. 오후 1:38:37 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.6 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/submissions/)

## Code Review

코드 리뷰를 진행하겠습니다.

1. **시간 복잡도**: O(n) - 이 코드는 연결 리스트를 한 번만 순회하므로, 시간 복잡도는 노드의 개수에 비례합니다. 연결 리스트의 각 노드를 최대 한 번씩 방문하기 때문입니다.

2. **공간 복잡도**: O(1) - 이 코드는 추가적인 공간을 사용하지 않습니다. 입력으로 주어진 연결 리스트의 노드만 사용하므로, 공간 복잡도는 상수입니다.

3. **풀이 접근법**: 이 코드는 두 개의 포인터를 사용하지 않고, 단일 포인터로 연결 리스트를 순회하는 방식을 사용합니다. 하지만, 주어진 문제의 요구사항을 만족하지 못합니다. 문제는 중복된 값이 있는 노드를 모두 제거하라고 요구하지만, 이 코드는 단순히 중복된 노드의 다음 노드를 건너뛰는 방식으로 해결하고 있습니다.

4. **잘된 점**: 코드는 간결하고, 이해하기 쉽습니다. 연결 리스트의 기본적인 순회 방식을 사용하고 있습니다.

5. **개선 사항**: 이 코드는 문제의 요구사항을 만족하지 못합니다. 중복된 값이 있는 노드를 모두 제거해야 하는데, 이 코드는 단순히 중복된 노드의 다음 노드를 건너뛰는 방식으로 해결하고 있습니다. 따라서, 이 문제를 해결하기 위해서는 두 개의 포인터를 사용하여, 중복된 값이 있는 노드를 모두 제거하는 방식으로 해결해야 합니다. 예를 들어, 현재 노드와 다음 노드를 비교하여, 중복된 값이 있는 경우에만 다음 노드를 건너뛰는 방식으로 해결할 수 있습니다. 또한, 연결 리스트의头部 노드도 중복된 값이 있는 경우에 제거되어야 하므로, 이를 처리하기 위한 추가적인 로직이 필요합니다. 

```java
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // dummy node
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        
        while (current.next != null && current.next.next != null) {
            if (current.next.val == current.next.next.val) {
                int val = current.next.val;
                // 중복된 노드 제거
                while (current.next != null && current.next.val == val) {
                    current.next = current.next.next;
                }
            } else {
                current = current.next;
            }
        }
        
        return dummy.next;
    }
}
```
