# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026-04-21 19:57:24 |
| Language | java |
| Runtime | 17 ms (Beats 15.9%) |
| Memory | 52.7 MB (Beats 78.3%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/majority-element/submissions/)

## Code Review

코드 리뷰를 진행하겠습니다.

1. **시간 복잡도**: 이 코드의 시간 복잡도는 O(n)입니다. 여기서 n은 입력 배열의 크기입니다. 이유는 코드가 한번의 반복문을 통해 모든 요소를 처리하기 때문입니다.

2. **공간 복잡도**: 이 코드의 공간 복잡도는 O(n)입니다. 이유는 모든 요소를 Map에 넣어야 할 경우 최대 n개의 요소를 저장해야 하기 때문입니다.

3. **풀이 접근법**: 이 코드는 해싱(Hashing)을 활용하여 Majority Element를 찾는 접근법을 사용합니다. 각 요소가 등장할 때마다 Map에 넣고, 해당 요소의 개수가 전체 요소의 절반을 넘는 경우 Majority Element로 반환합니다.

4. **잘된 점**: 코드가 매우 심플하고 이해하기 쉽습니다. 또한, Majority Element가 반드시 존재한다는 가정을 전제로 하면, 최적의 시간복잡도인 O(n)으로 समस를 해결합니다.

5. **개선 사항**: Majority Element가 반드시 존재한다는 가정이 아니고, 존재하지 않는 경우를 대비해 오류처리를 해줄 수 있습니다. 또한, Boyer-Moore Voting Algorithm 등의 다른 알고리즘을 사용하면 공간복잡도를 O(1)까지 낮출 수 있습니다. 예를 들어, Boyer-Moore Voting Algorithm을 사용하면 공간복잡도가 O(1)으로 개선될 수 있습니다.
```java
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = nums[0];
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        int occurrences = 0;
        for (int num : nums) {
            if (num == candidate) {
                occurrences++;
            }
        }
        return occurrences > nums.length / 2 ? candidate : -1;
    }
}
```
