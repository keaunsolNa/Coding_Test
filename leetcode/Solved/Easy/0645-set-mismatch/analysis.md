# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 22. 오후 3:39:29 |
| Language | java |
| Runtime | 6 ms (Beats 0.0%) |
| Memory | 43.3 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/set-mismatch/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n log n)입니다. Arrays.sort() 함수가 전체 시간 복잡도의 대부분을 차지하며, 이는 퀵소트 알고리즘을 사용하여 평균적으로 O(n log n)의 시간 복잡도를 가집니다. 이후 반복문을 통해 nums 배열을 순회하고, arr 배열을 순회하여 결과를 찾는 과정은 각각 O(n)과 O(max)의 시간 복잡도를 가지므로, 전체 시간 복잡도는 O(n log n) + O(n) + O(max) = O(n log n)으로简化됩니다.

2. **공간 복잡도**: O(max)입니다. arr 배열의 크기는 max + 1로 정의되며, 이는 입력 배열 nums의 최대값에 따라 결정됩니다. 따라서 공간 복잡도는 O(max)입니다.

3. **풀이 접근법**: 이 풀이는 정렬과 카운팅을 사용하여 문제를 해결합니다. 먼저 nums 배열을 정렬하고, 이후 arr 배열을 생성하여 nums 배열의 각 원소의 출현 횟수를 카운팅합니다. 이를 통해 중복된 원소와 누락된 원소를 찾을 수 있습니다.

4. **잘된 점**: 코드는 비교적 간결하고, 문제를 해결하는 논리는 명확합니다. Arrays.sort() 함수를 사용하여 nums 배열을 정렬하는 부분은 직관적이며, arr 배열을 사용하여 원소의 출현 횟수를 카운팅하는 부분도 효율적입니다.

5. **개선 사항**: 코드에서 개선할 수 있는 부분은 Arrays.sort() 함수의 사용입니다. 정렬을 사용하면 시간 복잡도가 O(n log n)이지만, 해시 테이블을 사용하여 원소의 출현 횟수를 카운팅할 경우 시간 복잡도를 O(n)으로 줄일 수 있습니다. 또한, max 값을 찾는 부분에서 nums 배열의 최대값을 직접 찾는 대신, nums.length를 사용하여 n의 범위를 가정할 경우 더 효율적인 코드를 작성할 수 있습니다. 또한, System.out.println()문을 사용한 디버깅 코드는 제거하는 것이 좋습니다.
