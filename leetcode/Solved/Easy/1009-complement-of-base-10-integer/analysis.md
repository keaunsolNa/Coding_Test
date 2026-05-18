# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026-05-18 23:30:46 |
| Language | java |
| Runtime | 0 ms (Beats 100.0%) |
| Memory | 42.4 MB (Beats 16.5%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/complement-of-base-10-integer/submissions/)

## Code Review

코드 리뷰를 진행하겠습니다.

1. **시간 복잡도**: O(log n)입니다. 왜냐하면 while 루프는 n의 비트 수만큼 반복되며, 각 반복에서 x를 2배로 증가시킵니다. 따라서 반복 횟수는 n의 비트 수에 비례합니다.

2. **공간 복잡도**: O(1)입니다. why? Because 코드에서 사용된 변수는 고정된 크기이므로, 입력 크기에 따라 메모리 사용량이 증가하지 않습니다.

3. **풀이 접근법**: bit manipulation 알고리즘을 사용했습니다. 코드는 n에 비트마스킹을 적용하여 n의 비트補数를 계산합니다. x 변수는 n의 비트 수에 해당하는 1로 구성된 이진수를 저장하며, while 루프에서 x를不断 증가시켜 n의 비트 수만큼 1로 채웁니다.

4. **잘된 점**: 코드는 간단명료합니다. while 루프를 사용하여 n의 비트 수를 계산하고, 이를 이용하여補数를 계산하는 방식이 효율적입니다.

5. **개선 사항**: 코드는 already tối적화되어 있습니다. 하지만, 코드의 가독성을 높이기 위해 변수명과 comentario를 추가할 수 있습니다. 예를 들어, x 변수를 `bitMask`로 이름을 변경하고, while 루프의 목적을 comentario로 추가할 수 있습니다. 또한, 코드의 입출력 예를 추가하여 테스트를 용이하게 할 수 있습니다.
