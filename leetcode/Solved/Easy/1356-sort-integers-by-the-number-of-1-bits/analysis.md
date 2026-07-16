# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 16. 오후 3:01:26 |
| Language | java |
| Runtime | 1 ms (Beats 0.0%) |
| Memory | 42.8 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n log n)입니다. 이유는 정렬을 위해 Comparator를 사용했기 때문입니다. 정렬 알고리즘의 시간 복잡도는 일반적으로 O(n log n)이며, 이 경우도 예외가 아닙니다. 또한 Integer.bitCount() 함수의 시간 복잡도는 O(log n)입니다. 그러나 전체 시간 복잡도는 정렬에 의해 지배됩니다.

2. **공간 복잡도**: O(n)입니다. 이유는 HashMap과 ArrayList를 사용했기 때문입니다. HashMap과 ArrayList는 각각 입력 배열의 크기만큼의 공간을 차지합니다.

3. **풀이 접근법**: 이 문제는 정렬 알고리즘과 비트 조작을 사용하여 해결되었습니다. Integer.bitCount() 함수를 사용하여 각 정수의 1의 개수를 세고, 이를 기준으로 정렬했습니다. 정렬은 Comparator를 사용하여 구현되었습니다.

4. **잘된 점**: 코드는 비교적 간결하고 이해하기 쉽습니다. Integer.bitCount() 함수를 사용하여 1의 개수를 세는 부분은 좋은 아이디어입니다. 또한 Comparator를 사용하여 정렬하는 부분도 잘 구현되었습니다.

5. **개선 사항**: 코드는 이미 비교적 효율적이지만, 조금 더 개선할 수 있습니다. 예를 들어, Integer.bitCount() 함수를 사용하는 대신, 비트 조작을 직접 구현할 수 있습니다. 또한, 정렬 알고리즘을 사용하는 대신, 다른 접근법을 사용할 수 있습니다. 그러나 이러한 개선은 코드의 복잡도를 증가시킬 수 있으므로, 필요에 따라慎重하게 고려해야 합니다. 또한, System.out.println(map); 부분은 테스트 코드로 보이므로, 실제 제출 코드에서는 제거하는 것이 좋습니다.
