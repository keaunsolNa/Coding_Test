# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 9. 2. 오후 4:36:48 |
| Language | java |
| Runtime | 17 ms (Beats 5.0%) |
| Memory | 47.3 MB (Beats 92.5%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/maximize-sum-of-at-most-k-distinct-elements/submissions/)

## Code Review

**1. 시간 복잡도**  
- `Arrays.stream(nums).boxed().collect(...)` : 배열을 한 번 순회 → **O(n)**  
- `list.sort(Comparator.reverseOrder())` : `list` 의 크기는 중복을 제거한 뒤이므로 최악은 `n` 개 → **O(m log m)** (m = 서로 다른 원소 개수, m ≤ n)  
- 최종 복사 루프 : **O(k)** (k ≤ m)  

전체 시간 복잡도는 **O(n + m log m)**, 최악 경우 **O(n log n)** 입니다.

**2. 공간 복잡도**  
- `LinkedHashSet` 에 원소를 모두 저장 → O(m)  
- `ArrayList` 로 다시 복사 → O(m)  
- 결과 배열 `ans` → O(k)  

추가적인 보조 공간이 전체적으로 **O(m)** (최악 O(n)) 입니다.

**3. 풀이 접근법**  
- **Hash‑Set + 정렬** 패턴을 사용했습니다.  
  1) `LinkedHashSet` 으로 중복을 제거하면서 입력 순서를 유지(하지만 이후 정렬하므로 순서 유지 의미는 사라짐).  
  2) 중복이 제거된 리스트를 내림차순으로 정렬.  
  3) 상위 `k` 개 원소를 결과 배열에 복사.  

이는 “가장 큰 k개의 서로 다른 원소”를 구하는 전형적인 그리디 + 정렬 방법입니다.

**4. 잘된 점**  
- Java 8 스트림을 활용해 코드를 간결하게 작성했습니다.  
- `LinkedHashSet`을 사용해 중복 제거를 한 번에 수행했습니다.  
- `Comparator.reverseOrder()` 로 내림차순 정렬을 직관적으로 표현했습니다.  
- `Math.min(list.size(), k)` 로 `k` 가 원소 개수보다 클 때도 안전하게 처리했습니다.

**5. 개선 사항**  
1. **불필요한 자료구조 제거**  
   - `LinkedHashSet` → `HashSet` 으로 바꾸어도 정렬 전에는 순서가 필요 없으므로 메모리와 약간의 오버헤드를 줄일 수 있습니다.  
   - `Set` → `int[]` 로 바로 변환 후 `Arrays.sort` 를 사용하면 박싱/언박싱 비용을 없앨 수 있습니다.

2. **정렬 대신 힙 사용**  
   - `m` 이 매우 크고 `k` 가 작을 경우 전체를 정렬하는 O(m log m) 보다 **최소 힙**(size = k) 을 이용해 O(m log k) 로 상위 k 개 원소만 추출할 수 있습니다.  
   - 구현 예시: `PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);` 로 순회하면서 힙에 넣고, 힙 크기가 k 를 초과하면 가장 작은 원소를 제거.

3. **스트림 사용 최소화**  
   - 현재 코드는 `boxed()` 로 `int` → `Integer` 변환, `collect` 로 `Set` 생성, 다시 `ArrayList` 로 복사 등 여러 번 객체를 생성합니다.  
   - 순수 배열 기반 루프를 사용하면 가비지 생성이 줄어들어 실행 시간이 약간 개선됩니다.

4. **결과 배열 정렬 보장**  
   - 현재는 내림차순 정렬된 리스트에서 앞 `k` 개를 복사하므로 결과도 내림차순이지만, `k` 가 `list.size()` 보다 작을 때 `ans` 가 정렬된 상태임을 명시적으로 주석 처리하면 가독성이 향상됩니다.

**요약**  
현재 구현은 가독성이 좋고 요구사항을 정확히 만족하지만, `k` 가 작고 입력이 클 때는 힙 기반 O(m log k) 알고리즘이 더 효율적이며, 박싱/언박싱을 피하면 메모리와 시간 측면에서 약간의 최적화를 얻을 수 있습니다. 필요에 따라 이러한 대안을 적용해 보세요.
