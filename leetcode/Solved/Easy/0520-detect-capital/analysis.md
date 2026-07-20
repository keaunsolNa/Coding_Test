# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 20. 오후 5:37:33 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.7 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/detect-capital/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 입력 문자열의 길이(n)에 비례하는 시간 복잡도를 가지고 있습니다. 이는 문자열을 두 번 반복하여 검사하기 때문입니다.

2. **공간 복잡도**: O(n) - 입력 문자열의 길이(n)에 비례하는 공간 복잡도를 가지고 있습니다. 이는 문자열을 배열로 변환하고, 추가적인 배열을 생성하여 사용하기 때문입니다.

3. **풀이 접근법**: 문자열을 배열로 변환하고, 각 문자의 ASCII 값을 계산하여 대문자와 소문자를 구분하는 방식을 사용했습니다. 이는 기본적인 문자열 처리 알고리즘을 사용한 접근법입니다.

4. **잘된 점**: 코드는 문제의 요구 사항을 충족하며, 대문자와 소문자의 구분을 제대로 처리합니다. 또한, 코드는 비교적 간단하고 이해하기 쉽습니다.

5. **개선 사항**: 코드에서 사용된 변수명이 직관적이지 않습니다. 예를 들어, `arr2`는 무엇을 나타내는지 명확하지 않습니다. 또한, 코드에서 사용된 알고리즘은 비교적 간단하지만, 더 최적화된 방법으로 접근할 수 있습니다. 예를 들어, 문자열을 직접 처리하여 추가적인 배열을 생성하지 않도록 할 수 있습니다. 또한, `System.out.println` 문은 테스트 목적으로 사용된 것으로 보이지만, 실제 코드에서는 제거되어야 합니다. 코드를 더 간결하고 효율적으로 개선할 수 있습니다. 

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
