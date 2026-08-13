# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 13. 오후 2:20:38 |
| Language | java |
| Runtime | 1 ms (Beats 81.9%) |
| Memory | 42.7 MB (Beats 71.7%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/implement-stack-using-queues/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: 푸시 연산의 경우, auxiliaryQueue에 원소를 추가하고 primaryQueue의 모든 원소를 auxiliaryQueue로 이동시키므로 O(n)의 시간 복잡도를 가지며, 팝, 탑, 엠티 연산의 경우 O(1)의 시간 복잡도를 가집니다. 따라서 전체적인 시간 복잡도는 O(n)입니다.

2. **공간 복잡도**: 두 개의 큐를 사용하여 스택을 구현하므로, 원소의 총 개수는 n개입니다. 따라서 공간 복잡도는 O(n)입니다.

3. **풀이 접근법**: 큐를 사용하여 스택을 구현하는 접근법을 사용했습니다. 두 개의 큐를 사용하여 스택의 LIFO(Last In First Out) 특성을 구현했습니다. 푸시 연산 시, auxiliaryQueue에 새로운 원소를 추가하고 primaryQueue의 모든 원소를 auxiliaryQueue로 이동시킵니다.这样하면 가장 최근에 추가된 원소가 항상 primaryQueue의 앞에 위치하게 됩니다.

4. **잘된 점**: 코드가 간결하고, 큐를 사용하여 스택을 구현하는 아이디어가 좋습니다. 또한, 변수명이 명확하고, 주석이 없어도 코드를 쉽게 이해할 수 있습니다.

5. **개선 사항**: 현재 코드는 이미 최적화되어 있으나, 더 나은 접근법으로는 큐의 크기를 동적으로 조절하여 메모리 사용량을 줄이는 방법이 있습니다. 또한, 예외 처리를 추가하여 null이나 음수 값의 입력에 대응할 수 있습니다. 예를 들어, 푸시 연산 시 null 값을 입력받으면 예외를 발생시키거나, 특정 범위의 값을 입력받을 수 있도록 제한할 수 있습니다.
