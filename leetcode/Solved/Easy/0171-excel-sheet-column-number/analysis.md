# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 21. 오전 9:51:43 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.7 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/excel-sheet-column-number/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n)입니다. 여기서 n은 입력 문자열의 길이입니다. 문자열을 한 번만 순회하기 때문에 시간 복잡도가 선형입니다.

2. **공간 복잡도**: O(n)입니다. 문자열을 문자 배열로 변환하기 때문에 공간 복잡도가 입력 문자열의 길이에 비례합니다.

3. **풀이 접근법**: 이 문제는 문자열을 숫자로 변환하는 문제입니다. 사용된 알고리즘은 단순한 반복문을 사용하여 각 문자를 해당하는 숫자로 변환하고, 이를 누적하여 결과를 얻는 것입니다. 26진법을 사용하여 계산합니다.

4. **잘된 점**: 코드는 간결하고 이해하기 쉽습니다. 변수 이름이 의미 있게 사용되어 코드의 가독성이 좋습니다.

5. **개선 사항**: 현재 코드는 거의 최적화되어 있습니다. 하지만, 더 간결한 코드를 작성하고자 한다면, 다음과 같이 수정할 수 있습니다. 
```java
class Solution {
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        for (char c : columnTitle.toCharArray()) {
            ans = ans * 26 + (c - 'A' + 1);
        }
        return ans;
    }
}
```
이 코드는 동일한 결과를 얻지만, 더 간결하고 효율적인 코드입니다.
