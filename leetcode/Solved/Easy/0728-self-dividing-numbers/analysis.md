# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 15. 오전 10:13:55 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.1 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/self-dividing-numbers/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n log n)입니다. 여기서 n은 입력 범위의 크기(left에서 right까지)를 의미합니다. selfDividingNumbers 함수는 left에서 right까지의 모든 숫자를 반복적으로 확인하고, selfDividing 함수는 각 숫자의 자릿수를 확인합니다. 숫자의 자릿수는 숫자의 크기에 비례하므로, 시간 복잡도는 O(n log n)입니다.

2. **공간 복잡도**: O(n)입니다. selfDividingNumbers 함수는 결과를 저장하기 위해 리스트를 사용하며, 리스트의 크기는 최대 right - left + 1입니다. 따라서 공간 복잡도는 O(n)입니다.

3. **풀이 접근법**: 이 풀이는 단순한 반복과 검사 알고리즘을 사용합니다. selfDividingNumbers 함수는 주어진 범위의 모든 숫자를 반복적으로 확인하고, selfDividing 함수는 각 숫자가 자릿수 나누기 조건을 만족하는지 확인합니다. 이 접근법은 직관적이고 이해하기 쉽지만, 대형 입력에 대해서는 비효율적일 수 있습니다.

4. **잘된 점**: 코드는 읽기 쉽고, 변수명과 함수명이 명확합니다. 또한, selfDividing 함수는 재사용 가능하며, 코드의 중복을 피할 수 있습니다.

5. **개선 사항**: 현재 풀이는 이미 최적화된 풀이입니다. 하지만, 더 빠른 풀이를 찾으려면 수학적 성질을 이용하여 자릿수 나누기 조건을 만족하는 숫자를 미리 계산할 수 있습니다. 예를 들어, 10의 배수는 항상 자릿수 나누기 조건을 만족하지 않으므로, 이러한 숫자는 미리 제외할 수 있습니다. 하지만, 이러한 최적화는 코드의 복잡도를 증가시킬 수 있으므로, 필요에 따라 적용해야 합니다.
