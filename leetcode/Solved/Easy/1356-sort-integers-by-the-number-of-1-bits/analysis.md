# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 16. 오후 3:02:33 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.7 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n log n)입니다. Integer.bitCount() 함수는 O(log n) 시간 복잡도를 가지며, 이 함수를 n번 호출합니다. 또한, 리스트를 정렬하는 데 O(n log n) 시간이 걸리므로, 전체 시간 복잡도는 O(n log n) + O(n log n) = O(n log n)입니다.

2. **공간 복잡도**: O(n)입니다. HashMap과 ArrayList를 사용하여 n개의 요소를 저장하기 때문입니다.

3. **풀이 접근법**: 이 문제는 정렬 알고리즘과 비트 조작을 사용합니다. Integer.bitCount() 함수를 사용하여 각 정수의 1의 개수를 세고, 이를 기준으로 정렬합니다. 이후, 1의 개수가 같은 경우에는 정수 값 자체를 기준으로 정렬합니다.

4. **잘된 점**: 코드는 읽기 쉽고, 변수명이 명확합니다. 또한, Integer.bitCount() 함수를 사용하여 1의 개수를 효율적으로 계산했습니다.

5. **개선 사항**: Java 8의 람다식과 스트림 API를 사용하여 코드를 더 간결하게 만들 수 있습니다. 예를 들어, Comparator를 람다식으로 정의할 수 있고, 리스트를 스트림으로 변환하여 정렬할 수 있습니다. 또한, 정렬된 리스트를 배열로 변환하는 대신, Arrays.sort() 함수를 사용하여 원본 배열을 직접 정렬할 수 있습니다. 이러한 최적화를 통해 코드를 더 효율적이고 간결하게 만들 수 있습니다.
