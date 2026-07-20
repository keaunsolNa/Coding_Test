# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 20. 오후 5:35:12 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.7 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/detect-capital/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 입력 문자열의 길이(n)에 비례하여 반복문을 두 번 실행하기 때문에 시간 복잡도는 선형입니다. 첫 번째 반복문에서 소문자 존재 여부를 확인하고, 두 번째 반복문에서 대문자 또는 소문자만 있는지 확인합니다.

2. **공간 복잡도**: O(n) - 입력 문자열의 길이(n)에 비례하여 두 개의 배열을 생성하기 때문에 공간 복잡도도 선형입니다. 하나의 배열은 문자를 숫자로 변환하여 저장하고, 다른 배열은 사용되지 않기 때문에 불필요한 메모리 사용이 발생합니다.

3. **풀이 접근법**: 문자열을 배열로 변환하고, 각 문자를 숫자로 변환하여 대문자와 소문자를 구분하는 방법을 사용했습니다. 그러나 이 접근법은 불필요한 계산과 메모리 사용을 포함하고 있습니다. 더 효율적인 방법은 문자열의 각 문자를 직접 확인하여 대문자와 소문자를 구분하는 것입니다.

4. **잘된 점**: 코드는 문제의 요구 사항을满족하고, 입력 문자열의 대문자와 소문자 사용을 올바르게 확인합니다. 또한, 변수 이름이 의미 있게 사용되어 코드의 가독성이 좋습니다.

5. **개선 사항**: 불필요한 배열과 변수를 제거하여 코드를 간결하게 만들 수 있습니다. 예를 들어, `arr2` 배열은 사용되지 않기 때문에 제거할 수 있습니다. 또한, 두 번째 반복문을 사용하지 않고, 첫 번째 반복문에서 직접 대문자와 소문자를 확인할 수 있습니다. 이러한 개선으로 코드의 효율성과 가독성을提高할 수 있습니다. 

예를 들어, 다음과 같이 개선할 수 있습니다:
```java
class Solution {
    public boolean detectCapitalUse(String word) {
        boolean isFirstCapital = Character.isUpperCase(word.charAt(0));
        boolean isAllCapital = true;
        boolean isAllNotCapital = true;

        for (int i = 1; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                isAllNotCapital = false;
            } else {
                isAllCapital = false;
            }
        }

        return (isAllCapital || (isFirstCapital && isAllNotCapital)) || (!isFirstCapital && isAllNotCapital);
    }
}
```
