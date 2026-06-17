# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 6. 17. 오후 9:07:31 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.8 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/is-subsequence/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n*m) - 두 개의 반복문이 중첩되어 있습니다. 여기서 n은 문자열 s의 길이, m은 문자열 t의 길이입니다. 내부 반복문은 문자열 t를 순회하며 문자열 s의 각 문자와 일치하는 문자를 찾습니다.

2. **공간 복잡도**: O(1) - 추가적인 공간이 거의 사용되지 않습니다. 문자열 s와 t는 입력으로 주어지며, 몇 개의 변수만 사용됩니다.

3. **풀이 접근법**: 이 풀이는 두 개의 문자열을 비교하며, 문자열 s의 각 문자가 문자열 t에 순서대로 포함되는지 확인합니다. 이는 두 개의 포인터를 사용하는 접근법과 유사하지만, 실제로 두 개의 포인터를 사용하는 것이 아니라, 내부 반복문을 통해 문자열 t를 순회합니다.

4. **잘된 점**: 코드는 간단하고 이해하기 쉽습니다. 또한, 문제의 요구 사항을 정확하게 구현하고 있습니다.

5. **개선 사항**: 현재 코드는 문자열 t를 순회하며 문자열 s의 각 문자와 일치하는 문자를 찾습니다. 하지만, 이 과정에서 중복된 순회가 발생할 수 있습니다. 이를 개선하기 위해, 두 개의 포인터를 사용하여 문자열 s와 t를 동시에 순회할 수 있습니다. 예를 들어, 두 개의 포인터 `i`와 `j`를 사용하여 문자열 s와 t를 순회하며, 문자열 s의 `i`번째 문자와 문자열 t의 `j`번째 문자가 일치할 때마다 `i`를 증가시킬 수 있습니다. 이를 통해 시간 복잡도를 O(n+m)으로 개선할 수 있습니다. 

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
