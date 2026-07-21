# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 21. 오전 11:05:18 |
| Language | java |
| Runtime | 1 ms (Beats 0.0%) |
| Memory | 42.4 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/excel-sheet-column-number/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 여기서 n은 입력 문자열의 길이입니다. 문자열을 한 번만 순회하기 때문에 시간 복잡도는 선형입니다.

2. **공간 복잡도**: O(n) - 문자열을 문자 배열로 변환하기 때문에 공간 복잡도는 입력 문자열의 길이와 동일합니다.

3. **풀이 접근법**: 이 문제는 26진법의 원리를 이용하여 해결할 수 있습니다. 각 문자를 해당하는 숫자로 변환하고, 자릿수에 맞게 26의 거듭제곱을 곱하여 더하는 방식입니다. 하지만 현재 구현된 코드는 이 원리를 완전히 반영하지 못하고 있습니다.

4. **잘된 점**: 문자열을 문자 배열로 변환하여 각 문자에 쉽게 접근할 수 있도록 구현한 점은 좋습니다. 또한, 결과를 계산하는 변수 `ans`를 초기화하여 사용한 점도 좋습니다.

5. **개선 사항**: 현재 코드는 26진법의 원리를 완전히 반영하지 못하고 있습니다. 각 문자의 값을 26의 거듭제곱으로 계산하여 더하는 대신, 현재는 26의 거듭제곱을 더하는 방식으로 구현되어 있습니다. 이를 개선하기 위해, 각 문자의 값을 26의 거듭제곱으로 계산하여 더하는 방식으로 수정할 수 있습니다. 예를 들어, 'A'의 경우 1, 'B'의 경우 2, ..., 'Z'의 경우 26으로 계산하여 해당 자릿수의 26의 거듭제곱으로 계산된 값을 더하는 방식으로 구현할 수 있습니다. 또한, `Math.pow` 함수의 사용을 줄이기 위해 26의 거듭제곱을 미리 계산하여 저장할 수 있습니다. 

```java
class Solution {
    public int titleToNumber(String columnTitle) {
        char[] arr = columnTitle.toCharArray();
        int ans = 0;
        int base = 1;
        
        for (int i = arr.length - 1; i >= 0; i--) {
            ans += (arr[i] - 'A' + 1) * base;
            base *= 26;
        }
        
        return ans;
    }
}
```
