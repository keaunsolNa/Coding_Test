# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 4. 오전 9:20:00 |
| Language | java |
| Runtime | 1 ms (Beats 0.0%) |
| Memory | 42.8 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/find-missing-elements/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n log n)입니다. Arrays.sort() 함수의 시간 복잡도가 O(n log n)이며, 이후의 반복문은 O(n)입니다. 따라서 전체 시간 복잡도는 O(n log n) + O(n) = O(n log n)입니다.

2. **공간 복잡도**: O(n)입니다. boolean 배열과 결과 리스트의 크기는 입력 배열의 크기에 비례하므로 O(n)입니다.

3. **풀이 접근법**: 정렬과 해시 테이블을 사용한 접근법입니다. 먼저 입력 배열을 정렬하고, 이후에 boolean 배열을 사용하여 존재하는 원소를 표시합니다. 마지막으로 존재하지 않는 원소를 결과 리스트에 추가합니다.

4. **잘된 점**: 코드는 간결하고 이해하기 쉽습니다. 또한, 문제의 요구 사항을 정확하게 구현했습니다.

5. **개선 사항**: Arrays.sort() 함수 대신에 해시 테이블만을 사용하여 풀이할 수 있습니다. 이는 시간 복잡도를 O(n)으로 개선할 수 있습니다. 또한, boolean 배열의 초기화를 별도로 하지 않아도 됩니다. boolean 배열은 기본적으로 false로 초기화되기 때문입니다. 또한, 결과 리스트를 생성할 때, ArrayList의 초기 용량을 지정하여 불필요한 동적 할당을 피할 수 있습니다. 

```java
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int num : nums) {
            set.add(num);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        List<Integer> list = new ArrayList<>(max - min + 1);
        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) list.add(i);
        }
        
        return list;
    }
}
```
