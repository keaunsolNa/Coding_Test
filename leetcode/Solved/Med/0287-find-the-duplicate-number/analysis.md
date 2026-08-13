# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 13. 오후 3:16:36 |
| Language | java |
| Runtime | 3 ms (Beats 0.0%) |
| Memory | 45.4 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/find-the-duplicate-number/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 코드의 시간 복잡도는 O(n)입니다. nums 배열의 각 원소를 한 번씩 방문하기 때문입니다.

2. **공간 복잡도**: O(n) - 이 코드의 공간 복잡도는 O(n)입니다. boolean 배열의 크기가 최대 1000000이기 때문입니다. 하지만 실제로는 nums 배열의 최대값에 따라 공간 복잡도가 결정됩니다.

3. **풀이 접근법**: 이 코드는 Floyd's Cycle Finding Algorithm이 아닌, 단순한 방문 체크 방식을 사용합니다. 각 숫자가 나타날 때마다 방문 여부를 체크하는 방식입니다.

4. **잘된 점**: 코드는 간단하고 이해하기 쉽습니다. 또한, 중복된 숫자를 찾는 문제의 요구사항을满족합니다.

5. **개선 사항**: boolean 배열의 크기를 nums 배열의 최대값으로 설정하여 공간 복잡도를 개선할 수 있습니다. 또한, Floyd's Cycle Finding Algorithm을 사용하여 공간 복잡도를 O(1)로 개선할 수 있습니다. 또한, System.out.println문을 제거하여 코드를 더 효율적으로 만들 수 있습니다. 또한, nums 배열의 원소가 1부터 n 사이의 정수라는 문제의 제약조건을 이용하여 더 효율적인 알고리즘을 설계할 수 있습니다.
