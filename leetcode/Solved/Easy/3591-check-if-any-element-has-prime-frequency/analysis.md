# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 27. 오후 1:23:36 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.2 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/check-if-any-element-has-prime-frequency/submissions/)

## Code Review

**1. 시간 복잡도**  
- `for (int i : nums)` : 배열을 한 번 순회 → **O(N)** (N = nums.length)  
- `for (int key : map.keySet())` : 서로 다른 원소 개수인 K 만큼 순회 → **O(K)**  
- `isPrime` 호출 시 최악은 √M (M = 해당 원소의 빈도) 만큼 반복 → 빈도들의 합은 N 이므로 전체는 **O(N √M_max)**, 여기서 M_max는 가장 큰 빈도.  
- 전체 시간 복잡도는 **O(N + K·√M_max)** ≈ **O(N √M_max)**. 일반적인 입력에서는 빈도가 작아 거의 **O(N)** 에 가깝다.

**2. 공간 복잡도**  
- 원소별 빈도를 저장하는 `HashMap`에 최대 K개의 엔트리 → **O(K)** (K ≤ N)  
- 추가적인 변수는 상수 개수 → **O(1)**  
- 따라서 전체 공간 복잡도는 **O(K)**, 최악 경우 **O(N)**.

**3. 풀이 접근법**  
- **해시 테이블**을 이용해 각 숫자의 등장 횟수를 카운트하고,  
- 각 빈도가 2 이상이면 **소수 판정**(`isPrime`)을 수행해 하나라도 소수이면 `true` 반환.  
- 전형적인 **빈도 수집 + 조건 검사** 패턴이다.

**4. 잘된 점**  
- `Map.getOrDefault`를 활용해 카운팅 로직을 간결하게 구현.  
- 빈도 1인 경우 바로 건너뛰어 불필요한 소수 검사를 방지.  
- `isPrime` 구현이 직관적이며 `Math.sqrt`를 이용해 불필요한 반복을 최소화.  
- 코드 가독성이 좋고, 메서드 분리를 통해 책임을 명확히 함.

**5. 개선 사항**  
1. **소수 판정 최적화**  
   - 현재 `isPrime`는 매 호출마다 `Math.sqrt`를 계산한다. `int limit = (int)Math.sqrt(n); for (int i=2; i<=limit; i++)` 로 미리 한 번만 계산하면 약간의 성능 향상이 있다.  
   - 빈도 값이 작을 경우 미리 작은 소수 리스트(2,3,5,7,11…)를 이용해 빠르게 판정할 수 있다.  

2. **불필요한 `boolean check` 변수 제거**  
   - `check` 변수는 사용되지 않으므로 삭제해도 된다.

3. **빈도 2에 대한 빠른 처리**  
   - 2는 가장 작은 소수이므로, `if (map.get(key) == 2) return true;` 로 먼저 체크하면 `isPrime` 호출을 피할 수 있다.

4. **`Map` 대신 `int[]` 사용 가능**  
   - 입력값 범위가 제한적이라면(예: `-10^5 ≤ nums[i] ≤ 10^5`) 배열 기반 카운팅으로 `HashMap`의 오버헤드를 줄일 수 있다. 하지만 일반적인 LeetCode 문제에서는 `HashMap`이 충분히 효율적이다.

5. **메서드 시그니처**  
   - 문제에서 요구하는 메서드 이름이 `primeFrequency` 등일 수 있으니, LeetCode 인터페이스와 정확히 일치하도록 확인한다.  

위와 같은 작은 개선을 적용하면 코드가 더 깔끔하고 약간의 성능 향상을 기대할 수 있다. 전체적인 로직은 매우 적절하며, 가독성·정확성 모두 만족한다.
