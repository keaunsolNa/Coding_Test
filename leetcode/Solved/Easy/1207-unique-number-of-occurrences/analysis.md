# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 22. 오후 12:49:24 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.6 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/unique-number-of-occurrences/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 코드는 입력 배열을 한 번 순회하고, 해시맵의 키를 순회하므로, 전체 시간 복잡도는 입력 크기에 비례합니다. 또한 contains 메소드는 리스트의 크기에 비례하는 시간을 가지므로, 최악의 경우 O(n^2)이 될 수 있습니다. 따라서, 리스트의 contains 메소드를 사용하는 부분을 개선할 필요가 있습니다.

2. **공간 복잡도**: O(n) - 코드는 입력 배열의 요소 수에 비례하는 크기의 해시맵과 리스트를 사용하므로, 공간 복잡도는 O(n)입니다.

3. **풀이 접근법**: 이 코드는 해시맵을 사용하여 각 요소의 출현 횟수를 계산하고, 리스트를 사용하여 출현 횟수의 중복을 확인합니다. 이는 해시맵과 리스트를 사용한 기본적인 알고리즘입니다.

4. **잘된 점**: 코드는 해시맵을 사용하여 각 요소의 출현 횟수를 효율적으로 계산하고, 리스트를 사용하여 출현 횟수의 중복을 확인하려고 시도했습니다. 또한, 코드는 비교적 간단하고 이해하기 쉽습니다.

5. **개선 사항**: contains 메소드를 사용하는 부분을 개선할 필요가 있습니다. 리스트 대신 해시셋을 사용하여 출현 횟수의 중복을 확인할 수 있습니다. 해시셋의 add 메소드는 이미 존재하는 요소를 추가할 때 false를 반환하므로, 중복을 효율적으로 확인할 수 있습니다. 또한, System.out.println 문은 제거하는 것이 좋습니다. 다음과 같이 개선할 수 있습니다.
```java
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) map.put(i, map.getOrDefault(i, 0) + 1);
        Set<Integer> valSet = new HashSet<>();
        for (int key : map.keySet()) {
            int num = map.get(key);
            if (!valSet.add(num)) return false;
        }
        return true;
    }
}
```
