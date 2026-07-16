# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 16. 오후 2:59:04 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.9 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n log n)입니다. 이유는 Integer.bitCount() 함수를 사용하여 비트를 세는 작업은 O(1)이며, 이 작업을 배열의 모든 원소에 대해 수행하므로 O(n)입니다. 그리고 Comparator를 사용하여 리스트를 정렬하는 작업은 O(n log n)입니다. 따라서 전체 시간 복잡도는 O(n) + O(n log n) = O(n log n)입니다.

2. **공간 복잡도**: O(n)입니다. 이유는 HashMap과 ArrayList를 사용하여 원소들을 저장하기 때문입니다. HashMap과 ArrayList의 크기는 입력 배열의 크기와 동일하기 때문에 공간 복잡도는 O(n)입니다.

3. **풀이 접근법**: 이 문제는 비트 카운팅과 정렬을 사용하여 해결했습니다. Integer.bitCount() 함수를 사용하여 각 원소의 비트를 세고, HashMap을 사용하여 원소와 비트 카운트를 저장했습니다. 그리고 Comparator를 사용하여 리스트를 정렬했습니다.

4. **잘된 점**: 코드는 읽기 쉽고, 변수 이름이 명확합니다. 또한, Integer.bitCount() 함수를 사용하여 비트를 세는 작업을 간단하게 구현했습니다.

5. **개선 사항**: 코드는 이미 잘 구현되어 있지만, 몇 가지 개선 사항이 있습니다. 예를 들어, System.out.println(map) 문은 불필요합니다. 또한, Comparator를 람다식으로 구현할 수 있습니다. 예를 들어, keySet.sort((o1, o2) -> map.get(o1).compareTo(map.get(o2))); 와 같이 구현할 수 있습니다. 또한, Java 8의 Stream API를 사용하여 코드를 더 간단하게 구현할 수 있습니다. 예를 들어, Arrays.stream(arr).sorted(Comparator.comparing(i -> Integer.bitCount(i))).toArray(); 와 같이 구현할 수 있습니다.
