# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 21. 오전 10:26:30 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.6 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/excel-sheet-column-number/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 입력 문자열의 길이(n)에 비례하는 시간 복잡도를 가지고 있습니다. 이는 문자열의 각 문자를 단 한 번만 처리하기 때문입니다.

2. **공간 복잡도**: O(n) - 입력 문자열을 문자 배열로 변환하기 때문에 공간 복잡도도 문자열의 길이(n)에 비례합니다.

3. **풀이 접근법**: 이 문제는 Excel의 열 제목을 숫자로 변환하는 문제입니다. 사용된 알고리즘은 각 문자를 해당하는 숫자로 변환하여 누적하는 방식입니다. 26진법을 사용하여 각 자릿값을 계산합니다.

4. **잘된 점**: 코드는 비교적 간결하며, 문제의 의도를 명확하게 표현하고 있습니다. 또한, 각 문자를 숫자로 변환하는 로직은 올바르게 구현되어 있습니다.

5. **개선 사항**: 코드에서 `target` 변수를 사용하여 중간 계산 결과를 저장하고 있습니다. 하지만, 이 변수는 실제로 필요하지 않습니다. 바로 `ans`에 누적 계산을 할 수 있습니다. 또한, `System.out.println` 문은 디버깅 용도로 사용하는 것이 좋으며, 실제 제출 코드에서는 제거하는 것이 좋습니다. 마지막으로, 변수명이 더 명확했으면 좋았을 것입니다. 예를 들어, `arr` 대신 `chars`로 이름을 지었으면 더 이해하기 쉬웠을 것입니다. 최적화된 코드는 다음과 같을 수 있습니다.
```java
class Solution {
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            char c = columnTitle.charAt(i);
            ans = ans * 26 + (c - 'A' + 1);
        }
        return ans;
    }
}
```
