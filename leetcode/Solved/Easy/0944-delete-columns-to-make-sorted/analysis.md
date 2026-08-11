# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 11. 오후 3:13:07 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.7 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/delete-columns-to-make-sorted/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n \* m)입니다. 여기서 n은 문자열의 길이이고, m은 문자열의 개수입니다. 코드는 각 문자열의 각 문자를 비교하기 때문에 시간 복잡도가 O(n \* m)입니다.

2. **공간 복잡도**: O(n \* m)입니다. 코드는 2차원 배열을 사용하여 각 문자열의 각 문자를 저장하기 때문에 공간 복잡도가 O(n \* m)입니다.

3. **풀이 접근법**: 코드는 각 문자열의 각 문자를 비교하여 정렬된 문자열을 만들 수 있는지 확인합니다. 이는 문자열의 각 문자를 비교하는 간단한 알고리즘을 사용합니다.

4. **잘된 점**: 코드는 간단하고 이해하기 쉽습니다. 또한, 코드는 문제의 요구 사항을 충족합니다.

5. **개선 사항**: 코드는 각 문자열의 각 문자를 비교하여 정렬된 문자열을 만들 수 있는지 확인합니다. 그러나, 코드는 불필요한 반복문을 사용하여 시간 복잡도를 증가시킵니다. 이를 개선하기 위해, 코드는 각 문자열의 각 문자를 비교하여 정렬된 문자열을 만들 수 있는지 확인하는 것을 한 번의 반복문으로 처리할 수 있습니다. 또한, 코드는 불필요한 2차원 배열을 사용하여 공간 복잡도를 증가시킵니다. 이를 개선하기 위해, 코드는 1차원 배열을 사용하여 각 문자열의 각 문자를 저장할 수 있습니다. 

예를 들어, 다음과 같이 개선할 수 있습니다.

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

이 코드는 각 문자열의 각 문자를 비교하여 정렬된 문자열을 만들 수 있는지 확인합니다. 또한, 코드는 불필요한 반복문과 2차원 배열을 사용하지 않습니다.
