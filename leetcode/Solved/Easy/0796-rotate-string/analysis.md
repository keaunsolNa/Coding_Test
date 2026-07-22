# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 22. 오전 10:42:42 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.5 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/rotate-string/submissions/)

## Code Review

**코드 리뷰**

1. **시간 복잡도**: O(n^2) - 문자열의 길이가 n일 때, 문자열을 회전시키는 과정에서 n번의 반복이 발생하고, 각 반복에서 문자열의 비교가 발생하기 때문에 시간 복잡도는 O(n^2)입니다.

2. **공간 복잡도**: O(n) - 문자열을 회전시키는 과정에서 임시 배열을 사용하기 때문에 공간 복잡도는 O(n)입니다.

3. **풀이 접근법**: 문자열 회전을 직접 구현하여 목표 문자열과 비교하는 알고리즘을 사용했습니다. 이는 브루트 포스 알고리즘의 일종으로, 모든 가능한 회전을 시도하여 목표 문자열과 일치하는지 확인합니다.

4. **잘된 점**: 코드는 문제의 요구사항을 충족하며, 문자열 회전을 구현하는 과정을 명확하게 보여줍니다. 또한, 임시 배열을 사용하여 문자열 회전을 효율적으로 구현했습니다.

5. **개선 사항**: 현재 구현된 코드는 효율적이지 않습니다. 문자열 회전을 구현하는 더 효율적인 방법은 문자열을 두 번 연결하여 회전을 구현하는 것입니다. 예를 들어, "abc"를 "abcabc"로 연결하여 회전을 구현할 수 있습니다. 이 방법을 사용하면 시간 복잡도를 O(n)으로 개선할 수 있습니다. 또한, 문자열 비교를 위해 `String` 클래스의 `equals` 메서드를 사용하는 것이 더 효율적입니다. 

```java
class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        return (s + s).contains(goal);
    }
}
```

이러한 개선 사항을 적용하면 코드를 더 효율적이고 간결하게 만들 수 있습니다.
