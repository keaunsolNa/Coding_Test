# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 6. 17. 오후 9:05:28 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.9 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/is-subsequence/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n*m) - 여기서 n은 문자열 s의 길이, m은 문자열 t의 길이입니다. 내부 루프에서 문자열 t를 순회하기 때문입니다. 그러나 현재 구현된 코드는 효율적이지 않습니다. 

2. **공간 복잡도**: O(n) - 문자열 s를 toArray() 함수로 변환하여 공간을 사용합니다. 그러나 이는 상수 공간 복잡도 O(1)로 개선될 수 있습니다.

3. **풀이 접근법**: 현재 코드는 두 개의 반복문을 사용하여 문자열 s와 t를 비교합니다. 그러나 이 접근법은 비효율적입니다. 더好的 접근법은 두 개의 포인터를 사용하여 문자열 s와 t를 순회하는 것입니다.

4. **잘된 점**: 코드는 간단하고 이해하기 쉽습니다. 그러나 현재 구현된 코드는 논리적으로 올바르지 않습니다. cnt 변수의 초기값은 s.length()로 설정되어 있으며, 문자열 t에서 문자열 s의 문자를 찾을 때마다 cnt를 증가시킵니다. 그러나 이는 올바른 논리 नह입니다. 

5. **개선 사항**: 현재 코드는 두 개의 반복문을 사용하여 문자열 s와 t를 비교합니다. 그러나 더好的 접근법은 두 개의 포인터를 사용하여 문자열 s와 t를 순회하는 것입니다. 또한, cnt 변수의 초기값과 증가 로직을 수정하여 올바른 결과를 얻을 수 있습니다. 예를 들어, 두 개의 포인터를 사용하여 문자열 s와 t를 순회하고, 문자열 t에서 문자열 s의 문자를 찾을 때마다 포인터를 증가시킵니다. 만약 문자열 s의 모든 문자를 찾으면 true를 반환하고, 아니라면 false를 반환합니다. 

```java
class Solution {
    public boolean isSubsequence(String s, String t) {
        int sIndex = 0;
        int tIndex = 0;
        
        while (sIndex < s.length() && tIndex < t.length()) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
            }
            tIndex++;
        }
        
        return sIndex == s.length();
    }
}
```
