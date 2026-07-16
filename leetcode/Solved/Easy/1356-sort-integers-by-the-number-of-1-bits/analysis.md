# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 16. 오후 2:58:16 |
| Language | java |
| Runtime | 1 ms (Beats 0.0%) |
| Memory | 43.3 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n log n)입니다. Integer.bitCount() 함수는 O(log n) 시간 복잡도를 가지며, 이 함수를 n번 호출합니다. 또한, 리스트를 정렬하는 데 O(n log n) 시간이 걸립니다.

2. **공간 복잡도**: O(n)입니다. 해시맵과 리스트에 n개의 요소를 저장하기 때문입니다.

3. **풀이 접근법**: 이 문제는 비트 조작과 정렬 알고리즘을 사용합니다. Integer.bitCount() 함수를 사용하여 각 정수의 1의 개수를 세고, 해시맵에 저장합니다. 이후, 리스트를 정렬하여 1의 개수가 적은 정수부터 출력합니다.

4. **잘된 점**: 코드는 읽기 쉽고, 변수명이 명확합니다. 또한, 문제의 요구 사항을 정확하게 구현했습니다.

5. **개선 사항**: 현재 코드는 정렬을 내림차순으로 진행하고 있습니다. 하지만, 문제에서는 1의 개수가 적은 정수를 먼저 출력해야 하므로, 오름차순 정렬을 사용해야 합니다. 또한, 정렬을 위해 커스텀 비교 함수를 사용하고 있지만, 문제에서는 1의 개수가 같은 경우에는 정수의 크기순으로 정렬해야 합니다. 따라서, 비교 함수를 수정하여 1의 개수가 같은 경우에는 정수의 크기순으로 정렬하도록 해야 합니다. 예를 들어, `(o1, o2) -> map.get(o1).compareTo(map.get(o2)) == 0 ? o1.compareTo(o2) : map.get(o1).compareTo(map.get(o2))`와 같이 수정할 수 있습니다.
