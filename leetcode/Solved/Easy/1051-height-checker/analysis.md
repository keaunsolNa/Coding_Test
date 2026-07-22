# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 22. 오후 2:04:55 |
| Language | java |
| Runtime | 5 ms (Beats 40.4%) |
| Memory | 43.2 MB (Beats 86.3%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/height-checker/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n log n)입니다. Arrays.sort() 함수는 일반적으로 퀵소트(QuickSort) 알고리즘을 사용하며, 이는 평균적으로 O(n log n)의 시간 복잡도를 가집니다. 이후에 반복문을 통해 원본 배열과 정렬된 배열을 비교하는 과정은 O(n)의 시간 복잡도를 가지므로, 전체 시간 복잡도는 O(n log n) + O(n) = O(n log n)입니다.

2. **공간 복잡도**: O(n)입니다. 원본 배열의 복사본을 생성하기 위해 추가적인 공간이 필요하며, 이는 원본 배열의 크기와 동일합니다.

3. **풀이 접근법**: 이 문제는 정렬 알고리즘을 사용하여 해결할 수 있습니다. Arrays.sort() 함수를 사용하여 heights 배열의 복사본을 정렬한 후, 원본 배열과 정렬된 배열을 비교하여 다른 요소의 개수를 센 것입니다. 이는 간단하면서도 효과적인 접근법입니다.

4. **잘된 점**: 코드는 간결하고 이해하기 쉽습니다. Arrays.sort() 함수를 사용하여 정렬을 간단하게 구현하였으며, 반복문을 통해 원본 배열과 정렬된 배열을 비교하는 과정도 명확합니다.

5. **개선 사항**: 현재의 코드는 이미 간결하고 효율적입니다. 그러나, Arrays.sort() 함수 대신에 카운팅 정렬(Counting Sort) 알고리즘을 사용할 수 있습니다. 이는 heights 배열의 요소가 제한된 범위 내에 존재하는 경우에 유용할 수 있습니다. 하지만, 이 경우에는 Arrays.sort() 함수를 사용하는 것이 더 간단하고 이해하기 쉽습니다.
