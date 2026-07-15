# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 15. 오전 11:03:18 |
| Language | java |
| Runtime | 15 ms (Beats 80.4%) |
| Memory | 48.1 MB (Beats 56.5%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/maximum-product-of-three-numbers/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: 이 코드의 시간 복잡도는 O(n log n)입니다. Arrays.sort() 함수를 사용하여 배열을 정렬하는 데 O(n log n)의 시간이 걸리기 때문입니다. 여기서 n은 입력 배열의 크기입니다.

2. **공간 복잡도**: 이 코드의 공간 복잡도는 O(1)입니다. 입력 배열을 제외하고 추가적인 공간을 사용하지 않기 때문입니다. Arrays.sort() 함수는 원본 배열을 수정하므로 추가적인 공간이 필요하지 않습니다.

3. **풀이 접근법**: 이 코드는 정렬 알고리즘을 사용하여 최대 곱을 찾는 접근법을 사용합니다. 먼저 배열을 정렬한 후, 최대 3개의 양수와 최대 2개의 음수를 찾아서 곱을 계산합니다. 이 접근법은 간단하고 직관적입니다.

4. **잘된 점**: 코드는 간결하고 읽기 쉽습니다. 변수 이름이 명확하여 코드의 의도를 쉽게 이해할 수 있습니다. 또한, Arrays.sort() 함수를 사용하여 배열을 정렬하는 것은 좋은 선택입니다.

5. **개선 사항**: 코드는 이미 간결하고 효율적이지만, 일부 변수 이름을 더 명확하게 할 수 있습니다. 예를 들어, maxPositive1, maxPositive2, maxPositive3 변수는 firstMax, secondMax, thirdMax로 이름을 변경할 수 있습니다. 또한, 코드에 주석을 추가하여 알고리즘의 동작을 설명할 수 있습니다. 그러나, 코드는 이미 잘 작성되어 있으므로 대안적인 접근법은 필요하지 않습니다.
