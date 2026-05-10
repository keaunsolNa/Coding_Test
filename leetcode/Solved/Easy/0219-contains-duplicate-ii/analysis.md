# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026-05-10 15:04:57 |
| Language | java |
| Runtime | 1167 ms (Beats 8.0%) |
| Memory | 70.2 MB (Beats 92.9%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/contains-duplicate-ii/submissions/)

## Code Review

리뷰어의 コ멘트입니다.

1. **시간 복잡도**: O(n*k)입니다.nested loop 때문에 시간 복잡도가 높습니다. 여기서 n은 입력 배열의 크기이고, k는 두 개의 중복된 원소 사이의 거리입니다.

2. **공간 복잡도**: O(1)입니다. 공간을 추가로 사용하지 않 quindi, 입력 배열을 제외하고는 공간 복잡도가 일정합니다.

3. **풀이 접근법**: 브루트 포스 알고리즘을 사용했습니다. 각 원소마다 k개의 뒤쪽 원소를 비교합니다. 이 방법은 간단하지만, 효율성이 떨어집니다.

4. **잘된 점**: 코드가 간단하고 이해하기 쉽습니다. 중복된 원소를 찾기 위한 로직이 명확하게 구현되어 있습니다.

5. **개선 사항**: 해시 테이블을 사용하면 효율성을 크게 개선할 수 있습니다. 각 원소를 해시 테이블에 저장하고, 해시 테이블에서 중복된 원소를 찾는 방식입니다. 예를 들어, HashMap을 사용하여 이전에出现한 원소의 인덱스를 저장할 수 있습니다. 이렇게 하면 시간 복잡도를 O(n)으로 줄일 수 있습니다. 

```java
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
```
