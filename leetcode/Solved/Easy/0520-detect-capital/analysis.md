# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 20. 오후 5:40:53 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.5 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/detect-capital/submissions/)

## Code Review

**코드 리뷰**

1. **시간 복잡도**: O(n) - 입력 문자열의 길이(n)에 비례하는 시간 복잡도를 가지고 있습니다. 이는 문자열을 두 번 순회하기 때문입니다.
2. **공간 복잡도**: O(n) - 입력 문자열의 길이(n)에 비례하는 공간 복잡도를 가지고 있습니다. 이는 문자열을 배열로 변환하고, 추가 배열을 생성하기 때문입니다.
3. **풀이 접근법**: 문자열을 배열로 변환하고, 각 문자의 ASCII 값을 계산하여 대문자와 소문자를 구분합니다. 이후, 여러 조건문을 사용하여 대문자 사용 규칙을 검사합니다.
4. **잘된 점**: 코드는 문제의 요구 사항을 구현했습니다. 또한, 각 문자의 ASCII 값을 계산하여 대문자와 소문자를 구분하는 방법은 창의적입니다.
5. **개선 사항**: 코드는 여러 번의 순회와 조건문을 사용하여 복잡합니다. 이를 개선하기 위해, 단일 순회에서 모든 조건을 검사할 수 있는 방법을 고려할 수 있습니다. 또한, 불필요한 배열 생성을 피할 수 있습니다. 예를 들어, 다음과 같이 개선할 수 있습니다.
```java
class Solution {
    public boolean detectCapitalUse(String word) {
        int count = 0;
        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) count++;
        }
        return count == 0 || count == word.length() || (count == 1 && Character.isUpperCase(word.charAt(0)));
    }
}
```
이 코드는 단일 순회에서 모든 조건을 검사하고, 불필요한 배열 생성을 피합니다.
