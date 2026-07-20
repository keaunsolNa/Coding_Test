# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 20. 오후 5:40:23 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.5 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/detect-capital/submissions/)

## Code Review

**코드 리뷰**

1. **시간 복잡도**: O(n) - 이 코드는 입력 문자열의 각 문자를 두 번 반복하여 처리하므로, 시간 복잡도는 문자열의 길이(n)와 비례합니다.
2. **공간 복잡도**: O(n) - 입력 문자열을 문자 배열과 정수 배열로 변환하므로, 공간 복잡도도 문자열의 길이(n)와 비례합니다.
3. **풀이 접근법**: 이 코드는 대문자와 소문자의 사용 패턴을 확인하기 위해 문자 배열을 사용하고, 각 문자의 ASCII 값을 계산하여 대문자와 소문자를 구분합니다. 이는 기본적인 문자열 처리 알고리즘을 사용한 접근법입니다.
4. **잘된 점**: 코드는 문제의 요구 사항을 충족하며, 대문자와 소문자의 사용 패턴을 올바르게 확인합니다. 또한, 코드는 비교적 간단하고 이해하기 쉽습니다.
5. **개선 사항**: 코드는 다음과 같은 부분에서 개선할 수 있습니다.
 * 불필요한 변수와 반복문을 제거하여 코드를 더 간결하게 만들 수 있습니다.
 * ASCII 값을 계산하는 대신, Java의 `Character.isUpperCase()`와 `Character.isLowerCase()` 메서드를 사용하여 대문자와 소문자를 구분할 수 있습니다.
 * 코드의 가독성을 높이기 위해 변수 이름을 더 명확하게 지정할 수 있습니다.
 * System.out.println 문을 제거하여 코드를 더 깨끗하게 유지할 수 있습니다.

예를 들어, 다음과 같이 코드를 개선할 수 있습니다:
```java
class Solution {
    public boolean detectCapitalUse(String word) {
        boolean isAllUpperCase = true;
        boolean isAllLowerCase = true;
        boolean isFirstCharUpperCase = Character.isUpperCase(word.charAt(0));

        for (int i = 1; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                isAllLowerCase = false;
            } else {
                isAllUpperCase = false;
            }
        }

        return isAllUpperCase || isAllLowerCase || (isFirstCharUpperCase && isAllLowerCase);
    }
}
```
