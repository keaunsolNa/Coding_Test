# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 14. 오전 11:00:42 |
| Language | java |
| Runtime | 2 ms (Beats 0.0%) |
| Memory | 42.8 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/find-triangular-sum-of-an-array/submissions/)

## Code Review

리뷰 대상 코드는 삼각형 합을 계산하는 문제를 해결하기 위한 자바 솔루션입니다. 

1. **시간 복잡도**: 코드의 시간 복잡도는 O(n^2)입니다. 왜냐하면 nums.length 만큼의 반복문이 있고, 그 안에 nums.length - 2 만큼의 반복문이 있기 때문입니다. nums.length 가 커질수록 시간 복잡도가 기하급수적으로 증가합니다.

2. **공간 복잡도**: 코드의 공간 복잡도는 O(n)입니다. nums.length - 2 크기의 새로운 배열을 생성하기 때문입니다. 

3. **풀이 접근법**: 이 코드는 삼각형 합을 계산하기 위해 반복문을 사용합니다. nums 배열의 각 요소를 다음 요소와 더하여 새로운 배열을 생성하고, 이 과정을 반복합니다. 이 접근법은 문제를 해결하는 데 효과적이지만, 시간 복잡도가 높습니다.

4. **잘된 점**: 코드는 문제를 해결하는 데 필요한 논리를 포함하고 있습니다. 또한, 각 단계에서 계산된 값을 출력하여 디버깅을 용이하게 합니다.

5. **개선 사항**: 코드의 시간 복잡도를 개선하기 위해, 더 효율적인 알고리즘을 사용할 수 있습니다. 예를 들어, 동적 프로그래밍을 사용하여 이전 단계의 결과를 재사용할 수 있습니다. 또한, 불필요한 출력문을 제거하여 코드를 더 간결하게 만들 수 있습니다. 마지막으로, nums.length <= i 조건을 nums.length - 1 <= i 로 변경하여 배열 인덱스 오류를 방지할 수 있습니다. 

```java
class Solution {
    public int triangularSum(int[] nums) {
        while (nums.length > 1) {
            int[] arr = new int[nums.length - 1];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (nums[i] + nums[i + 1]) % 10;
            }
            nums = arr;
        }
        return nums[0];
    }
}
```
