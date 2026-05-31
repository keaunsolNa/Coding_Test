# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026-05-31 15:07:01 |
| Language | java |
| Runtime | 2 ms (Beats 91.7%) |
| Memory | 48 MB (Beats 19.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/move-zeroes/submissions/)

## Code Review

이 Java 코드는 LeetCode의 move-zeroes 문제를 해결하는 간단한 해결책입니다.

1. **시간 복잡도** — O(n): 이 코드의 시간 복잡도는 O(n)으로, n은 배열의 길이입니다. 한 번의 반복문을 통해 모든 원소를 처리하기 때문입니다.
2. **공간 복잡도** — O(1): 공간 복잡도는 O(1)으로, 추가적인 공간을 사용하지 않고 원본 배열을 수정합니다.
3. **풀이 접근법** — 이 코드는 두 개의 포인터(nonZeroIndex, currentIndex)를 사용하여 0이 아닌 원소를 왼쪽으로 이동시키는 알고리즘입니다. 이는 Two Pointers 패턴의 변형으로 볼 수 있습니다.
4. **잘된 점** — 코드는 간결하고 이해하기 쉬우며, O(n) 시간 복잡도와 O(1) 공간 복잡도를 달성하여 효율적입니다. 또한, 원본 배열을 수정하여 불필요한 메모리 할당을 피합니다.
5. **개선 사항** — 코드는 이미 khá 최적화되어 있지만, 변수 이름을 더 명확하게 바꾸거나 주석을 추가하여 코드의 가독성을 높일 수 있습니다. 예를 들어, nonZeroIndex를 nextNonZeroIndex로 바꾸거나, 변수의 역할에 대한 주석을 추가할 수 있습니다. 또한, 코드의 구조를 개선하여 더 함수형 프로그래밍적으로 만들 수 있지만, 현재의 코드는 이미 효율적이고 이해하기 쉽습니다.
