# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 21. 오전 10:29:44 |
| Language | java |
| Runtime | 1 ms (Beats 0.0%) |
| Memory | 42.7 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/excel-sheet-column-number/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 입력 문자열의 길이(n)에 비례하는 시간 복잡도를 가지고 있습니다. 이는 문자열을 한 번만 순회하기 때문입니다.

2. **공간 복잡도**: O(n) - 입력 문자열을 문자 배열로 변환하기 때문에 공간 복잡도도 입력 문자열의 길이(n)에 비례합니다.

3. **풀이 접근법**: 이 문제는 26진법을 10진법으로 변환하는 문제로 볼 수 있습니다. 따라서 각 자릿수의 값을 계산하여 총합을 구하는 방식의 알고리즘을 사용했습니다. 하지만 코드에서 사용된 공식은 올바르지 않아 결과가 정확하지 않을 수 있습니다.

4. **잘된 점**: 코드는 간단하고 이해하기 쉽습니다. 또한 입력 문자열을 문자 배열로 변환하여 각 자릿수의 값을 계산하는 방식은 적절합니다.

5. **개선 사항**: 코드에서 사용된 공식은 올바르지 않습니다. 26진법을 10진법으로 변환하는 올바른 방식은 각 자릿수의 값을 26의 제곱으로 계산하여 총합을 구하는 것입니다. 예를 들어, "AZ"의 경우, 'A'의 값은 1 * 26^1 = 26, 'Z'의 값은 26 * 26^0 = 26입니다. 따라서 총합은 26 + 26 = 52입니다. 또한 불필요한 출력문을 제거하여 코드를 간결하게 할 수 있습니다. 다음은 개선된 코드입니다.
```java
class Solution {
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        for (char c : columnTitle.toCharArray()) {
            ans = ans * 26 + (c - 'A' + 1);
        }
        return ans;
    }
}
```
