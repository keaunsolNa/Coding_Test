# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 4. 오후 5:17:38 |
| Language | java |
| Runtime | 1 ms (Beats 0.0%) |
| Memory | 42.7 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/find-target-indices-after-sorting-array/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n log n)입니다. Arrays.sort() 함수는 퀵소트 알고리즘을 사용하여 평균 시간 복잡도가 O(n log n)입니다. 이후에 반복문을 통해 target 값을 찾는 과정은 O(n)입니다. 따라서 전체 시간 복잡도는 O(n log n) + O(n) = O(n log n)입니다.

2. **공간 복잡도**: O(n)입니다. Arrays.sort() 함수는 원본 배열을 정렬하므로 추가적인 공간이 필요하지 않습니다. 그러나 결과를 저장하기 위한 List는 최대 n개의 원소를 저장할 수 있으므로 O(n)입니다.

3. **풀이 접근법**: 이 문제는 정렬과 반복문을 사용하여 해결했습니다. 먼저 Arrays.sort() 함수를 사용하여 배열을 정렬하고, 이후에 반복문을 통해 target 값을 찾는 과정에서 그 인덱스를 리스트에 추가합니다.

4. **잘된 점**: 코드는 간결하고 이해하기 쉽습니다. Arrays.sort() 함수를 사용하여 정렬하는 부분은 효율적입니다.

5. **개선 사항**: 이 문제는 이진 탐색을 사용하여 더 효율적으로 해결할 수 있습니다. 정렬된 배열에서 target 값을 찾는 과정에서 이진 탐색을 사용하면 시간 복잡도를 O(log n)으로 줄일 수 있습니다. 또한, target 값의 개수를 미리 계산하여 리스트의 크기를事前に 설정할 수 있습니다. 이는 불필요한 리스트의 크기 조정을 피할 수 있습니다.
