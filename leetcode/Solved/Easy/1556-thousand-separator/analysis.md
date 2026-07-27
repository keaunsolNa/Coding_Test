# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 27. 오후 5:05:27 |
| Language | java |
| Runtime | 2 ms (Beats 23.4%) |
| Memory | 42.3 MB (Beats 88.7%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/thousand-separator/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(log n) - DecimalFormat의 format 메서드는 숫자를 문자열로 변환하는 데 필요한 시간은 숫자의 자릿수에 비례하므로, 입력 숫자 n의 자릿수에 비례하는 시간 복잡도를 가지게 됩니다. 즉, n이 커질수록 자릿수가 증가하므로 시간 복잡도는 O(log n)입니다.

2. **공간 복잡도**: O(log n) - DecimalFormat의 format 메서드는 숫자를 문자열로 변환하여 반환합니다. 따라서 반환된 문자열의 길이는 숫자의 자릿수에 비례하므로, 공간 복잡도는 O(log n)입니다.

3. **풀이 접근법**: DecimalFormat을 사용하여 숫자를 문자열로 변환하고, 천의 자리 구분 기호를 ','에서 '.'로 교체하는 알고리즘을 사용했습니다. 이는 간단하고 직관적인 풀이 방법입니다.

4. **잘된 점**: 코드가 간결하고, DecimalFormat을 사용하여 숫자를 문자열로 변환하는 부분이 잘 구현되어 있습니다. 또한, 천의 자리 구분 기호를 교체하는 부분도 간단명료하게 구현되어 있습니다.

5. **개선 사항**: DecimalFormat을 사용하는 대신, 직접 숫자를 문자열로 변환하고 천의 자리 구분 기호를 추가하는 알고리즘을 구현할 수 있습니다. 이는 DecimalFormat을 사용하는 것보다 더 효율적일 수 있습니다. 또한, 코드에 주석을 추가하여 풀이 방법을 설명하면 더 좋을 것입니다. 예를 들어, 직접 구현하는 방법은 다음과 같습니다.
```java
class Solution {
    public String thousandSeparator(int n) {
        String str = Integer.toString(n);
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            if ((str.length() - i) % 3 == 0 && i != 0) {
                sb.append('.');
            }
            sb.append(str.charAt(i));
        }
        return sb.reverse().toString();
    }
}
```
