# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 11. 오후 3:09:22 |
| Language | java |
| Runtime | 4 ms (Beats 0.0%) |
| Memory | 42.7 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/delete-columns-to-make-sorted/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n \* m^2) - 여기서 n은 문자열의 길이, m은 문자열의 개수입니다. 코드는 문자열의 각 문자를 비교하고, 문자열의 각 문자를 다시 비교하기 때문에 시간 복잡도가 O(n \* m^2)입니다.

2. **공간 복잡도**: O(n \* m) - 코드는 2차원 배열을 사용하여 문자열의 각 문자를 저장하기 때문에 공간 복잡도가 O(n \* m)입니다.

3. **풀이 접근법**: 코드는 각 문자열의 각 문자를 비교하여 오름차순인지 아닌지를 판단합니다. 이는 단순한 비교 알고리즘을 사용하여 구현되었습니다. 하지만, 코드는 불필요한 반복문을 사용하여 효율성이 떨어집니다.

4. **잘된 점**: 코드는 문제를 이해하고, 비교 알고리즘을 사용하여 풀이를 시도했습니다. 또한, 코드는 2차원 배열을 사용하여 문자열의 각 문자를 저장하여 비교하기 쉽게 구현했습니다.

5. **개선 사항**: 코드는 불필요한 반복문을 사용하여 효율성이 떨어집니다. 이를 개선하기 위해, 코드는 각 문자열의 각 문자를 한 번만 비교하여 오름차순인지 아닌지를 판단할 수 있습니다. 또한, 코드는 불필요한 변수를 제거하고, 简洁한 코드를 작성할 수 있습니다. 예를 들어, 코드는 다음과 같이 개선할 수 있습니다.
```java
class Solution {
    public int minDeletionSize(String[] strs) {
        int count = 0;
        for (int j = 0; j < strs[0].length(); j++) {
            for (int i = 1; i < strs.length; i++) {
                if (strs[i - 1].charAt(j) > strs[i].charAt(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
```
이 코드는 각 문자열의 각 문자를 한 번만 비교하여 오름차순인지 아닌지를 판단하고, 불필요한 변수를 제거하여 简洁한 코드를 작성했습니다.
