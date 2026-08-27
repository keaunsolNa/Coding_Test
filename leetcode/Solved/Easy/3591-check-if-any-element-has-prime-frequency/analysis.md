# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 27. 오후 1:21:40 |
| Language | java |
| Runtime | 4 ms (Beats 0.0%) |
| Memory | 42.9 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/check-if-any-element-has-prime-frequency/submissions/)

## Code Review

**1. 시간 복잡도**  
- **전체 복잡도: O(N log M)**  
  - `for (int i : nums)` 를 돌며 해시맵에 빈도수를 저장하는 단계는 O(N) (N = 배열 길이).  
  - 각 서로 다른 원소에 대해 `isPrime(freq)` 를 호출하는데, `isPrime` 은 √freq 까지 검사하므로 최악의 경우 O(√M) (M = 가장 큰 빈도수).  
  - 전체는 O(N + K·√M) ≈ O(N log M) 로 볼 수 있다. (실제 빈도수는 N 이하이므로 √M ≤ √N.)

**2. 공간 복잡도**  
- **O(K)**, 여기서 K는 `nums` 에서 서로 다른 값의 개수.  
  - 해시맵에 각 원소와 그 빈도수를 저장하므로 추가적인 배열이나 리스트는 사용하지 않는다.  

**3. 풀이 접근법**  
- **해시맵을 이용한 빈도수 카운팅** → 각 원소가 몇 번 등장했는지 O(N)에 구함.  
- **소수 판별** → 빈도수가 소수인지 확인하기 위해 2부터 √n까지 나눗셈을 수행.  
- 모든 빈도수가 소수이면 `true`, 하나라도 소수가 아니면 `false` 를 반환한다.  

**4. 잘된 점**  
- `Map.getOrDefault` 를 활용해 코드가 간결하고 가독성이 좋다.  
- `isPrime` 구현이 직관적이며, 1 이하를 바로 걸러내는 등 기본적인 예외 처리를 잘 해놓았다.  
- `keySet()` 을 순회하면서 바로 빈도수와 소수 여부를 검사해 불필요한 반복을 최소화한다.  

**5. 개선 사항**  

| 항목 | 내용 | 이유 |
|------|------|------|
| **불필요한 출력** | `System.out.println` 구문 제거 | 온라인 저지에서는 출력이 오히려 오버헤드가 되며, 정답 판정에 영향을 주지 않는다. |
| **소수 판별 최적화** | - 2와 짝수를 미리 처리 <br> - 6k±1 패턴 사용 | 현재 구현은 매번 `Math.sqrt` 를 호출하고 모든 i 를 검사한다. 2와 짝수를 먼저 걸러내고, 이후 6k±1 형태만 검사하면 약 2배 정도 빠르게 된다. |
| **빈도수 범위 활용** | 빈도수가 2 이하이면 바로 `true` 반환 | 2는 소수, 1은 소수가 아니므로 `isPrime` 호출 전에 빠르게 판단 가능. |
| **메서드 시그니처** | `public boolean checkPrimeFrequency(int[] nums)` → `public boolean primeFrequency(int[] nums)` 등 의미 있는 이름으로 변경 가능 | LeetCode에서는 메서드 이름이 정해져 있지만, 실제 프로젝트에서는 의미 있는 이름이 유지보수에 도움이 된다. |
| **반복 횟수 최소화** | `isPrime` 내부에서 `Math.sqrt(n)` 를 미리 변수에 저장 | `Math.sqrt` 호출은 비용이 있으므로 한 번만 계산하고 재사용하면 약간의 성능 향상이 있다. |
| **가능한 경우 조기 종료** | 빈도수가 2가 아닌 경우 바로 `false` 반환 | 현재 로직은 이미 조기 종료하지만, `isPrime` 내부에서도 `n == 2` 를 빠르게 처리하면 더 명확해진다. |

**예시 개선된 `isPrime` 구현**

```java
private boolean isPrime(int n) {
    if (n <= 1) return false;
    if (n <= 3) return true;          // 2, 3은 소수
    if (n % 2 == 0 || n % 3 == 0) return false;

    int limit = (int) Math.sqrt(n);
    for (int i = 5; i <= limit; i += 6) {
        if (n % i == 0 || n % (i + 2) == 0) return false;
    }
    return true;
}
```

위와 같이 약간의 최적화를 적용하면 큰 입력에서도 더 안정적인 실행 시간을 기대할 수 있다. 전체적인 구조와 로직은 매우 깔끔하므로, 위 개선점만 적용한다면 완벽한 풀이가 될 것이다.
