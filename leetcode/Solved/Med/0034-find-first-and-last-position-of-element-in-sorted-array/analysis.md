# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 4. 오후 5:04:35 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 43 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/)

## Code Review

코드 리뷰를 진행하겠습니다.

1. **시간 복잡도**: O(n) - 이 코드는 입력 배열을 한 번만 순회하므로, 시간 복잡도는 배열의 크기(n)와 동일합니다. 즉, 입력 크기에 비례하여 실행 시간이 증가합니다.

2. **공간 복잡도**: O(1) - 이 코드는 입력 배열 외에 추가적인 공간을 거의 사용하지 않습니다. 결과를 저장하기 위한 배열은 크기가 고정되어 있으므로, 공간 복잡도는 상수입니다.

3. **풀이 접근법**: 이 코드는 단순한 선형 탐색 알고리즘을 사용하여 배열을 순회하며, 타겟 요소를 찾습니다. 이 접근법은 배열이 정렬되어 있지 않은 경우에 적합하지만, 문제에서 배열이 정렬되어 있다고 가정할 때는 비효율적일 수 있습니다.

4. **잘된 점**: 코드는 읽기 쉽고, 변수 이름이 명확하여 이해하기 쉽습니다. 또한, 결과를 반환하는 방식도 직관적입니다.

5. **개선 사항**: 문제에서 배열이 정렬되어 있다고 가정하므로, 더 효율적인 알고리즘으로 이진 탐색을 사용할 수 있습니다. 이진 탐색을 사용하면 시간 복잡도를 O(log n)으로 개선할 수 있습니다. 또한, 첫 번째와 마지막 위치를 찾는 두 개의 별도 함수를 사용하여 코드를 더 모듈화할 수 있습니다. 이는 코드의 가독성과 유지보수를 향상시킬 수 있습니다. 

예를 들어, 이진 탐색을 사용하여 첫 번째와 마지막 위치를 찾는 함수를 다음과 같이 구현할 수 있습니다.

```java
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstIndex = findFirst(nums, target);
        int lastIndex = findLast(nums, target);
        
        if (firstIndex == -1) {
            return new int[] {-1, -1};
        } else {
            return new int[] {firstIndex, lastIndex};
        }
    }
    
    private int findFirst(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int result = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                result = mid;
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return result;
    }
    
    private int findLast(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int result = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                result = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return result;
    }
}
```

이러한 개선 사항을 적용하면 코드의 효율성과 가독성이 향상됩니다.
