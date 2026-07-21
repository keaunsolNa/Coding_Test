# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 21. 오전 11:12:12 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.7 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/excel-sheet-column-number/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 여기서 n은 columnTitle의 길이입니다. 문자열의 각 문자를 한 번씩만 처리하기 때문에 선형 시간 복잡도를 가집니다.

2. **공간 복잡도**: O(1) - 입력 문자열을 제외하고는 추가적인 공간을 사용하지 않기 때문에 상수 공간 복잡도를 가집니다.

3. **풀이 접근법**: 이 문제는 26진수에서 10진수로의 변환과 유사합니다. 각 문자를 해당하는 숫자 값으로 변환하고, 이전 결과에 26을 곱한 후에 현재 문자의 숫자 값을 더하는 방식으로 해결합니다.

4. **잘된 점**: 코드는 매우 간결하고, 문제를 명확하게 이해하고 이를 간단한 수식으로 변환하여 구현했습니다. 또한 변수명이 명확하여 코드의 가독성이 좋습니다.

5. **개선 사항**: 코드는 이미 매우 효율적이고 간결합니다. 그러나 입력 유효성 검사를 추가하여 columnTitle이 null이거나 비어있는 경우를 처리할 수 있습니다. 예를 들어, `if (columnTitle == null || columnTitle.isEmpty()) { return 0; }`와 같은 검사를 추가할 수 있습니다. 또한, columnTitle의 문자가 'A'에서 'Z' 범위에 속하는지 확인할 수 있습니다.
