# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 22. 오후 12:49:54 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.8 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/unique-number-of-occurrences/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 코드는 배열을 두 번 순회합니다. 첫 번째 순회는 각 요소의 발생 횟수를 계산하는 데 사용되며, 두 번째 순회는 발생 횟수의 유일성을 확인하는 데 사용됩니다. 따라서 전체 시간 복잡도는 O(n)입니다.

2. **공간 복잡도**: O(n) - 코드는 두 개의 추가 데이터 구조를 사용합니다: `map`과 `valList`. 최악의 경우, 배열의 모든 요소가 고유할 수 있으므로 `map`과 `valList`의 크기는 n까지 증가할 수 있습니다. 따라서 공간 복잡도는 O(n)입니다.

3. **풀이 접근법**: 해시 맵과 리스트를 사용하여 발생 횟수의 유일성을 확인합니다. 먼저, 각 요소의 발생 횟수를 계산하고 해시 맵에 저장합니다. 그런 다음, 발생 횟수를 리스트에 저장하고 리스트에 중복된 발생 횟수가 있는지 확인합니다.

4. **잘된 점**: 코드는 간결하고 이해하기 쉽습니다. 발생 횟수를 계산하고 확인하는 로직이 분리되어 있습니다. 또한, 변수 이름이 명확하여 코드의 의도를 쉽게 파악할 수 있습니다.

5. **개선 사항**: 코드는 이미 효율적이지만, 발생 횟수를 확인하는 부분을 개선할 수 있습니다. 현재, 리스트에 발생 횟수를 추가하고 중복을 확인하는 데 O(n) 시간이 걸립니다. 대신, 해시 집합을 사용하여 발생 횟수의 유일성을 확인할 수 있습니다. 발생 횟수를 해시 집합에 추가하고, 추가에 실패할 경우(false를 반환할 경우) 즉시 함수를 종료할 수 있습니다. 이 방법으로 코드의 효율성을 조금 더提高할 수 있습니다. 

```java
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) map.put(i, map.getOrDefault(i, 0) + 1);
        
        Set<Integer> set = new HashSet<>();
        for (int num : map.values()) {
            if (!set.add(num)) return false;
        }
        return true;
    }
}
```
