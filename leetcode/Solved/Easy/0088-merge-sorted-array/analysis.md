# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 22. 오전 11:05:50 |
| Language | java |
| Runtime | 1 ms (Beats 0.0%) |
| Memory | 43.2 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/merge-sorted-array/submissions/)

## Code Review

리뷰 대상 코드는 LeetCode의 merge-sorted-array 문제를 해결하기 위한 자바 솔루션입니다. 

1. **시간 복잡도**: 이 코드의 시간 복잡도는 O((m+n)log(m+n))입니다. Arrays.sort() 함수를 사용하여 nums1 배열을 정렬하기 때문입니다. m과 n은 각각 nums1과 nums2의 요소 개수입니다.

2. **공간 복잡도**: 이 코드의 공간 복잡도는 O(1)입니다. nums1 배열을 제외하고 추가적인 공간을 사용하지 않기 때문입니다. nums1 배열은 입력으로 주어지며, 그 크기는 변경되지 않습니다.

3. **풀이 접근법**: 이 코드는 두 개의 정렬된 배열을 하나의 정렬된 배열로 합치는 문제를 해결하기 위해 두 가지 단계를 사용합니다. 첫 번째 단계에서는 nums2의 요소를 nums1의 끝에 복사합니다. 두 번째 단계에서는 Arrays.sort() 함수를 사용하여 nums1을 정렬합니다. 이 접근법은 간단하지만, 효율적이지 않을 수 있습니다.

4. **잘된 점**: 이 코드는 간단하고 이해하기 쉽습니다. 또한, nums1과 nums2의 요소 개수(m과 n)를 체크하여 예외적인 경우를 처리하고 있습니다.

5. **개선 사항**: 이 코드의 효율성을 개선하기 위해 두 개의 포인터를 사용하여 nums1과 nums2의 요소를 비교하고, 더 큰 요소를 nums1의 끝에 복사하는 방식으로 구현할 수 있습니다. 이 방식은 시간 복잡도를 O(m+n)으로 줄일 수 있습니다. 또한, nums1의 요소를 왼쪽으로 이동시키지 않고, nums1의 끝에서부터 시작하여 왼쪽으로 이동하는 방식으로 구현할 수 있습니다. 이 방식은 공간 복잡도를 유지하면서 시간 복잡도를 개선할 수 있습니다. 

예를 들어, 다음과 같이 구현할 수 있습니다:
```java
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;
        
        while ((p1 >= 0) && (p2 >= 0)) {
            nums1[p--] = (nums1[p1] > nums2[p2]) ? nums1[p1--] : nums2[p2--];
        }
        
        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
    }
}
```
이 코드는 두 개의 포인터(p1과 p2)를 사용하여 nums1과 nums2의 요소를 비교하고, 더 큰 요소를 nums1의 끝에 복사합니다. 또한, System.arraycopy() 함수를 사용하여 남은 nums2의 요소를 nums1의 앞에 복사합니다. 이 방식은 시간 복잡도를 O(m+n)으로 줄일 수 있습니다.
