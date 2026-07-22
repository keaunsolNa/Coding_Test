# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 22. 오전 11:06:34 |
| Language | java |
| Runtime | 3 ms (Beats 22.7%) |
| Memory | 43.9 MB (Beats 46.7%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/merge-sorted-array/submissions/)

## Code Review

리뷰 대상 코드는 LeetCode의 merge-sorted-array 문제를 해결하는 Java 솔루션입니다. 

1. **시간 복잡도**: 이 코드의 시간 복잡도는 O((m+n)log(m+n))입니다. 이는 `Arrays.sort()` 함수가 전체 배열을 정렬하기 때문입니다. 이 함수는 일반적으로 퀵소트나 머지소트와 같은 비교 기반 정렬 알고리즘을 사용하며, 이러한 알고리즘의 평균 시간 복잡도는 O(n log n)입니다.

2. **공간 복잡도**: 이 코드의 공간 복잡도는 O(1)입니다. 입력 배열 `nums1`을 제외하고 추가적인 공간을 사용하지 않기 때문입니다. `nums2` 배열은 입력으로 주어지며, 추가적인 공간을 할당하지 않습니다.

3. **풀이 접근법**: 이 코드는 두 개의 정렬된 배열을 하나의 정렬된 배열로 합치는 문제를 해결하기 위해 두 가지 단계를 사용합니다. 첫 번째 단계에서는 `nums2`의 요소를 `nums1`의 끝 부분에 복사합니다. 두 번째 단계에서는 `Arrays.sort()` 함수를 사용하여 전체 `nums1` 배열을 정렬합니다. 이 접근법은 간단하지만, 이미 정렬된 배열의 특성을 최대한 활용하지 못합니다.

4. **잘된 점**: 이 코드는 간단하고 이해하기 쉽습니다. 또한, Java의 내장 정렬 함수를 사용하여 코드를 간결하게 유지했습니다.

5. **개선 사항**: 현재 코드는 이미 정렬된 두 배열을 합치는 문제를 해결하기 위해 전체 배열을 다시 정렬합니다. 이는 비효율적입니다. 더 효율적인 접근법은 두 개의 포인터를 사용하여 두 배열을 비교하고, 더 작은 요소를 결과 배열에 추가하는 것입니다. 이 방법으로 시간 복잡도를 O(m+n)으로 개선할 수 있습니다. 또한, 두 배열을 역순으로 비교하여 결과 배열의 끝에서부터 채워나가는 방법도 있습니다. 이 방법은 추가적인 공간을 사용하지 않으며, 이미 정렬된 배열의 특성을 잘 활용합니다. 

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
