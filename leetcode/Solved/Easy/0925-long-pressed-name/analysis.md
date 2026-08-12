# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 12. 오후 4:16:01 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.1 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/long-pressed-name/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n + m)입니다. 여기서 n과 m은 각각 `name`과 `typed`의 길이입니다. 두 문자열을 각각 한 번씩 반복하여 처리하기 때문입니다.

2. **공간 복잡도**: O(n + m)입니다. 두 개의 해시맵(`nameMap`과 `typedMap`)을 사용하여 문자열의 각 문자의 빈도를 저장하기 때문입니다.

3. **풀이 접근법**: 이 문제는 두 포인터(Two Pointers)와 문자열(String) 처리를 사용합니다. 하지만 제공된 코드에서는 해시맵을 사용하여 문자열의 각 문자의 빈도를 계산하고 비교합니다. 이는 문제를 해결하는 하나의 방법이지만, 두 포인터를 사용하여 직접 문자열을 비교하는 접근법도 있습니다.

4. **잘된 점**: 코드는 비교적 간결하고, 해시맵을 사용하여 문자열의 각 문자의 빈도를 계산하는 부분은 잘 구현되어 있습니다. 또한, 코드는 읽기 쉽고 변수명이 명확합니다.

5. **개선 사항**: 코드에서 `check` 변수는 불필요합니다. `return !check` 대신에 `return typedMap.get(c) != nameMap.get(c)`를 사용할 수 있습니다. 또한, 두 포인터를 사용하여 직접 문자열을 비교하는 접근법을 사용할 수 있습니다. 이는 해시맵을 사용하지 않아 공간 복잡도를 줄일 수 있습니다. 예를 들어, 두 포인터를 사용하여 `name`과 `typed`를 비교하면서 `typed`의 문자가 `name`의 문자와 일치하는지 확인할 수 있습니다. 만약 일치한다면, `typed`의 해당 문자를 건너뛸 수 있습니다. 이 접근법은 더 효율적이고 간결한 코드를 작성할 수 있습니다. 

예를 들어, 다음과 같이 코드를 개선할 수 있습니다:
```java
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0;
        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
            } else if (j == 0 || typed.charAt(j) != typed.charAt(j - 1)) {
                return false;
            }
            j++;
        }
        return i == name.length();
    }
}
```
