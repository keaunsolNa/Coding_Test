# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 27. 오후 1:20:59 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.4 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/check-if-any-element-has-prime-frequency/submissions/)

## Code Review

**1. 시간 복잡도**  
- `for (int i : nums)` : 배열 길이 *n*에 대해 O(n)  
- `for (int key : map.keySet())` : 서로 다른 값의 개수를 *k*라 하면 O(k)  
- `isPrime` 내부 루프는 √(frequency) 까지 검사하므로 최악의 경우 O(√n) (frequency ≤ n)  
전체 시간 복잡도는 **O(n + k·√n)** 이며, 일반적인 경우 `k ≤ n` 이므로 **O(n·√n)** 로 표현할 수 있다.  

**2. 공간 복잡도**  
- `HashMap` 에는 각 고유 원소당 하나의 엔트리가 저장된다. 고유 원소 개수를 *k*라 하면 O(k) 공간을 사용한다.  
추가적인 보조 공간은 거의 없으므로 **O(k)** (최악 O(n))이다.  

**3. 풀이 접근법**  
- **해시 테이블**을 이용해 각 원소의 등장 빈도를 카운트하고,  
- 각 빈도가 **소수**인지 검사하는 **수학적 검증**을 수행한다.  
이러한 “카운트 → 검증” 패턴은 빈도 기반 문제에서 흔히 쓰이는 접근법이다.  

**4. 잘된 점**  
- `Map.getOrDefault` 를 활용해 카운팅 로직을 간결하게 구현한 점.  
- `keySet()` 을 순회하면서 바로 빈도에 대해 `isPrime` 을 호출해 가독성이 좋다.  
- `Math.sqrt` 를 사용해 소수 판별 루프 범위를 최적화한 점도 긍정적이다.  

**5. 개선 사항**  
1. **소수 판별 로직 오류**  
   - 현재 `if (n <= 1) return true;` 로 구현돼 있어 1 이하의 수를 소수로 잘못 판단한다.  
   - `n <= 1` 인 경우 `false` 를 반환하도록 수정해야 한다.  

2. **소수 판별 캐시**  
   - 동일한 빈도가 여러 키에서 반복될 수 있다.  
   - `Map<Integer, Boolean> primeCache` 와 같은 메모이제이션을 두어 이미 검사한 빈도 결과를 재사용하면 최악 경우 O(k·√n) → **O(k + √n)** 로 개선될 수 있다.  

3. **루프 최적화**  
   - `for (int i = 2; i * i <= n; i++)` 로 `Math.sqrt` 호출을 피하면 약간의 성능 향상이 있다.  

4. **불필요한 `keySet()` 사용 제거**  
   - `for (Map.Entry<Integer, Integer> entry : map.entrySet())` 로 바로 빈도 값을 얻으면 `map.get(key)` 호출을 피할 수 있다.  

5. **메서드 시그니처**  
   - 문제에서 요구하는 메서드 이름이 `isPossible` 혹은 `primeFrequency` 등일 수 있다. LeetCode 인터페이스와 일치하도록 확인한다.  

**수정 예시 (핵심 부분만)**  

```java
class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int v : nums) freq.put(v, freq.getOrDefault(v, 0) + 1);

        Map<Integer, Boolean> primeCache = new HashMap<>();
        for (int count : freq.values()) {
            if (primeCache.containsKey(count)) {
                if (!primeCache.get(count)) return false;
            } else {
                boolean prime = isPrime(count);
                primeCache.put(count, prime);
                if (!prime) return false;
            }
        }
        return true;
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
```

위와 같이 수정하면 논리 오류가 해결되고, 동일 빈도에 대한 중복 연산을 피할 수 있어 전체 실행 시간이 개선됩니다.
