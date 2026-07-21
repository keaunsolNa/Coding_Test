# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 21. 오전 10:27:00 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.8 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/excel-sheet-column-number/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 여기서 n은 columnTitle의 길이입니다. 코드는 columnTitle의 각 문자를 한 번씩만 처리하기 때문입니다.

2. **공간 복잡도**: O(n) - columnTitle을 문자 배열로 변환하기 때문에 발생합니다. 그러나 실제로 사용하는 공간은 문자열의 길이와 동일합니다.

3. **풀이 접근법**: 이 문제는 26진법을 10진법으로 변환하는 문제입니다. 코드는 columnTitle의 각 문자를 26진법의 자릿수로 간주하고, 이를 10진법으로 변환하는 방식으로 해결합니다. 그러나 현재 구현된 코드는 정확하지 않습니다. 26진법의 각 자릿수는 이전 자릿수의 26의 거듭제곱을 곱한 값을 더해야 합니다.

4. **잘된 점**: 코드는 columnTitle을 문자 배열로 변환하여 각 문자를 쉽게 접근할 수 있게 합니다. 또한, 각 문자의 값을 계산하는 부분은 명확합니다.

5. **개선 사항**: 현재 코드는 26진법을 10진법으로 변환하는 로직이 정확하지 않습니다. 이를 개선하기 위해, 각 자릿수의 값을 26의 거듭제곱을 곱한 값으로 계산해야 합니다. 예를 들어, "AB"의 경우, 'A'의 값은 26^1 * 1 + 26^0 * 2로 계산해야 합니다. 또한, 불필요한 System.out.println 문을 제거하여 코드를 간결하게 할 수 있습니다. 

```java
class Solution {
    public int titleToNumber(String columnTitle) {
        char[] arr = columnTitle.toCharArray();
        int ans = 0;
        int len = arr.length;
        
        for (int i = 0; i < len; i++) {
            int target = arr[i] - 'A' + 1;
            ans += target * Math.pow(26, len - i - 1);
        }
        
        return ans;
    }
}
```
