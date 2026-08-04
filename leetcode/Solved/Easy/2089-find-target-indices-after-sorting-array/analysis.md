# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 4. 오후 5:17:41 |
| Language | java |
| Runtime | 6 ms (Beats 28.4%) |
| Memory | 45.3 MB (Beats 61.9%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/find-target-indices-after-sorting-array/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n log n)입니다. Arrays.sort() 함수는 퀵소트 알고리즘을 사용하여 평균적으로 O(n log n)의 시간 복잡도를 가지며, 이후의 for 루프는 O(n)의 시간 복잡도를 가집니다. 따라서 전체 시간 복잡도는 O(n log n) + O(n) = O(n log n)입니다.

2. **공간 복잡도**: O(n)입니다. Arrays.sort() 함수는 제자리 정렬(in-place sorting)을 수행하므로 추가적인 공간이 필요하지 않습니다. 그러나 결과를 저장하기 위한 리스트는 최대 n개의 요소를 가질 수 있으므로 O(n)의 공간 복잡도를 가집니다.

3. **풀이 접근법**: 이 코드는 정렬 알고리즘과 선형 탐색 알고리즘을 사용합니다. 먼저 Arrays.sort() 함수를 사용하여 입력 배열을 정렬한 후, for 루프를 사용하여 타겟 요소의 인덱스를 찾습니다.

4. **잘된 점**: 코드는 간결하고 이해하기 쉽습니다. Arrays.sort() 함수를 사용하여 정렬을 간단하게 처리하였으며, 결과를 저장하기 위한 리스트를 사용하여 코드를 깔끔하게 유지했습니다.

5. **개선 사항**: 이 문제는 이진 탐색 알고리즘을 사용하여 더 효율적으로 해결할 수 있습니다. 먼저 less_than_target와 equal_to_target의 개수를 세고, less_than_target의 개수를 사용하여 타겟 요소의 시작 인덱스를 계산할 수 있습니다. 예를 들어, less_than_target의 개수가 3이고 equal_to_target의 개수가 2라면, 타겟 요소의 인덱스는 3, 4입니다. 이러한 접근법을 사용하면 시간 복잡도를 O(n)으로 개선할 수 있습니다.
