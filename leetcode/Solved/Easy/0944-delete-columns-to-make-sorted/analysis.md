# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 11. 오후 3:03:21 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.7 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/delete-columns-to-make-sorted/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n*m^2) - n은 문자열의 길이, m은 문자열의 개수입니다. 코드에서 두 개의 중첩된 반복문이 있습니다. 첫 번째 반복문은 문자열의 각 문자를 처리하며, 두 번째 반복문은 문자열의 각 문자를 비교합니다. 그러나 코드의 로직이 올바르지 않아 결과가 정확하지 않을 수 있습니다.

2. **공간 복잡도**: O(n*m) - 2차원 배열을 사용하여 문자열의 각 문자를 저장합니다. n은 문자열의 길이, m은 문자열의 개수입니다.

3. **풀이 접근법**: 코드는 각 문자열의 문자를 비교하여 정렬된 문자열을 만들기 위해 삭제해야 할 열의 개수를 계산하려고 합니다. 그러나 코드의 로직이 복잡하고, 일부 변수의 이름이 명확하지 않으며, 로직이 올바르지 않아 결과가 정확하지 않을 수 있습니다.

4. **잘된 점**: 코드는 2차원 배열을 사용하여 문자열의 각 문자를 효율적으로 저장하고 처리합니다.

5. **개선 사항**: 코드의 로직을 단순화하고, 변수의 이름을 명확하게 변경하며, 결과가 정확하도록 수정해야 합니다. 예를 들어, 각 열의 문자를 비교하여 정렬된 문자열을 만들기 위해 삭제해야 할 열의 개수를 계산할 수 있습니다. 또한, 코드의 시간 복잡도를 개선하기 위해 더 효율적인 알고리즘을 사용할 수 있습니다. 다음과 같은 코드로 개선할 수 있습니다.
```java
class Solution {
    public int minDeletionSize(String[] strs) {
        int count = 0;
        for (int col = 0; col < strs[0].length(); col++) {
            for (int row = 1; row < strs.length; row++) {
                if (strs[row].charAt(col) < strs[row - 1].charAt(col)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
```
이 코드는 각 열의 문자를 비교하여 정렬된 문자열을 만들기 위해 삭제해야 할 열의 개수를 계산합니다. 시간 복잡도는 O(n*m)입니다.
