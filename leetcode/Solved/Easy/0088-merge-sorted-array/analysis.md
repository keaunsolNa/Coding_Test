# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 22. 오전 11:06:27 |
| Language | java |
| Runtime | 2 ms (Beats 0.0%) |
| Memory | 42.5 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/merge-sorted-array/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O((m+n)log(m+n))입니다. Arrays.sort() 함수는 퀵소트 알고리즘을 사용하며, 평균적으로 O(n log n)의 시간 복잡도를 가지기 때문입니다. 여기서 n은 nums1의 길이인 m+n입니다.

2. **공간 복잡도**: O(1)입니다. 입력 배열을 제외하고 추가적인 공간을 사용하지 않기 때문입니다. Arrays.sort() 함수는 in-place 정렬을 수행합니다.

3. **풀이 접근법**: 이 풀이는 두 배열을 하나로 합친 후 정렬하는 접근법을 사용합니다. Arrays.sort() 함수를 사용하여 nums1 배열을 정렬합니다. 이 접근법은 간단하지만, 이미 정렬된 두 배열의 특성을 고려하지 않습니다.

4. **잘된 점**: 코드는 간단하고 이해하기 쉽습니다. Arrays.sort() 함수를 사용하여 정렬을 쉽게 구현했습니다.

5. **개선 사항**: 두 배열이 이미 정렬되어 있다는 점을 고려하여, 두 포인터를 사용하여 nums1을 정렬할 수 있습니다. 이 접근법은 O(m+n)의 시간 복잡도를 가지며, 더 효율적입니다. 예를 들어, 두 포인터를 사용하여 nums1의 끝에서부터 시작하여, nums1과 nums2의 원소를 비교하여 더 큰 값을 nums1의 끝에 배치하는 방식입니다. 이 방식으로 구현하면, Arrays.sort() 함수를 사용하지 않아도 됩니다. 또한, nums2의 원소를 nums1에 복사할 때, nums2의 원소를 0으로 초기화하는 것은 불필요합니다.
