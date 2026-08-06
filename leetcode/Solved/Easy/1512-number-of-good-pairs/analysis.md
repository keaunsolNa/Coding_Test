# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 5. 오후 5:06:00 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.4 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/number-of-good-pairs/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n^2) - 이중 반복문을 사용하여 배열의 모든 요소에 접근하기 때문에 시간 복잡도가 n^2로 증가합니다. 이는 입력 크기가 커질수록 성능이 저하될 수 있습니다.

2. **공간 복잡도**: O(1) - 추가적인 공간을 사용하지 않기 때문에 공간 복잡도는 상수입니다. 입력 배열을 수정하지 않고 결과만 반환하기 때문입니다.

3. **풀이 접근법**: 브루트 포스 알고리즘을 사용하여 배열의 모든 요소에 접근하고, 각 요소와 비교하여 동일한 쌍의 개수를 세는 방식입니다. 이 접근법은 간단하지만 효율성이 떨어질 수 있습니다.

4. **잘된 점**: 코드는 간단하고 이해하기 쉽습니다. 변수명이 명확하고, 로직이 직관적입니다. 또한, 문제의 요구 사항을 정확히 구현했습니다.

5. **개선 사항**: 해시 테이블을 사용하여 각 숫자의 등장 횟수를 세는 방식으로 최적화할 수 있습니다. 예를 들어, HashMap을 사용하여 숫자를 키로 하고, 그 숫자가 등장한 횟수를 값으로 하여 저장할 수 있습니다. 이후, 각 숫자의 등장 횟수를 이용하여 좋은 쌍의 개수를 계산할 수 있습니다. 이는 시간 복잡도를 O(n)으로 개선할 수 있습니다. 예시 코드는 다음과 같습니다.
```java
class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        int ans = 0;
        for (int count : countMap.values()) {
            ans += count * (count - 1) / 2;
        }
        return ans;
    }
}
```
