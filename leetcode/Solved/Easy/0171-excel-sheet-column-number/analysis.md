# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 21. 오전 10:27:19 |
| Language | java |
| Runtime | 1 ms (Beats 0.0%) |
| Memory | 42.6 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/excel-sheet-column-number/submissions/)

## Code Review

코드 리뷰를 진행하겠습니다.

1. **시간 복잡도**: O(n) - 입력 문자열의 길이(n)에 비례하는 시간 복잡도를 가지고 있습니다. 이는 문자열을 한 번만 순회하기 때문입니다.

2. **공간 복잡도**: O(n) - 입력 문자열을 문자 배열로 변환하기 때문에 공간 복잡도도 문자열의 길이(n)에 비례합니다.

3. **풀이 접근법**: 이 문제는 26진법을 10진법으로 변환하는 문제입니다. 문자열을 뒤에서부터 순회하면서 각 문자의 값을 계산하고, 결과를 누적하는 방식으로 해결합니다. 이는 26진법의 특성을 잘 활용한 풀이입니다.

4. **잘된 점**: 코드는 간결하고, 문제의 의도를 명확하게 표현하고 있습니다. 또한, 각 문자의 값을 계산하는 부분에서 26진법의 특성을 잘 활용하고 있습니다.

5. **개선 사항**: 코드에서 `target` 변수의 계산 부분을 더 간결하게 만들 수 있습니다. 또한, `System.out.println`문을 제거하여 코드를 더 깔끔하게 만들 수 있습니다. 예를 들어, `target` 변수의 계산 부분을 `(arr[i] - 'A' + 1) * (int)Math.pow(26, arr.length - i - 1)`로 변경할 수 있습니다. 또한, 변수명이 더 명확하게 변경되어야 합니다. 예를 들어, `ans`를 `result`로, `arr`을 `chars`로 변경할 수 있습니다. 최종적으로, 코드는 다음과 같이 개선될 수 있습니다.
```java
class Solution {
    public int titleToNumber(String columnTitle) {
        char[] chars = columnTitle.toCharArray();
        int result = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            result += (chars[i] - 'A' + 1) * (int)Math.pow(26, arr.length - i - 1);
        }
        return result;
    }
}
```
