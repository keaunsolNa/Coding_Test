# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 15. 오전 11:03:15 |
| Language | java |
| Runtime | 1 ms (Beats 0.0%) |
| Memory | 42.4 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/maximum-product-of-three-numbers/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: 이 코드의 시간 복잡도는 O(n log n)입니다. Arrays.sort() 함수를 사용하여 배열을 정렬하는 데 O(n log n)의 시간이 걸리기 때문입니다. 여기서 n은 배열의 크기를 나타냅니다.

2. **공간 복잡도**: 이 코드의 공간 복잡도는 O(1)입니다. 입력 배열을 제외하고 추가적인 공간을 사용하지 않기 때문입니다. Arrays.sort() 함수는 원본 배열을 수정하므로 추가적인 공간이 필요하지 않습니다.

3. **풀이 접근법**: 이 코드는 정렬 알고리즘을 사용하여 최대 곱을 찾습니다. 먼저 배열을 정렬한 후,最大의 세 개의 양수와 최대 두 개의 음수를 찾아서 최대 곱을 계산합니다. 이 접근법은 간단하고 직관적입니다.

4. **잘된 점**: 코드는 간결하고 읽기 쉽습니다. 변수 이름이 명확하여 코드의 의도를 쉽게 이해할 수 있습니다. 또한, 최대 곱을 계산하는 로직이 명확하고 간단합니다.

5. **개선 사항**: 코드는 이미 간결하고 효율적입니다. 그러나, Arrays.sort() 함수를 사용하는 대신, 최대와 최소를 찾는 알고리즘을 사용하여 시간 복잡도를 O(n)으로 개선할 수 있습니다. 예를 들어, 단일 반복문을 사용하여 최대 세 개의 양수와 최대 두 개의 음수를 찾을 수 있습니다. 이는 다음과 같은 코드로 구현할 수 있습니다.
```java
class Solution {
    public int maximumProduct(int[] nums) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num <= min1) {
                min2 = min1;
                min1 = num;
            } else if (num <= min2) {
                min2 = num;
            }

            if (num >= max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num >= max2) {
                max3 = max2;
                max2 = num;
            } else if (num >= max3) {
                max3 = num;
            }
        }

        return Math.max(max1 * max2 * max3, max1 * min1 * min2);
    }
}
```
이 코드는 O(n)의 시간 복잡도를 가지며, Arrays.sort() 함수를 사용하지 않습니다.
