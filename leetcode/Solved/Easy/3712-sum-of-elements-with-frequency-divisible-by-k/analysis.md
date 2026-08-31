# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 31. 오전 10:29:14 |
| Language | java |
| Runtime | 2 ms (Beats 0.0%) |
| Memory | 43.1 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/sum-of-elements-with-frequency-divisible-by-k/submissions/)

## Code Review

**1. 시간 복잡도**  
- 전체 배열 `nums` 를 한 번 순회하면서 빈도수를 기록하므로 **O(N)** (N = `nums.length`).  
- 이후 `map.keySet()` 을 순회하는데, 키의 개수는 최악의 경우 N 개이므로 또 **O(N)**.  
- 따라서 전체 시간 복잡도는 **O(N)** 입니다.

**2. 공간 복잡도**  
- 각 서로 다른 숫자를 키로 하는 `HashMap` 을 사용하므로, 최악의 경우 모든 원소가 서로 다를 때 O(N) 의 추가 메모리가 필요합니다.  
- 따라서 공간 복잡도는 **O(N)** 입니다.

**3. 풀이 접근법**  
- **해시 테이블(맵) 기반 카운팅**: 배열을 한 번 스캔해 각 원소의 등장 빈도를 `Map<Integer, Integer>` 에 저장하고, 이후 빈도가 `k` 로 나누어 떨어지는 원소들을 찾아 그 값에 빈도를 곱해 합산합니다.  
- 이 패턴은 “빈도수 기반 필터링”이라고 부를 수 있습니다.

**4. 잘된 점**  
- `Map.getOrDefault` 를 활용해 빈도수 누적 로직을 간결하게 구현한 점이 좋습니다.  
- `if (map.get(key) % k == 0)` 로 조건을 명확히 표현해 가독성이 높습니다.  
- 로직이 직관적이라 이해하기 쉽습니다.

**5. 개선 사항**  
1. **불필요한 출력 제거**  
   - `System.out.println(map);` 와 `System.out.println(key + " " + map.get(key));` 은 디버깅용이라면 메서드 외부에서 테스트할 때만 사용하고, 최종 제출 코드에서는 제거해야 합니다.  

2. **키와 값을 한 번에 가져오기**  
   - 현재 `map.get(key)` 를 두 번 호출하고 있는데, `Map.Entry<Integer, Integer>` 로 순회하면 한 번만 조회할 수 있어 약간의 성능 향상이 있습니다.  
   ```java
   for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
       int key = entry.getKey();
       int cnt = entry.getValue();
       if (cnt % k == 0) {
           ans += key * cnt;
       }
   }
   ```

3. **오버플로우 방지**  
   - `key * map.get(key)` 가 `int` 범위를 초과할 가능성이 있습니다. 결과가 `long` 이어야 한다면 `long ans = 0;` 로 선언하고 연산 시 `((long) key) * cnt` 로 캐스팅하는 것이 안전합니다.

4. **k 가 0 인 경우 처리**  
   - 문제 정의에 따라 `k` 가 0 일 수 없지만, 방어적 코딩을 위해 `k <= 0` 인 입력에 대한 예외 처리를 추가하면 더욱 견고합니다.

5. **한 번의 순회로 해결 가능**  
   - 현재는 두 번 순회하지만, 빈도수를 기록하면서 동시에 `k` 로 나누어 떨어지는 경우를 바로 합산하는 방법도 가능합니다. 다만 가독성이 약간 떨어질 수 있으니, 현재 구조가 충분히 명확하고 O(N) 이므로 큰 차이는 없습니다.
