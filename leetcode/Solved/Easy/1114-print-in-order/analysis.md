# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 12. 오전 11:28:43 |
| Language | java |
| Runtime | 3 ms (Beats 0.0%) |
| Memory | 43.2 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/print-in-order/submissions/)

## Code Review

코드 리뷰를 다음과 같이 진행하겠습니다.

1. **시간 복잡도**: O(1) - 각 메서드의 시간 복잡도는 상수 시간으로, 세마포어의 acquire와 release 연산이 상수 시간에 수행되기 때문입니다. 

2. **공간 복잡도**: O(1) - 클래스 내에 사용된 세마포어의 개수가 상수이기 때문에 공간 복잡도는 상수 시간입니다.

3. **풀이 접근법**: 이 문제는 동시성(concurrency) 문제로, 세마포어(semaphore)를 사용하여 순차적으로 실행되도록 구현했습니다. 세마포어는 자원에 대한 접근을 제어하는 데 사용되며, 이 경우에 각 메서드의 실행 순서를 제어하기 위해 사용되었습니다.

4. **잘된 점**: 코드는 간결하고, 세마포어를 사용하여 순차적으로 실행되도록 구현한 점이 좋습니다. 또한, 각 메서드의 이름이 명확하여 코드의 가독성이 좋습니다.

5. **개선 사항**: 현재 코드는 이미 최적화되어 있지만, 예외 처리를 추가하여 세마포어의 acquire와 release 연산에서 발생할 수 있는 예외를 처리할 수 있습니다. 또한, 세마포어의 초기값을 더 명확하게 설정하여 코드의 의도를 더 분명히 할 수 있습니다. 예를 들어, `private Semaphore firstSemaphore = new Semaphore(1);` 대신 `private Semaphore firstSemaphore = new Semaphore(1, true);`를 사용하여 공정한 세마포어를 생성할 수 있습니다.
