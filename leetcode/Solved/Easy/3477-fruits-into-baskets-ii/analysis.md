# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 31. 오전 10:43:29 |
| Language | java |
| Runtime | 3 ms (Beats 0.0%) |
| Memory | 42 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/fruits-into-baskets-ii/submissions/)

## Code Review

**1. 시간 복잡도**  
- 현재 구현은 두 개의 중첩 루프를 사용하고 있어 `O(N·M)` 입니다. 여기서 `N`은 `fruits.length`, `M`은 `baskets.length` 입니다.  
- 문제의 제약이 크지 않다면 통과는 가능하지만, `N·M`이 10⁵ ~ 10⁶ 수준을 넘어가면 시간 초과 위험이 있습니다.

**2. 공간 복잡도**  
- 추가적인 자료구조를 사용하지 않고 입력 배열만 그대로 활용하므로 **O(1)** (상수) 공간 복잡도입니다.  
- 단, `System.out.println` 호출은 디버깅용이므로 실제 제출 시 제거해야 합니다.

**3. 풀이 접근법**  
- **그리디** 방식으로 각 과일을 가능한 가장 작은 바구니에 넣으려는 시도입니다.  
- 바구니가 사용되면 `0` 으로 마킹하고, 해당 과일을 배치한 뒤 바로 다음 과일로 넘어갑니다.  

**4. 잘된 점**  
- 로직이 직관적이고 구현이 간단합니다.  
- 과일이 배치되지 않은 경우를 `cnt` 로 카운트해 최종 결과를 바로 반환합니다.  
- 불필요한 추가 배열이나 복잡한 자료구조 없이 문제를 해결하려는 시도가 좋습니다.

**5. 개선 사항**  

| 항목 | 내용 |
|------|------|
| **정렬 활용** | 과일과 바구니를 각각 오름차순 정렬한 뒤, 두 포인터(`i`, `j`)를 이용해 한 번의 선형 스캔(`O(N log N + M log M)`)으로 매칭할 수 있습니다. 이렇게 하면 최악의 경우에도 `O(N log N + M log M)` 시간에 해결됩니다. |
| **바구니 마킹 방식** | 현재 `baskets[j] = 0` 으로 사용 여부를 표시하고 있는데, 바구니 값이 `0`인 경우 실제로 `0` 크기의 바구니가 있을 수도 있습니다. 대신 `boolean[] used` 와 같은 별도 플래그 배열을 쓰거나, 정렬 후 포인터 방식이면 마킹이 필요 없습니다. |
| **불필요한 출력** | `System.out.println` 은 디버깅용이라면 주석 처리하거나 삭제해야 합니다. 실제 채점에서는 I/O 비용이 크게 늘어나 시간 초과를 유발합니다. |
| **Edge Case 처리** | `baskets`에 음수 혹은 매우 큰 값이 들어올 경우 현재 로직은 정상 동작하지만, 정렬 후 포인터 방식에서는 `int` 범위 초과에 주의해야 합니다. |
| **시간 복잡도 개선** | 위의 정렬 + 투 포인터 방식은 `O(N log N + M log M)` 로, 입력이 10⁵ 정도일 때도 충분히 빠릅니다. 또한 `TreeSet`(Ordered Set) 을 이용하면 `O(N log M)` 로도 구현 가능합니다. |

**예시 개선 코드 (정렬 + 투 포인터)**  

```java
class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        Arrays.sort(fruits);
        Arrays.sort(baskets);

        int i = 0, j = 0, placed = 0;
        while (i < fruits.length && j < baskets.length) {
            if (fruits[i] <= baskets[j]) {
                placed++;
                i++;
                j++;
            } else {
                // 현재 바구니가 과일보다 작으니 더 큰 바구니를 찾아야 함
                j++;
            }
        }
        return fruits.length - placed;
    }
}
```

위와 같이 수정하면 시간 복잡도가 크게 개선되고, 코드 가독성도 향상됩니다.
