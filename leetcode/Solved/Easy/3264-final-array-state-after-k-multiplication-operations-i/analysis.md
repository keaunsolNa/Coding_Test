# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 9. 14. 오후 5:38:21 |
| Language | java |
| Runtime | 1 ms (Beats 98.5%) |
| Memory | 46.8 MB (Beats 57.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/final-array-state-after-k-multiplication-operations-i/submissions/)

## Code Review

**코드 리뷰**

1. **시간 복잡도**  
   - 현재 구현은 `k` 번 반복하면서 매 반복마다 전체 배열을 순회해 최소값을 찾습니다.  
   - 최소값 탐색은 `O(n)` (n = `nums.length`)이므로 전체 시간 복잡도는 **O(k·n)** 입니다.  
   - `k` 와 `n` 이 모두 커질 경우 비효율적입니다.

2. **공간 복잡도**  
   - 추가적인 자료구조를 사용하지 않고 입력 배열 `nums` 를 제자리에서 수정합니다.  
   - 따라서 **O(1)** (상수) 추가 공간을 사용합니다.

3. **풀이 접근법**  
   - 매 연산마다 현재 배열에서 가장 작은 원소를 찾아 `multiplier` 를 곱해 업데이트하는 **그리디 시뮬레이션** 방식입니다.  
   - 최소값을 매번 선형 탐색으로 찾고 있기 때문에 힙(우선순위 큐)와 같은 자료구조를 활용하면 더 효율적으로 구현할 수 있습니다.

4. **잘된 점**  
   - 로직이 직관적이고 구현이 간단합니다.  
   - 별도의 외부 라이브러리 없이 순수 Java만으로 문제를 해결했습니다.  
   - 배열을 제자리에서 수정하므로 메모리 오버헤드가 없습니다.

5. **개선 사항**  
   - **우선순위 큐 사용**: 최소값을 빠르게 추출·갱신하려면 `PriorityQueue<Integer>` 를 이용하면 각 연산을 `O(log n)` 로 줄일 수 있습니다. 전체 복잡도는 `O((n + k) log n)` 로 개선됩니다.  
   - **배열 복제 방지**: 현재는 `nums` 를 직접 변경하고 반환합니다. 함수 명세가 원본을 보존해야 한다면 복사본을 만든 뒤 작업하는 것이 안전합니다.  
   - **오버플로우 방지**: `min * multiplier` 가 `int` 범위를 초과할 가능성이 있다면 `long` 으로 계산 후 적절히 캐스팅하거나 범위 검사를 추가해야 합니다.  
   - **코드 가독성**: 최소값 탐색 로직을 별도 메서드(`findMinIndex`) 로 분리하면 메인 루프가 더 깔끔해집니다.  

**예시 개선 코드 (우선순위 큐 활용)**

```java
class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        // 최소값을 빠르게 꺼내기 위한 힙
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) pq.offer(num);

        for (int i = 0; i < k; i++) {
            long cur = pq.poll();                 // 현재 최소값
            long updated = cur * (long) multiplier; // 곱셈 (long 사용)
            pq.offer((int) updated);              // 다시 삽입
        }

        // 힙에 남은 값을 배열에 복원
        for (int i = 0; i < nums.length; i++) {
            nums[i] = pq.poll();
        }
        return nums;
    }
}
```

이와 같이 힙을 이용하면 시간 복잡도가 크게 개선되고, `long` 을 사용해 곱셈 오버플로우 위험도 완화할 수 있습니다.
