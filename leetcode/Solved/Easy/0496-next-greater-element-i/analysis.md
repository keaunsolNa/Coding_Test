# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 15. 오전 10:26:03 |
| Language | java |
| Runtime | 1 ms (Beats 0.0%) |
| Memory | 42.7 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/next-greater-element-i/submissions/)

## Code Review

리뷰 대상 코드는 next-greater-element-i 문제를 해결하는 자바 솔루션입니다. 

1. **시간 복잡도**: 이 코드의 시간 복잡도는 O(n*m)입니다. 여기서 n은 nums1의 길이, m은 nums2의 길이입니다. 이유는 nums1의 각 원소마다 nums2를 순회하여 다음으로 큰 원소를 찾기 때문입니다.

2. **공간 복잡도**: 이 코드의 공간 복잡도는 O(n)입니다. nums2의 원소들을 key로 하는 해시맵을 사용하여 각 원소의 인덱스를 저장하기 때문입니다.

3. **풀이 접근법**: 이 코드는 해시맵과 순차 탐색을 사용하여 문제를 해결합니다. nums2의 각 원소를 해시맵에 저장하고, nums1의 각 원소에 대해 nums2를 순회하여 다음으로 큰 원소를 찾습니다.

4. **잘된 점**: 이 코드는 문제를 이해하고, 해시맵을 사용하여 nums2의 원소에 대한 빠른 접근을 제공하는 부분이 잘 구현되었습니다. 또한, 각 원소에 대한 다음으로 큰 원소를 찾는 로직이 명확하게 구현되어 있습니다.

5. **개선 사항**: 이 코드는 단순하지만, 효율성을 높이기 위해 스택을 사용하여 다음으로 큰 원소를 찾는 방법을 고려할 수 있습니다. 이는 nums2를 한 번만 순회하여 다음으로 큰 원소를 모두 찾을 수 있기 때문입니다. 또한, System.out.println 문을 제거하여 코드를 더 깨끗하게 만들 수 있습니다. 스택을 사용한 접근법은 시간 복잡도를 O(n+m)으로 개선할 수 있습니다. 

예를 들어, 다음과 같이 스택을 사용하여 개선할 수 있습니다:
```java
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        
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
이 코드는 nums2를 한 번만 순회하여 다음으로 큰 원소를 모두 찾습니다. 이는 시간 복잡도를 개선하는 효과적인 방법입니다.
