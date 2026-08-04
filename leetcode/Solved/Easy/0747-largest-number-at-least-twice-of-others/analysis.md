# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 4. 오후 4:24:59 |
| Language | java |
| Runtime | 4 ms (Beats 0.0%) |
| Memory | 42.5 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/largest-number-at-least-twice-of-others/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 입력 배열을 한 번만 순회하므로 시간 복잡도는 선형입니다. 이는 문제의 크기가 커져도 효율적으로 동작할 수 있도록 합니다.

2. **공간 복잡도**: O(1) - 입력 배열 외에 추가적인 공간을 사용하지 않으므로 공간 복잡도는 상수입니다. 이는 메모리 사용량이 일정하다는 것을 의미합니다.

3. **풀이 접근법**: 이 문제는 단일 패스 알고리즘을 사용하여 최대값과 두 번째 최대값을 찾는 방식입니다. 이는 입력 배열을 한 번만 순회하면서 최대값과 두 번째 최대값을 갱신하는 방법으로, 효율적이고 간단한 접근법입니다.

4. **잘된 점**: 코드는 매우 간결하고 읽기 쉽습니다. 변수 이름이 명확하고, 로직이 직관적입니다. 또한, 문제의 요구사항을 정확하게 구현하고 있습니다.

5. **개선 사항**: 코드는 이미 충분히 최적화되어 있습니다. 그러나, 두 번째 최대값을 찾는 로직을 조금 더 명확하게 만들 수 있습니다. 예를 들어, 초기에 `secondMax`를 음의 무한대로 설정하고, 최대값이 갱신될 때마다 두 번째 최대값도 갱신하는 방식으로 구현할 수 있습니다. 하지만, 현재의 코드도 충분히 명확하고 효율적입니다. 

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
