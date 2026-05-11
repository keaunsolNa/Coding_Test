# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026-05-12 00:28:13 |
| Language | java |
| Runtime | 1 ms (Beats 99.5%) |
| Memory | 42.4 MB (Beats 69.7%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/ugly-number/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(logN) - 코드에서 사용된 while문은 입력된 수 n을 계속적으로 나누어가며 진행하므로, n의 크기에 따라 반복 회수가 줄어든다. 따라서 시간 복잡도는 O(logN)이다.

2. **공간 복잡도**: O(1) - 코드에서 추가 메모리가 사용되지 않으므로 공간 복잡도는 O(1)이다.

3. **풀이 접근법**: 코드는 나누기 알고리즘을 사용하여 입력된 수를 2, 3, 5로 나누어 가며, 결국 1이 되면 ugly number로 판단한다. 이는 ugly number의 정의와 일치한다.

4. **잘된 점**: 코드는 간결하고 직관적으로 작성되어 있다. ugly number의 정의를 잘 이해하고, 이를 코드로 구현한 점은 잘된 부분이다.

5. **개선 사항**: 코드는 이미 최적화가 잘 되어 있으나, 입력값이 очень 클 경우에 대한 처리가 필요할 수 있다. 예를 들어, long 타입을 사용하여 overflow를 방지하는 방법이 있을 수 있다. 또한, ugliness를 확인할 때 2, 3, 5만 체크하는 이유를 주석으로 설명하는 것이 코드의 이해도를 높일 수 있을 것이다.
