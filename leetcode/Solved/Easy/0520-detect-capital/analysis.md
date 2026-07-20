# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 20. 오후 5:36:41 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.9 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/detect-capital/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 코드의 시간 복잡도는 O(n)입니다. 여기서 n은 입력 문자열의 길이입니다. 코드는 문자열을 두 번 순회하기 때문에 시간 복잡도는 선형입니다.

2. **공간 복잡도**: O(n) - 이 코드의 공간 복잡도는 O(n)입니다. 문자열을 배열로 변환하고, 추가적인 배열을 생성하여 각 문자의 ASCII 값을 저장하기 때문입니다.

3. **풀이 접근법**: 이 코드는 문자열을 순회하여 각 문자가 대문자인지 소문자인지 확인하는 방식으로 접근합니다. ASCII 값을 이용하여 대문자와 소문자를 구분합니다. 그러나 코드의 논리 구조가 복잡하여 이해하기 어렵습니다.

4. **잘된 점**: 코드는 문자열을 배열로 변환하여 각 문자에 접근하는 방식을 사용하여 문자열의 각 문자를 쉽게 처리할 수 있습니다.

5. **개선 사항**: 코드의 논리 구조를 단순화하고, 불필요한 변수와 반복문을 제거하여 코드를 더 효율적이고 가독성 있게 만들 수 있습니다. 예를 들어, 대문자와 소문자의 ASCII 값 범위를 이용하여 더 간단한 조건문을 사용할 수 있습니다. 또한, System.out.println 문은 테스트 용도로 사용하는 것이 좋으며, 실제 코드에서는 제거하는 것이 좋습니다. 또한 변수명이 의미가 명확하지 않으므로 변수명을 더 명확하게 변경하는 것이 좋습니다. 

예를 들어, 다음과 같이 개선할 수 있습니다.

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
