# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 13. 오후 2:34:57 |
| Language | java |
| Runtime | 1 ms (Beats 0.0%) |
| Memory | 45.2 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/find-the-duplicate-number/submissions/)

## Code Review

리뷰 대상 코드는 LeetCode의 "find-the-duplicate-number" 문제를 해결하기 위한 자바 솔루션입니다. 

1. **시간 복잡도**: 코드의 시간 복잡도는 O(n)입니다. 이는 nums 배열을 한 번 순회하며 각 요소를 처리하기 때문입니다. 여기서 n은 nums 배열의 크기입니다.

2. **공간 복잡도**: 코드의 공간 복잡도는 O(n)입니다. 이는 boolean 배열 arr을 생성하여 nums 배열의 모든 요소를 처리하기 때문입니다. 그러나 실제로 사용되는 공간은 nums 배열의 최대값에 의해 결정되는데, 이 경우 1000000 크기의 배열을 사용하여固定된 공간 복잡도가 됩니다.

3. **풀이 접근법**: 이 코드는 Floyd's Cycle Finding Algorithm을 사용하지 않고, 대신 boolean 배열을 사용하여 중복된 숫자를 찾습니다. 이는 Pigeonhole Principle을 간접적으로 활용한 것으로, nums 배열의 요소가 1부터 n까지의 범위에 속한다는 점을 이용하여 중복을 찾습니다.

4. **잘된 점**: 코드는 간단하고 이해하기 쉽습니다. boolean 배열을 사용하여 중복된 숫자를 찾는 아이디어는 직관적이며, 코드의 구현도 명료합니다.

5. **개선 사항**: 코드에서 사용된 boolean 배열의 크기는 1000000으로 固定되어 있습니다. 그러나 nums 배열의 크기와 최대값에 따라 동적으로 배열의 크기를 조정할 수 있습니다. 또한, Floyd's Cycle Finding Algorithm을 사용하여 중복된 숫자를 찾는 방법도 있습니다. 이 방법은 Tortoise와 Hare 두 개의 포인터를 사용하여 순환을 찾는 것으로, 공간 복잡도를 O(1)로 줄일 수 있습니다. 그러나 이 방법은 코드의 복잡도를 증가시킵니다.
