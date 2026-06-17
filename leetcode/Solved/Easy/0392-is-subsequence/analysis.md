# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 6. 17. 오후 9:07:36 |
| Language | java |
| Runtime | 1 ms (Beats 95.1%) |
| Memory | 42.7 MB (Beats 62.8%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/is-subsequence/submissions/)

## Code Review

**코드 리뷰**

1. **시간 복잡도**: O(n*m) - 여기서 n은 문자열 s의 길이, m은 문자열 t의 길이입니다. 내부 루프에서 문자열 t를 순회하기 때문에 시간 복잡도가 증가합니다.
2. **공간 복잡도**: O(n) - 문자열 s를 toCharArray() 메서드를 통해 배열로 변환하기 때문에 공간 복잡도가 증가합니다. 그러나 이 경우 n은 문자열 s의 길이로 상수 시간 복잡도에 비하면 작습니다.
3. **풀이 접근법**: 이 코드는 두 개의 포인터를 사용하여 문자열 s와 t를 순회하는 접근법을 사용합니다. 그러나 내부 루프에서 문자열 t를 순회하는 방식은 비효율적입니다. 더 효율적인 방법은 두 개의 포인터를 사용하여 동시에 문자열 s와 t를 순회하는 것입니다.
4. **잘된 점**: 코드는 간결하고 이해하기 쉽습니다. 또한, 문제의 요구 사항을 충족하는지 확인하기 위해 cnt 변수를 사용하여 문자열 s의 모든 문자가 문자열 t에 포함되는지 확인합니다.
5. **개선 사항**: 내부 루프에서 문자열 t를 순회하는 방식은 비효율적입니다. 더 효율적인 방법은 두 개의 포인터를 사용하여 동시에 문자열 s와 t를 순회하는 것입니다. 예를 들어, 다음과 같이 코드를 개선할 수 있습니다.

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

이 코드는 시간 복잡도를 O(n+m)으로 개선하고, 더 효율적인 방법으로 문자열 s와 t를 순회합니다.
