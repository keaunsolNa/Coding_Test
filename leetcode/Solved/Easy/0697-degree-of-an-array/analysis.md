# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 27. 오전 10:08:01 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.5 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/degree-of-an-array/submissions/)

## Code Review

**코드 리뷰**

1. **시간 복잡도**: O(n) - 이 코드는 두 번의 반복문을 통해 배열을 순회하기 때문에 시간 복잡도는 선형입니다. 첫 번째 반복문에서는 각 요소의 빈도수를 계산하고, 두 번째 반복문에서는 시작 인덱스를 찾습니다.
2. **공간 복잡도**: O(n) - 이 코드는 해시 맵을 사용하여 각 요소의 빈도수를 저장하기 때문에 공간 복잡도는 선형입니다. 최악의 경우, 모든 요소가 고유할 수 있으므로 해시 맵의 크기는 배열의 크기와 동일할 수 있습니다.
3. **풀이 접근법**: 이 코드는 해시 맵을 사용하여 각 요소의 빈도수를 계산하고, 가장 빈도수가 높은 요소를 찾습니다. 이후에 시작 인덱스를 찾기 위해 다시 배열을 순회합니다. 이 접근법은 간단하고 효율적입니다.
4. **잘된 점**: 코드는 읽기 쉽고, 변수 이름이 명확합니다. 또한, 해시 맵을 사용하여 빈도수를 계산하는 것은 좋은 아이디어입니다.
5. **개선 사항**: 코드를 개선할 수 있는 방법은 한 번의 반복문으로 시작 인덱스와 끝 인덱스를 찾는 것입니다. 이를 위해 첫 번째 반복문에서 시작 인덱스를 찾을 수 있습니다. 예를 들어, 해시 맵에 각 요소의 첫 번째 인덱스를 저장할 수 있습니다. 이를 통해 두 번째 반복문을 제거할 수 있습니다. 또한, 변수 이름을 더 명확하게 만들 수 있습니다. 예를 들어, `maxCnt` 대신 `maxFrequency`를 사용할 수 있습니다. 

```java
class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        Map<Integer, Integer> firstIndexMap = new HashMap<>();
        Map<Integer, Integer> lastIndexMap = new HashMap<>();
        int maxFrequency = 0;
        int shortestLength = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            frequencyMap.put(nums[i], frequencyMap.getOrDefault(nums[i], 0) + 1);
            if (!firstIndexMap.containsKey(nums[i])) {
                firstIndexMap.put(nums[i], i);
            }
            lastIndexMap.put(nums[i], i);
            if (frequencyMap.get(nums[i]) > maxFrequency) {
                maxFrequency = frequencyMap.get(nums[i]);
                shortestLength = lastIndexMap.get(nums[i]) - firstIndexMap.get(nums[i]) + 1;
            } else if (frequencyMap.get(nums[i]) == maxFrequency) {
                shortestLength = Math.min(shortestLength, lastIndexMap.get(nums[i]) - firstIndexMap.get(nums[i]) + 1);
            }
        }
        return shortestLength;
    }
}
```
