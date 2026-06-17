# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 6. 17. 오후 9:06:58 |
| Language | java |
| Runtime | 3 ms (Beats 0.0%) |
| Memory | 42.7 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/is-subsequence/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n*m) - 이중 반복문을 사용하여 문자열 `s`와 `t`를 순회하기 때문에 시간 복잡도가 O(n*m)입니다. 여기서 n은 문자열 `s`의 길이, m은 문자열 `t`의 길이입니다.

2. **공간 복잡도**: O(1) - 추가적인 공간을 사용하지 않기 때문에 공간 복잡도는 O(1)입니다. 단, `toCharArray()` 메서드는 문자열을 문자 배열로 변환하여 추가적인 공간을 사용하지만, 이는 입력 크기에 비례하지 않기 때문에 무시할 수 있습니다.

3. **풀이 접근법**: 이중 반복문을 사용하여 문자열 `s`와 `t`를 순회하는 브루트 포스 알고리즘을 사용했습니다. 하지만, 이 접근법은 효율적이지 않습니다. 더 효율적인 접근법은 두 개의 포인터를 사용하여 문자열 `s`와 `t`를 순회하는 것입니다.

4. **잘된 점**: 코드는 간단하고 이해하기 쉽습니다. 또한, 문제의 요구 사항을 만족하는지 확인하기 위해 `System.out.println`문을 사용하여 디버깅을 쉽게 할 수 있습니다.

5. **개선 사항**: 현재 코드는 효율적이지 않습니다. 더 효율적인 접근법은 두 개의 포인터를 사용하여 문자열 `s`와 `t`를 순회하는 것입니다. 예를 들어, 다음과 같이 구현할 수 있습니다.
```java
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
```
이 코드는 시간 복잡도 O(n+m)으로 더 효율적입니다.
