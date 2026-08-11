# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 11. 오후 2:54:46 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.9 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/delete-columns-to-make-sorted/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n*m) - 여기서 n은 입력 문자열의 길이, m은 문자열의 개수입니다. 각 문자열을 한 번씩 순회하기 때문입니다.
2. **공간 복잡도**: O(1) - 입력 문자열과 변수를 제외하면 추가적인 공간을 사용하지 않습니다.
3. **풀이 접근법**: 이 문제는 각 문자열의 문자를 비교하여 오름차순인지 아닌지를 확인하는 방식으로 접근했습니다. 하지만 이는 문제의 본질을 정확하게 파악하지 못한 것으로 보입니다. 문제는 여러 문자열에서 공통된 열을 삭제하여 모든 문자열이 오름차순이 되도록 하는 것입니다. 따라서 각 열의 문자를 비교하여 오름차순이 아닌 열을 삭제하는 방식으로 접근해야 합니다.
4. **잘된 점**: 변수의 이름이 명확하고, 코드의 구조가 비교적 간단합니다. 또한, 문자의 ASCII 값을 사용하여 비교하는 부분은 좋은 아이디어입니다.
5. **개선 사항**: 현재 코드는 각 문자열의 문자를 비교하여 오름차순인지 아닌지를 확인합니다. 하지만 문제는 여러 문자열에서 공통된 열을 삭제하여 모든 문자열이 오름차순이 되도록 하는 것입니다. 따라서 각 열의 문자를 비교하여 오름차순이 아닌 열을 삭제하는 방식으로 접근해야 합니다. 이를 위해 다음과 같은 코드로 개선할 수 있습니다.

```java
class Solution {
    public int minDeletionSize(String[] strs) {
        int m = strs.length;
        int n = strs[0].length();
        int ans = 0;

        for (int j = 0; j < n; j++) {
            for (int i = 1; i < m; i++) {
                if (strs[i].charAt(j) < strs[i-1].charAt(j)) {
                    ans++;
                    break;
                }
            }
        }

        return ans;
    }
}
```

이 코드는 각 열의 문자를 비교하여 오름차순이 아닌 열을 삭제하는 방식으로 접근합니다. 이는 문제의 본질을 정확하게 파악하여 더 효율적인 해결책입니다.
