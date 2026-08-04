# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 4. 오후 4:27:02 |
| Language | java |
| Runtime | 7 ms (Beats 0.0%) |
| Memory | 43 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/largest-number-at-least-twice-of-others/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n log n)입니다. Arrays.sort() 함수가 전체 배열을 정렬하기 때문에 이 함수의 시간 복잡도가 가장 크게 작용합니다. 반면에 최대값과 두 번째 최대값을 찾기 위한 반복문은 O(n)의 시간 복잡도를 가지므로, 전체 시간 복잡도는 O(n log n)으로 결정됩니다.

2. **공간 복잡도**: O(1)입니다. 입력 배열을 제외하고는 추가적인 공간을 사용하지 않습니다. Arrays.sort() 함수는 원본 배열을 수정하므로, 추가적인 공간이 필요하지 않습니다.

3. **풀이 접근법**: 이 문제는 배열에서 최대값과 두 번째 최대값을 찾는 문제입니다. 사용된 알고리즘은 정렬 알고리즘입니다. 하지만, 정렬 알고리즘은 최대값과 두 번째 최대값을 찾기 위해 사용하는 것은 비효율적입니다. 더 효율적인 방법은 단일 반복문을 사용하여 최대값과 두 번째 최대값을 찾는 것입니다.

4. **잘된 점**: 코드는 간단하고 이해하기 쉽습니다. 변수 이름도 명확하여 코드의 의도를 쉽게 파악할 수 있습니다.

5. **개선 사항**: 현재 코드는 정렬 알고리즘을 사용하여 두 번째 최대값을 찾습니다. 하지만, 단일 반복문을 사용하여 최대값과 두 번째 최대값을 찾는 것이 더 효율적입니다. 예를 들어, 최대값을 찾은 후에 두 번째 최대값을 찾기 위한 반복문을 추가하여 코드를 개선할 수 있습니다. 또한, System.out.println 문은 제거하여 코드를 더 깨끗하게 만들 수 있습니다. 개선된 코드는 다음과 같습니다.
```java
class Solution {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int idx = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
                idx = i;
            } else if (nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }

        return max >= secondMax * 2 ? idx : -1;
    }
}
```
