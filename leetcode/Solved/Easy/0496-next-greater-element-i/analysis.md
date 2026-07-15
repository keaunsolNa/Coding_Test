# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 15. 오전 10:25:48 |
| Language | java |
| Runtime | 2 ms (Beats 0.0%) |
| Memory | 42.5 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/next-greater-element-i/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n*m) - nums1과 nums2의 길이를 각각 n과 m이라고 가정하면, nums1의 각 원소에 대해 nums2를 순회하기 때문에 시간 복잡도는 O(n*m)입니다. 이는 nums2의 길이가 매우 길 경우 성능이 저하될 수 있습니다.

2. **공간 복잡도**: O(n) - nums2의 각 원소를 해시맵에 저장하기 때문에 공간 복잡도는 O(n)입니다. 여기서 n은 nums2의 길이를 의미합니다.

3. **풀이 접근법**: 이 문제는 해시맵과 순회를 사용한 알고리즘으로 해결되었습니다. nums2의 각 원소를 해시맵에 저장하여 nums1의 각 원소에 대해 다음으로 큰 원소를 찾을 때 nums2의 인덱스를 바로 접근할 수 있습니다.

4. **잘된 점**: 코드는 비교적 간결하고, 문제의 요구 사항을 잘 반영했습니다. 또한, nums2의 각 원소를 해시맵에 저장하여 다음으로 큰 원소를 찾을 때 효율적으로 접근할 수 있습니다.

5. **개선 사항**: 현재 코드는 nums2를 순회하여 다음으로 큰 원소를 찾기 때문에, nums2의 길이가 매우 길 경우 성능이 저하될 수 있습니다. 이를 개선하기 위해, 단조 스택(monotonic stack)을 사용하여 nums2를 순회하며 다음으로 큰 원소를 바로 찾을 수 있습니다. 또한, System.out.println문을 제거하여 코드를 더 깨끗하게 만들 수 있습니다. 예를 들어, 다음のように 개선할 수 있습니다.
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
이러한 개선으로 코드의 성능과 가독성을 향상시킬 수 있습니다.
