# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 5. 오후 3:44:41 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(log n) - 입력 숫자 n의 자릿수에 비례하여 반복문이 실행되므로, n의 자릿수는 log n에 비례하므로 O(log n)입니다.

2. **공간 복잡도**: O(log n) - 입력 숫자를 문자열로 변환하여 저장하므로, 문자열의 길이는 n의 자릿수에 비례하므로 O(log n)입니다.

3. **풀이 접근법**: 이 문제는 간단한 수학적 계산을 통해 해결할 수 있습니다. 숫자를 문자열로 변환하여 각 자릿수를 추출하고, 곱과 합을 계산하는 방식입니다. 이 접근법은 문제의 요구 사항을 직접적으로 해결할 수 있습니다.

4. **잘된 점**: 코드는 문제의 요구 사항을 명확하게 이해하고, 간단한 반복문을 통해 곱과 합을 계산하여 결과를 반환합니다. 또한, 변수의 이름이 명확하여 코드의 가독성이 좋습니다.

5. **개선 사항**: System.out.println((int)c); 라인은 디버깅 용도로 사용된 것으로 보입니다. 실제로 이 코드는 문제의 해결에 필요하지 않으므로, 제거하는 것이 좋습니다. 또한, 변수 product와 sum의 초기값을 1과 0으로 설정한 것은 좋지만, 코드에 주석을 추가하여 이유를 설명하는 것이 좋습니다. 예를 들어, product의 초기값을 1로 설정한 이유는 숫자의 곱셈에서 중립 元素이기 때문입니다.
