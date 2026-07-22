# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 22. 오전 10:40:11 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.5 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/rotate-string/submissions/)

## Code Review

**코드 리뷰**

1. **시간 복잡도**: O(n) - 현재 구현된 코드는 무한루프에 빠지기 때문에 시간 복잡도가 정확하게 계산되지 않습니다. 그러나 목표 문자열과 비교하는 과정에서 문자열의 길이만큼 반복하기 때문에 O(n)이라고 볼 수 있습니다. 하지만 실제로 구현된 코드에서는 문자열을 회전시키는 로직이 제대로 구현되지 않았습니다.

2. **공간 복잡도**: O(n) - 문자열을 배열로 변환하고 임시 배열을 사용하기 때문에 공간 복잡도는 O(n)입니다.

3. **풀이 접근법**: 문자열 회전 문제를 해결하기 위해 문자열을 배열로 변환하고, 목표 문자열과 비교하는 방식을 사용했습니다. 그러나 실제로 구현된 코드에서는 문자열을 회전시키는 로직이 제대로 구현되지 않았습니다. 일반적으로는 문자열을 회전시키는 로직을 구현하여 회전된 문자열과 목표 문자열을 비교하는 방식을 사용합니다.

4. **잘된 점**: 문자열의 길이가 다르면 즉시 false를 반환하는 부분은 효율적인 접근법입니다. 또한 문자열을 배열로 변환하여 비교하는 방식도 좋습니다.

5. **개선 사항**: 현재 구현된 코드는 무한루프에 빠지기 때문에 제대로 동작하지 않습니다. 문자열을 회전시키는 로직을 구현해야 합니다. 예를 들어, 문자열을 회전시키는 로직을 구현하여 회전된 문자열과 목표 문자열을 비교하는 방식을 사용할 수 있습니다. 또한, 문자열을 회전시키는 과정에서 문자열의 길이만큼 반복하기 때문에 반복 횟수를 제한할 수 있습니다. 예를 들어, 문자열의 길이만큼 반복하면 동일한 문자열이 반복되기 때문에 더 이상 반복할 필요가 없습니다. 따라서 반복 횟수를 문자열의 길이로 제한할 수 있습니다. 

```java
class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        for (int i = 0; i < s.length(); i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            if (rotated.equals(goal)) return true;
        }
        return false;
    }
}
```
