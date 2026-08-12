# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 12. 오후 2:09:56 |
| Language | java |
| Runtime | 2 ms (Beats 0.0%) |
| Memory | 42.9 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n log n)입니다. 이유는 `Arrays.sort()` 함수를 사용하여 배열을 정렬하기 때문입니다. 이 함수의 시간 복잡도는 일반적으로 O(n log n)입니다. 또한, 배열을 순회하여 결과를 계산하는 부분의 시간 복잡도는 O(n)입니다. 그러나 정렬 부분이 전체 시간 복잡도를 결정하므로, 전체 시간 복잡도는 O(n log n)입니다.

2. **공간 복잡도**: O(n)입니다. 이유는 입력 배열의 복사본을 생성하기 때문입니다. 입력 배열의 크기가 n일 때, 복사본의 크기도 n이 되므로 공간 복잡도는 O(n)입니다. 또한, 결과를 저장하는 리스트의 크기도 n이므로, 공간 복잡도는 O(n)입니다.

3. **풀이 접근법**: 이 문제는 정렬 알고리즘과 배열 순회를 사용하여 해결했습니다. 먼저, 입력 배열의 복사본을 생성하고 정렬합니다. 그리고 최대값을 찾은 후, 입력 배열을 순회하여 각 원소에 extraCandies를 더했을 때 최대값 이상이 되는지 확인합니다.

4. **잘된 점**: 코드는 간결하고 이해하기 쉽습니다. 또한, 문제의 요구 사항을 정확하게 구현했습니다. 입력 배열의 복사본을 생성하여 원본 배열을 변경하지 않으므로, 안정적인 코드입니다.

5. **개선 사항**: 코드를 최적화할 수 있는 부분은 있습니다. 현재 코드는 정렬을 사용하여 최대값을 찾습니다. 그러나, 최대값을 찾는 데에는 정렬보다 더 효율적인 방법이 있습니다. 예를 들어, 단순히 배열을 순회하여 최대값을 찾을 수 있습니다. 이 경우, 시간 복잡도는 O(n)으로 개선될 수 있습니다. 또한, 결과를 저장하는 리스트를 미리 초기화하여, 리스트의 크기를事前に 결정할 수 있습니다. 이는 코드의 효율성을 높일 수 있습니다. 

```java
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        List<Boolean> list = new ArrayList<>(candies.length);
        
        for (int candy : candies) {
            list.add(candy + extraCandies >= max);
        }
        
        return list;
    }
}
```
