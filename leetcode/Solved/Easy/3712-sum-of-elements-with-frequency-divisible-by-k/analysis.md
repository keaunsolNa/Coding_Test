# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 31. 오전 10:27:45 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.5 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/sum-of-elements-with-frequency-divisible-by-k/submissions/)

## Code Review

**1. 시간 복잡도**  
- `for (int i : nums)` : 배열 `nums` 를 한 번 순회 → **O(n)** (n = nums.length)  
- `for (int key : map.keySet())` : 해시맵에 저장된 서로 다른 값의 개수 m 만큼 순회 → **O(m)**  
전체 시간 복잡도는 **O(n + m)** 이며, 최악의 경우 모든 원소가 서로 다르면 m = n 이므로 **O(n)** 입니다.

**2. 공간 복잡도**  
- 각 원소와 등장 횟수를 저장하기 위해 `HashMap<Integer, Integer>` 를 사용 → 서로 다른 값의 개수만큼 메모리를 사용합니다.  
따라서 **O(m)** (최악 O(n)) 의 추가 공간이 필요합니다.

**3. 풀이 접근법**  
- **해시맵을 이용한 빈도 카운팅**: 배열을 한 번 순회하면서 각 숫자의 등장 횟수를 기록하고, 이후 빈도가 `k` 와 정확히 일치하는 경우에만 `key * k` 를 누적합니다.  
- 이 방법은 “빈도수 기반 필터링” 패턴에 해당합니다.

**4. 잘된 점**  
- `Map.getOrDefault` 를 활용해 코드가 간결하고 가독성이 좋습니다.  
- 불필요한 중간 리스트나 배열을 만들지 않아 메모리 사용을 최소화했습니다.  
- `key * k` 로 한 번에 해당 숫자의 전체 합을 계산해 반복적인 덧셈을 피했습니다.

**5. 개선 사항**  
1. **조건 오류**  
   - 문제는 “빈도가 **k 로 나누어 떨어지는** 경우”를 요구합니다(`frequency % k == 0`). 현재 구현은 `frequency == k` 로만 체크하고 있어 정답이 제한됩니다.  
   - 수정: `if (map.get(key) % k == 0) ans += key * map.get(key);`

2. **불필요한 `key * k` 연산**  
   - 위와 같이 조건을 바꾸면 `key * map.get(key)` 로 실제 빈도만큼 곱해 주어야 합니다.

3. **`int` 오버플로우 방지**  
   - `key * frequency` 가 `int` 범위를 초과할 가능성이 있다면 `long` 로 누적하거나 `Math.multiplyExact` 로 안전하게 계산하는 것이 좋습니다.

4. **스트림 활용 (선택 사항)**  
   - Java 8 이상이라면 `Map` 스트림을 이용해 한 줄로 구현할 수 있습니다.  
   ```java
   long ans = map.entrySet().stream()
                 .filter(e -> e.getValue() % k == 0)
                 .mapToLong(e -> (long) e.getKey() * e.getValue())
                 .sum();
   ```

5. **변수명 및 메서드 시그니처**  
   - `sumDivisibleByK` 라는 메서드명은 “빈도가 k 로 나누어 떨어지는 원소들의 합”이라는 의미를 더 명확히 전달하도록 `sumOfElementsWithFrequencyDivisibleByK` 와 같이 바꾸면 가독성이 향상됩니다.  

위와 같이 조건을 바로잡고 오버플로우를 고려한다면, 현재 구현은 시간·공간 효율성 면에서 충분히 최적화된 수준이라고 할 수 있습니다.
