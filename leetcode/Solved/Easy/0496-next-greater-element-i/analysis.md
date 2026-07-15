# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 15. 오전 10:27:40 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.8 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/next-greater-element-i/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n*m)입니다. nums1과 nums2의 원소들을 각각 순회하며, nums2의 원소들을 다시 순회하기 때문입니다. 여기서 n은 nums1의 길이, m은 nums2의 길이를 나타냅니다.

2. **공간 복잡도**: O(n+m)입니다. nums2의 원소들을 저장하기 위한 HashMap이 필요하고, 결과를 저장하기 위한 answer 배열이 필요하기 때문입니다.

3. **풀이 접근법**: 이 문제는 해시 맵과 순회를 이용한 간단한 알고리즘을 사용합니다. nums2의 원소들을 해시 맵에 저장하고, nums1의 원소들에 대해 nums2에서 다음으로 큰 원소를 찾습니다.

4. **잘된 점**: 코드는 비교적 간결하고, 해시 맵을 사용하여 nums2의 원소들을 효율적으로 찾을 수 있습니다. 또한, 변수명이 명확하여 코드의 의도를 쉽게 이해할 수 있습니다.

5. **개선 사항**: 현재 코드는 nums2를 순회하며 다음으로 큰 원소를 찾기 위해 다시 순회합니다. 이는 비효율적입니다. 대신, 스택을 사용하여 nums2를 한 번만 순회하며 다음으로 큰 원소를 찾을 수 있습니다. 또한, nums1의 원소들이 nums2에 존재하는지 확인하지 않습니다. 따라서, nums1의 원소가 nums2에 존재하지 않는 경우에 대한 처리가 필요합니다. 

예를 들어, 스택을 사용하여 다음으로 큰 원소를 찾는 코드는 다음과 같습니다.
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
이 코드는 nums2를 한 번만 순회하며 다음으로 큰 원소를 찾기 때문에, 시간 복잡도를 O(n+m)으로 개선할 수 있습니다.
