# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 20. 오후 5:42:32 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.3 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/detect-capital/submissions/)

## Code Review

**코드 리뷰**

1. **시간 복잡도**: O(n) - 이 코드의 시간 복잡도는 입력 문자열의 길이(n)와 동일합니다. 문자열을 두 번 반복하여 문자를 확인하기 때문입니다.
2. **공간 복잡도**: O(n) - 코드는 입력 문자열의 길이(n)만큼의 추가 공간을 사용하여 문자 배열을 생성합니다.
3. **풀이 접근법**: 이 코드는 문자열을 반복적으로 확인하여 대문자와 소문자의 사용을 검사합니다. 이는 간단한 문자열 처리 알고리즘을 사용한 것입니다.
4. **잘된 점**: 코드는 문제의 조건을 모두 충족하며, 입력 문자열의 길이가 1인 경우를 별도로 처리하여 효율성을 높였습니다.
5. **개선 사항**: 코드의 구조가 다소 복잡하고, 불필요한 변수와 반복문이 존재합니다. 예를 들어, `arr2` 배열은 불필요하며, 대신에 `Character.isUpperCase()` 메서드를 사용하여 대문자 여부를 바로 확인할 수 있습니다. 또한, 코드의 논리를 단순화하고 가독성을 높이기 위해 변수 이름과 주석을 추가할 수 있습니다. 예를 들어, 다음과 같이 개선할 수 있습니다.

```java
class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.length() == 1) return true;
        
        boolean isFirstCapital = Character.isUpperCase(word.charAt(0));
        boolean isAllCapital = true;
        boolean isAllLower = true;
        
        for (int i = 1; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                isAllLower = false;
            } else {
                isAllCapital = false;
            }
        }
        
        return isAllCapital || isAllLower || (isFirstCapital && isAllLower);
    }
}
```
