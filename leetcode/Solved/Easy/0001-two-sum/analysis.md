# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 6. 16. 오후 9:09:10 |
| Language | java |
| Runtime | 13 ms (Beats 41.8%) |
| Memory | 49 MB (Beats 11.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/two-sum/submissions/)

## Code Review

LeetCode의 two-sum 문제에 대한 코드 리뷰입니다.

1. **시간 복잡도**: 코드의 시간 복잡도는 O(n^2)입니다. 이는 두 개의 반복문이 중첩되어 사용되기 때문입니다. 첫 번째 반복문에서 배열을 순회하고, 두 번째 반복문에서 다시 배열을 순회하기 때문에 시간 복잡도가 증가합니다.

2. **공간 복잡도**: 코드의 공간 복잡도는 O(n)입니다. 이는 해시맵을 사용하여 배열의 원소들을 저장하기 때문입니다. 해시맵의 크기는 배열의 크기에 비례하기 때문에 공간 복잡도가 증가합니다.

3. **풀이 접근법**: 코드에서는 해시맵과 이중 반복문을 사용하여 두 개의 원소가 주어진 타겟을 합산하는지 확인합니다. 이는 브루트 포스 알고리즘의 일종입니다. 하지만, 코드에서 사용된 접근법은 효율적이지 않습니다. 더 효율적인 접근법은 한 번의 반복문에서 해시맵을 사용하여 타겟을 찾는 것입니다.

4. **잘된 점**: 코드에서 잘 구현된 부분은 해시맵을 사용하여 원소들의 인덱스를 저장하는 것입니다. 이는 두 개의 원소가 같은지 확인할 때 유용합니다.

5. **개선 사항**: 코드를 최적화하기 위해 한 번의 반복문에서 해시맵을 사용하여 타겟을 찾는 접근법을 사용할 수 있습니다. 또한, 배열을 정렬할 필요가 없습니다. 개선된 코드는 다음과 같습니다.
```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
```
이 개선된 코드의 시간 복잡도는 O(n)이고, 공간 복잡도는 O(n)입니다. 이는 한 번의 반복문에서 해시맵을 사용하여 타겟을 찾기 때문입니다.
