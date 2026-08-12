# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 12. 오후 4:14:53 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.3 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/long-pressed-name/submissions/)

## Code Review

LeetCode 솔루션을 검토한 결과, 다음과 같은 내용을 확인했습니다.

1. **시간 복잡도**: O(n + m) - 여기서 n과 m은 각각 `name`과 `typed`의 길이입니다. 문자열을 배열로 변환하고, 각 문자의 빈도수를 계산하는 작업이 포함되어 있습니다. 이러한 작업은 선형 시간에 수행되므로, 전체 시간 복잡도는 O(n + m)입니다.

2. **공간 복잡도**: O(n + m) - `nameMap`과 `typedMap`을 사용하여 각 문자의 빈도수를 저장합니다. 이러한 맵의 크기는 최대 n과 m의 크기만큼 커질 수 있으므로, 공간 복잡도는 O(n + m)입니다.

3. **풀이 접근법**: 해시 맵을 사용하여 각 문자의 빈도수를 계산하고, 두 문자열의 빈도수를 비교하는 접근법을 사용했습니다. 이는 문자열 비교 문제에서 자주 사용되는 해시 맵 패턴입니다.

4. **잘된 점**: 코드는 비교적 간결하고, 해시 맵을 사용하여 빈도수를 계산하는 부분은 잘 구현되어 있습니다. 또한, `getOrDefault` 메서드를 사용하여 코드를 더 간결하게 만들었습니다.

5. **개선 사항**: 현재 코드는 두 문자열의 빈도수를 비교하여 `long-pressed-name`인지 확인합니다. 그러나, 이 문제는 두 문자열의 순서도 중요합니다. 즉, `typed` 문자열이 `name` 문자열의 각 문자를 연속적으로 반복하는지 확인해야 합니다. 따라서, 두 문자열을 동시에 순회하면서 비교하는 두 포인터 접근법을 사용하는 것이 더 적절할 것입니다. 또한, `check` 변수의 사용이 불필요하며, 코드를 더 간결하게 만들 수 있습니다. 

예를 들어, 다음과 같이 두 포인터를 사용하여 코드를 개선할 수 있습니다.

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

이 코드는 두 포인터 `i`와 `j`를 사용하여 `name`과 `typed`를 동시에 순회합니다. `name`의 각 문자가 `typed`에서 연속적으로 반복되는지 확인하며, 만약 그렇지 않으면 false를 반환합니다.
