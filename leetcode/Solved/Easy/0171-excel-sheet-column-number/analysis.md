# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 21. 오전 10:28:44 |
| Language | java |
| Runtime | 1 ms (Beats 0.0%) |
| Memory | 42.3 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/excel-sheet-column-number/submissions/)

## Code Review

코드 리뷰를 다음과 같이 진행하겠습니다.

1. **시간 복잡도**: Big-O 표기법으로는 O(n)입니다. 여기서 n은 입력 문자열의 길이입니다. 이유는 입력 문자열의 각 문자를 한 번씩만 처리하기 때문입니다.

2. **공간 복잡도**: Big-O 표기법으로는 O(n)입니다. 입력 문자열을 문자 배열로 변환하기 때문에 공간 복잡도가 발생합니다.

3. **풀이 접근법**: 이 문제는 26진법을 10진법으로 변환하는 문제로 볼 수 있습니다. 사용된 알고리즘은 각 자릿수의 값을 계산하여 총합을 구하는 것입니다. 하지만 코드에서 사용된 접근법은 조금 복잡하고, 중간에 불필요한 연산이 포함되어 있습니다.

4. **잘된 점**: 코드에서 잘 구현된 점은 입력 문자열을 문자 배열로 변환하여 각 문자를 쉽게 접근할 수 있도록 한 것입니다. 또한, 각 자릿수의 값을 계산하여 총합을 구하는 기본적인 아이디어는 올바르습니다.

5. **개선 사항**: 코드를 개선할 수 있는 방법은 다음과 같습니다. 먼저, 불필요한 연산을 제거하고, 코드를 더 간결하게 만들 수 있습니다. 예를 들어, 각 자릿수의 값을 계산할 때, 26의 거듭제곱을 미리 계산하여 저장해두면 연산을 줄일 수 있습니다. 또한, 변수의 이름을 더 명확하게 바꾸면 코드의 가독성이 향상됩니다. 예를 들어, `target` 변수는 `digitValue`로, `idx` 변수는 `power`로 바꿀 수 있습니다. 마지막으로, 디버깅을 위한 출력문을 제거하여 코드를 더 깨끗하게 만들 수 있습니다. 

다음은 개선된 코드의 예시입니다.
```java
class Solution {
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        int power = 0;
        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            char c = columnTitle.charAt(i);
            int digitValue = c - 'A' + 1;
            ans += digitValue * Math.pow(26, power);
            power++;
        }
        return ans;
    }
}
```
