# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 15. 오전 10:26:40 |
| Language | java |
| Runtime | 1 ms (Beats 0.0%) |
| Memory | 42.8 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/next-greater-element-i/submissions/)

## Code Review

리뷰 대상 코드는 next-greater-element-i 문제를 해결하는 자바 솔루션입니다. 

1. **시간 복잡도**: 이 코드의 시간 복잡도는 O(n*m)입니다. 여기서 n은 nums1의 길이, m은 nums2의 길이입니다. nums1의 각 원소에 대해 nums2를 순회하여 다음으로 큰 원소를 찾기 때문입니다.

2. **공간 복잡도**: 이 코드의 공간 복잡도는 O(n)입니다. nums2의 원소를 key로, 그 인덱스를 value로 하는 해시맵을 사용하여 공간을 사용하기 때문입니다.

3. **풀이 접근법**: 이 코드는 해시맵을 사용하여 nums2의 원소와 그 인덱스를 매핑하고, nums1의 각 원소에 대해 nums2를 순회하여 다음으로 큰 원소를 찾는 방식으로 문제를 해결합니다. 이는 기본적인 해시맵 활용과 순차 탐색을 결합한 접근법입니다.

4. **잘된 점**: 코드는 문제를 해결하는 데 필요한 로직을 포함하고, 해시맵을 사용하여 nums2의 원소에 빠르게 접근할 수 있습니다. 또한, 변수명이 명확하여 코드의 가독성이 좋습니다.

5. **개선 사항**: 현재 코드는 nums2를 순회하여 다음으로 큰 원소를 찾는 부분에서 비효율적입니다. 이는 단순한 순차 탐색을 사용하기 때문입니다. 개선할 수 있는 방법은, nums2를 스택을 사용하여 단 한번만 순회하여 다음으로 큰 원소를 모두 찾는 것입니다. 이를 통해 시간 복잡도를 O(n + m)으로 개선할 수 있습니다. 또한, 불필요한 System.out.println 문을 제거하여 코드를 더 깔끔하게 만들 수 있습니다. 

예를 들어, 다음과 같이 개선할 수 있습니다:
```java
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[nums1.length];

        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }

        for (int i = 0; i < nums1.length; i++) {
            answer[i] = map.getOrDefault(nums1[i], -1);
        }

        return answer;
    }
}
```
이 코드는 스택을 사용하여 nums2를 단 한번만 순회하고, 다음으로 큰 원소를 모두 찾습니다. 이를 통해 시간 복잡도를 개선할 수 있습니다.
