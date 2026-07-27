# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 27. 오후 3:55:38 |
| Language | java |
| Runtime | 1 ms (Beats 0.0%) |
| Memory | 42.7 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/remove-outermost-parentheses/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 입력 문자열의 길이(n)에 비례하여 반복문을 수행하기 때문입니다. 문자열을 한 번만 순회하므로 시간 복잡도는 선형입니다.

2. **공간 복잡도**: O(n) - 입력 문자열의 길이(n)에 비례하여 리스트와 스택, StringBuilder를 사용하기 때문입니다. 문자열을 저장하고 처리하는 데 필요한 공간이 입력 크기에 비례합니다.

3. **풀이 접근법**: 스택을 사용하여 괄호의 깊이를 추적하고, StringBuilder를 사용하여 문자열을 빌드하는 접근법입니다. 이 알고리즘은 입력 문자열을 순회하며 괄호의 깊이를 관리하고, 깊이가 0이 될 때마다 문자열을 분리하여 리스트에 추가합니다.

4. **잘된 점**: 코드는 문제를 명확하게 이해하고, 스택과 StringBuilder를 적절하게 사용하여 문제를 해결했습니다. 또한, 코드는 읽기 쉽고, 변수명이 명확하여 이해하기 쉽습니다.

5. **개선 사항**: 코드에서 일부 불필요한 부분이 있습니다. 예를 들어, `else` 블록에서 `stack.push(c)`는 불필요합니다. 또한, `stack.peek() == '('` 조건은 항상 참이므로, 이를 제거할 수 있습니다. 또한, `System.out.println` 문은 디버깅용으로 사용되었을 것으로 보이므로, 제거할 수 있습니다. 마지막으로, `str.replaceAll("^.|.$", "")` 대신 `str.substring(1, str.length() - 1)`을 사용하여 첫 번째와 마지막 문자를 제거할 수 있습니다. 이러한 개선 사항을 적용하면 코드를 더 간결하고 효율적으로 만들 수 있습니다.
