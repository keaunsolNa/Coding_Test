# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 15. 오전 10:27:45 |
| Language | java |
| Runtime | 3 ms (Beats 92.7%) |
| Memory | 44.9 MB (Beats 81.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/next-greater-element-i/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: 이 코드의 시간 복잡도는 O(n*m)입니다. 여기서 n은 nums1의 길이, m은 nums2의 길이입니다. nums1의 각 원소에 대해 nums2를 순회하기 때문입니다.

2. **공간 복잡도**: 이 코드의 공간 복잡도는 O(n)입니다. nums2의 원소를 key로 하는 HashMap을 사용하기 때문입니다.

3. **풀이 접근법**: 이 코드는 해시 맵을 사용하여 nums2의 원소와 그 인덱스를 매핑하고, nums1의 각 원소에 대해 nums2를 순회하여 다음으로 큰 원소를 찾는 접근법을 사용합니다. 이는 단순하고 직관적인 풀이입니다.

4. **잘된 점**: 코드는 비교적 간결하고, 변수명이 명확하여 이해하기 쉽습니다. 또한, 해시 맵을 사용하여 nums2의 원소에 빠르게 접근할 수 있습니다.

5. **개선 사항**: 이 문제는 스택을 사용하여 더 효율적으로 풀 수 있습니다. 스택을 사용하면 nums2를 한 번만 순회하여 다음으로 큰 원소를 모두 찾을 수 있습니다. 또한, 해시 맵을 사용하여 결과를 저장할 수 있습니다. 이러한 접근법은 시간 복잡도를 O(n + m)으로 개선할 수 있습니다. 예를 들어, 다음의 코드를 참고할 수 있습니다.
```java
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>();
        
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }
        
        int[] answer = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            answer[i] = map.getOrDefault(nums1[i], -1);
        }
        
        return answer;
    }
}
```
