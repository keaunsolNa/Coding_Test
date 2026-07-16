# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 16. 오후 2:58:35 |
| Language | java |
| Runtime | 2 ms (Beats 0.0%) |
| Memory | 43 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n log n)입니다. 이유는 HashMap에 데이터를 저장하는 시간은 O(n)이고, 이후에 리스트를 정렬하는 시간은 O(n log n)입니다. 따라서 전체 시간 복잡도는 O(n) + O(n log n) = O(n log n)입니다.

2. **공간 복잡도**: O(n)입니다. HashMap과 ArrayList에 데이터를 저장하기 때문에 입력 크기(n)에 비례하는 메모리 공간을 사용합니다.

3. **풀이 접근법**: 이 문제는 비트 조작과 정렬을 사용합니다. Integer.bitCount() 함수를 사용하여 각 정수의 1의 개수를 세고, HashMap에 저장합니다. 이후에 리스트를 정렬하여 1의 개수가 적은 정수부터 먼저 출력합니다.

4. **잘된 점**: 코드는 비교적 간결하고, HashMap을 사용하여 데이터를 효율적으로 저장하고 접근합니다. 또한, Integer.bitCount() 함수를 사용하여 비트 조작을 간단하게 구현했습니다.

5. **개선 사항**: 현재 코드는 정렬을 내림차순으로 구현했지만, 문제에서는 1의 개수가 같을 경우에는 오름차순으로 정렬해야 합니다. 따라서 비교 함수를 수정하여 1의 개수가 같을 경우에는 원래 숫자를 비교하여 오름차순으로 정렬하도록 해야 합니다. 예를 들어, `(o1, o2) -> map.get(o1).equals(map.get(o2)) ? o1 - o2 : map.get(o1) - map.get(o2)`와 같이 수정할 수 있습니다.
