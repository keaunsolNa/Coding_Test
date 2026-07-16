# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 16. 오후 3:01:42 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 43.1 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n log n) - 코드에서 사용된 정렬 알고리즘이 전체 시간 복잡도를 결정하며, 자바의 기본 정렬 알고리즘은 TimSort로 O(n log n)의 시간 복잡도를 가지고 있습니다. 또한, 비트 카운트를 위한 Integer.bitCount() 메서드는 O(1)의 시간 복잡도를 가지므로 전체 시간 복잡도에 영향을 미치지 않습니다.

2. **공간 복잡도**: O(n) - 코드에서 사용된 HashMap과 ArrayList는 입력 배열의 크기(n)에 비례하는 공간을 사용하므로 O(n)의 공간 복잡도를 가집니다.

3. **풀이 접근법**: 코드는 비트 카운트를 기반으로 정렬하는 문제를 해결하기 위해 HashMap을 사용하여 각 숫자의 비트 카운트를 저장하고, 이후에 정렬을 수행합니다. 이는 비트 카운트를 기반으로 정렬하는 문제에 적합한 접근법입니다.

4. **잘된 점**: 코드는 비교자(Comparator)를 사용하여 정렬을 수행하는 부분이 잘 구현되어 있습니다. 또한, 비트 카운트를 위한 Integer.bitCount() 메서드를 사용하여 코드를 간결하게 작성했습니다.

5. **개선 사항**: 비교자(Comparator)에서 map.get(o1) == map.get(o2)일 때 o1 - o2를 반환하는 부분이 불필요합니다. 비교자에서 map.get(o1)과 map.get(o2)를 먼저 비교하고, 같을 때에만 o1과 o2를 비교하면 더 효율적인 코드가 됩니다. 또한, System.out.println(map)과 같은 디버깅 코드는 제거하는 것이 좋습니다. 개선된 비교자 코드는 다음과 같습니다.
```java
keySet.sort(new Comparator<Integer>() {
    @Override
    public int compare(Integer o1, Integer o2) {
        int bitCount1 = map.get(o1);
        int bitCount2 = map.get(o2);
        if (bitCount1 == bitCount2) return o1 - o2;
        return bitCount1 - bitCount2;
    }
});
```
