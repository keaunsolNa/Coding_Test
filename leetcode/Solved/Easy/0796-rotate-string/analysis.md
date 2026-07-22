# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 22. 오전 10:43:37 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.4 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/rotate-string/submissions/)

## Code Review

**코드 리뷰**

1. **시간 복잡도**: O(n^2) - 문자열의 길이가 n일 때, 문자열을 회전시키고 비교하는 과정에서 n번의 반복이 발생하며, 각 반복에서 문자열을 비교하는 과정에서 추가로 n번의 반복이 발생하기 때문입니다.

2. **공간 복잡도**: O(n) - 문자열을 회전시키기 위해 임시 배열을 사용하며, 이 배열의 크기는 문자열의 길이와 동일합니다.

3. **풀이 접근법**: 문자열 회전 알고리즘을 사용하여 문자열을 회전시키고, 회전된 문자열을 목표 문자열과 비교하는 방식입니다. 이 알고리즘은 문자열의 회전을 시뮬레이션하여 문자열을 비교하는 패턴입니다.

4. **잘된 점**: 코드는 문자열의 회전을 시뮬레이션하는 부분에서 잘 구현되어 있습니다. 또한, 문자열의 길이가 1인 경우를 별도로 처리하여 효율성을 높였습니다.

5. **개선 사항**: 현재 구현된 알고리즘은 효율성이 떨어질 수 있습니다. 대안적인 접근법으로는 문자열을 두 번 연결하여 새로운 문자열을 생성하고, 이 새로운 문자열에서 목표 문자열을 찾는 방식입니다. 예를 들어, "abc"를 "abcabc"로 확장하여 "abc"를 찾는 방식입니다. 이 방식은 문자열의 회전을 시뮬레이션하는 것보다 더 효율적일 수 있습니다. 또한, Java의 String 클래스에서 제공하는 `contains()` 메서드를 사용하여 목표 문자열을 찾을 수 있습니다. 이는 코드를 더 간결하고 효율적으로 만들 수 있습니다. 

```java
class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        return (s + s).contains(goal);
    }
}
```
