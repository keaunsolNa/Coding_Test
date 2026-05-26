# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026-05-25 20:37:49 |
| Language | java |
| Runtime | 180 ms (Beats 4.3%) |
| Memory | 47.1 MB (Beats 6.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/baseball-game/submissions/)

## Code Review

LeetCode 풀이를 리뷰해 보겠습니다.

1. **시간 복잡도** — O(n)
 시간 복잡도는 O(n)입니다. 여기서 n은_operations 배열의 크기입니다._operations 배열의 각 원소를 한 번씩 순회하며 스택 관련 연산을 수행하기 때문입니다. 스택 연산의 시간 복잡도는 O(1)로 sangat 효율적입니다.

2. **공간 복잡도** — O(n)
 공간 복잡도 또한 O(n)입니다.최대로 운영할 수 있는 스택의 크기는 입력 배열의 크기와 동일하기 때문입니다.

3. **풀이 접근법** 
이 풀이에서는 스택 데이터 구조를 사용했습니다. 스택을 사용하여 최근에 계산된 점수를 효율적으로 관리했습니다.operations 배열을 순회하며 각 연산에 맞게 스택을 업데이트 했습니다.

4. **잘된 점** 
코드는 매우 직관적이며, 문제를 효율적으로 해결했습니다. 스택을 사용한 접근법이 적절했습니다. 또한, 각 연산을 Switch 문으로 처리하여 가독성을 향상시켰습니다.

5. **개선 사항** 
해당 코드는 충분히 효율적이나, 더 개선할 수 있는 부분은 없게 코드를 작성했습니다. 다만, 변수 이름을 더 명확하게 지을 수 있습니다. 예를 들어, `stack`을 `scoreStack`으로, `s`를 `operation`으로, `temp`를 `prevScore`로 지정을 통해 코드를 더 읽기 쉽게 만들 수 있습니다. 또한, 불필요한 System.out.println 문을 제거하여 코드를 더 클린하게 유지할 수 있습니다.
