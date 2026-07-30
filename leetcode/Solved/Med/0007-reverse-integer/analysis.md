# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 30. 오후 3:16:17 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.4 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/reverse-integer/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(log|x|)입니다. 입력 숫자 x의 자릿수를 반복하여 처리하기 때문입니다. StringBuilder의 insert 연산은 평균적으로 O(1)입니다. 그러나 문자열을 배열로 변환하고, 각 문자를 StringBuilder에 삽입하는 과정에서 시간 복잡도가 발생합니다.

2. **공간 복잡도**: O(log|x|)입니다. 입력 숫자 x의 자릿수만큼의 문자열을 StringBuilder에 저장하기 때문입니다. 문자열을 배열로 변환하는 과정에서도 공간 복잡도가 발생합니다.

3. **풀이 접근법**: 문자열을 이용한 풀이 접근법을 사용했습니다. 입력 숫자를 문자열로 변환하고, 각 문자를 StringBuilder에 역순으로 삽입하여 숫자를 뒤집는 알고리즘을 사용했습니다.

4. **잘된 점**: 코드가 간결하고, 쉽게 이해할 수 있습니다. StringBuilder를 사용하여 효율적으로 문자열을 조작했습니다.

5. **개선 사항**: 숫자의 부호를 별도로 처리하는 대신, 절대값으로 변환하여 처리할 수 있습니다. 또한, StringBuilder의 insert 연산 대신, append 연산을 사용하여 문자열을 뒤집을 수 있습니다. 예를 들어, `StringBuilder sb = new StringBuilder(String.valueOf(Math.abs(x)));`와 `return Integer.parseInt(sb.reverse().toString()) * (x < 0 ? -1 : 1);`를 사용할 수 있습니다. 이는 코드를 더 간결하게 만들 수 있습니다. 또한, 오버플로우를 체크하지 않으므로, 이를 추가하여 더 견고한 코드를 만들 수 있습니다.
