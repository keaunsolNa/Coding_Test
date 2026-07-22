# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 22. 오전 10:41:30 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.7 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/rotate-string/submissions/)

## Code Review

**코드 리뷰**

1. **시간 복잡도**: O(n^2) - 문자열의 길이가 n이라고 가정할 때, 문자열을 회전시키는 과정에서 각 문자를 비교해야 하므로 n번의 비교가 필요하고, 회전을 최대 n번 수행해야 하므로 시간 복잡도는 O(n^2)입니다.

2. **공간 복잡도**: O(n) - 문자열을 회전시키는 과정에서 임시 배열을 사용하므로 공간 복잡도는 O(n)입니다.

3. **풀이 접근법**: 문자열 회전을 직접 구현하여 목표 문자열과 비교하는 알고리즘이 사용되었습니다. 이 접근법은 직관적이지만 효율성이 떨어질 수 있습니다.

4. **잘된 점**: 코드는 문제의 요구사항을 충족하며, 문자열의 길이가 1인 경우를 별도로 처리하여 효율성을 향상시켰습니다.

5. **개선 사항**: 문자열 회전을 직접 구현하는 대신, 문자열을 두 번 연결하여 회전을 구현할 수 있습니다. 예를 들어, "abc"를 "abcabc"로 연결한 후, "abc"를 찾는 방식입니다. 이 접근법은 시간 복잡도를 O(n)으로 줄일 수 있습니다. 또한, Java의 StringBuilder 클래스를 사용하여 문자열을 효율적으로 회전시킬 수 있습니다. 

```java
class Solution {
    public boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }
}
```
