# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 31. 오전 10:29:24 |
| Language | java |
| Runtime | 3 ms (Beats 54.2%) |
| Memory | 44.3 MB (Beats 70.1%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/sum-of-elements-with-frequency-divisible-by-k/submissions/)

## Code Review

**1. 시간 복잡도**  
- 전체 시간 복잡도: **O(N)**  
- 첫 번째 `for` 루프에서 `nums` 배열을 한 번 순회하며 원소 빈도를 카운트합니다 (`N` = `nums.length`).  
- 두 번째 `for` 루프는 `map.keySet()`을 순회하는데, 키의 개수는 최악의 경우에도 `N` 이하이므로 역시 O(N)입니다.  
- 따라서 전체는 O(N + M) ≈ O(N) (여기서 M은 서로 다른 값의 개수) 입니다.

**2. 공간 복잡도**  
- **O(M)**, 여기서 M은 `nums` 배열에서 서로 다른 값의 개수입니다.  
- 빈도수를 저장하기 위해 `HashMap<Integer, Integer>` 를 사용하므로, 최악의 경우(모든 원소가 서로 다름) O(N)의 추가 메모리를 사용합니다.

**3. 풀이 접근법**  
- **해시 테이블(맵) 기반 카운팅** 패턴을 사용했습니다.  
- 배열을 한 번 순회하면서 각 원소의 등장 횟수를 `map`에 저장하고, 이후 빈도가 `k` 로 나누어 떨어지는 원소들만 `key * frequency` 를 누적해 답을 구합니다.

**4. 잘된 점**  
- `Map#getOrDefault` 를 활용해 코드가 간결하고 가독성이 좋습니다.  
- `key * map.get(key)` 로 한 번에 해당 원소들의 합을 계산해 불필요한 반복을 없앴습니다.  
- 변수명(`map`, `ans`)이 직관적이며, 로직이 명확하게 분리되어 있어 이해하기 쉽습니다.

**5. 개선 사항**  
1. **불필요한 `keySet()` 사용 최소화**  
   - `for (int key : map.keySet())` 대신 `for (Map.Entry<Integer, Integer> entry : map.entrySet())` 를 사용하면 `map.get(key)` 호출을 한 번만 할 수 있어 약간의 성능 향상이 있습니다.  

   ```java
   for (Map.Entry<Integer, Integer> e : map.entrySet()) {
       int key = e.getKey();
       int cnt = e.getValue();
       if (cnt % k == 0) {
           ans += key * cnt;
       }
   }
   ```

2. **`k` 가 0인 경우 방어 코드**  
   - 문제에서 `k` 가 0이 될 가능성이 없다고 가정하더라도, `k == 0` 일 때 `cnt % k` 연산은 `ArithmeticException`을 발생시킵니다. 입력 검증을 추가하면 안전합니다.  

   ```java
   if (k == 0) return 0; // 혹은 예외 처리
   ```

3. **`long` 사용 고려**  
   - `key * cnt` 가 `int` 범위를 초과할 가능성이 있다면 `long` 타입으로 누적하는 것이 안전합니다.  

   ```java
   long ans = 0L;
   // ...
   ans += (long) key * cnt;
   return (int) ans; // 필요 시 캐스팅
   ```

4. **한 번의 순회로 해결 가능** (옵션)  
   - 빈도와 합을 동시에 저장하는 `Map<Integer, Pair<Integer, Integer>>` (또는 두 개의 맵) 를 사용하면 한 번의 순회만으로도 답을 구할 수 있지만, 현재 구현도 충분히 간결하고 O(N) 이므로 가독성을 위해 그대로 두는 것이 좋습니다.  

전반적으로 코드가 깔끔하고 요구사항을 정확히 만족합니다. 위의 작은 개선점을 적용하면 약간의 성능·안전성 향상을 기대할 수 있습니다.
