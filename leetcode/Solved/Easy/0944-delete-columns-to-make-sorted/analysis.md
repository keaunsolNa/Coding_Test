# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 11. 오후 3:12:55 |
| Language | java |
| Runtime | 3 ms (Beats 0.0%) |
| Memory | 42.5 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/delete-columns-to-make-sorted/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n \* m) - 여기서 n은 문자열의 길이이고, m은 문자열의 개수입니다. 이 코드는 각 문자열의 각 문자를 비교하기 때문에 시간 복잡도가 O(n \* m)입니다.

2. **공간 복잡도**: O(n \* m) - 코드는 2차원 배열을 사용하여 문자열의 각 문자를 저장하기 때문에 공간 복잡도가 O(n \* m)입니다.

3. **풀이 접근법**: 이 코드는 각 문자열의 문자를 비교하여 정렬된 문자열을 만들기 위해 삭제해야 할 열의 개수를 계산합니다. 코드는 각 문자열의 각 문자를 비교하여 이전 문자가 이후 문자보다 크면 삭제해야 할 열의 개수를 증가시킵니다.

4. **잘된 점**: 코드는 문제를 이해하고 각 문자열의 문자를 비교하여 삭제해야 할 열의 개수를 계산하는 로직을 구현했습니다. 또한, 코드는 2차원 배열을 사용하여 문자열의 각 문자를 효율적으로 저장하고 접근했습니다.

5. **개선 사항**: 코드는 각 문자열의 문자를 비교하여 삭제해야 할 열의 개수를 계산하지만, 코드의 로직이 복잡하고 이해하기 어렵습니다. 코드를 더 간단하고 효율적으로 만들기 위해, 각 열의 문자를 비교하여 정렬된 문자열을 만들기 위해 삭제해야 할 열의 개수를 계산하는 더 간단한 알고리즘을 사용할 수 있습니다. 예를 들어, 코드는 각 열의 문자를 비교하여 이전 열의 문자가 이후 열의 문자보다 크면 삭제해야 할 열의 개수를 증가시킬 수 있습니다. 또한, 코드는 더 효율적인 자료구조를 사용하여 문자열의 각 문자를 저장하고 접근할 수 있습니다. 

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
