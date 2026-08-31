# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 31. 오전 10:42:08 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.7 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/fruits-into-baskets-ii/submissions/)

## Code Review

**1. 시간 복잡도**  
- 현재 구현은 이중 루프를 사용하고 있어 `O(N·M)` 입니다. 여기서 `N = fruits.length`, `M = baskets.length`.  
- 문제의 제약이 크지 않다면 통과할 수 있지만, `N·M`이 10⁵ ~ 10⁶ 수준을 넘어가면 시간 초과가 발생할 위험이 있습니다.

**2. 공간 복잡도**  
- 추가적인 자료구조를 사용하지 않고 입력 배열만 그대로 활용하므로 `O(1)` (상수) 공간 복잡도입니다.  
- 단, `baskets` 배열을 직접 수정하고 있기 때문에 원본 데이터를 보존해야 하는 경우에는 별도의 복사본이 필요합니다.

**3. 풀이 접근법**  
- 완전 탐색(Brute‑Force) 방식으로, 각 과일을 모든 바구니와 비교해 조건을 만족하면 바구니를 `0` 으로 비우고 과일 개수를 감소시킵니다.  
- “바구니를 사용했으면 0 으로 마킹한다”는 간단한 시뮬레이션 패턴을 사용했지만, 바구니가 한 번만 사용될 수 있다는 제약을 제대로 활용하지 못했습니다.

**4. 잘된 점**  
- 코드가 직관적이고 이해하기 쉬워서 로직 흐름을 빠르게 파악할 수 있습니다.  
- 불필요한 변수 선언 없이 바로 `cnt--` 로 남은 과일 수를 관리한 점이 간결합니다.  

**5. 개선 사항**  
1. **정렬 + 이진 탐색**  
   - `fruits`와 `baskets`를 각각 오름차순 정렬한 뒤, 가장 작은 과일부터 가능한 가장 작은 바구니에 할당하면 `O(N log N + M log M)` 로 해결할 수 있습니다.  
   - 정렬 후 두 포인터(또는 `TreeSet`/`Multiset`)를 이용해 바구니를 효율적으로 찾으면 전체 시간 복잡도는 `O(N log N + M log M)` 혹은 `O(N log M)` 가 됩니다.

2. **멀티셋/TreeMap 활용**  
   - `java.util.TreeMap<Integer, Integer>` 혹은 `java.util.TreeSet<Integer>` 로 바구니 용량을 관리하면, 각 과일에 대해 `ceilingKey`(≥ 과일 크기) 를 O(log M) 에 찾을 수 있어 전체 복잡도는 `O(N log M)` 입니다.

3. **바구니 재사용 방지**  
   - 현재 코드는 한 과일이 여러 바구니에 매칭될 수 있는 버그가 있습니다. `if (fruits[i] <= baskets[j])` 가 참이면 바로 `break;` 로 현재 과일에 대해 매칭된 바구니를 찾았으니 루프를 종료해야 합니다.

4. **입력 배열 보존**  
   - `baskets` 배열을 직접 0 으로 바꾸는 대신 복사본을 사용하거나, 사용된 바구니를 `boolean[] used` 로 표시하면 원본 데이터를 유지할 수 있어 함수 재사용성이 높아집니다.

5. **코드 가독성**  
   - 변수명을 `cnt` 보다는 `unplacedCount` 와 같이 의미를 명확히 하는 것이 좋습니다.  
   - `for` 루프 내부에 `break` 를 넣어 불필요한 반복을 방지하면 가독성 및 성능이 동시에 개선됩니다.

**예시 개선 코드 (정렬 + 이진 탐색)**  

```java
class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        Arrays.sort(fruits);
        Arrays.sort(baskets);

        int i = 0, j = 0;               // i: 과일 인덱스, j: 바구니 인덱스
        while (i < fruits.length && j < baskets.length) {
            if (fruits[i] <= baskets[j]) { // 현재 바구니에 넣을 수 있음
                i++;                       // 과일 하나 배정
                j++;                       // 바구니 사용 완료
            } else {
                j++;                       // 현재 바구니는 너무 작음 → 다음 바구니 탐색
            }
        }
        return fruits.length - i;          // 배정되지 않은 과일 수
    }
}
```

이와 같이 정렬과 투 포인터(또는 TreeSet) 방식을 적용하면 시간 복잡도가 크게 개선되고, 논리 오류도 사라집니다.
