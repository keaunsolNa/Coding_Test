# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 13. 오후 3:17:10 |
| Language | java |
| Runtime | 530 ms (Beats 6.3%) |
| Memory | 86.4 MB (Beats 24.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/find-the-duplicate-number/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 코드의 시간 복잡도는 O(n)입니다. nums 배열의 각 요소를 한 번씩만 방문하기 때문입니다. Big-O 표기법에서 n은 nums 배열의 크기를 나타냅니다.

2. **공간 복잡도**: O(n) - 이 코드의 공간 복잡도는 O(n)입니다. boolean 배열의 크기가 최대 1000000이기 때문입니다. 하지만 실제로는 nums 배열의 최대값에 따라 공간 복잡도가 결정됩니다. nums 배열의 최대값이 m이라면, 공간 복잡도는 O(m)입니다.

3. **풀이 접근법**: 이 코드는 Floyd's Cycle Finding Algorithm이 아닌, 단순히 방문 여부를 체크하는 방법을 사용했습니다. nums 배열의 각 요소를 boolean 배열의 인덱스로 사용하여, 이미 방문한 요소가 있는지 체크합니다. 이는 Pigeonhole Principle을 이용한 풀이 접근법 중 하나입니다.

4. **잘된 점**: 코드가 간결하고, 쉽게 이해할 수 있습니다. boolean 배열을 사용하여 방문 여부를 체크하는 방법은 직관적이고 효율적입니다.

5. **개선 사항**: boolean 배열의 크기를 nums 배열의 최대값으로 동적으로 설정할 수 있습니다. 또한, Floyd's Cycle Finding Algorithm을 사용하여 공간 복잡도를 O(1)로 개선할 수 있습니다. 하지만, 이 경우 코드의 복잡도가 증가할 수 있습니다. 또한, nums 배열의 요소가 1부터 n 사이의 정수라는 문제의 제약 조건을 이용하여, boolean 배열의 크기를 n+1로 설정할 수 있습니다. 이는 공간 복잡도를 개선하는 방법 중 하나입니다.
