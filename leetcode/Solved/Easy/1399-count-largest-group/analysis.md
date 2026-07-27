# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 27. 오후 5:20:33 |
| Language | java |
| Runtime | 4 ms (Beats 0.0%) |
| Memory | 42.4 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/count-largest-group/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n log n) - 각 숫자의 자릿수 합을 계산하는 데 O(log n) 시간이 걸리고, 1부터 n까지의 모든 숫자를 처리하기 때문에 O(n) 시간이 걸리므로, 총 시간 복잡도는 O(n log n)입니다.

2. **공간 복잡도**: O(n) - 해시 맵에 최대 n개의 키를 저장할 수 있으므로, 공간 복잡도는 O(n)입니다.

3. **풀이 접근법**: 이 문제는 해시 맵을 사용하여 각 숫자의 자릿수 합을 계산하고, 해당 합의 빈도를 저장합니다. 이후 빈도 중 최대 값을 찾는 알고리즘을 사용합니다. 이 접근법은 해시 맵의 빠른 탐색과 삽입 능력을 활용하여 효율적으로 문제를 해결합니다.

4. **잘된 점**: 코드는 문제를 명확하게 이해하고, 해시 맵을 사용하여 효율적으로 해결했습니다. 또한, 변수 이름이 명확하고, 코드가 읽기 쉽습니다.

5. **개선 사항**: while 루프 내의 `origin -= origin % mod;` 문을 `origin /= 10;`로 대체하여 코드를 간소화할 수 있습니다. 또한, `mod` 변수는 불필요한 변수로, `origin % 10`을 직접 사용하여 코드를 더 간결하게 만들 수 있습니다. 또한, `System.out.println` 문은 디버깅 용도로 사용되므로, 최종 제출 코드에서는 제거하는 것이 좋습니다. 

예를 들어, 다음과 같이 개선할 수 있습니다:
```java
class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            int num = 0;
            int origin = i;

            while (origin > 0) {
                num += origin % 10;
                origin /= 10;
            }

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int ans = 0;
        for (int key : map.keySet()) {
            ans = Math.max(ans, map.get(key));
        }

        return ans;
    }
}
```
