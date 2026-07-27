# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 27. 오후 3:29:50 |
| Language | java |
| Runtime | 2 ms (Beats 0.0%) |
| Memory | 42.6 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/degree-of-an-array/submissions/)

## Code Review

**코드 리뷰**

1. **시간 복잡도**: O(n) - 이 코드는 입력 배열을 두 번 순회합니다. 첫 번째 순회에서는 각 요소의 빈도수를 계산하고, 두 번째 순회에서는 각 요소의 첫 번째와 마지막 인덱스를 찾습니다. 따라서 시간 복잡도는 O(n)입니다.

2. **공간 복잡도**: O(n) - 이 코드는 입력 배열의 요소를 저장하기 위해 HashMap과 ArrayList를 사용합니다. 따라서 공간 복잡도는 O(n)입니다.

3. **풀이 접근법**: 이 코드는 해시 테이블(HashMap)을 사용하여 각 요소의 빈도수를 계산하고, 빈도수가 가장 높은 요소를 찾습니다. 그리고 ArrayList를 사용하여 빈도수가 가장 높은 요소의 첫 번째와 마지막 인덱스를 찾습니다. 이 접근법은 문제를 해결하기 위해 적절한 알고리즘입니다.

4. **잘된 점**: 이 코드는 문제를 해결하기 위해 필요한 변수와 데이터 구조를 명확하게 정의하고, 코드를 읽기 쉽게 작성했습니다. 또한, 코드는 문제의 요구 사항을 충족하며, 빈도수가 가장 높은 요소의 첫 번째와 마지막 인덱스를 올바르게 찾습니다.

5. **개선 사항**: 이 코드는 이미 효율적으로 작성되어 있지만, 몇 가지 개선 사항이 있습니다. 예를 들어, `list` 변수는 불필요한 작업을 수행합니다. 대신, 빈도수가 가장 높은 요소의 첫 번째와 마지막 인덱스를 바로 계산할 수 있습니다. 또한, `originalArr` 변수는 불필요한 작업을 수행합니다. 대신, 입력 배열을 직접 사용할 수 있습니다. 이러한 개선 사항을 적용하면 코드를 더 효율적으로 만들 수 있습니다. 

```java
class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> first = new HashMap<>();
        Map<Integer, Integer> last = new HashMap<>();
        
        int maxCount = 0;
        int minLen = Integer.MAX_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
            if (!first.containsKey(nums[i])) {
                first.put(nums[i], i);
            }
            last.put(nums[i], i);
            if (count.get(nums[i]) > maxCount) {
                maxCount = count.get(nums[i]);
                minLen = last.get(nums[i]) - first.get(nums[i]) + 1;
            } else if (count.get(nums[i]) == maxCount) {
                minLen = Math.min(minLen, last.get(nums[i]) - first.get(nums[i]) + 1);
            }
        }
        
        return minLen;
    }
}
```
