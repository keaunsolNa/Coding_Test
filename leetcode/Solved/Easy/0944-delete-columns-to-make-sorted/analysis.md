# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 11. 오후 3:10:58 |
| Language | java |
| Runtime | 3 ms (Beats 0.0%) |
| Memory | 42.7 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/delete-columns-to-make-sorted/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n*m^2) - n은 문자열의 길이, m은 문자열의 개수입니다. 이 코드는 문자열의 각 문자를 비교하고, 문자열의 각 문자를 다시 비교하여 정렬 여부를 확인합니다. 이는 시간 복잡도를 증가시킵니다.

2. **공간 복잡도**: O(n*m) - 문자열의 각 문자를 2차원 배열에 저장하여 공간 복잡도가 증가합니다.

3. **풀이 접근법**: 이 코드는 각 문자열의 문자를 비교하여 정렬 여부를 확인하는 방식으로, 기본적으로는 정렬 알고리즘을 사용하고 있습니다. 하지만, 이 문제는 삭제할 열의 최소 개수를 찾는 문제로, 더 효율적인 알고리즘을 사용할 수 있습니다.

4. **잘된 점**: 코드는 문제를 이해하고, 각 문자열의 문자를 비교하여 정렬 여부를 확인하는 방식으로 접근했습니다. 또한, 코드는 2차원 배열을 사용하여 문자열의 각 문자를 저장하여 비교하기 쉽게 만들었습니다.

5. **개선 사항**: 이 문제는 더 효율적인 알고리즘을 사용할 수 있습니다. 예를 들어, 각 열을 비교하여 정렬 여부를 확인하는 방식으로 접근할 수 있습니다. 또한, 불필요한 반복문을 제거하여 시간 복잡도를 개선할 수 있습니다. 예를 들어, 다음과 같은 코드로 개선할 수 있습니다.
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
이 코드는 각 열을 비교하여 정렬 여부를 확인하고, 불필요한 반복문을 제거하여 시간 복잡도를 개선했습니다.
