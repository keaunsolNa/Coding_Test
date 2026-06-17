# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 6. 17. 오후 9:06:30 |
| Language | java |
| Runtime | 2 ms (Beats 0.0%) |
| Memory | 43 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/is-subsequence/submissions/)

## Code Review

LeetCode 솔루션을 검토한 결과, 다음과 같은 사항을 발견했습니다.

1. **시간 복잡도**: O(n*m) - 여기서 n은 문자열 s의 길이, m은 문자열 t의 길이입니다. 내부 루프에서 문자열 t를 순회하기 때문에 시간 복잡도가 증가합니다.
2. **공간 복잡도**: O(1) - 추가적인 공간을 사용하지 않기 때문에 공간 복잡도는 상수입니다. 단, 문자열 s를 toCharArray() 메서드로 변환하는 과정에서 임시 공간이 사용되지만, 이는 상수 공간으로 간주됩니다.
3. **풀이 접근법**: 두 개의 문자열을 비교하는 문제로, 내부 루프를 사용하여 문자열 t에서 문자열 s의 각 문자를 찾는 방식입니다. 이 접근법은 두 개의 포인터를 사용하여 문자열을 비교하는 Two Pointers 알고리즘과 유사합니다.
4. **잘된 점**: 코드는 비교적 간단하고 이해하기 쉽습니다. 또한, System.out.println()문을 사용하여 중간 결과를 출력하여 디버깅에 도움이 됩니다.
5. **개선 사항**: 현재 구현된 코드는 비효율적입니다. 내부 루프에서 문자열 t를 순회하는 과정에서 중복된 작업이 발생합니다. 이를 개선하기 위해, 두 개의 포인터를 사용하여 문자열 s와 문자열 t를 동시에 순회하는 방식으로 변경할 수 있습니다. 예를 들어, 다음과 같이 구현할 수 있습니다.

```java
class Solution {
    public boolean isSubsequence(String s, String t) {
        int indexS = 0;
        int indexT = 0;
        
        while (indexS < s.length() && indexT < t.length()) {
            if (s.charAt(indexS) == t.charAt(indexT)) {
                indexS++;
            }
            indexT++;
        }
        
        return indexS == s.length();
    }
}
```

이러한 변경으로 시간 복잡도를 O(n+m)으로 개선할 수 있습니다.
