# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 4. 오후 4:27:11 |
| Language | java |
| Runtime | 5 ms (Beats 4.7%) |
| Memory | 43.8 MB (Beats 5.4%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/largest-number-at-least-twice-of-others/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n log n)입니다. Arrays.sort() 함수를 사용하여 배열을 정렬하는 데 O(n log n)의 시간이 걸리기 때문입니다. 반면에 최대값과 인덱스를 찾는 루프는 O(n)의 시간 복잡도를 가지고 있습니다. 그러나 정렬이 전체 시간 복잡도를 지배하므로 O(n log n)으로 계산됩니다.

2. **공간 복잡도**: O(n)입니다. Arrays.sort() 함수는 일반적으로 원본 배열을 수정하며, 추가적인 공간을 사용하지 않습니다. 그러나 일부 자바 구현에서는 임시 배열을 사용할 수 있으므로 O(n)의 공간 복잡도를 가질 수 있습니다.

3. **풀이 접근법**: 이 코드는 정렬 알고리즘을 사용하여 두 번째로 큰 수를 찾는 접근법을 사용합니다. 먼저 최대값과 그 인덱스를 찾은 후, 배열을 정렬하여 두 번째로 큰 수를 찾습니다. 이후 최대값이 두 번째로 큰 수의 두 배 이상인지 확인하여 결과를 반환합니다.

4. **잘된 점**: 코드는 비교적 간결하며, 최대값과 그 인덱스를 찾는 로직은 명확합니다. 또한 Arrays.sort() 함수를 사용하여 두 번째로 큰 수를 찾는 방법은 직관적입니다.

5. **개선 사항**: 현재 코드는 Arrays.sort() 함수를 사용하여 두 번째로 큰 수를 찾습니다. 그러나 이는 O(n log n)의 시간 복잡도를 가집니다. 더 효율적인 방법은 최대값과 두 번째로 큰 값을 한 번의 루프에서 찾는 것입니다. 이렇게 하면 시간 복잡도를 O(n)으로 줄일 수 있습니다. 예를 들어, 다음과 같이 수정할 수 있습니다:
```java
class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0;
        int secondMax = 0;
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

        if (max >= secondMax * 2) return idx;
        else return -1;
    }
}
```
이 수정된 코드는 한 번의 루프에서 최대값과 두 번째로 큰 값을 찾기 때문에 시간 복잡도를 O(n)으로 줄일 수 있습니다.
